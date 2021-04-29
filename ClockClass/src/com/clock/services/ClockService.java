package com.clock.services;

import java.util.List;

import com.clock.entity.Clock_Person;
import com.clock.entity.Is_menu;
import com.clock.entity.Layui;
import com.clock.entity.Person;
import com.clock.entity.Student;

public interface ClockService {

	Person showLogin(String name,String password);//��¼ϵͳ

	List<Is_menu>SelectAll(int userId);//�����û�id ѡ���Ե�¼
	
	List<Is_menu>SelectContext(int fatherId);//fatherId���ݸ���id��ѯȨ��
	
	Layui<Person>selePersons(String name);// �Թ���Ա����ݲ�ѯ������Ϣ
	
	Layui<Person>SelectClock();//ǩ��������Ϣ
	
	int upClockCount(int uId,int cId);// ǩ����Ϣ
	
	List<Clock_Person> colSeleClock(int id);//ǩ��ǰ�Ĳ�ѯ

	Layui<Student>SelectStudent();//��ѯѧԱ��Ϣ
	
	int addStudent(Student stu);//����ѧԱ
	
	int delStudent(int id);//ɾ��ѧԱ
	
	int upStudent(Student stu);//�޸�ѧԱ
	
	List<Student>selectStudentid(int id);//�޸�ǰ�Ĳ�ѯ��������

	
}
