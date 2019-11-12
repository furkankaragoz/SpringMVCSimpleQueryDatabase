package com.furkan.springdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepartmentController {
	
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";

	
	@RequestMapping("/queryDepartment")
	public String inputDepartment() {
			
		
		return "department-input";
		
	}
	
	@RequestMapping("/showDepartment") 
	public String savePersonel(HttpServletRequest request ,Model model) throws SQLException { 
		
		
		String deptName = request.getParameter("department");
		int deptId = Integer.valueOf(request.getParameter("department"));
		
		Connection myConn = DriverManager.getConnection(dbUrl, "hr", "hr"); // Oracle default DB hr.Username hr,password hr.

		PreparedStatement stmt = myConn
				.prepareStatement("Select department_id,department_name,manager_id,location_id from departments where department_id=?");

		stmt.setInt(1, deptId);
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			
			model.addAttribute("departmentId",rs.getInt(1));
			model.addAttribute("departmentName",rs.getString(2));
			model.addAttribute("managerId",rs.getInt(3));
			model.addAttribute("locationId",rs.getInt(4));
			
			return "department-input";
			
		}
		
		return  "department-input";
		
	
		
		
		

		
	
		
		
	}
	
	
}
