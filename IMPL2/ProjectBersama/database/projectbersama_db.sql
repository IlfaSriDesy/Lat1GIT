/*
SQLyog Enterprise - MySQL GUI v7.02 
<<<<<<< HEAD
<<<<<<< HEAD
=======
MySQL - 5.5.5-10.1.10-MariaDB : Database - projectbersama_db
=======
>>>>>>> 9137e75825fbe13cb7fa00555f0c6ec0c2ad4324
<<<<<<< HEAD
MySQL - 5.6.21 : Database - projectbersama_db
=======
<<<<<<< HEAD
MySQL - 5.5.5-10.1.37-MariaDB : Database - projectbersama_db
=======
MySQL - 5.5.5-10.1.10-MariaDB : Database - projectbersama_db
>>>>>>> a47cdfa6becf1bf165901e2ef796bc804d1db5ab
>>>>>>> 1c372de46fb78ee591679d9f44d2c5174b65369a
<<<<<<< HEAD
=======
MySQL - 5.5.5-10.1.10-MariaDB : Database - projectbersama_db
>>>>>>> 21332ac9a830e4145ae9f8d434969c6581b9065e
=======
>>>>>>> 59e7156e5c89d82150f208a86495cf226fb44436
>>>>>>> 9137e75825fbe13cb7fa00555f0c6ec0c2ad4324
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
<<<<<<< HEAD
=======

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

<<<<<<< HEAD
<<<<<<< HEAD
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
=======
<<<<<<< HEAD
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
=======
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
>>>>>>> a47cdfa6becf1bf165901e2ef796bc804d1db5ab
>>>>>>> 1c372de46fb78ee591679d9f44d2c5174b65369a
=======
/*Table structure for table `photo_tbl` */

DROP TABLE IF EXISTS `photo_tbl`;

CREATE TABLE `photo_tbl` (
  `photo_id` int(11) NOT NULL AUTO_INCREMENT,
  `photo_nm` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`photo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `photo_tbl` */

insert  into `photo_tbl`(`photo_id`,`photo_nm`) values (1,'kuc.jpg'),(2,'kucing.jpg'),(3,'panda.jpg');
>>>>>>> 21332ac9a830e4145ae9f8d434969c6581b9065e

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
>>>>>>> 59e7156e5c89d82150f208a86495cf226fb44436
