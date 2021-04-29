package com.clock.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clock.entity.Layui;
import com.clock.entity.Student;
import com.clock.services.ClockService;
import com.clock.services.ClockServiceImpl;
import com.clock.utils.PrintUtil;
import com.clock.web.AbstractServlet;

@WebServlet("/StudentServlet")

public class StudentServlet extends AbstractServlet{
	@Override
	public Class getServletClass() {
		// TODO Auto-generated method stub
		return StudentServlet.class;
	}
	public void selectStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		ClockService cs = new ClockServiceImpl();
		Layui<Student> list = cs.SelectStudent();
		PrintUtil.write(list, response);
	}
	public int addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");

		String uname = request.getParameter("uname");		
		String className = request.getParameter("className");
		String teacher = request.getParameter("teacher");
		String leader = request.getParameter("leader");

		ClockService cs = new ClockServiceImpl();
		Student stu = new Student();
		stu.setUname(uname);	
		stu.setClassName(className);
		stu.setTeacher(teacher);
		stu.setLeader(leader);
		int num = cs.addStudent(stu);
		return num;
	}
	public void delStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		int id=Integer.parseInt(request.getParameter("id"));		
		ClockService cs = new ClockServiceImpl();
		PrintUtil.write(cs.delStudent(id), response);
	}
	//执行修改方法
		public int upStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=utf-8");
			request.setCharacterEncoding("utf-8");
			int id = Integer.parseInt(request.getParameter("id"));
			String uname = request.getParameter("uname");
			String className = request.getParameter("className");
			String teacher = request.getParameter("teacher");
			String leader = request.getParameter("leader");
			ClockService cs = new ClockServiceImpl();			
			Student stu=new Student();
			stu.setId(id);
			stu.setUname(uname);
			stu.setClassName(className);
			stu.setTeacher(teacher);
			stu.setLeader(leader);
			int num = cs.upStudent(stu);
			return num;
		}
		public void selectStudentid(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			ClockService cs = new ClockServiceImpl();
			int id = Integer.parseInt(request.getParameter("id"));
			PrintUtil.write(cs.selectStudentid(id), response);
		}

}
