<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML> <!--[if lt IE 7]>
<html class="lt-ie9 lt-ie8 lt-ie7"><![endif]--> <!--[if IE 7]>
<html class="lt-ie9 lt-ie8"><![endif]--> <!--[if IE 8]>
<html class="lt-ie9"><![endif]--> <!--[if gt IE 8]><!-->
<html> <!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=9, IE=8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>我的消息-燕软在线教育</title>
    <meta name="author" content="#"/>
    <meta name="keywords" content="#"/>
    <meta name="description" content="#"/>
    <link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/theme.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/global.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/web.css">

    <script type="text/javascript" src="../../static/common/webutils.js"></script>
    <script type="text/javascript" src="../../static/common/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="../../static/inxweb/user/ucTop.js"></script>
    <script type="text/javascript" src="../../static/inxweb/header/header.js"></script>
    <script type="text/javascript" src="../../static/inxweb/js/common.js"></script>
    <script type="text/javascript">
        function delULetter(id) {//删除站内信
            $.ajax({
                type: "POST",
                dataType: "json",
                url: baselocation + "/uc/ajax/delLetterInbox",
                data: {"msgReceive.id": id},
                cache: true,
                async: false,
                success: function (result) {
                    if (result.message == "success") {
                        $("#del" + id).remove();//
                        dialog('提示', '删除成功', 0, '/uc/letter');
                    }
                }
            });
        }
    </script>
</head>
<body>
<div class="in-wrap">
	<%@ include file="include/header.jsp" %>

    <div class="h-mobile-mask"></div>
    <div class="head-mobile">
        <div class="head-mobile-box">
            <section class="clearfix">
                <div class="u-face-pic"><img src="http://127.0.0.1:8088/static/inxweb/img/avatar-boy.gif" alt=""
                                             class="userImgPhoto"> <a href="http://127.0.0.1:8088/uc/initUpdateUser/1"
                                                                      title="" class="c-fff">修改头像</a></div>
                <h4 class="hLh30 txtOf"><span class="fsize16 c-ccc userNameClass"> <span class="vam ml5"
                                                                                         style="cursor:pointer;"
                                                                                         onclick="lrFun(1)">登录</span> </span>
                </h4>

                <div class="hLh30"><a href="http://127.0.0.1:8088/uc/initUpdateUser/0" title="个人资料设置" class="c-999">个人资料设置</a>
                </div>
                <div class="hLh20 undis" id="mobileExitDiv"><a href="javascript:void(0)" title="退出" onclick="exit();"
                                                               class="c-999">退出</a></div>
            </section>
            <nav class="mw-nav">
                <ul class="clearfix">
                    <li><a href="http://127.0.0.1:8088/" title="首页">首页</a></li>
                    <li><a href="http://127.0.0.1:8088/front/showcoulist" title="课程">课程</a></li>
                    <li><a href="http://127.0.0.1:8088/front/teacherlist" title="名师">名师</a></li>
                    <li><a href="http://127.0.0.1:8088/front/articlelist" title="文章">文章</a></li>
                    <li><a href="http://127.0.0.1:8088/questions/list" title="问答">问答</a></li>
                </ul>
            </nav>
            <section class="u-m-dd">
                <ul>
                    <li><span>Wo的学习</span>
                        <ol>
                            <li class="current"><a href="javascript:void(0)"
                                                   onclick="mobileHrefCheckLogin('http://127.0.0.1:8088/uc/index')"
                                                   title="">免费课程</a></li>
                            <li><a href="javascript:void(0)"
                                   onclick="mobileHrefCheckLogin('http://127.0.0.1:8088/front/showcoulist')" title="">选课中心</a>
                            </li>
                            <li><a href="javascript:void(0)"
                                   onclick="mobileHrefCheckLogin('http://127.0.0.1:8088/uc/myFavorites')"
                                   title="">Wo的收藏</a></li>
                        </ol>
                    </li>
                </ul>
                <ul>
                    <li><span>Wo的问答</span>
                        <ol>
                            <li><a href="javascript:void(0)"
                                   onclick="mobileHrefCheckLogin('http://127.0.0.1:8088/uc/myquestions/list')" title="">Wo的提问</a>
                            </li>
                            <li><a href="javascript:void(0)"
                                   onclick="mobileHrefCheckLogin('http://127.0.0.1:8088/uc/myrepquestions/list')"
                                   title="">Wo的回答</a></li>
                        </ol>
                    </li>
                </ul>
                <ul>
                    <li><span>Wo的资料</span>
                        <ol>
                            <li><a href="javascript:void(0)"
                                   onclick="mobileHrefCheckLogin('http://127.0.0.1:8088/uc/initUpdateUser/0')" title="">基本资料</a>
                            </li>
                            <li><a href="javascript:void(0)"
                                   onclick="mobileHrefCheckLogin('http://127.0.0.1:8088/uc/initUpdateUser/1')" title="">个人头像</a>
                            </li>
                            <li><a href="javascript:void(0)"
                                   onclick="mobileHrefCheckLogin('http://127.0.0.1:8088/uc/initUpdateUser/2')" title="">密码设置</a>
                            </li>
                        </ol>
                    </li>
                </ul>
                <ul>
                    <li><span>Wo的消息</span>
                        <ol>
                            <li><a href="javascript:void(0)"
                                   onclick="mobileHrefCheckLogin('http://127.0.0.1:8088/uc/letter')" title="">系统消息</a>
                            </li>
                        </ol>
                    </li>
                </ul>
            </section>
        </div>
    </div>
    <script>
        $(function () {
            wmNavFun(); // 手机端导航方法
            goTopFun(); //返回顶部
        })
    </script>
    <div class="bg-fa of">
        <section class="container">
            <div class="u-body mt40">
                <menu class="col-3 fl uMenu">
                    <dl>
                        <dt>
                            <section class="of">
                                <div class="u-face-pic"><img
                                        src="http://127.0.0.1:8088/static/inxweb/img/avatar-boy.gif" alt=""
                                        class="userImgPhoto"> <a href="http://127.0.0.1:8088/uc/initUpdateUser/1"
                                                                 title="" class="c-fff">修改头像</a></div>
                                <h4 class="mt10"><span class="fsize16 c-666 userNameClass"></span></h4>

                                <div class="hLh30 mt10"><a href="http://127.0.0.1:8088/uc/initUpdateUser/0" title=""
                                                           class="c-blue">个人资料设置</a></div>
                                <div class="clear"></div>
                            </section>
                        </dt>
                        <dd class="u-m-dd">
                            <ul>
                                <li><span>Wo的学习</span>
                                    <ol>
                                        <li><a href="http://127.0.0.1:8088/uc/index" title="">免费课程</a></li>
                                        <li><a href="http://127.0.0.1:8088/front/showcoulist" title=""
                                               target="view_window">选课中心</a></li>
                                        <li><a href="http://127.0.0.1:8088/uc/myFavorites" title="">Wo的收藏</a></li>
                                    </ol>
                                </li>
                            </ul>
                            <ul>
                                <li><span>Wo的考试</span>
                                    <ol>
                                        <li><a target="content" href="${pageContext.request.contextPath }/user/exam/examlist.do" title="">我的试卷</a></li>
                                        <li><a href="http://127.0.0.1:8088/uc/myrepquestions/list" title="">考试记录</a>
                                        </li>
                                    </ol>
                                </li>
                            </ul>
                            <ul>
                                <li><span>Wo的资料</span>
                                    <ol>
                                        <li><a href="http://127.0.0.1:8088/uc/initUpdateUser/0" title="">基本资料</a></li>
                                        <li><a href="http://127.0.0.1:8088/uc/initUpdateUser/1" title="">个人头像</a></li>
                                        <li><a href="http://127.0.0.1:8088/uc/initUpdateUser/2" title="">密码设置</a></li>
                                    </ol>
                                </li>
                            </ul>
                        </dd>
                    </dl>
                </menu>
                
                <article class="col-7 fl" style="height:600px">
                	<iframe name="content"  scrolling="auto" frameborder="0"  height="100%" width="100%"></iframe>
               </article>
                
                
                <div class="clear"></div>
            </div>
        </section>
    </div>
<%@ include file="include/footer.jsp" %>
    <div class="r-fixed-wrap">
        <ul class="r-fixed-ul">
            <li id="goTopBtn" class="undis"><a href="javascript: void(0)" title="返回顶部" class="bg-orange"> <em
                    class="r-f-icon-3">&nbsp;</em><span>返回顶部</span> </a></li>
            <li class="foot-zixun"><a href="" title="在线咨询" class="bg-orange"> <em class="r-f-icon-1">&nbsp;</em><span>在线咨询</span>
            </a></li>
            <li class="foot-zixun"><a href="" title="扫描关注" class="bg-orange"> <em class="r-f-icon-2">&nbsp;</em><span>扫描关注</span>
            </a></li>
        </ul>
    </div>
</div>
</body>
</html>