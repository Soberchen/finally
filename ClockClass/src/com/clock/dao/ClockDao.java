package com.clock.dao;

import java.util.List;

import com.clock.entity.Clock_Person;
import com.clock.entity.Is_menu;
import com.clock.entity.Person;
import com.clock.entity.Student;

public interface ClockDao {
	/**
	 * 登录系统
	 * @param name
	 * @param password
	 * @return
	 */
	Person showLogin(String name,String password);
	/**
	 * 根据用户id 选择性登录
	 * @param userId
	 * @return
	 */
	List<Is_menu>SelectAll(int userId);
	/**
	 * fatherId根据父级id查询权限
	 * @param fatherId
	 * @return
	 */
	List<Is_menu>SelectContext(int fatherId);
	/**
	 * 
	 * @param 以管理员的身份查询个人信息
	 * @return
	 */
	List<Person>selePersons(String name);
	/**
	 * 
	 * @param 以管理员的身份查询所有学生数
	 * @return
	 */
	int countPersons(String name);
	/**
	 * 新增学员信息
	 * @param per
	 * @return
	 */
	int addPserons(Person per);
	
	/**
	 * 删除学员信息
	 * @param id
	 * @return
	 */
	int delPersons(int id);
	/**
	 * 签到管理信息
	 * @return
	 */
	List<Person>SelectClock();
	int countClock();
	/**
	 * 签到信息
	 * @param clock
	 * @return
	 */
	int upClockCount(int uId,int cId);
	/**
	 * 更改签到前的查询
	 * @param id
	 * @return
	 */
	
	List<Clock_Person>colSeleClock(int id);
/**
 * 查询学员信息
 * @return
 */
	List<Student>SelectStudent();
	int countStudent();
	int addStudent(Student stu);//增加学员
	int delStudent(int id);//删除学员
	int upStudent(Student stu);//修改学员
	List<Student>selectStudentid(int id);//修改前的查询所有数据

	
	
	

}
