package com.clock.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.clock.entity.Is_menu;
import com.clock.services.ClockService;
import com.clock.services.ClockServiceImpl;
import com.clock.web.AbstractServlet;

@WebServlet("/ShowSelectServlet")
public class ShowSelectServlet extends AbstractServlet{

	@Override
	public Class getServletClass() {
		// TODO Auto-generated method stub
		return ShowSelectServlet.class;
	}
	public String ShowStu(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		int  id=Integer.parseInt(request.getParameter("id"));
	
		ClockService cs = new ClockServiceImpl();
	
		List<Is_menu>list=cs.SelectContext(id);
		
		HttpSession session=request.getSession();
		session.setAttribute("list1", list);
		return "showButton/stubtn";
	}
	public String ShowClock(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		int  id=Integer.parseInt(request.getParameter("id"));
	
		ClockService cs = new ClockServiceImpl();
	
		List<Is_menu>list=cs.SelectContext(id);
		
		HttpSession session=request.getSession();
		session.setAttribute("list1", list);
		return "showButton/clockBtn";
	}
	public String ShowClss(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		int  id=Integer.parseInt(request.getParameter("id"));
		
		ClockService cs = new ClockServiceImpl();
	
		List<Is_menu>list=cs.SelectContext(id);
		
		HttpSession session=request.getSession();
		session.setAttribute("list1", list);
		
		
		return "showButton/classBtn";
	}

	

}
