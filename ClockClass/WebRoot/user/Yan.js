   var  flag=false;
function ifCont(uname,pass){
	var name=$("#username").val();
	var pwd=$("#password").val();

	if(name==""||pwd==""){
		alert("用户名或密码不能为空！")
		flag=false;
	}
	flag=true;
}
$("#cc").submit(function(){
	return flag;
});
// 进行登录操作验证
form.on('submit(login)', function (data) {
    data = data.field;
    if (data.username == '') {
        layer.msg('用户名不能为空');
        return false;
    }
    if (data.password == '') {
        layer.msg('密码不能为空');
        return false;
    }
    if (data.captcha == '') {
        layer.msg('验证码不能为空');
        return false;
    }
    layer.msg('登录成功', function () {
        window.location = 'list.jsp';
    });
    return false;
});