package com.clock.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clock.entity.Layui;
import com.clock.entity.Person;
import com.clock.services.ClockService;
import com.clock.services.ClockServiceImpl;
import com.clock.utils.PrintUtil;
import com.clock.web.AbstractServlet;

@WebServlet("/SelectAllListServlet")
public class SelectAllListServlet  extends AbstractServlet{

	@Override
	public Class getServletClass() {
		// TODO Auto-generated method stub
		return SelectAllListServlet.class;
	}
	public void selectUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("uname");
	
		ClockService cs = new ClockServiceImpl();
		Layui<Person> list = cs.selePersons(name);

		PrintUtil.write(list, response);
	}
}
