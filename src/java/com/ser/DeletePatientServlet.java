package com.ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeletePatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagementsystem","root","12345");
			String query = "DELETE FROM `patients` WHERE ReportId=?";
			PreparedStatement pst=con.prepareStatement(query);
			String pid = req.getParameter("reportid");
			pst.setString(1, pid);
			pst.executeUpdate();
		        res.sendRedirect("AdminPortal.jsp"); 	
		}
		catch(Exception e) {
			out.println("<h1 text-align='center'>");
		        out.println("Some Error Occured. Please contact the development team");
		        out.println("</h1>");
		        System.out.println(e);
		}
	
	}

}
