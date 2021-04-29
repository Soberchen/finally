<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path ;
	pageContext.setAttribute("ctx", basePath);
%>    		
   <script type="text/html" id="toolbarDemo">
				<c:forEach var="i" items="${list1}">
					${i.btn}
				</c:forEach>
			</script>
			
		<table id="roleList" lay-filter="roleList"></table>  
	  	<script src="user/clockList.js" charset="utf-8"></script>