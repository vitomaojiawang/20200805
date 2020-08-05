<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>


	<p>
		${papervo.paperName }考试人：${papervo.user.realname }
		<input type="hidden" id="paperId" value="${papervo.paperId }">
	<p>
	
	<c:set scope="page" value="1" var="count"></c:set>
	${papervo.codes.size() }
	<ol>
	<c:forEach items="${papervo.codes }" var="code" >
			
			<li>${code.qtypename }
				<ul>
				<c:forEach items="${code.questions }" var="q" >
				
					<c:choose>
						<c:when test="${q.qtype==2 }">
							${q.qtype } :::${count } <li class="question" id="quest${count }"> ${q.content } 
								<ul>
								<c:forEach items="${q.options }" var="op">
									<input type='checkbox' name="quest${count }" value="${op.salisa}">  <li>${op.salisa} ${op.soption }</li>
								</c:forEach>
								</ul>
							</li>
						
						</c:when>
						<c:otherwise>
													${q.qtype } :::${count } <li class="question" id="quest${count }"> ${q.content } 
								<ul >
								<c:forEach items="${q.options }" var="op">
									<input type='radio' name="quest${count }" value="${op.salisa}">  <li>${op.salisa}   ${op.soption }</li>
								</c:forEach>
								</ul>
							</li>
						
						</c:otherwise>
					

					
					</c:choose>
					<input type="hidden"  value="${q.questionId }">
					<input type="hidden"  value="${q.qtype }">
				<c:set scope="page" value="${count+1 }" var="count"></c:set>
				</c:forEach>
				</ul>
			</li>
			
	</c:forEach>
	</ol>	

	
	<c:forEach begin="1" end="${count-1 }" var="x">
		<a href="#quest${x }">${x }</a>  &nbsp;&nbsp;&nbsp;
	
	</c:forEach>

	
	<button id="sub">提交试卷</button>
	<!-- 
		userid sesssion取
		pid 当前页面
			qid qtype题id 对应 答案 
		{pid:59,questions:[{qid:182,qtype:3,ans:'A'},{qid:182,qtype:3,ans:'A'},{qid:182,qtype:3,ans:'A'}]}
	
	 -->
	 <script type="text/javascript" src="${pageContext.request.contextPath }/static/common/jquery-3.4.1.js"></script>

	 <script type="text/javascript">
	 
	 $("#sub").click(function(){
		 
		 subPaper();
		 
	 });
	 
	 
	 	function subPaper(){
	 		var paperId = $("#paperId").val();
	 		var qarr = new Array();
	 		$.each($(".question"),function(idx,obj){
	 			var qid = $(obj).next().val();
	 			var qtype = $(obj).next().next().val();
	 			
	 			var name = $(obj).attr("id");
	 			var ans = "";
	 			if(qtype==2){
	 				
	 				$.each($("input[name='"+name+"']:checked"),function(i,o){
	 					ans = ans + $(o).val();
	 					
	 				});
	 				
	 			}else{
	 				
	 				 ans = $("input[name='"+name+"']:checked").val();
	 				if(ans==undefined){
	 					ans="";
	 				}
	 			}
	 			var question = {qid:qid,qtype:qtype,ans:ans}
	 			
	 			qarr[idx] = question;
	 		
	 		});
	 		
	 		
	 		var data = {paperId:paperId,questions:qarr}
	 		
	 		$.ajax({
	 			type:"POST",
	 			url:"${pageContext.request.contextPath }/user/exam/subPaper.do",
	 			data:JSON.stringify(data),
	 			dataType:"json",
	 			contentType:'application/json;charset=utf-8',
	 			success:function(res){
	 				if(res.code==200){
	 					alert(res.msg);
	 					window.location.reload();
	 				}else{
	 					alert(res.msg);
	 				}
	 				
	 			}
	 			
	 			
	 			
	 		});
	 		
	 		
	 		
	 		
	 	}
	 
	 
	 </script>
	 
	 
	



</body>
</html>