<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage = "Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="ISO-8859-1">
 <meta charset="UTF-8">
            <title>SIGN UP  FORM</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">\
            <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
           
</head>
<div id="mydiv" align="center">
	        <h1  class="fas fa-user-plus">Register Here</h1><br><br></div>

         	<form action="SignupServlet" method="post"> 

         		 <div  align="center">

         		    <div class="form-group" >
         		    	
                            <div class="col-md-4 mb-3"><i class="far fa-envelope-open"></i>
                            <label for="validationEmail" align="left" >Email</label >
                            <input type="text" class="form-control is-valid" id="validationServerUsername" placeholder="@example.com"  required style="width:50%" name="email">
                            </div>


                            <div class="col-md-4 mb-3"><i class="fas fa-pen-nib"></i>
                            <label for="validationfirst" align="left">User name</label>
                            <input type="text" class="form-control is-valid" id="validation" placeholder="User name"  required style="width:50%"  name="uname">
                            <div class="valid-feedback">
                            </div>
                             </div>


                            <div class="col-md-4 mb-3" > <i class="fas fa-key"></i>
                            <label for="validationPassword"class="top-left" >  Password</label>
                            <input type="Password" class="form-control is-valid" id="validationPassword" placeholder="Password" aria-describedby="inputGroupPrepend3" required style="width:50%" name="password">       
        
                            </div>



                            <button class="btn btn-primary" type="submit" align="center">Sign Up </button ><br>

                             <a href="Login.html"> <ul>already have an account...</ul></a>
                     </div>
                            

                            
                            
                             
                     </div>
         		   
         	</form>
   	

         </body>
</html>