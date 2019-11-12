<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html>
<html>
<head>

<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;
}
</style>
<title>Enter DepartmentID</title>
</head>
<body>
	
	<f:form action="showDepartment" method="GET">
	Department id : <input type="text" name="department">
	
	<br><br>
	
	<input type="submit" value="Search"/>	
	</f:form>
	
	<table  style="width:100%">
  <tr>
    <th>DepartmentId</th>
    <th>DepartmentName</th>
     <th>ManagerId</th>
      <th>LocationId</th>
  </tr>
  <tr>
    <td>${departmentId}</td>
    <td>${departmentName}</td>
    <td>${managerId}</td>
    <td>${locationId}</td>
  </tr>

</table>

</body>
</html>