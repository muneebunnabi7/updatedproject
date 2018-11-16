

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h4>Booking Information is:<h4><br>
<table border='2px'>
      <tr> 
           <td>First Name</td>
           <td>Second Name</td>
           <td>Last Name</td>
           <td>Gender</td>
           <td>Merrage Status</td>
           <td>DOB</td>
           <td>Check In</td>
           <td>Check out</td>
           <td>Total Persons</td>
           <td>Mail</td>
           <td>Phone</td>
           <td>State</td>
           <td>City</td>
           <td>Zip No</td>
           <td>Adhar No</td>
           <td>Pan Card No</td>
      </tr>
      <c:forEach items="${requestScope.data}" var="d">
      <tr>
           <td>${d.fname }</td>
           <td>${d.sname }</td>
           <td>${d.lname }</td>
           <td>${d.gender }</td>
           <td>${d.mstatus }</td>
           <td>${d.dob }</td>
           <td>${d.checkin }</td>
           <td>${d.checkout }</td>
           <td>${d.noper }</td>
           <td>${d.email }</td>
           <td>${d.phone }</td>
           <td>${d.state }</td>
           <td>${d.city }</td>
           <td>${d.zip }</td>
           <td>${d.adhar }</td>
           <td>${d.pan }</td>
        </tr>
        </c:forEach>
        </table>
<c:if test="${requestScope.message !=null}">
	NOTE : ${message}
</c:if>
<c:if test="${requestScope.data !=null and not empty requestScope.data  }">
    
</c:if>


</body>
</html>