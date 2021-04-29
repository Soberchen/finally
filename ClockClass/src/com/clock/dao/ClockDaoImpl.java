package com.clock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clock.utils.DataBaseUtil;
import com.clock.entity.Clock_Person;
import com.clock.entity.Is_menu;
import com.clock.entity.Person;
import com.clock.entity.Student;

public class ClockDaoImpl extends BaseDao implements ClockDao {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement ps = null;

	@Override
	public Person showLogin(String name, String password) {
		conn = getConnection();
		Person user = new Person();
		String sql = "SELECT `id`,`name`,`loginName`,`password` FROM`student` WHERE `loginName`='" + name
				+ "' AND `password` ='" + password + "'";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					user.setId(rs.getInt(1));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataBaseUtil.closeAll(rs, ps, conn);
		}

		return user;
	}

	@Override
	public List<Is_menu> SelectAll(int userId) {
		conn = getConnection();
		List<Is_menu> list = null;
		String sql = "SELECT `id`,`mname`,`fatherId`,`url`,`btn`,`type` FROM `is_menu` WHERE id IN (SELECT `mId` FROM `student_menu` WHERE `sId`="
				+ userId + ")";
		try {
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			if (rs != null) {
				list = new ArrayList<Is_menu>();
				while (rs.next()) {
					Is_menu im = new Is_menu();
					im.setId(rs.getInt(1));
					im.setMname(rs.getString(2));
					im.setFatherId(rs.getInt(3));
					im.setUrl(rs.getString(4));
					im.setBtn(rs.getString(5));
					im.setTypeId(rs.getInt(6));
					list.add(im);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataBaseUtil.closeAll(rs, ps, conn);
		}

		return list;

	}

	@Override
	public List<Is_menu> SelectContext(int fatherId) {
		conn = getConnection();
		List<Is_menu> list = null;
		String sql = "SELECT `id`,`mname`,`fatherId`,`url`,`btn`,`type` FROM `is_menu` WHERE  `fatherId` =" + fatherId
				+ "";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				list = new ArrayList<Is_menu>();
				while (rs.next()) {
					Is_menu im = new Is_menu();
					im.setId(rs.getInt(1));
					im.setMname(rs.getString(2));
					im.setFatherId(rs.getInt(3));
					im.setUrl(rs.getString(4));
					im.setBtn(rs.getString(5));
					im.setTypeId(rs.getInt(6));
					list.add(im);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataBaseUtil.closeAll(rs, ps, conn);
		}
		return list;
	}

	@Override
	public List<Person> selePersons(String name) {
		conn = getConnection();
		List<Person> list = null;
		String sql = "SELECT `student`.`id`,`name`,`loginName`,`clockTime`,`clockCount` FROM `is_clock`,`student`,`pserson_clock` WHERE `pId`=`student`.`id` AND `is_clock`.`id`=`cId`\n";
		try {
			if (name != null && name.length() > 0) {
				sql += " AND `name` LIKE CONCAT('%','" + name + "','%')\n";

			}
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				list = new ArrayList<Person>();
				while (rs.next()) {
					Person im = new Person();
					im.setId(rs.getInt(1));
					im.setName(rs.getString(2));
					im.setLoginName(rs.getString(3));
					im.setClockTime(rs.getString(4));
					im.setClockCount(rs.getInt(5));
					list.add(im);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataBaseUtil.closeAll(rs, ps, conn);
		}

		return list;
	}

	@Override
	public int countPersons(String name) {
		conn = getConnection();
		String sql = "SELECT COUNT(1) FROM `student` where 1=1\n ";
		int num = 0;
		try {
			if (name != null && name.length() > 0) {
				sql += " AND `name` LIKE CONCAT('%','" + name + "','%')\n";

			}
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					num = rs.getInt("COUNT(1)");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataBaseUtil.closeAll(rs, ps, conn);
		}

		return num;
	}

	@Override
	public int addPserons(Person per) {
		String sql="";
		
		return 0;
	}

	@Override
	public int delPersons(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int upClockCount(int uId,int cId) {
		String sql="UPDATE `pserson_clock` SET  `cId`=? WHERE `pId`=?";
		Object[]params= {cId,uId};
		return executeUpdate(sql, params);
	}

	@Override
	public List<Person> SelectClock() {
		conn = getConnection();
		List<Person> list = null;
		String sql = "SELECT `student`.`id`,`name`,`loginName`,`clockTime`,`clockCount` FROM `is_clock`,`student`,`pserson_clock` WHERE `pId`=`student`.`id` AND `is_clock`.`id`=`cId`\n";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				list = new ArrayList<Person>();
				while (rs.next()) {
				
					Person im = new Person();
					im.setId(rs.getInt(1));
					im.setName(rs.getString(2));
					im.setLoginName(rs.getString(3));
					im.setClockTime(rs.getString(4));
					im.setClockCount(rs.getInt(5));
					list.add(im);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataBaseUtil.closeAll(rs, ps, conn);
		}

		return list;
	}

	@Override
	public int countClock() {
		conn = getConnection();
		String sql = "SELECT COUNT(1) FROM `student` where 1=1\n ";
		int num = 0;
		try {
			
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					num = rs.getInt("COUNT(1)");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataBaseUtil.closeAll(rs, ps, conn);
		}

		return num;
	}

	@Override
	public List<Clock_Person> colSeleClock(int id) {
		conn = getConnection();
		List<Clock_Person> list = null;
		String sql = "SELECT * FROM `pserson_clock`  WHERE `pId`="+id+"\n";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				list = new ArrayList<Clock_Person>();
				while (rs.next()) {
				
					Clock_Person im = new Clock_Person();
					im.setcId(rs.getInt(1));
					im.setpId(rs.getInt(2));
					list.add(im);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataBaseUtil.closeAll(rs, ps, conn);
		}

		return list;
	}

	@Override
	public List<Student> SelectStudent() {
		conn = getConnection();
		List<Student> list = null;
		String sql = "SELECT `id`,`uname`,`className`,`teacher`,`leader`FROM `person`";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				list = new ArrayList<Student>();
				while (rs.next()) {
					Student stu=new Student();
					stu.setId(rs.getInt(1));
					stu.setUname(rs.getString(2));
					stu.setClassName(rs.getString(3));
					stu.setTeacher(rs.getString(4));	
					stu.setLeader(rs.getString(5));
				    list.add(stu);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataBaseUtil.closeAll(rs, ps, conn);
		}
		return list;

	}

	@Override
	public int countStudent() {
		conn = getConnection();
		String sql = "SELECT COUNT(1) FROM `person` where 1=1\n ";
		int num = 0;
		try {						
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					num = rs.getInt("COUNT(1)");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataBaseUtil.closeAll(rs, ps, conn);
		}

		return num;

	}

	@Override
	public int addStudent(Student stu) {
		String sql="INSERT INTO `person`(`uname`,`className`,`teacher`,`leader`)VALUES (?,?,?,?)";
		Object []params= {stu.getUname(),stu.getClassName(),stu.getTeacher(),stu.getLeader()};
		return executeUpdate(sql, params);

	}

	@Override
	public int delStudent(int id) {
		String sql="DELETE FROM `person` WHERE id=?";
		Object []params= {id};
		return executeUpdate(sql, params);

	}

	@Override
	public int upStudent(Student stu) {
		String sql="UPDATE `clock`.`person` SET `uname` =?,`className` =?,`teacher` =?,`leader` =? WHERE `id` =?";
		Object []params= {stu.getUname(),stu.getClassName(),stu.getTeacher(),stu.getLeader(),stu.getId()};
		return executeUpdate(sql, params);

	}

	@Override
	public List<Student> selectStudentid(int id) {
		conn=getConnection();
		List<Student> list = null;
		String sql="SELECT `id`,`uname`,`className`,`teacher`,`leader`FROM `clock`.`person` WHERE id='"+id+"'";
          try {     	  
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				list = new ArrayList<Student>();
				while (rs.next()) {
					Student stu=new Student();
					stu.setId(rs.getInt(1));
					stu.setUname(rs.getString(2));
					stu.setClassName(rs.getString(3));
					stu.setTeacher(rs.getString(4));
					stu.setLeader(rs.getString(5));
					list.add(stu);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	

}
