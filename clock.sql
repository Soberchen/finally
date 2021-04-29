/*
SQLyog v10.2 
MySQL - 5.5.37 : Database - clock
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`clock` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `clock`;

/*Table structure for table `is_clock` */

DROP TABLE IF EXISTS `is_clock`;

CREATE TABLE `is_clock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `clockCount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `is_clock` */

insert  into `is_clock`(`id`,`clockCount`) values (1,0),(2,1);

/*Table structure for table `is_menu` */

DROP TABLE IF EXISTS `is_menu`;

CREATE TABLE `is_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(255) NOT NULL,
  `fatherId` int(11) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `btn` varchar(255) DEFAULT NULL,
  `type` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `is_menu` */

insert  into `is_menu`(`id`,`mname`,`fatherId`,`url`,`btn`,`type`) values (1,'班级签到管理系统',0,NULL,NULL,1),(2,'签到管理',1,'ShowSelectServlet?action=ShowClock','user/clockList.js',2),(3,'信息管理',0,'','',2),(4,'班级管理',0,NULL,NULL,1),(5,'我的班级',4,'ShowSelectServlet?action=ShowClss','user/stuList.js',2),(7,'修改签到',2,NULL,'<button TYPE=\'button\' class=\'layui-btn layui-btn-normal\' lay-event=\"upUser\"><i class=\'layui-icon\'>&#xe642;</i>修改签到</button>',3),(8,'删除签到',2,NULL,'<button TYPE=\'button\' lay-event=\"delUser\" class=\'layui-btn layui-btn-danger xz\'><i class=\'layui-icon\'>&#xe640;</i>删除签到</button>',3),(9,'修改个人信息',13,NULL,'<button TYPE=\'button\' class=\'layui-btn layui-btn-normal\' lay-event=\"upUser\"><i class=\'layui-icon\'>&#xe642;</i>更改信息</button>',3),(10,'增加个人信息',12,NULL,'<button TYPE=\'button\'class=\'layui-btn layui-btn-warm xz\' lay-event=\"addUser\"><i class=\'layui-icon\'>&#xe654;</i>增加信息</button>',3),(11,'删除个人信息',12,NULL,'<button TYPE=\'button\' lay-event=\"delUser\" class=\'layui-btn layui-btn-danger xz\'><i class=\'layui-icon\'>&#xe640;</i>删除信息</button>',3),(12,'全部信息',3,'ShowSelectServlet?action=ShowStu','user/userList.js',0),(13,'个人信息',3,NULL,NULL,0),(14,'修改信息',12,NULL,'<button TYPE=\'button\' class=\'layui-btn layui-btn-normal\' lay-event=\"upUser\"><i class=\'layui-icon\'>&#xe642;</i>更改信息</button>',3),(17,'删除学员',5,NULL,'<button TYPE=\'button\' lay-event=\"delStudent\" class=\'layui-btn layui-btn-danger xz\'><i class=\'layui-icon\'>&#xe640;</i>删除学员</button>',3),(18,'增加学员',5,NULL,'<button TYPE=\'button\'class=\'layui-btn layui-btn-warm xz\' lay-event=\"addStudent\"><i class=\'layui-icon\'>&#xe654;</i>增加学员</button>',3),(19,'修改学员',5,NULL,'<button TYPE=\'button\' class=\'layui-btn layui-btn-normal\' lay-event=\"upStudent\"><i class=\'layui-icon\'>&#xe642;</i>修改学员</button>',3);

/*Table structure for table `is_role` */

DROP TABLE IF EXISTS `is_role`;

CREATE TABLE `is_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `is_role` */

insert  into `is_role`(`id`,`rname`) values (1,'教师'),(2,'学生');

/*Table structure for table `person` */

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(50) NOT NULL,
  `className` varchar(50) NOT NULL,
  `teacher` varchar(50) NOT NULL,
  `leader` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `person` */

insert  into `person`(`id`,`uname`,`className`,`teacher`,`leader`) values (1,'田万里','96班','卞显路','裴勃'),(2,'宋宇涵','96班','卞显路','裴勃'),(3,'陈晓雅','96班','卞显路','裴勃'),(4,'王爱弟','96班','卞显路','裴勃'),(5,'李乐成','96班','卞显路','裴勃'),(6,'杨凌志','96班','卞显路','裴勃');

/*Table structure for table `pserson_clock` */

DROP TABLE IF EXISTS `pserson_clock`;

CREATE TABLE `pserson_clock` (
  `pId` int(11) NOT NULL,
  `cId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pserson_clock` */

insert  into `pserson_clock`(`pId`,`cId`) values (1,1),(2,2),(3,2),(4,2);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `loginName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `clockTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `className` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`loginName`,`password`,`clockTime`,`className`) values (1,'张三','zhangsan','123','2021-03-03 00:00:00','96班'),(2,'李四','lisi','123456','2021-03-01 00:00:00','96班'),(3,'卞老师','admin','1','2021-03-01 00:00:00','96班教员'),(4,'王五','wangwu','123456','2021-04-29 12:16:09','96班');

/*Table structure for table `student_menu` */

DROP TABLE IF EXISTS `student_menu`;

CREATE TABLE `student_menu` (
  `sId` int(11) NOT NULL,
  `mId` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `student_menu` */

insert  into `student_menu`(`sId`,`mId`) values (3,1),(3,2),(3,3),(3,4),(3,5),(3,6),(3,7),(3,8),(3,9),(3,10),(3,11),(3,12),(2,1),(2,2),(2,3),(2,4),(2,5),(2,6),(2,9),(3,13),(3,14),(3,15),(3,16),(3,17),(3,18),(3,19),(3,20);

/*Table structure for table `student_role` */

DROP TABLE IF EXISTS `student_role`;

CREATE TABLE `student_role` (
  `sId` int(11) NOT NULL,
  `rId` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `student_role` */

insert  into `student_role`(`sId`,`rId`) values (3,1),(2,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
