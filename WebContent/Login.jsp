<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage = "Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta charset="UTF-8">
            <title>LOGIN UP  FORM</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">\
            <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
</head>
<body>
         	<div id="mydiv" align="center">
	        <h1  class="fas fa-sign-in-alt">Log in Here</h1><br><br></div>

         	<form action="LoginServlet" method="post"> 

         		 <div  align="center">

         		    <div class="form-group" >
         		    	
                           


                            <div class="col-md-4 mb-3"><i class="fas fa-pen-nib"></i>
                            <label for="validationfirst" align="left"><b>User name</b></label>
                            <input type="text" class="form-control is-valid" id="validation" placeholder="User name"  required style="width:50%" name="name">
                            <div class="valid-feedback">
                            </div>
                             </div>


                            <div class="col-md-4 mb-3" > <i class="fas fa-key"></i>
                            <label for="validationPassword"class="top-left"> <b> Password</b></label>
                            <input type="Password" class="form-control is-valid" id="validationPassword" placeholder="Password" aria-describedby="inputGroupPrepend3" required style="width:50%"name="passw">       
        
                            </div>
                                    <button class="btn btn-primary" type="submit">Log In </button >
                                    <a href="SignUp.html"> <input type="button" name="SignUp" class="btn btn-primary" value="SignUp">  </input></a>


                                    <div class="form-check">
                                       <input class="form-check-input is-invalid" type="checkbox" value="" id="invalidCheck3" required>
                                       <label class="form-check-label" for="invalidCheck3">
                                        Remember Me
                                         </label>
      
                                     </div>
                     </div>
                     </div>
         		   
         	</form>
   	

         </body>
</html>