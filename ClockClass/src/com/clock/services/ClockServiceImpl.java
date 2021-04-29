package com.clock.services;

import java.util.List;

import com.clock.dao.ClockDao;
import com.clock.dao.ClockDaoImpl;
import com.clock.entity.Clock_Person;
import com.clock.entity.Is_menu;
import com.clock.entity.Layui;
import com.clock.entity.Person;
import com.clock.entity.Student;

public class ClockServiceImpl implements ClockService{
	private ClockDao cd=new ClockDaoImpl();

	@Override
	public Person showLogin(String name, String password) {
		// TODO Auto-generated method stub
		return cd.showLogin(name, password);
	}

	@Override
	public List<Is_menu> SelectAll(int userId) {
		// TODO Auto-generated method stub
		return cd.SelectAll(userId);
	}

	@Override
	public List<Is_menu> SelectContext(int fatherId) {
		// TODO Auto-generated method stub
		return cd.SelectContext(fatherId);
	}

	@Override
	public Layui<Person> selePersons(String name) {
	
		List<Person>list=cd.selePersons(name);
		int count=cd.countPersons(name);
		Layui<Person>use=new Layui<Person>();
		use.setCode(0);
		use.setMsg("");
		use.setCount(count);
		use.setData(list);
		return use;
	}

	@Override
	public Layui<Person> SelectClock() {
		List<Person>list=cd.SelectClock();
		int count=cd.countClock();
		Layui<Person>use=new Layui<Person>();
		use.setCode(0);
		use.setMsg("");
		use.setCount(count);
		use.setData(list);
		return use;
	}

	@Override
	public int upClockCount(int uId,int cId) {
		// TODO Auto-generated method stub
		return cd.upClockCount(uId,cId);
	}

	@Override
	public List<Clock_Person> colSeleClock(int id) {
		// TODO Auto-generated method stub
		return cd.colSeleClock(id);
	}

	@Override
	public Layui<Student> SelectStudent() {
		// TODO Auto-generated method stub
				List<Student>list=cd.SelectStudent();
				int count=cd.countStudent();
				Layui<Student>use=new Layui<Student>();
				use.setCode(0);
				use.setMsg("");
				use.setCount(count);
				use.setData(list);
				return use;
	}

	@Override
	public int addStudent(Student stu) {
		// TODO Auto-generated method stub
		return cd.addStudent(stu);
	}

	@Override
	public int delStudent(int id) {
		// TODO Auto-generated method stub
		return cd.delStudent(id);
	}

	@Override
	public int upStudent(Student stu) {
		// TODO Auto-generated method stub
		return cd.upStudent(stu);
	}

	@Override
	public List<Student> selectStudentid(int id) {
		// TODO Auto-generated method stub
		return cd.selectStudentid(id);
	}

}
