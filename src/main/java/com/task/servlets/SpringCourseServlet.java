package com.task.servlets;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.task.entity.others.SingleCourse;

@WebServlet(urlPatterns = { "/springCourses.jsp" })
public class SpringCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/springCourses.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// od tuda
		// DOBRO DOHVACA STRINGOVE! --> SPREMI TO u List<COURSE> i to proslijedi u
				// learning agreement i sve prikazi i to je to
				List<SingleCourse> receivingCourses = new LinkedList<>();
				List<SingleCourse> sendingCourses = new LinkedList<>();
				String[] recCourses = req.getParameterValues("mycheck");

				for (String singleCourse : recCourses) {
					String[] courseECTS = singleCourse.split(" ");
					String courseName = "";
					for (int i = 0; i < courseECTS.length - 1; i++) {
						courseName += courseECTS[i] + " ";
					}
					receivingCourses
							.add(new SingleCourse(courseName.trim(), Integer.parseInt(courseECTS[courseECTS.length - 1])));
				}
				String[] sendingCoursesCourse = req.getParameterValues("sendingCourse");
				String[] sendingCoursesECTS = req.getParameterValues("sendingECTS");
				for (int i = 0; i < sendingCoursesCourse.length; i++) {
					if (sendingCoursesCourse[i].equals("")) {
						break;
					}
					sendingCourses.add(new SingleCourse(sendingCoursesCourse[i], Integer.parseInt(sendingCoursesECTS[i])));
				}
				req.setAttribute("sendingCourses", sendingCourses);
				req.setAttribute("receivingCourses", receivingCourses);
				req.setAttribute("semester", "spring");
				req.getRequestDispatcher("/WEB-INF/preview.jsp").forward(req, resp);
	}

}
