-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot213wf
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springboot213wf`
--

/*!40000 DROP DATABASE IF EXISTS `springboot213wf`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springboot213wf` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboot213wf`;

--
-- Table structure for table `cailiaoruku`
--

DROP TABLE IF EXISTS `cailiaoruku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cailiaoruku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `cailiaohao` varchar(200) NOT NULL COMMENT '材料号',
  `cailiaomingcheng` varchar(200) NOT NULL COMMENT '材料名称',
  `jinhuoriqi` date NOT NULL COMMENT '进货日期',
  `jinhuodanjia` int(11) NOT NULL COMMENT '进货单价',
  `shuliang` int(11) NOT NULL COMMENT '数量',
  `gongyingshanghao` varchar(200) NOT NULL COMMENT '供应商号',
  `gongyingshangmingcheng` varchar(200) NOT NULL COMMENT '供应商名称',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='材料入库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cailiaoruku`
--

LOCK TABLES `cailiaoruku` WRITE;
/*!40000 ALTER TABLE `cailiaoruku` DISABLE KEYS */;
INSERT INTO `cailiaoruku` VALUES (31,'2022-04-03 12:27:51','材料号1','材料名称1','2022-04-03',1,1,'供应商号1','供应商名称1','备注1'),(32,'2022-04-03 12:27:51','材料号2','材料名称2','2022-04-03',2,2,'供应商号2','供应商名称2','备注2'),(33,'2022-04-03 12:27:51','材料号3','材料名称3','2022-04-03',3,3,'供应商号3','供应商名称3','备注3'),(34,'2022-04-03 12:27:51','材料号4','材料名称4','2022-04-03',4,4,'供应商号4','供应商名称4','备注4'),(35,'2022-04-03 12:27:51','材料号5','材料名称5','2022-04-03',5,5,'供应商号5','供应商名称5','备注5'),(36,'2022-04-03 12:27:51','材料号6','材料名称6','2022-04-03',6,6,'供应商号6','供应商名称6','备注6');
/*!40000 ALTER TABLE `cailiaoruku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cheliangmeirong`
--

DROP TABLE IF EXISTS `cheliangmeirong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cheliangmeirong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` datetime DEFAULT NULL COMMENT '日期',
  `chepaihaoma` varchar(200) DEFAULT NULL COMMENT '车牌号码',
  `jiechebumen` varchar(200) DEFAULT NULL COMMENT '接车部门',
  `meirongxiangmu` varchar(200) DEFAULT NULL COMMENT '美容项目',
  `jiage` int(11) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='车辆美容';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheliangmeirong`
--

LOCK TABLES `cheliangmeirong` WRITE;
/*!40000 ALTER TABLE `cheliangmeirong` DISABLE KEYS */;
INSERT INTO `cheliangmeirong` VALUES (71,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码1','接车部门1','美容项目1',1),(72,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码2','接车部门2','美容项目2',2),(73,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码3','接车部门3','美容项目3',3),(74,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码4','接车部门4','美容项目4',4),(75,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码5','接车部门5','美容项目5',5),(76,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码6','接车部门6','美容项目6',6);
/*!40000 ALTER TABLE `cheliangmeirong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cheliangxiaofei`
--

DROP TABLE IF EXISTS `cheliangxiaofei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cheliangxiaofei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` datetime NOT NULL COMMENT '日期',
  `chepaihaoma` varchar(200) DEFAULT NULL COMMENT '车牌号码',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `rengongfeiheji` int(11) DEFAULT NULL COMMENT '人工费合计',
  `cailiaofeiheji` int(11) DEFAULT NULL COMMENT '材料费合计',
  `zongjine` int(11) DEFAULT NULL COMMENT '总金额',
  `shishoujine` int(11) DEFAULT NULL COMMENT '实收金额',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='车辆消费';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheliangxiaofei`
--

LOCK TABLES `cheliangxiaofei` WRITE;
/*!40000 ALTER TABLE `cheliangxiaofei` DISABLE KEYS */;
INSERT INTO `cheliangxiaofei` VALUES (91,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码1','账号1',1,1,1,1,'未支付'),(92,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码2','账号2',2,2,2,2,'未支付'),(93,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码3','账号3',3,3,3,3,'未支付'),(94,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码4','账号4',4,4,4,4,'未支付'),(95,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码5','账号5',5,5,5,5,'未支付'),(96,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码6','账号6',6,6,6,6,'未支付');
/*!40000 ALTER TABLE `cheliangxiaofei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cheliangxinxi`
--

DROP TABLE IF EXISTS `cheliangxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cheliangxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chepaihaoma` varchar(200) NOT NULL COMMENT '车牌号码',
  `kehumingcheng` varchar(200) NOT NULL COMMENT '客户名称',
  `lianxidianhua` varchar(200) NOT NULL COMMENT '联系电话',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='车辆信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheliangxinxi`
--

LOCK TABLES `cheliangxinxi` WRITE;
/*!40000 ALTER TABLE `cheliangxinxi` DISABLE KEYS */;
INSERT INTO `cheliangxinxi` VALUES (61,'2022-04-03 12:27:51','车牌号码1','客户名称1','联系电话1','备注1','账号1'),(62,'2022-04-03 12:27:51','车牌号码2','客户名称2','联系电话2','备注2','账号2'),(63,'2022-04-03 12:27:51','车牌号码3','客户名称3','联系电话3','备注3','账号3'),(64,'2022-04-03 12:27:51','车牌号码4','客户名称4','联系电话4','备注4','账号4'),(65,'2022-04-03 12:27:51','车牌号码5','客户名称5','联系电话5','备注5','账号5'),(66,'2022-04-03 12:27:51','车牌号码6','客户名称6','联系电话6','备注6','账号6');
/*!40000 ALTER TABLE `cheliangxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cheliangyongliao`
--

DROP TABLE IF EXISTS `cheliangyongliao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cheliangyongliao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` datetime DEFAULT NULL COMMENT '日期',
  `chepaihaoma` varchar(200) NOT NULL COMMENT '车牌号码',
  `cailiaohao` varchar(200) NOT NULL COMMENT '材料号',
  `cailiaomingcheng` varchar(200) NOT NULL COMMENT '材料名称',
  `danjia` int(11) NOT NULL COMMENT '单价',
  `shuliang` int(11) NOT NULL COMMENT '数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='车辆用料';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheliangyongliao`
--

LOCK TABLES `cheliangyongliao` WRITE;
/*!40000 ALTER TABLE `cheliangyongliao` DISABLE KEYS */;
INSERT INTO `cheliangyongliao` VALUES (81,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码1','材料号1','材料名称1',1,1),(82,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码2','材料号2','材料名称2',2,2),(83,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码3','材料号3','材料名称3',3,3),(84,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码4','材料号4','材料名称4',4,4),(85,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码5','材料号5','材料名称5',5,5),(86,'2022-04-03 12:27:51','2022-04-03 20:27:51','车牌号码6','材料号6','材料名称6',6,6);
/*!40000 ALTER TABLE `cheliangyongliao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guanyuxitong`
--

DROP TABLE IF EXISTS `guanyuxitong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guanyuxitong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `wangzhangongneng` longtext COMMENT '网站功能',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `gongnengjieshao` longtext COMMENT '功能介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='关于系统';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guanyuxitong`
--

LOCK TABLES `guanyuxitong` WRITE;
/*!40000 ALTER TABLE `guanyuxitong` DISABLE KEYS */;
INSERT INTO `guanyuxitong` VALUES (111,'2022-04-03 12:27:51','标题1','网站功能1','13823888881','773890001@qq.com','2022-04-03 20:27:51','功能介绍1'),(112,'2022-04-03 12:27:51','标题2','网站功能2','13823888882','773890002@qq.com','2022-04-03 20:27:51','功能介绍2'),(113,'2022-04-03 12:27:51','标题3','网站功能3','13823888883','773890003@qq.com','2022-04-03 20:27:51','功能介绍3'),(114,'2022-04-03 12:27:51','标题4','网站功能4','13823888884','773890004@qq.com','2022-04-03 20:27:51','功能介绍4'),(115,'2022-04-03 12:27:51','标题5','网站功能5','13823888885','773890005@qq.com','2022-04-03 20:27:51','功能介绍5'),(116,'2022-04-03 12:27:51','标题6','网站功能6','13823888886','773890006@qq.com','2022-04-03 20:27:51','功能介绍6');
/*!40000 ALTER TABLE `guanyuxitong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kucuncailiao`
--

DROP TABLE IF EXISTS `kucuncailiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kucuncailiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `cailiaohao` varchar(200) NOT NULL COMMENT '材料号',
  `cailiaomingcheng` varchar(200) NOT NULL COMMENT '材料名称',
  `jinhuodanjia` int(11) NOT NULL COMMENT '进货单价',
  `shuliang` int(11) NOT NULL COMMENT '数量',
  `gongyingshanghao` varchar(200) NOT NULL COMMENT '供应商号',
  `gongyingshangmingcheng` varchar(200) DEFAULT NULL COMMENT '供应商名称',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='库存材料';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kucuncailiao`
--

LOCK TABLES `kucuncailiao` WRITE;
/*!40000 ALTER TABLE `kucuncailiao` DISABLE KEYS */;
INSERT INTO `kucuncailiao` VALUES (21,'2022-04-03 12:27:51','材料号1','材料名称1',1,1,'供应商号1','供应商名称1','备注1'),(22,'2022-04-03 12:27:51','材料号2','材料名称2',2,2,'供应商号2','供应商名称2','备注2'),(23,'2022-04-03 12:27:51','材料号3','材料名称3',3,3,'供应商号3','供应商名称3','备注3'),(24,'2022-04-03 12:27:51','材料号4','材料名称4',4,4,'供应商号4','供应商名称4','备注4'),(25,'2022-04-03 12:27:51','材料号5','材料名称5',5,5,'供应商号5','供应商名称5','备注5'),(26,'2022-04-03 12:27:51','材料号6','材料名称6',6,6,'供应商号6','供应商名称6','备注6');
/*!40000 ALTER TABLE `kucuncailiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laichedengji`
--

DROP TABLE IF EXISTS `laichedengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laichedengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` date NOT NULL COMMENT '日期',
  `chepaihaoma` varchar(200) NOT NULL COMMENT '车牌号码',
  `kehumingcheng` varchar(200) NOT NULL COMMENT '客户名称',
  `lianxidianhua` varchar(200) NOT NULL COMMENT '联系电话',
  `jiechebumen` varchar(200) DEFAULT NULL COMMENT '接车部门',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='来车登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laichedengji`
--

LOCK TABLES `laichedengji` WRITE;
/*!40000 ALTER TABLE `laichedengji` DISABLE KEYS */;
INSERT INTO `laichedengji` VALUES (51,'2022-04-03 12:27:51','2022-04-03','车牌号码1','客户名称1','13823888881','接车部门1','备注1','账号1'),(52,'2022-04-03 12:27:51','2022-04-03','车牌号码2','客户名称2','13823888882','接车部门2','备注2','账号2'),(53,'2022-04-03 12:27:51','2022-04-03','车牌号码3','客户名称3','13823888883','接车部门3','备注3','账号3'),(54,'2022-04-03 12:27:51','2022-04-03','车牌号码4','客户名称4','13823888884','接车部门4','备注4','账号4'),(55,'2022-04-03 12:27:51','2022-04-03','车牌号码5','客户名称5','13823888885','接车部门5','备注5','账号5'),(56,'2022-04-03 12:27:51','2022-04-03','车牌号码6','客户名称6','13823888886','接车部门6','备注6','账号6');
/*!40000 ALTER TABLE `laichedengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meirongxiangmu`
--

DROP TABLE IF EXISTS `meirongxiangmu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `meirongxiangmu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmubianhao` varchar(200) NOT NULL COMMENT '项目编号',
  `meirongxiangmu` varchar(200) NOT NULL COMMENT '美容项目',
  `jiage` int(11) NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiangmubianhao` (`xiangmubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='美容项目';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meirongxiangmu`
--

LOCK TABLES `meirongxiangmu` WRITE;
/*!40000 ALTER TABLE `meirongxiangmu` DISABLE KEYS */;
INSERT INTO `meirongxiangmu` VALUES (41,'2022-04-03 12:27:51','项目编号1','美容项目1',1),(42,'2022-04-03 12:27:51','项目编号2','美容项目2',2),(43,'2022-04-03 12:27:51','项目编号3','美容项目3',3),(44,'2022-04-03 12:27:51','项目编号4','美容项目4',4),(45,'2022-04-03 12:27:51','项目编号5','美容项目5',5),(46,'2022-04-03 12:27:51','项目编号6','美容项目6',6);
/*!40000 ALTER TABLE `meirongxiangmu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-04-03 12:27:51');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xitongbangzhu`
--

DROP TABLE IF EXISTS `xitongbangzhu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xitongbangzhu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `neirong` longtext COMMENT '内容',
  `gengxinshijian` date DEFAULT NULL COMMENT '更新时间',
  `faburen` varchar(200) DEFAULT NULL COMMENT '发布人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='系统帮助';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xitongbangzhu`
--

LOCK TABLES `xitongbangzhu` WRITE;
/*!40000 ALTER TABLE `xitongbangzhu` DISABLE KEYS */;
INSERT INTO `xitongbangzhu` VALUES (101,'2022-04-03 12:27:51','标题1','内容1','2022-04-03','发布人1'),(102,'2022-04-03 12:27:51','标题2','内容2','2022-04-03','发布人2'),(103,'2022-04-03 12:27:51','标题3','内容3','2022-04-03','发布人3'),(104,'2022-04-03 12:27:51','标题4','内容4','2022-04-03','发布人4'),(105,'2022-04-03 12:27:51','标题5','内容5','2022-04-03','发布人5'),(106,'2022-04-03 12:27:51','标题6','内容6','2022-04-03','发布人6');
/*!40000 ALTER TABLE `xitongbangzhu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2022-04-03 12:27:51','账号1','123456','姓名1','男','13823888881'),(12,'2022-04-03 12:27:51','账号2','123456','姓名2','男','13823888882'),(13,'2022-04-03 12:27:51','账号3','123456','姓名3','男','13823888883'),(14,'2022-04-03 12:27:51','账号4','123456','姓名4','男','13823888884'),(15,'2022-04-03 12:27:51','账号5','123456','姓名5','男','13823888885'),(16,'2022-04-03 12:27:51','账号6','123456','姓名6','男','13823888886');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-06 15:59:05
