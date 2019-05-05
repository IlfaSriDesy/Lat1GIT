/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.5.5-10.1.10-MariaDB : Database - projectbersama_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`projectbersama_db` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `projectbersama_db`;

/*Table structure for table `contoh_tbl` */

DROP TABLE IF EXISTS `contoh_tbl`;

CREATE TABLE `contoh_tbl` (
  `id` varchar(255) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contoh_tbl` */

/*Table structure for table `member_tbl` */

DROP TABLE IF EXISTS `member_tbl`;

CREATE TABLE `member_tbl` (
  `member_id` varchar(255) NOT NULL,
  `member_nm` varchar(255) DEFAULT NULL,
  `member_jk` varchar(255) DEFAULT NULL,
  `member_point` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `member_tbl` */

insert  into `member_tbl`(`member_id`,`member_nm`,`member_jk`,`member_point`) values ('01','wahid','laki','100'),('02','amel','perempuan','100'),('03','deded','laki','100'),('04','fahmi','laki','100'),('05','hafid','laki','100'),('06','helma','perempuan','100'),('07','herdi','laki','100'),('08','iyan','laki','100'),('09','monica','perempuan','100'),('10','novel','perempuan','100'),('11','putri','perempuan','100'),('12','saeful','laki','100'),('13','sri','perempuan','100'),('14','teguh','laki','100'),('15','rini','perempuan','100'),('16','wia','perempuan','100');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
