<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/theme.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/global.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/web.css">
    
</head>
<body>


      <div class="u-r-cont">
                        <section>
                            <div>
                                <section class="c-infor-tabTitle c-tab-title"><a href="javascript: void(0)"
                                                                                 title="Wo的消息" style="cursor: default;">Wo的考试</a>
                                    <a href="javascript: void(0)" title="系统消息" class="current">我的试卷</a>
                                <a href="javascript: void(0)" title="系统消息">考试记录</a></section>
                            </div>
                            <div class="mt40">
                                <div class="u-sys-news">

									<c:forEach items="${papers }" var="p">			
                                    <dl >
                                        <dt>
                                            <section class="tar"><p class="hLh30"><b class="fsize14 f-fA c-red">${p.paperName }</b>
                                            </p>

                                                <p class="hLh20"><span class="f-fA c-666">用时：${p.paperMinute }分钟</span></p>

                                                <p class="hLh20"><span class="f-fA c-999">总分：${p.totalScore }分</span></p></section>
                                        </dt>
                                        <dd>
                                            <section class="mt10">
                                                <div style="line-height: 200%;"><p><span class="c-666 f-fA">${p.starttime } 到 ${p.endtime }<br/></span>
                                                </p></div>
                                                <div class="mt10 tar"><a href="${pageContext.request.contextPath }/user/exam/examDetail.do?id=${p.paperId }"
                                                                          title=""
                                                                         class="comm-btn c-btn-6">进入考试</a></div>
                                            </section>
                                        </dd>
                                    </dl>

									</c:forEach>	


                                </div>
                            </div>
                        </section>
                    </div>



</body>
</html>