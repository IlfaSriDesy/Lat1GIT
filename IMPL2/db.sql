/*
SQLyog Professional v12.4.3 (64 bit)
MySQL - 10.1.31-MariaDB : Database - projectbersama_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
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

/*Table structure for table `data2_tbl` */

DROP TABLE IF EXISTS `data2_tbl`;

CREATE TABLE `data2_tbl` (
  `data2_id` varchar(255) NOT NULL,
  `kd_produk` varchar(255) DEFAULT NULL,
  `nm_produk` varchar(255) DEFAULT NULL,
  `kategori_produk` varchar(255) DEFAULT NULL,
  `stok` double DEFAULT NULL,
  PRIMARY KEY (`data2_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `data2_tbl` */

/*Table structure for table `food_tbl` */

DROP TABLE IF EXISTS `food_tbl`;

CREATE TABLE `food_tbl` (
  `food_id` varchar(255) NOT NULL,
  `food_nm` varchar(255) DEFAULT NULL,
  `food_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `food_tbl` */

insert  into `food_tbl`(`food_id`,`food_nm`,`food_desc`) values 
('F001','Karedok Lenca','Makanan'),
('F002','Lotek','Makanan'),
('F003','Nasi Oncom Bakar','Makanan'),
('F004','NIla Bakar','Makanan'),
('F005','Gurame Bakar','Makanan'),
('F006','Tumis Kangkung','Makanan'),
('F007','Tumis Genjer','Makanan'),
('F008','Es lemon tea','Minuman'),
('F009','Es Jeruk','Minuman'),
('F010','Es campur ','Minuman');

/*Table structure for table `foodcategory_tbl` */

DROP TABLE IF EXISTS `foodcategory_tbl`;

CREATE TABLE `foodcategory_tbl` (
  `foodCategory_id` varchar(255) NOT NULL,
  `foodCategory_nm` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`foodCategory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `foodcategory_tbl` */

/*Table structure for table `foodproduct_tbl` */

DROP TABLE IF EXISTS `foodproduct_tbl`;

CREATE TABLE `foodproduct_tbl` (
  `foodProduct_id` varchar(255) NOT NULL,
  `foodProduct_nm` varchar(255) DEFAULT NULL,
  `foodCategory_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`foodProduct_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `foodproduct_tbl` */

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

/*Table structure for table `photo_tbl` */

DROP TABLE IF EXISTS `photo_tbl`;

CREATE TABLE `photo_tbl` (
  `photo_id` int(11) NOT NULL AUTO_INCREMENT,
  `photo_nm` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`photo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `photo_tbl` */

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

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
