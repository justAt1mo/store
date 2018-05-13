<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>医疗管理系统主页</title>
<link href="./Wopop_files/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/style.css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/userpanel.css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/jquery.ui.all.css">
</head>
<body class="login" mycollectionplug="bind">
<div class="login_m">
<div class="login_logo"><span style="font-size:30px">医疗管理系统</span></div>
<div class="login_boder">

<s:form action="login" namespace="/"  theme="simple">
<div class="login_padding" id="login_model">

  <h2>用户名</h2>
  <label>
  	<s:textfield label="用户名" name="id" cssClass="txt_input txt_input2"/>
    <!-- <input type="text" id="id" class="txt_input txt_input2" value="" placeholder="请输入用户名"> -->
  </label>
  <h2>密码</h2>
  <label>
  	<s:password label="密码" name="password" cssClass="txt_input"/>
    <!-- <input type="password" name="textfield2" id="password" class="txt_input" value="" placeholder="请输入密码"> -->
  </label>
 
 

 
  <br/>
  <br/>
  <div class="rem_sub">

    <label>
      <s:submit value="登录" cssClass="sub_button"/>
      <!-- <input type="submit" class="sub_button" name="button" id="button" value="登陆" style="opacity: 0.7;"> -->
    </label>
  </div>
</div>
</s:form>




<!--login_padding  Sign up end-->
</div><!--login_boder end-->
</div><!--login_m end-->

</body>
</html>