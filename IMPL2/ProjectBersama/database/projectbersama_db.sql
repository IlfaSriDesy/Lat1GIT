/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.5.5-10.1.37-MariaDB : Database - projectbersama_db
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

/*Table structure for table `jenispoint_tbl` */

DROP TABLE IF EXISTS `jenispoint_tbl`;

CREATE TABLE `jenispoint_tbl` (
  `jnspoint_id` varchar(255) NOT NULL,
  `jnspoint_nm` varchar(255) DEFAULT NULL,
  `jnspoint_nilai` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`jnspoint_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `jenispoint_tbl` */

insert  into `jenispoint_tbl`(`jnspoint_id`,`jnspoint_nm`,`jnspoint_nilai`) values ('P001','saeful','9'),('P002','mizwar','8'),('P003','novelina','8'),('P004','erlin','8'),('P005','saputri','6');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
