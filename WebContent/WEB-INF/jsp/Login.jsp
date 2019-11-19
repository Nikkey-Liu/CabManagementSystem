<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <meta http-equiv="x-ua-compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1"><!--宽度等于设备宽度-->
 <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<title>毕业设计选题系统</title>
 <style>
 html,body{
	width:100%;
	height:100%
}
 body{
  font-family: "华文细黑";
  background:url("${pageContext.request.contextPath}/img/bg.jpg") no-repeat;
  background-size: 100%;
}
     .container-fluid {
        padding-top: 150px;
        padding-bottom: 10px;
      }
     .list-group-item{
       text-align: center;
     }

      .login{
        margin-top:60px;

      }
      
.center {
	width: auto;
	display: table;
	margin-left: auto;
	margin-right: auto;
}
    </style>
 <script type="text/javascript">
 function check(){
	    var username = $("#username").val();
	    var password = $("#password").val();
	   
	    if(username=="" || password==""){
	    	$("#message").text("Account and password can not be null");
	        return false;
	    }  
	    return true;
	}
 function toSign(){
	    window.location.href="${pageContext.request.contextPath }/sign.action"
	}
    </script>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="col-md-12">
			<div class="row ">			
		    <div class="col-md-4">
		     </div>   
			<div class="col-md-4">
               <div class="login">
             	<form action="${pageContext.request.contextPath }/login.action"  method="post" onsubmit="return check()">
             	
   <div class="form-horizontal center">
   
    <div class="form-group">
       <h2 class="form-signin-heading">Please sign in</h2>
      <div class="row-fluid">
        <input type="text" class="form-control" id="username" placeholder="userName" name="username">
      </div>
    </div>
    <div class="form-group">
    
      <div class="row-fluid">
        <input type="password" class="form-control" id="password" placeholder="Password"  name="password">
      </div>
    </div>
 
    <div class="form-group">
     <div class="col-sm-offset-2 col-sm-10 row">
  
     
   <div class="form-group">
     <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
      <div class="row-fluid">
     
         <div class="col-md-2">
        <button type="submit" class="btn btn-default" id="btn1">Login</button>
      </div>
     <!--  </div>
       <div class="col-md-2">
        <button type="button" class="btn btn-default" id="btn2" onclick="return toSign()">注册</button>
      </div>
      -->
      </div>
    
    </div>
     
  </div>
   </form>
  </div>
  <font color="red">
			 <%-- 提示信息--%>
			 <span id="message">${msg}</span>
		</font>
				</div>
			</div>
		    <div class="col-md-4">
			</div>
		</div>
	</div>
    </div>

</div>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
</body>
</html>
