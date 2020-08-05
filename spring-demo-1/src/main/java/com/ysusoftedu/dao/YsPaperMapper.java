package com.ysusoftedu.dao;

import com.ysusoftedu.pojo.YsPaper;
import com.ysusoftedu.pojo.YsPaperExample;
import com.ysusoftedu.pojo.vo.YsPaperVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YsPaperMapper {
    int countByExample(YsPaperExample example);

    int deleteByExample(YsPaperExample example);

    int deleteByPrimaryKey(Integer paperId);

    int insert(YsPaper record);

    int insertSelective(YsPaper record);

    List<YsPaper> selectByExample(YsPaperExample example);

    YsPaper selectByPrimaryKey(Integer paperId);

    int updateByExampleSelective(@Param("record") YsPaper record, @Param("example") YsPaperExample example);

    int updateByExample(@Param("record") YsPaper record, @Param("example") YsPaperExample example);

    int updateByPrimaryKeySelective(YsPaper record);

    int updateByPrimaryKey(YsPaper record);
    
    
    
    //自己写的方法
    List<YsPaper> selectPaperByGroupId(@Param("id")int groupId,@Param("userId")int userId);
    
    
    YsPaperVo selectPaperById(int id);
    
    
    int autoPaper(@Param("start")String start,@Param("end")String end);
    
}