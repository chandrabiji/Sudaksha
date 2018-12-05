package com.sudaksha.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sudaksha.bean.Student;
import com.sudaksha.daoImpl.StudentDAOImpl;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Student student = new Student();
		StudentDAOImpl studentDAO = new StudentDAOImpl();
		student.setStudentNumber(Integer.parseInt(request.getParameter("sno")));
		student.setStudentName(request.getParameter("sname"));
		student.setStudentMarks(Integer.parseInt(request.getParameter("marks")));
		int n = studentDAO.insertStudent(student);
		if(n!=0)
		{
			out.println("Successfully Student Record Inserted.");
			RequestDispatcher rd = request.getRequestDispatcher("./student.html");
			rd.include(request, response);
		}else{
			out.println("Record Not Inserted.Please try again...");
			RequestDispatcher rd = request.getRequestDispatcher("./student.html");
			rd.include(request, response);
			
		}
	}

}
