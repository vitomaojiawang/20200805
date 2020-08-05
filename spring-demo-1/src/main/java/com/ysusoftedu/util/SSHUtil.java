package com.ysusoftedu.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.SCPClient;
import ch.ethz.ssh2.SFTPv3Client;
import ch.ethz.ssh2.Session;
//import troila.web.model.Conf;

/**
 * ssh上传文件
 * @author 
 *
 */
public class SSHUtil {

	private static SCPClient scp;
	private static Connection conn;
	
		/**
	     *  获取连接conn
	     * @ClassName:SSHUtil.java
	     * @Description：
	     * @author: liuquanrui
	     * @date: 2018年7月5日
	     */
	private static void getConnect(String serverIp, String username, String password) {
			try {
				conn = new Connection(serverIp);
				conn.connect();
				conn.authenticateWithPassword(username, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	/**
     * 
     * @Description：获取scp
     * @return
     * @version: v1.1.0
     * @author: liuquanrui
     * @date: 2018年7月5日 下午4:09:01
     */
	private static SCPClient getSCPClient() {
		return scp = new SCPClient(conn);
	}

	/**
     * 
     * @Description：获取连接conn 和 scp
     * @version: v1.1.0
     * @author: liuquanrui
     * @date: 2018年7月5日 下午4:11:38
     */
	private static void getConnAndScp() {
		SSHUtil.getConnect(Conf.SSHSERVERIP, Conf.SSHUSERNAME, Conf.SSHPASSWORD);
		scp = getSCPClient();
	}
	/**
     * 
     * @Description：上传文件
     * @param localFile 本地文件目录
     * @param remoteTargetDirectory 远程文件目录
     * @version: v1.1.0
     * @author: liuquanrui
     * @date: 2018年7月5日
     */
	private static boolean upload(byte[] data, String fileName,String remoteTargetDirectory) {
		boolean flag = false;
		try {
			getConnAndScp();
			//ifDirExist();            
			scp.put(data, fileName, remoteTargetDirectory,"0777");
			flag = true;
			conn.close();
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 上传文件到服务器
	 * @param filePath 文件路径
	 * @param fileName 服务器存储文件名称
	 * @return
	 */
	public static boolean upload(String filePath,String fileName){
		boolean flag = false;
		byte[] bytes = null;
		try {
			bytes = toByteArray(new FileInputStream(new File(filePath)));
		} catch (FileNotFoundException e) {
			flag = false;
			e.printStackTrace();
		} catch (IOException e) {
			flag = false;
			e.printStackTrace();
		}
		return upload(bytes, fileName, Conf.REMOTETARGETDIR);
		
	}
	
	/**
	 * 上传文件到服务器
	 * @param file 文件
	 * @param fileName 服务器存储文件名称
	 * @return
	 */
	public static String upload(MultipartFile file,String fileName){
		Map<String, String> map = getAbsolutePath(file);
		int idx = file.getOriginalFilename().lastIndexOf(".");
		String suffix = file.getOriginalFilename().substring(idx);
		if(upload(map.get("filePath").toString(),fileName+suffix)){
			return Conf.DIRURL+fileName+suffix;
		}else{
			return null;
		}
		 
	}
	
	
	
	
	
	
	
	/**
     * 
     * @Description：下载文件
     * @param fileName  文件名称
     * @param localDirectory  本地文件目录
     * @version: v1.1.0
     * @author: liuquanrui
     * @date: 2018年7月5日
     */
	private static void download(String fileName, String localDirectory) {
		String separator = File.separator;
		
		try {
			getConnAndScp();
			scp.get(Conf.REMOTETARGETDIR+separator+fileName, localDirectory);
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
     * 
     * @Description：删除文件
     * @param fileName
     * @version: v1.1.0
     * @author: liuquanrui
     * @date: 2018年7月5日
     */
	public static void remove(String fileName) {
		try {
			SSHUtil.getConnect(Conf.SSHSERVERIP, Conf.SSHUSERNAME, Conf.SSHPASSWORD);
			SFTPv3Client sftpClient = new SFTPv3Client(conn);
			sftpClient.rm(Conf.REMOTETARGETDIR+fileName);
			sftpClient.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
     * 
     * @Description：获得上传文件的本地路径和文件名称
     * @param file
     * @return
     * @version: v1.1.0
     * @author: liuquanrui
     * @date: 2018年7月5日 下午3:04:11
     */
	private static Map<String, String> getAbsolutePath(MultipartFile file) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			int idx = file.getOriginalFilename().lastIndexOf(".");
			String suffix = file.getOriginalFilename().substring(idx);
			//创建临时文件
			File f = File.createTempFile("temp"+System.currentTimeMillis(),suffix);
			//将文件转为file文件
			file.transferTo(f);
			//获取本地路径
			String filePath = f.getAbsolutePath();
			//获取文件名称
			String newFileName = f.getName();
			map.put("filePath", filePath);
			map.put("fileName", newFileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
     * File的InputStream 转为byte[]
     * @param in
     * @return
     * @throws IOException
     */
	private static byte[] toByteArray(InputStream in) throws IOException {
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		byte[] bufferValue=new byte[in.available()];
		byte[] buffer=new byte[1024*4];
		int n=0;
		while ( (n=in.read(buffer)) !=-1) {
			out.write(buffer,0,n);
		}
		bufferValue = out.toByteArray();
		out.close();
		return bufferValue;
	}

	/**
     * 
     * @Description：创建文件夹
     * @version: v1.1.0
     * @author: liuquanrui
     * @date: 2018年7月6日上午9:27:45
     */
	private static void makeDir() {
		try {
			SSHUtil.getConnect(Conf.SSHSERVERIP, Conf.SSHUSERNAME, Conf.SSHPASSWORD);
			SFTPv3Client sftpClient = new SFTPv3Client(conn);
			sftpClient.mkdir(Conf.REMOTETARGETDIR, 0777);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
     * 
     * @Description：判断服务器上的存储路径是否存在，不存在则创建
     * @version: v1.1.0
     * @author: liuquanrui
     * @date: 2018年7月6日上午9:54:12
     */
	private static void ifDirExist() {
		try {
			String cmd = "[ -d Conf.REMOTETARGETDIR ]";
			Session session= conn.openSession();//打开一个会话
			session.execCommand(cmd);//执行命令
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String xiegang = File.separator;
	//	String filePath = "D:\\工具\\test1.jpg";
	
//		SSHUtil.upload(toByteArray(new FileInputStream(new File(filePath))),"test111.jpg", Conf.REMOTETARGETDIR);
//		SSHUtil.download(Conf.REMOTETARGETDIR+xiegang+"test.jpg", "D:\\工具");
//		SSHUtil.remove("test111.jpg");
		}
}
