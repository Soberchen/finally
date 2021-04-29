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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `is_menu` */

insert  into `is_menu`(`id`,`mname`,`fatherId`,`url`,`btn`,`type`) values (1,'班级签到管理系统',0,NULL,NULL,1),(2,'签到管理',1,NULL,NULL,2),(3,'信息管理',0,'','',2),(4,'班级管理',0,NULL,NULL,1),(5,'我的班级',4,NULL,NULL,2),(6,'增加签到',2,NULL,'<button TYPE=\'button\'class=\'layui-btn layui-btn-warm xz\' lay-event=\"addUser\"><i class=\'layui-icon\'>&#xe654;</i>增加签到</button>',3),(7,'修改签到',2,NULL,'<button TYPE=\'button\' class=\'layui-btn layui-btn-normal\' lay-event=\"upUser\"><i class=\'layui-icon\'>&#xe642;</i>更改签到</button>',3),(8,'删除签到',2,NULL,'<button TYPE=\'button\' lay-event=\"delUser\" class=\'layui-btn layui-btn-danger xz\'><i class=\'layui-icon\'>&#xe640;</i>删除签到</button>',3),(9,'修改个人信息',13,NULL,'<button TYPE=\'button\' class=\'layui-btn layui-btn-normal\' lay-event=\"upUser\"><i class=\'layui-icon\'>&#xe642;</i>更改信息</button>',3),(10,'增加个人信息',12,NULL,'<button TYPE=\'button\'class=\'layui-btn layui-btn-warm xz\' lay-event=\"addUser\"><i class=\'layui-icon\'>&#xe654;</i>增加信息</button>',3),(11,'删除个人信息',12,NULL,'<button TYPE=\'button\' lay-event=\"delUser\" class=\'layui-btn layui-btn-danger xz\'><i class=\'layui-icon\'>&#xe640;</i>删除信息</button>',3),(12,'全部信息',3,'ShowSelectServlet?action=ShowStu','user/userList.jsp',0),(13,'个人信息',3,NULL,NULL,0),(14,'修改信息',12,NULL,'<button TYPE=\'button\' class=\'layui-btn layui-btn-normal\' lay-event=\"upUser\"><i class=\'layui-icon\'>&#xe642;</i>更改信息</button>',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
