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

@WebServlet("/SelectClockServlet")
public class SelectClockServlet extends AbstractServlet{

	@Override
	public Class getServletClass() {
		// TODO Auto-generated method stub
		return SelectClockServlet.class;
	}
	public void selectClo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
	
		ClockService cs = new ClockServiceImpl();
		Layui<Person> list = cs.SelectClock();
		PrintUtil.write(list, response);
	}
	public void selectClcokOne(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClockService cs = new ClockServiceImpl();
		int uId = Integer.parseInt(request.getParameter("uid"));
		
		PrintUtil.write(cs.colSeleClock(uId), response);
	}
	//ÐÞ¸ÄÇ©µ½
	public int upClock(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		int uId = Integer.parseInt(request.getParameter("uid"));
		
		int cId = Integer.parseInt(request.getParameter("isStatus"));
		ClockService cs = new ClockServiceImpl();
		
		int num=cs.upClockCount(uId, cId);
		

		return num;
	}
	
}
