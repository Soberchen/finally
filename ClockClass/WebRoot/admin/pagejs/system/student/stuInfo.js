layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;


  $("#xiugai").click(function(){
	  var id = $("#id").val();
	  var uname = $("#uname").val();
	  var className = $("#className").val();
	  var teacher = $("#teacher").val();
	  var leader = $("#leader").val();
	  var data = {
			  "id":id,
			  "uname":uname,
     		  "className":className,
			  "teacher":teacher,
			  "leader":leader
	  }
	  /*if(name.length<3){
		  layer.alert("登录名不能小于3位数")
		  return false;
	  }else if(password.length < 5 || password.length > 19){
		  layer.alert('密码必须6到12位，且不能出现空格');
		  return false;
	  }else if(loginname.length == "" || loginname.length == null){
		  layer.alert('用户名不能为空');
		  return false;
	  }else if(!email.match(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/)){
		  layer.alert("邮箱格式不正确！请重新输入");
		  return false;
	  }else if(phone.length != 11){
		  layer.alert("手机格式不正确! 请重新输入");
		  return false;
	  }*/
	  /*else if(name !=null  ){
		  var check = checkUname(name);
		  if(check == false){
			  layer.alert("登录账号已存在! 请重新输入")
			  return false;
		  }
	  }*/
	  
	  $.ajax({
	  		url:"/ClockClass/StudentServlet?action=upStudent",
			data:data,
			tyep:"post",
			success:function(data){
				if(data==1){
					layer.msg("用户信息修改成功");
					setTimeout(function(){
						parent.layer.closeAll("iframe");
			            //刷新父页面
			           //parent.location.reload();
						parent.layui.table.reload("newsList");
		        	},1000);
				}else{
					layer.msg("系统异常");
				}
			}
	  })
	  return false;
  })
  
});
