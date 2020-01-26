package com.task.servlets;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.task.dao.DAOProvider;
import com.task.entity.users.Student;

@WebServlet(urlPatterns = { "/register.jsp" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/register.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student = new Student();
		
		//catching variables from HTML
		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		LocalDate dateOfBirth = LocalDate.parse(req.getParameter("dateOfBirth"));
		String email = req.getParameter("email");
		String nationality = req.getParameter("nationality");
		String sex = req.getParameter("gender");
		String studyCycle = req.getParameter("studyCycle");
		String fieldOfEducation = req.getParameter("fieldOfEducation");
		String semesterType = req.getParameter("semesterType");
		// new 5 variables
		String facultyOrDepartment = req.getParameter("facultyOrDepartment");
		String erasmusCode = req.getParameter("erasmusCode");
		String facultyAddress = req.getParameter("facultyAddress");
		String contactPersonInfo = req.getParameter("contactPersonInfo");
		String country = req.getParameter("country");
		String universityName = req.getParameter("universityName");
		// *** end of new 5 variables
		int studentPassword = req.getParameter("studentPassword").hashCode();

		// setting variables to student
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setStudentPassword(studentPassword);
		student.setDateOfBirth(dateOfBirth);
		student.setFieldOfEducation(fieldOfEducation);
		student.setNationality(nationality);
		student.setSex(sex);
		student.setStudyCycle(studyCycle);
		student.setEmail(email);
		student.setSemesterType(semesterType);
		// new 5 variables
		student.setFacultyorDepartment(facultyOrDepartment);
		student.setContactPersonInfo(contactPersonInfo);
		student.setFacultyAddress(facultyAddress);
		student.setCountry(country);
		student.setErasmusCode(erasmusCode);
		student.setUniversityName(universityName);
		// *** end of new 5 variables
		System.out.println(student.toString());
		DAOProvider.getDAO().createStudent(student);
		
		// redirecting user back to the main page 
		resp.sendRedirect("/task/index.jsp");
}
}
