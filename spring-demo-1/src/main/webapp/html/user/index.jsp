<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE HTML>
<!--[if lt IE 7]>      <html class="lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html>
<!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,user-scalable=no,minimal-ui">
    <title>首页-燕软在线教育</title>
    <meta name="author" content="" />
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />
    <meta content="telephone=no" name="format-detection" />
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/theme.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/global.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/inxweb/css/web.css">
    <link href="../../static/inxweb/css/mw_320_768.css" rel="stylesheet" type="text/css" media="screen and (min-width: 320px) and (max-width: 768px)">
    <!--[if lt IE 9]>
    <script src="../../static/common/html5.js"></script><![endif]-->
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/common/jquery-3.4.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/common/webutils.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/inxweb/header/header.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/inxweb/js/common.js"></script>
</head>
<body class="W-body">
	<%@ include file="include/header.jsp" %>


<!-- 首页轮播  start-->
<div class="i-slide">
    <section>
        <!-- 如果需要导航按钮 -->
        <a class="arrow-left s-arrow" href="javascript:void(0)"></a>
        <a class="arrow-right s-arrow" href="javascript:void(0)"></a>
        <!-- 图片位置 -->
        <div class="swiper-container">
            <div class="swiper-wrapper">
                <div class="swiper-slide" style="background: #ef550f;">
                    <a target="_blank" href="/front/showcoulist">
                        <img class="imgload" src="../../images/upload/image/20150915/banner01.png" alt="首页banner图片01">
                    </a>
                </div>
                <div class="swiper-slide" style="background: #ef550f;">
                    <a target="_blank" href="/front/showcoulist">
                        <img class="imgload" src="../../images/upload/image/20150915/banner02.png" alt="首页banner图片02">
                    </a>
                </div>
            </div>
        </div>
        <!-- 如果需要分页器 -->
        <div class="pagination"></div>
    </section>
</div>
<!-- 首页轮播  end-->

<!-- /index slide -->
<div id="aCoursesList">

    <!-- /为你推荐 开始 -->
    <div class="bg-fa of">
        <section class="container">
            <header class="comm-title">
                <span class="fr mt5"><a href="javascript:void(0)" title="换一换" class="c-master" onclick="huanyihuan()">换一换</a></span>
                <h2 class="fl tac">
                    <span class="c-333">为你推荐</span>
                </h2>
            </header>
            <article class="comm-course-list">
                <ul class="of" id="weinituijian">

                </ul>
                <div class="clear"></div>
            </article>
        </section>
    </div>
    <!-- /为你推荐 结束 -->

    <!-- /网校课程 开始 -->
    <div>
        <section class="container">
            <header class="comm-title">
                <h2 class="tac">
                    <span class="c-333">网校课程</span>
                </h2>
            </header>
            <div>
                <section class="c-tab-title">
                    <a href="javascript:void(0)" title="精品课程" onclick="bna('FOLLOW',this)" class="current boutiqueCourse">精品课程</a>
                    <a href="javascript:void(0)" title="最新课程" onclick="bna('NEW',this)">最新课程</a>
                    <a href="javascript:void(0)" title="全部课程" onclick="bna('ALL',this)">全部课程</a>
                </section>
            </div>
            <!-- 课程列表  start-->
            <div>
                <article class="comm-course-list">
                    <ul class="of" id="bna">

                        <li>
                            <div class="cc-l-wrap">
                                <section class="course-img">
                                    <img xsrc="../../images/upload/course/20150915/1442295455437.jpg" src="../../images/upload/course/20150915/1442295455437.jpg" class="img-responsive" alt="零基础入门学习Python课程学习">
                                    <div class="cc-mask">
                                        <a href="course/coursedetail.html" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                    </div>
                                </section>
                                <h3 class="hLh30 txtOf mt10">
                                    <a href="course/coursedetail.html" title="零基础入门学习Python课程学习" class="course-title fsize18 c-333">零基础入门学习Python课程学习</a>
                                </h3>
                                <section class="mt10 hLh20 of">
                                    <span class="fr jgTag bg-green"><tt class="c-fff fsize12 f-fA">免费</tt></span>
						<span class="fl jgAttr c-ccc f-fA"> <tt class="c-999 f-fA">
                            128人学习
                        </tt> | <tt class="c-999 f-fA">
                            128评论
                        </tt>
						</span>
                                </section>
                            </div>
                        </li>

                        <li>
                            <div class="cc-l-wrap">
                                <section class="course-img">
                                    <img xsrc="../../images/upload/course/20150915/1442295455437.jpg" src="../../images/upload/course/20150915/1442295455437.jpg" class="img-responsive" alt="零基础入门学习Python课程学习">
                                    <div class="cc-mask">
                                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                    </div>
                                </section>
                                <h3 class="hLh30 txtOf mt10">
                                    <a href="#" title="零基础入门学习Python课程学习" class="course-title fsize18 c-333">零基础入门学习Python课程学习</a>
                                </h3>
                                <section class="mt10 hLh20 of">
                                    <span class="fr jgTag bg-green"><tt class="c-fff fsize12 f-fA">免费</tt></span>
						<span class="fl jgAttr c-ccc f-fA"> <tt class="c-999 f-fA">
                            128人学习
                        </tt> | <tt class="c-999 f-fA">
                            128评论
                        </tt>
						</span>
                                </section>
                            </div>
                        </li>

                        <li>
                            <div class="cc-l-wrap">
                                <section class="course-img">
                                    <img xsrc="../../images/upload/course/20150915/1442295455437.jpg" src="../../images/upload/course/20150915/1442295455437.jpg" class="img-responsive" alt="零基础入门学习Python课程学习">
                                    <div class="cc-mask">
                                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                    </div>
                                </section>
                                <h3 class="hLh30 txtOf mt10">
                                    <a href="#" title="零基础入门学习Python课程学习" class="course-title fsize18 c-333">零基础入门学习Python课程学习</a>
                                </h3>
                                <section class="mt10 hLh20 of">
                                    <span class="fr jgTag bg-green"><tt class="c-fff fsize12 f-fA">免费</tt></span>
						<span class="fl jgAttr c-ccc f-fA"> <tt class="c-999 f-fA">
                            128人学习
                        </tt> | <tt class="c-999 f-fA">
                            128评论
                        </tt>
						</span>
                                </section>
                            </div>
                        </li>

                        <li>
                            <div class="cc-l-wrap">
                                <section class="course-img">
                                    <img xsrc="../../images/upload/course/20150915/1442295455437.jpg" src="../../images/upload/course/20150915/1442295455437.jpg" class="img-responsive" alt="零基础入门学习Python课程学习">
                                    <div class="cc-mask">
                                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                    </div>
                                </section>
                                <h3 class="hLh30 txtOf mt10">
                                    <a href="#" title="零基础入门学习Python课程学习" class="course-title fsize18 c-333">零基础入门学习Python课程学习</a>
                                </h3>
                                <section class="mt10 hLh20 of">
                                    <span class="fr jgTag bg-green"><tt class="c-fff fsize12 f-fA">免费</tt></span>
						<span class="fl jgAttr c-ccc f-fA"> <tt class="c-999 f-fA">
                            128人学习
                        </tt> | <tt class="c-999 f-fA">
                            128评论
                        </tt>
						</span>
                                </section>
                            </div>
                        </li>

                        <li>
                            <div class="cc-l-wrap">
                                <section class="course-img">
                                    <img xsrc="../../images/upload/course/20150915/1442295455437.jpg" src="../../images/upload/course/20150915/1442295455437.jpg" class="img-responsive" alt="零基础入门学习Python课程学习">
                                    <div class="cc-mask">
                                        <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                    </div>
                                </section>
                                <h3 class="hLh30 txtOf mt10">
                                    <a href="#" title="零基础入门学习Python课程学习" class="course-title fsize18 c-333">零基础入门学习Python课程学习</a>
                                </h3>
                                <section class="mt10 hLh20 of">
                                    <span class="fr jgTag bg-green"><tt class="c-fff fsize12 f-fA">免费</tt></span>
						<span class="fl jgAttr c-ccc f-fA"> <tt class="c-999 f-fA">
                            128人学习
                        </tt> | <tt class="c-999 f-fA">
                            128评论
                        </tt>
						</span>
                                </section>
                            </div>
                        </li>
                    </ul>
                    <div class="clear"></div>
                </article>
                <section class="tac pt20">
                    <a href="#" title="全部课程" class="comm-btn c-btn-2">全部课程</a>
                </section>
            </div>
            <!-- 课程列表 end -->
        </section>
    </div>
    <!-- /网校课程 结束 -->

    <!-- /课程互动 开始-->
    <div class="bg-fa of mt30">
        <section class="container">
            <article class="fl col-7" style="width:60%">
                <div class="mr50">
                    <header class="comm-title">
                        <h2 class="fl tac">
                            <span class="c-333">课程互动</span>
                        </h2>
                    </header>
                    <div class="i-question-list">
                        <ul id="iQuestion">
                            <li>
                                <section class="i-q-l-wrap">
                                    <div class="u-face">
                                        <img width="50" height="50" class="picImg" src="../../static/inxweb/img/avatar-boy.gif" xsrc="../../images/upload/customer/20150910/1441527777887.jpg">
                                    </div>
                                    <section class="hLh20 of">
                                        <span class="fr"><tt class="c-ccc f-fG">2015/11/04 10:33</tt></span>
												<span class="fsize16 c-666">
												 	goddess</span>
                                        <span class="fsize14 c-999 ml5 f-fA">评论课程：</span>
                                    </section>
                                    <section class="hLh20 of mt10">
                                        <a class="c-master fsize14" href="course/coursedetail.html">《XHTML CSS2 JS整站制作教程课程学习》</a>
                                    </section>
                                    <section class="i-q-txt">
                                        <p>
                                            <span class="c-999 f-fA txtOf"> 支持,不错</span>
                                        </p>
                                    </section>
                                </section>
                            </li>
                            <li>
                                <section class="i-q-l-wrap">
                                    <div class="u-face">
                                        <img width="50" height="50" class="picImg" src="../../static/inxweb/img/avatar-boy.gif" xsrc="../../static/inxweb/img/avatar-boy.gif">
                                    </div>
                                    <section class="hLh20 of">
                                        <span class="fr"><tt class="c-ccc f-fG">2015/11/04 12:02</tt></span>
												<span class="fsize16 c-666">
												 	lmingxing@inxedu.com</span>
                                        <span class="fsize14 c-999 ml5 f-fA">评论课程：</span>
                                    </section>
                                    <section class="hLh20 of mt10">
                                        <a class="c-master fsize14" href="course/coursedetail.html">《搜索引擎优化技术》</a>
                                    </section>
                                    <section class="i-q-txt">
                                        <p>
                                            <span class="c-999 f-fA txtOf"> SEO由英文Search Engine Optimization缩写而来， 中文意译为“搜索引擎优化”。SEO是指从自然搜索结果获得网站流量的技术和过程，是在了解搜索引擎自然排名机制的基础上， 对网站进行内部及外部的调整优化， 改进网站在搜索引擎中的关键词自然排名， 获得更多流量， 从而达成网站销售及品牌建设的目标及用途。</span>
                                        </p>
                                    </section>
                                </section>
                            </li>
                            <li>
                                <section class="i-q-l-wrap">
                                    <div class="u-face">
                                        <img width="50" height="50" class="picImg" src="../../static/inxweb/img/avatar-boy.gif" xsrc="../../images/upload/customer/20151204/1449196673280.jpg">
                                    </div>
                                    <section class="hLh20 of">
                                        <span class="fr"><tt class="c-ccc f-fG">2016/02/03 11:53</tt></span>
												<span class="fsize16 c-666">
												 	燕软教育</span>
                                        <span class="fsize14 c-999 ml5 f-fA">评论课程：</span>
                                    </section>
                                    <section class="hLh20 of mt10">
                                        <a class="c-master fsize14" href="course/coursedetail.html">《XHTML CSS2 JS整站制作教程课程学习》</a>
                                    </section>
                                    <section class="i-q-txt">
                                        <p>
                                            <span class="c-999 f-fA txtOf"> 不错</span>
                                        </p>
                                    </section>
                                </section>
                            </li>
                            <li>
                                <section class="i-q-l-wrap">
                                    <div class="u-face">
                                        <img width="50" height="50" class="picImg" src="../../static/inxweb/img/avatar-boy.gif" xsrc="../../images/upload/customer/20150910/1441527777887.jpg">
                                    </div>
                                    <section class="hLh20 of">
                                        <span class="fr"><tt class="c-ccc f-fG">2015/11/04 10:32</tt></span>
												<span class="fsize16 c-666">
												 	goddess</span>
                                        <span class="fsize14 c-999 ml5 f-fA">评论课程：</span>
                                    </section>
                                    <section class="hLh20 of mt10">
                                        <a class="c-master fsize14" href="course/coursedetail.html">《零基础入门学习Python课程学习》</a>
                                    </section>
                                    <section class="i-q-txt">
                                        <p>
                                            <span class="c-999 f-fA txtOf"> 讲得很详细</span>
                                        </p>
                                    </section>
                                </section>
                            </li>
                            <li>
                                <section class="i-q-l-wrap">
                                    <div class="u-face">
                                        <img width="50" height="50" class="picImg" src="../../static/inxweb/img/avatar-boy.gif" xsrc="../../images/upload/customer/20150910/1441527777887.jpg">
                                    </div>
                                    <section class="hLh20 of">
                                        <span class="fr"><tt class="c-ccc f-fG">2015/11/04 10:32</tt></span>
												<span class="fsize16 c-666">
												 	goddess</span>
                                        <span class="fsize14 c-999 ml5 f-fA">评论课程：</span>
                                    </section>
                                    <section class="hLh20 of mt10">
                                        <a class="c-master fsize14" href="course/coursedetail.html">《零基础入门学习Python课程学习》</a>
                                    </section>
                                    <section class="i-q-txt">
                                        <p>
                                            <span class="c-999 f-fA txtOf"> 收藏了</span>
                                        </p>
                                    </section>
                                </section>
                            </li>
                            <li>
                                <section class="i-q-l-wrap">
                                    <div class="u-face">
                                        <img width="50" height="50" class="picImg" src="../../static/inxweb/img/avatar-boy.gif" xsrc="../../images/upload/customer/20151204/1449196673280.jpg">
                                    </div>
                                    <section class="hLh20 of">
                                        <span class="fr"><tt class="c-ccc f-fG">2015/11/04 11:57</tt></span>
												<span class="fsize16 c-666">
												 	燕软教育</span>
                                        <span class="fsize14 c-999 ml5 f-fA">评论课程：</span>
                                    </section>
                                    <section class="hLh20 of mt10">
                                        <a class="c-master fsize14" href="course/coursedetail.html">《影想力摄影小课堂》</a>
                                    </section>
                                    <section class="i-q-txt">
                                        <p>
                                            <span class="c-999 f-fA txtOf"> 摄影一词是源于希腊语 φῶς phos（光线）和 γραφι graphis（绘画、绘图）或γραφή graphê，两字一起的意思是“以光线绘图”。摄影是指使用某种专门设备进行影像记录的过程，一般我们使用机械照相机或者数码照相机进行摄影。有时摄影也会被称为照相，也就是通过物体所反射的光线使感光介质曝光的过程。有人说过的一句精辟的语言：摄影家的能力是把日常生活中稍纵即逝的平凡事物转化为不朽的视觉图像。</span>
                                        </p>
                                    </section>
                                </section>
                            </li>
                            <li>
                                <section class="i-q-l-wrap">
                                    <div class="u-face">
                                        <img width="50" height="50" class="picImg" src="../../static/inxweb/img/avatar-boy.gif" xsrc="../../images/upload/customer/20150910/1441527777887.jpg">
                                    </div>
                                    <section class="hLh20 of">
                                        <span class="fr"><tt class="c-ccc f-fG">2015/11/04 11:59</tt></span>
												<span class="fsize16 c-666">
												 	goddess</span>
                                        <span class="fsize14 c-999 ml5 f-fA">评论课程：</span>
                                    </section>
                                    <section class="hLh20 of mt10">
                                        <a class="c-master fsize14" href="course/coursedetail.html">《影想力摄影小课堂》</a>
                                    </section>
                                    <section class="i-q-txt">
                                        <p>
                                            <span class="c-999 f-fA txtOf"> 曝光过程 在进行照相时，光通过小孔（更多时候是一个透镜组）进入暗盒，在暗盒背部（相对于光入射方向）的介质上成像。根据实际光强度和介质感光能力的不同，要求的光照时间也不同。在光照过程中，介质被感光。</span>
                                        </p>
                                    </section>
                                </section>
                            </li>
                            <li>
                                <section class="i-q-l-wrap">
                                    <div class="u-face">
                                        <img width="50" height="50" class="picImg" src="../../static/inxweb/img/avatar-boy.gif" xsrc="../../images/upload/customer/20150910/1441527777887.jpg">
                                    </div>
                                    <section class="hLh20 of">
                                        <span class="fr"><tt class="c-ccc f-fG">2015/11/04 11:59</tt></span>
												<span class="fsize16 c-666">
												 	goddess</span>
                                        <span class="fsize14 c-999 ml5 f-fA">评论课程：</span>
                                    </section>
                                    <section class="hLh20 of mt10">
                                        <a class="c-master fsize14" href="course/coursedetail.html">《零基础入门学习Python课程学习》</a>
                                    </section>
                                    <section class="i-q-txt">
                                        <p>
                                            <span class="c-999 f-fA txtOf"> 是一种面向对象、解释型计算机程序设计语言，由Guido van Rossum于1989年发明，第一个公开发行版发行于1991年。</span>
                                        </p>
                                    </section>
                                </section>
                            </li>
                            <li>
                                <section class="i-q-l-wrap">
                                    <div class="u-face">
                                        <img width="50" height="50" class="picImg" src="../../static/inxweb/img/avatar-boy.gif" xsrc="../../static/inxweb/img/avatar-boy.gif">
                                    </div>
                                    <section class="hLh20 of">
                                        <span class="fr"><tt class="c-ccc f-fG">2015/11/04 12:01</tt></span>
												<span class="fsize16 c-666">
												 	lmingxing@inxedu.com</span>
                                        <span class="fsize14 c-999 ml5 f-fA">评论课程：</span>
                                    </section>
                                    <section class="hLh20 of mt10">
                                        <a class="c-master fsize14" href="course/coursedetail.html">《听力口语》</a>
                                    </section>
                                    <section class="i-q-txt">
                                        <p>
                                            <span class="c-999 f-fA txtOf"> 听力常作为一种考试题型，目的在于考察应试者对英语语言的把握，考察考生对英语日常交流的理解能力；通常有听对话选择答案、听句子默写关键字词几种形式。</span>
                                        </p>
                                    </section>
                                </section>
                            </li>
                            <li>
                                <section class="i-q-l-wrap">
                                    <div class="u-face">
                                        <img width="50" height="50" class="picImg" src="../../static/inxweb/img/avatar-boy.gif" xsrc="../../images/upload/customer/20151204/1449196673280.jpg">
                                    </div>
                                    <section class="hLh20 of">
                                        <span class="fr"><tt class="c-ccc f-fG">2016/02/02 16:42</tt></span>
												<span class="fsize16 c-666">
												 	燕软教育</span>
                                        <span class="fsize14 c-999 ml5 f-fA">评论课程：</span>
                                    </section>
                                    <section class="hLh20 of mt10">
                                        <a class="c-master fsize14" href="course/coursedetail.html">《零基础入门学习Python课程学习》</a>
                                    </section>
                                    <section class="i-q-txt">
                                        <p>
                                            <span class="c-999 f-fA txtOf"> 赞赞赞赞赞赞赞赞</span>
                                        </p>
                                    </section>
                                </section>
                            </li>
                        </ul>
                    </div>
                </div>
            </article>

            <aside class="fl col-3" style="width:35%">
                <header class="comm-title">
                    <!-- <span class="fr"><a class="c-master" title="" href="">换一换</a></span> -->
                    <h2 class="fl tac">
                        <span class="c-333">最新文章</span>
                    </h2>
                </header>
                <div class="stud-act-list">
                    <section>
                        <ul id="s-action" class="studentDynamicHtml"><li>
                            <div class="u-face">
                                <img src="../../static/inxweb/img/avatar-boy.gif" width="50" height="50" alt="">
                            </div>
                            <section class="hLh30 txtOf">
                                <span class="c-ccc fr">6天前 11:29:12</span>
                                <span class="c-333 fsize16 fl">admin</span>
                            </section>
                            <section class="hLh20 txtOf">
                                <span class="c-999">发布了</span><span class="c-master">“雅思阅读能力提高有方法 文章精读可以这样做”</span>
                            </section>
                        </li>
                            <li>
                                <div class="u-face">
                                    <img src="../../images/upload/customer/20151204/1449196673280.jpg" width="50" height="50" alt="">
                                </div>
                                <section class="hLh30 txtOf">
                                    <span class="c-ccc fr">2016-05-17 09:57:49</span>
                                    <span class="c-333 fsize16 fl">雅思阅读能力提高有方法 </span>
                                </section>
                                <section class="hLh20 txtOf">
                                    <span class="c-999">发布了</span> <span class="c-master">“零基础入门学习Python课程学习”</span>
                                </section>
                            </li>
                            <li>
                                <div class="u-face">
                                    <img src="../../images/upload/customer/20151204/1449196673280.jpg" width="50" height="50" alt="">
                                </div>
                                <section class="hLh30 txtOf">
                                    <span class="c-ccc fr">2016-05-17 09:57:48</span>
                                    <span class="c-333 fsize16 fl">燕软教育</span>
                                </section>
                                <section class="hLh20 txtOf">
                                    <span class="c-999">发布了</span> <span class="c-master">“零基础入门学习Python课程学习”</span>
                                </section>
                            </li>
                            <li>
                                <div class="u-face">
                                    <img src="../../images/upload/customer/20151204/1449196673280.jpg" width="50" height="50" alt="">
                                </div>
                                <section class="hLh30 txtOf">
                                    <span class="c-ccc fr">2016-05-10 15:55:39</span>
                                    <span class="c-333 fsize16 fl">燕软教育</span>
                                </section>
                                <section class="hLh20 txtOf">
                                    <span class="c-999">发布了</span> <span class="c-master">“零基础入门学习Python课程学习”</span>
                                </section>
                            </li>
                        </ul>
                    </section>
                </div>
            </aside>

            <div class="clear"></div>
        </section>
    </div>
    <!-- /课程互动 结束-->

    <!-- /网校名师 开始 -->
    <div>
        <section class="container">
            <header class="comm-title">
                <h2 class="tac">
                    <span class="c-333">网校名师</span>
                </h2>
            </header>
            <div>
                <article class="i-teacher-list">
                    <ul class="of">
                        <li>
                            <section class="i-teach-wrap">
                                <div class="i-teach-pic">
                                    <a href="teacher/tercherDetail.html" title="陈晓薇">
                                        <img alt="陈晓薇" src="../../static/inxweb/img/default-tea-img.gif" xsrc="../../images/upload/teacher/20150915/1442297885942.jpg">
                                    </a>
                                </div>
                                <div class="mt10 hLh30 txtOf tac">
                                    <a href="teacher/tercherDetail.html" title="陈晓薇" class="fsize18 c-666">陈晓薇</a>
                                </div>
                                <div class="hLh30 txtOf tac">
                                    <span class="fsize14 c-999">北京师范大学法学院副教授</span>
                                </div>
                                <div class="mt15 i-q-txt">
                                    <p class="c-999 f-fA">北京师范大学法学院副教授、清华大学法学博士。自2004年至今已有9年的司法考试培训经验。长期从事司法考试辅导，深知命题规律，了解解题技巧。内容把握准确，授课重点明确，层次分明，调理清晰，将法条法理与案例有机融合，强调综合，深入浅出。</p>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="i-teach-wrap">
                                <div class="i-teach-pic">
                                    <a href="teacher/tercherDetail.html" title="李小梅">
                                        <img alt="李小梅" src="../../static/inxweb/img/default-tea-img.gif" xsrc="../../images/upload/teacher/20150915/1442297919077.jpg">
                                    </a>
                                </div>
                                <div class="mt10 hLh30 txtOf tac">
                                    <a href="teacher/tercherDetail.html" title="李小梅" class="fsize18 c-666">李小梅</a>
                                </div>
                                <div class="hLh30 txtOf tac">
                                    <span class="fsize14 c-999">资深课程设计专家，专注10年AACTP美国培训协会认证导师</span>
                                </div>
                                <div class="mt15 i-q-txt">
                                    <p class="c-999 f-fA">十年课程研发和培训咨询经验，曾任国企人力资源经理、大型外企培训经理，负责企业大学和培训体系搭建；曾任专业培训机构高级顾问、研发部总监，为包括广东移动、东莞移动、深圳移动、南方电网、工商银行、农业银行、民生银行、邮储银行、TCL集团、清华大学继续教育学院、中天路桥、广西扬翔股份等超过200家企业提供过培训与咨询服务，并担任近50个大型项目的总负责人。</p>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="i-teach-wrap">
                                <div class="i-teach-pic">
                                    <a href="teacher/tercherDetail.html" title="李立">
                                        <img alt="李立" src="../../static/inxweb/img/default-tea-img.gif" xsrc="../../images/upload/teacher/20150915/1442297927029.jpg">
                                    </a>
                                </div>
                                <div class="mt10 hLh30 txtOf tac">
                                    <a href="teacher/tercherDetail.html" title="李立" class="fsize18 c-666">李立</a>
                                </div>
                                <div class="hLh30 txtOf tac">
                                    <span class="fsize14 c-999">上海师范大学法学院副教授</span>
                                </div>
                                <div class="mt15 i-q-txt">
                                    <p class="c-999 f-fA">上海师范大学法学院副教授、清华大学法学博士。自2004年至今已有9年的司法考试培训经验。长期从事司法考试辅导，深知命题规律，了解解题技巧。内容把握准确，授课重点明确，层次分明，调理清晰，将法条法理与案例有机融合，强调综合，深入浅出。</p>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="i-teach-wrap">
                                <div class="i-teach-pic">
                                    <a href="teacher/tercherDetail.html" title="潘新强">
                                        <img alt="潘新强" src="../../static/inxweb/img/default-tea-img.gif" xsrc="../../images/upload/teacher/20150915/1442297935589.jpg">
                                    </a>
                                </div>
                                <div class="mt10 hLh30 txtOf tac">
                                    <a href="teacher/tercherDetail.html" title="潘新强" class="fsize18 c-666">潘新强</a>
                                </div>
                                <div class="hLh30 txtOf tac">
                                    <span class="fsize14 c-999">考研政治辅导实战派专家，全国考研政治命题研究组核心成员。</span>
                                </div>
                                <div class="mt15 i-q-txt">
                                    <p class="c-999 f-fA">法学博士，北京师范大学马克思主义学院副教授，专攻毛泽东思想概论、邓小平理论，长期从事考研辅导。出版著作两部，发表学术论文30余篇，主持国家社会科学基金项目和教育部重大课题子课题各一项，参与中央实施马克思主义理论研究和建设工程项目。</p>
                                </div>
                            </section>
                        </li>
                    </ul>
                    <div class="clear"></div>
                </article>
                <section class="tac pt20">
                    <a href="../../front/teacherlist" title="全部讲师" class="comm-btn c-btn-2">全部讲师</a>
                </section>
            </div>
        </section>
    </div>
    <!-- /网校名师 结束 -->
</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/inxweb/js/swiper-2.1.0.js"></script>
<script>
    $(function() {
        sSwiperFun(); //幻灯片调取
        upSlideFun("#iQuestion"); //向上滚动互动
        scrollLoad(); //响应滚动加载课程图片
        //      $(".boutiqueCourse").click();//网校课程-精品课程

        //   huanyihuan();
        //   studentDynamic();//学生动态



        var uri = window.location.search;
        var val = "msg";
        var re = new RegExp("" + val + "=([^&?]*)", "ig");
        var msg=((uri.match(re)) ? (uri.match(re)[0].substr(val.length + 1)) : null);
        if(msg!=null && msg!='' && msg=='LimitLogin'){
            dialog('提示信息',"您的帐号在其他地点登录，请重新登录",1);
        }
    });





    //首页响应式幻灯片调取方法
    function sSwiperFun() {
        var _sWrap = $('.swiper-container');
        var mySwiper = _sWrap.swiper({
            loop: true, //无缝连接滚动
            autoplay : 5000, //自动滚动
            autoplayDisableOnInteraction : false, //设置点击后是否继续滚动
            speed:300, //滚动速度
            pagination : '.pagination', //设置分页
            paginationClickable :true //设置true分页点击执行swiper
        });
        $('.arrow-left').on('click', function(e){
            e.preventDefault();
            mySwiper.swipePrev();
        });
        $('.arrow-right').on('click', function(e){
            e.preventDefault();
            mySwiper.swipeNext();
        });

        $(".imgload").eq(0).get(0).onload=function(){
            $(".i-slide").css("height",$(".imgload").eq(0).height());
        }
        $(".swiper-slide").css("background","#fafafa");
    };

    var lodingHtml = '<div class="tac"><img width="100" height="108" alt="" src="../../static/inxweb/img/loading.gif"></div>',
            _timer = null;
    //为你推荐    换一换
    function huanyihuan() {
        $.ajax({
            url : baselocation + "/index/ajax/huanyihuan",
            type : 'post',
            dataType : 'text',
            beforeSend:function(){
                $("#weinituijian").html(lodingHtml);
                clearTimeout(_timer);
            },
            success : function(result) {
                _timer = setTimeout(function(){
                    $("#weinituijian").html(result);
                    scrollLoad(); // 调用 滚动记载图片方法
                }, 300);
            }
        });
    }

    //精品、最新、全部课程
    function bna(type,obj) {
        alert("111111111")
        $.ajax({
            url : baselocation + "/index/ajax/bna",
            data : {
                "order" : type
            },
            type : 'post',
            dataType : 'text',
            beforeSend:function(){
                $("#bna").html(lodingHtml);
                clearTimeout(_timer);
            },
            success : function(result) {
                $(obj).addClass("current").siblings().removeClass("current");
                _timer = setTimeout(function(){
                    $("#bna").html(result);
                    scrollLoad(); // 调用 滚动记载图片方法
                }, 300);
            }
        });
    }
    //学生动态
    function studentDynamic() {
        $.ajax({
            url :baselocation +  "/index/ajax/studentDynamic",
            data : {
            },
            type : 'post',
            dataType : 'text',
            beforeSend:function(){
                $(".studentDynamicHtml").html(lodingHtml);
            },
            success : function(result) {
                $(".studentDynamicHtml").html(result);
            }
        });
    }

</script>

	<%@ include file="include/footer.jsp" %>

<!-- 统计代码 -->
</body>
</html>
