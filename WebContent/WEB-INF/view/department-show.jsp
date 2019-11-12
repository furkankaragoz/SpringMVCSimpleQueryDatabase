




<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Department Query Screen</title>
</head>
<body>
<h2>Query successfull !</h2>

<br>
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

<br>

</body>
</html>