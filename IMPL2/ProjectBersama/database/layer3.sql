/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.6.21 : Database - projectbersama_db
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

/*Table structure for table `jenispoint_tbl` */

DROP TABLE IF EXISTS `jenispoint_tbl`;

CREATE TABLE `jenispoint_tbl` (
  `jnspoint_id` varchar(255) NOT NULL,
  `jnspoint_nm` varchar(255) DEFAULT NULL,
  `jnspoint_nilai` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`jnspoint_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `jenispoint_tbl` */

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

/*Table structure for table `transaksi_tbl` */

DROP TABLE IF EXISTS `transaksi_tbl`;

CREATE TABLE `transaksi_tbl` (
  `id` varchar(255) NOT NULL,
  `date1` varchar(255) DEFAULT NULL,
  `member` varchar(255) DEFAULT NULL,
  `jns` varchar(255) DEFAULT NULL,
  `desc1` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transaksi_tbl` */

insert  into `transaksi_tbl`(`id`,`date1`,`member`,`jns`,`desc1`) values ('b90','b01','b011','kas','tunai'),('b91','b02','b012','kredit','transfer');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
