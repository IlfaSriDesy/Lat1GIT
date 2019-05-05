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

/*Table structure for table `data1_tbl` */

DROP TABLE IF EXISTS `data1_tbl`;

CREATE TABLE `data1_tbl` (
  `data1_id` varchar(255) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `tempat_lahir` varchar(255) DEFAULT NULL,
  `tanggal_lahir` varchar(255) DEFAULT NULL,
  `profesi` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nope` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`data1_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `data1_tbl` */

insert  into `data1_tbl`(`data1_id`,`nama`,`tempat_lahir`,`tanggal_lahir`,`profesi`,`alamat`,`nope`,`email`) values ('P01','Wia Handayani','Crb','1998-07-04','mhs','dakota','082118108732','wiahanday04@gmail.com'),('P02','Monica Dyah Pratiwi','Salatiga','2001-04-21','mhs','dakota','08263723626','monica@gmial.com'),('P03','Budi','Bdg','2000-09-21','mhs','dakota','0883473465736','budi@gmial.com'),('P04','Depi','Bdg','2000-09-03','mhs','dakota','087434636565','depi@gmail.com'),('P05','Ani','Bdg','1999-09-07','mhs','dakota','08674374637673','Ani@gmail.com'),('P06','Rendi','Bdg','1998-07-06','mhs','dakota','089754656734','rendi@gmail.com'),('P07','Danang','Bdg','1998-05-06','mhs','dakota','0893457384577','danang@gmail.com'),('P08','Sumi','Bdg','1998-05-07','mhs','dakota','0867438684','sumi@gmail.com'),('P09','Rana','Bdg','1999-08-07','mhs','dakota','08795685868','rana@gmail.com'),('P10','Reni','Bdg','1998-06-08','mhs','dakota','087694678578','reni@gmail.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
