layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  

	 /* $.ajax({
		  url:"/ControlText/SelectUserServlet?action=selectUserBtn",
		  type:"post",
		  success:function(data){
			var info = eval("("+data+")");
			 // var row = info.data;
			  var role = $("#role1");
			  var html = '';
			  $.each(info,function(index,item){
				  html += '<option value="'+item.id+'">'+item.rname+'</option>';
			  })
			  role.html(html);
			  form.render("select");
		  }
	  })*/

  
  /*function checkUname(uname){
	  var is = false;
	  $.ajax({
		  url:"/ControlText/SelectUserServlet?action=IfUser",
		  data:{"uname":uname},
		  async:false,
		  type:"post",
		  success:function(data){
			  if(data == 0){
				  is = true;
			  }else{
				  is = false;
			  }
			  
		  }
	  })
	  return is;
  }
  
  $("#uname").blur(function(){
	  var name = $("#uname").val();
	  if(!name.length == "" || !name.length == null){
		  var check = checkUname(name);
		  if(check == false){
			  layer.alert("登录账号已存在! 请重新输入")
		  }
	  }
  })*/
  
  
  $("#tijiao").click(function(){
	  var uname = $("#uname").val();
	  var className = $("#className").val();
	  var teacher = $("#teacher").val();
	  var leader=$("#leader").val();
	  var data = {
			  "uname":uname,
     		  "className":className,
			  "teacher":teacher,
			  "leader":leader
	  }
	 /* if(uname.length<3){
		  layer.alert("登录名不能小于3位数")
		  return false;
	  }else if(password.length < 5 || password.length > 19){
		  layer.alert('密码必须6到12位，且不能出现空格');
		  return false;
	  }else if(identityCode.length == "" || identityCode.length == null){
		  layer.alert('身份信息不能为空！');
		  return false;
	  }else if(!email.match(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/)){
		  layer.alert("邮箱格式不正确！请重新输入");
		  return false;
	  }else if(phone.length != 11){
		  layer.alert("手机格式不正确! 请重新输入");
		  return false;
	  }*/
	  /*else if(!name.length == "" || !name.length == null){
		  var check = checkUname(name);
		  if(check == false){
			  layer.alert("登录账号已存在! 请重新输入")
			  return false;
		  }
	  }*/
	  $.ajax({
	  		url:"/ClockClass/StudentServlet?action=addStudent",
			data:data,
			tyep:"post",
			success:function(data){
//				alert(data);
				if(data == 1){
					layer.msg("添加成功")
					setTimeout(function(){
						parent.layer.closeAll("iframe");
			            //刷新父页面
//  			            parent.location.reload();					
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
