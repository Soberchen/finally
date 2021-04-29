<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("ctx", basePath);
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>新增学员</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="${ctx}admin/lib/layui-v2.5.5/css/layui.css" media="all" />
	<link rel="stylesheet" href="${ctx}admin/css/public.css" media="all" />
</head>
<body class="childrenBody">
<form class="layui-form layui-form-pane" action="Javascript:void(0)">
  <div class="layui-form-item">
    <label class="layui-form-label">姓名</label>
    <div class="layui-input-inline">
      <input type="text" name="uname" id="uname" lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
    </div>
  </div> 
  <div class="layui-form-item">
    <label class="layui-form-label">班级</label>
    <div class="layui-input-inline">
      <input type="text" name="className" id="className"  placeholder="请输入班级" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">教员</label>
    <div class="layui-input-inline">
      <input type="text" name="teacher" id="teacher" lay-verify="required" placeholder="请输入教员" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">班主任</label>
    <div class="layui-input-inline">
      <input type="text" name="leader" id="leader" lay-verify="required" placeholder="请输入班主任"  autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <button class="layui-btn layui-btn-fluid" id="tijiao" lay-filter="addStudent">新增用户</button>
  </div>
</form>
<script type="text/javascript" src="${ctx}admin/lib/layui-v2.5.5/layui.js"></script>
<script type="text/javascript" src="${ctx}admin/lib/jquery-3.4.1/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="${ctx}admin/pagejs/system/student/stuAdd.js"></script>
</body>
</html>