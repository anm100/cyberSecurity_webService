CREATE DATABASE  IF NOT EXISTS `sys` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sys`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: sys
-- ------------------------------------------------------
-- Server version	5.7.20

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
-- Table structure for table `EventsLog`
--

DROP TABLE IF EXISTS `EventsLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EventsLog` (
  `EventID` varchar(10) NOT NULL,
  `LogID` varchar(10) NOT NULL,
  PRIMARY KEY (`EventID`,`LogID`),
  KEY `LogID_idx` (`LogID`),
  CONSTRAINT `EventID` FOREIGN KEY (`EventID`) REFERENCES `events` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `LogID` FOREIGN KEY (`LogID`) REFERENCES `LogFiles` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EventsLog`
--

LOCK TABLES `EventsLog` WRITE;
/*!40000 ALTER TABLE `EventsLog` DISABLE KEYS */;
/*!40000 ALTER TABLE `EventsLog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Host`
--

DROP TABLE IF EXISTS `Host`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Host` (
  `ID` varchar(10) NOT NULL,
  `HostName` varchar(10) DEFAULT NULL,
  `IsActive` varchar(10) DEFAULT NULL,
  `LastSync` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Host`
--

LOCK TABLES `Host` WRITE;
/*!40000 ALTER TABLE `Host` DISABLE KEYS */;
INSERT INTO `Host` VALUES ('121','ebrahim','as','2017-12-01 13:27:27'),('342','saaada','adas','2017-12-01 13:27:27'),('44','fdfd','no','2017-12-01 13:27:27'),('454','fadi','333','2017-12-01 13:27:27');
/*!40000 ALTER TABLE `Host` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HostMac`
--

DROP TABLE IF EXISTS `HostMac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `HostMac` (
  `id` varchar(10) NOT NULL,
  `mac` varchar(12) NOT NULL,
  `ip` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`,`mac`),
  CONSTRAINT `hstIDd` FOREIGN KEY (`id`) REFERENCES `Host` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HostMac`
--

LOCK TABLES `HostMac` WRITE;
/*!40000 ALTER TABLE `HostMac` DISABLE KEYS */;
INSERT INTO `HostMac` VALUES ('121','shksjndjdo','555'),('342','hfvdhdbd','77'),('44','snshjs','77'),('454','djhdidj','544');
/*!40000 ALTER TABLE `HostMac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LogFiles`
--

DROP TABLE IF EXISTS `LogFiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `LogFiles` (
  `ID` varchar(10) NOT NULL,
  `Name` varchar(1) NOT NULL,
  `TimeStamp` datetime NOT NULL,
  `URL` varchar(45) DEFAULT NULL,
  `HostID` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`,`Name`,`TimeStamp`),
  KEY `HostID_idx` (`HostID`),
  CONSTRAINT `HostID` FOREIGN KEY (`HostID`) REFERENCES `Host` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LogFiles`
--

LOCK TABLES `LogFiles` WRITE;
/*!40000 ALTER TABLE `LogFiles` DISABLE KEYS */;
/*!40000 ALTER TABLE `LogFiles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TypeEvents`
--

DROP TABLE IF EXISTS `TypeEvents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TypeEvents` (
  `Name` varchar(10) NOT NULL,
  `Severity` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TypeEvents`
--

LOCK TABLES `TypeEvents` WRITE;
/*!40000 ALTER TABLE `TypeEvents` DISABLE KEYS */;
INSERT INTO `TypeEvents` VALUES ('aprsofing','medium'),('ddos','hight'),('password','low');
/*!40000 ALTER TABLE `TypeEvents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `events`
--

DROP TABLE IF EXISTS `events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `events` (
  `ID` varchar(10) NOT NULL,
  `TimeStamp` datetime DEFAULT NULL,
  `EventName` varchar(10) DEFAULT NULL,
  `HostID` varchar(10) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `EventName_idx` (`EventName`),
  KEY `HostID_idx` (`HostID`),
  CONSTRAINT `EventName` FOREIGN KEY (`EventName`) REFERENCES `TypeEvents` (`Name`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `HstID` FOREIGN KEY (`HostID`) REFERENCES `Host` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events`
--

LOCK TABLES `events` WRITE;
/*!40000 ALTER TABLE `events` DISABLE KEYS */;
INSERT INTO `events` VALUES ('12','2017-12-01 13:27:27','ddos','121','dfsdnfsdjh'),('43','2017-12-01 13:27:27','password','454','dsds'),('55','2017-12-01 13:27:27','password','44','sdsdsfdsfgdfgsdgfdhsdfg');
/*!40000 ALTER TABLE `events` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-08 13:38:26
