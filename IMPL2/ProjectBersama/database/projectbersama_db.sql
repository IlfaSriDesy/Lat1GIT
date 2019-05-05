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

/*Table structure for table `photo_tbl` */

DROP TABLE IF EXISTS `photo_tbl`;

CREATE TABLE `photo_tbl` (
  `photo_id` int(11) NOT NULL AUTO_INCREMENT,
  `photo_nm` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`photo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `photo_tbl` */

insert  into `photo_tbl`(`photo_id`,`photo_nm`) values (1,'kuc.jpg'),(2,'kucing.jpg'),(3,'panda.jpg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
