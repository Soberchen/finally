package com.clock.dao;

import java.util.List;

import com.clock.entity.Clock_Person;
import com.clock.entity.Is_menu;
import com.clock.entity.Person;
import com.clock.entity.Student;

public interface ClockDao {
	/**
	 * ��¼ϵͳ
	 * @param name
	 * @param password
	 * @return
	 */
	Person showLogin(String name,String password);
	/**
	 * �����û�id ѡ���Ե�¼
	 * @param userId
	 * @return
	 */
	List<Is_menu>SelectAll(int userId);
	/**
	 * fatherId���ݸ���id��ѯȨ��
	 * @param fatherId
	 * @return
	 */
	List<Is_menu>SelectContext(int fatherId);
	/**
	 * 
	 * @param �Թ���Ա����ݲ�ѯ������Ϣ
	 * @return
	 */
	List<Person>selePersons(String name);
	/**
	 * 
	 * @param �Թ���Ա����ݲ�ѯ����ѧ����
	 * @return
	 */
	int countPersons(String name);
	/**
	 * ����ѧԱ��Ϣ
	 * @param per
	 * @return
	 */
	int addPserons(Person per);
	
	/**
	 * ɾ��ѧԱ��Ϣ
	 * @param id
	 * @return
	 */
	int delPersons(int id);
	/**
	 * ǩ��������Ϣ
	 * @return
	 */
	List<Person>SelectClock();
	int countClock();
	/**
	 * ǩ����Ϣ
	 * @param clock
	 * @return
	 */
	int upClockCount(int uId,int cId);
	/**
	 * ����ǩ��ǰ�Ĳ�ѯ
	 * @param id
	 * @return
	 */
	
	List<Clock_Person>colSeleClock(int id);
/**
 * ��ѯѧԱ��Ϣ
 * @return
 */
	List<Student>SelectStudent();
	int countStudent();
	int addStudent(Student stu);//����ѧԱ
	int delStudent(int id);//ɾ��ѧԱ
	int upStudent(Student stu);//�޸�ѧԱ
	List<Student>selectStudentid(int id);//�޸�ǰ�Ĳ�ѯ��������

	
	
	

}
