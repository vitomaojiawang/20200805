<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- /global header begin-->
<header id="header">
    <section class="container">
        <h1 id="logo">
            <a href="../../" title="燕软在线教育软件">
                <img src="../../static/admin/assets/logo.png" width="100%" alt="燕软在线教育软件">
            </a>
        </h1>
        <div class="h-r-nsl">
            <ul class="nav">
                <li><a href="#" title="首页" >首页</a></li>
                <li><a href="course/courseIndex.html" title="课程" >课程</a></li>
                <li><a href="teacher/tercherIndex.html" title="名师" >名师</a></li>
                <li><a href="acticle/acticleIndex.html" title="文章" >文章</a></li>
            </ul>
            <!-- / nav -->
            <ul class="h-r-login">
				<c:choose>
					<c:when test="${sessionScope.user==null }">
				<li class="undis" id="no-login">
                    <a href="javascript:lrFun(1)" title="登录">
                        <em class="icon18 login-icon">&nbsp;</em><span class="vam ml5">登录</span>
                    </a>
                    |
                    <a href="javascript:lrFun(2)" title="注册">
                        </em><span class="vam ml5">注册</span>
                    </a>
                </li>
					</c:when>
					<c:otherwise>
				<li class="mr10 undis" id="is-login-one"><a href="succIndex.jsp" title="消息" id="headerMsgCountId">
                    <em class="icon18 news-icon">&nbsp;</em>
                </a><q class="red-point" style="display: none">&nbsp;</q></li>

                <li class="h-r-user undis" id="is-login-two"><a href="../../uc/index" title="">
                    <img src="../../static/inxweb/img/avatar-boy.gif" width="30" height="30" class="vam picImg" alt="">
                    <span class="vam disIb" id="userName">${sessionScope.user.realname }</span>
                </a>
                    <a href="javascript:void(0)" title="退出" onclick="exit();" class="ml5">退出</a></li>
			
					
					</c:otherwise>
					</c:choose>



                <!-- /未登录显示第1 li；登录后显示第2，3 li -->
            </ul>
            <aside class="h-r-search">
                <form action="#" method="post">
                    <label class="h-r-s-box"><input type="text" placeholder="输入你想学的课程" name="queryCourse.courseName" value="">
                        <button type="submit" class="s-btn">
                            <em class="icon18">&nbsp;</em>
                        </button></label>
                </form>
            </aside>
        </div>
        <aside class="mw-nav-btn">
            <div class="mw-nav-icon"></div>
        </aside>
        <div class="clear"></div>
    </section>
</header>






