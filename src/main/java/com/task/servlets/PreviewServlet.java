package com.task.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.task.dao.DAOProvider;
import com.task.entity.others.SingleCourse;
import com.task.entity.users.Student;

@WebServlet(urlPatterns = { "/WEB-INF/preview.jsp" })
public class PreviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<SingleCourse> sendingCourses = (List<SingleCourse>) req.getAttribute("sendingCourses");
		List<SingleCourse> receivingCourses = (List<SingleCourse>) req.getAttribute("receivingCourses");
		System.out.println(sendingCourses.toString());
		System.out.println(receivingCourses.toString());
		System.out.println("I'm here somehow");
		req.getRequestDispatcher("/WEB-INF/preview.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email =  (String) req.getSession().getAttribute("current.user.mail");
		// use student to create additional table
		Student student = DAOProvider.getDAO().getStudentByEmail(email);
		List<SingleCourse> sendingCourses = (List<SingleCourse>) req.getAttribute("sendingCourses");
		List<SingleCourse> receivingCourses = (List<SingleCourse>) req.getAttribute("receivingCourses");
		String semester = (String) req.getAttribute("semester");
		System.out.println(sendingCourses.toString());
		System.out.println(receivingCourses.toString());
		// Analyze the servlet exception
		// Set response content type
		resp.setContentType("text/html");

		// dodaj back ili log out button na kraju toga svega
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int next = year+1;
		PrintWriter out = resp.getWriter();
		out.write("<html><head><title>LA Preview</title>");
		// header is here
		out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">");
		out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\"></script>");
	    out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
	    // end of header   
	    out.write("</head><body>");
	    // BODY part
	    // title part
	    out.write("<div id=\"headerDiv\" style=\"text-align: center\">");
	    out.write("<p id= \"titleText\"><font size=\"20\">Learning Agreement \n" + 
	    		" - Student Mobility for Studies\n" + 
	    		"</font></p>");
	    out.write("</div>");
	    // end of title part
	    // back button
	    out.write("<form>");
	    out.write(" <input type=\"button\" value=\"Back\" onclick=\"history.back()\">");
	    out.write("</form>");
	    // end of back button
		out.write("<table cellpadding=\"5\" class=\"table table-bordered\">");
		out.write("<td></td>");
		out.write("<td><b>Last name(s)</b></td>");
		out.write("<td><b>First name(s)</b></td>");
		out.write("<td><b>Date of birth</b></td>");
		out.write("<td><b>Nationality</b></td>");
		out.write("<td><b>Sex</b></td>");
		out.write("<td><b>Study Cycle</b></td>");
		out.write("<td><b>Field of Education</b></td>");
		
		out.write("<tr>");
		out.write("<th>Student</th>");
		out.write("<td>"+student.getLastName() +"</td>");
		out.write("<td>"+student.getFirstName() +"</td>");
		out.write("<td>"+student.getDateOfBirth() +"</td>");
		out.write("<td>"+student.getNationality() +"</td>");
		out.write("<td>"+student.getSex() +"</td>");
		out.write("<td>"+student.getStudyCycle() +"</td>");
		out.write("<td>"+student.getFieldOfEducation() +"</td>");
		
		
		// tu ima 6 polja,a ne 7,zadnje ostavi prazno
		out.write("<tr>");
		out.write("<td></td>");
		out.write("<td><b>Name</b></td>");
		out.write("<td><b>Faculty / Department</b></td>");
		out.write("<td><b>Erasmus code (if applicable)</b></td>");
		out.write("<td><b>Address</b></td>");
		out.write("<td><b>Country</b></td>");
		out.write("<td><b>Contact person name;email;phone</b></td>");
		
		out.write("<tr>");
		out.write("<th>Sending Institution</th>");
		out.write("<td>"+student.getUniversityName() +"</td>");
		out.write("<td>"+student.getFacultyorDepartment() +"</td>");
		out.write("<td>"+student.getErasmusCode() +"</td>");
		out.write("<td>"+student.getFacultyAddress() +"</td>");
		out.write("<td>"+student.getCountry() +"</td>");
		out.write("<td>"+student.getContactPersonInfo() +"</td>");
		
		out.write("<tr>");
		out.write("<td></td>");
		out.write("<td><b>Name</b></td>");
		out.write("<td><b>Faculty / Department</b></td>");
		out.write("<td><b>Erasmus code (if applicable)</b></td>");
		out.write("<td><b>Address</b></td>");
		out.write("<td><b>Country</b></td>");
		out.write("<td><b>Contact person name;email;phone</b></td>");
		
		out.write("<tr>");
		out.write("<th>Receiving Institution</th>");
		out.write("<td>Poznan University of Technology</td>");
		out.write("<td>Computing / Software Engineering</td>");
		out.write("<td>PL POZNAN02</td>");
		out.write("<td>5 M. Sklodowska-Curie Square, 60-965 Poznan, Poland</td>");
		out.write("<td>Poland</td>");
		out.write("<td>Dr. Sc. Jan Lamperski; jan.lamperski@put.poznan.pl </td>");
		
		out.write("</table>");
		out.write("<div id=\"headerDiv\" style=\"text-align: center\">");
		out.write("<h2>Table A Before The Mobility - Study Programme at the Receiving Institution</h2>");
		// from 9th to 2nd month coz this is autumn semester if it's different then it should be for spring
		if (semester.equals("autumn")) {
			out.write("<h3>" + "Planned period of the mobility: from [09/" + year + "] [02/" + next  + "]" + "</h3>");
		}else {
			out.write("<h3>" + "Planned period of the mobility: from [03/" + year + "] [07/" + next  + "]" + "</h3>");
		}
		out.write("</div>");
		// only this line matters if it's spring or autumn and semester type 
		out.write("<table cellpadding=\"5\" class=\"table table-bordered\">");
		out.write("<th>Component  code (if any)</th>");
		out.write("<th>Component title at the Receiving Institution</th>");
		out.write("<th>Semester</th>");
		out.write("<th>Number of ECTS credits (or equivalent) to be awarded by the Receiving Institution upon successful completion</th>");
		int recCount = 0;
		for(SingleCourse course : receivingCourses) {
			
			out.write("<tr>");
			out.write("<td></td>");
			out.write("<td>" + course.getName() + "</td>");
			out.write("<td>" + semester.substring(0, 1).toUpperCase() + semester.substring(1) + "</td>");
			out.write("<td>" + course.getECTS() + "</td>");
			recCount+=course.getECTS();
			out.write("</tr>");
		}
		out.write("<tr>");
		out.write("<td></td>");
		out.write("<td></td>");
		out.write("<td></td>");
		out.write("<td> Total:"+ recCount + "</td>");
		out.write("</table>");
		
		
		out.write("<br><br>");
		out.write("<div id=\"headerDiv\" style=\"text-align: center\">");
		out.write("<h2>Table B Before The Mobility - Recognition at the Sending Institution</h2>");
		out.write("</div>");
		out.write("<table cellpadding=\"5\" class=\"table table-bordered\">");
		out.write("<th>Component  code (if any)</th>");
		out.write("<th>Component title at the Sending Institution</th>");
		out.write("<th>Semester</th>");
		out.write("<th>Number of ECTS credits (or equivalent) to be recognised by the Sending Institution</th>");
		int recCount1 = 0;
		for(SingleCourse course : sendingCourses) {
			out.write("<tr>");
			out.write("<td></td>");
			out.write("<td>" + course.getName() + "</td>");
			out.write("<td>" + semester.substring(0, 1).toUpperCase() + semester.substring(1) + "</td>");
			out.write("<td>" + course.getECTS() + "</td>");
			recCount1+=course.getECTS();
			out.write("</tr>");
		}
		out.write("<tr>");
		out.write("<td></td>");
		out.write("<td></td>");
		out.write("<td></td>");
		out.write("<td> Total:"+ recCount1 + "</td>");
		out.write("</table>");
		out.write("<a href=\"index.jsp\">Home Page</a>");
		out.write("</body></html>");
	}
}
