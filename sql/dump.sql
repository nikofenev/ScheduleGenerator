-- MySQL dump 10.13  Distrib 5.7.17, for osx10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: teamProject
-- ------------------------------------------------------
-- Server version	5.7.17

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
-- Table structure for table `decisions`
--

DROP TABLE IF EXISTS `decisions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `decisions` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `answer` varchar(255) NOT NULL,
  `crude` varchar(15) DEFAULT NULL,
  `irritated` varchar(15) DEFAULT NULL,
  `indecisive` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `decisions`
--

LOCK TABLES `decisions` WRITE;
/*!40000 ALTER TABLE `decisions` DISABLE KEYS */;
INSERT INTO `decisions` VALUES (1,'what are you thinking','false','true','true'),(2,'shove a banana in it','true','false','false'),(3,'not right now','false','true','false'),(4,'what do you think','false','true','true'),(5,'ask someone else','true','false','true'),(6,'dont ask me now','true','false','true'),(7,'maybe next time','true','false','true'),(8,'go away now','false','true','true'),(9,'why would you ask me','false','true','true'),(10,'you will get your answer next time','false','true','true'),(11,'not happening for you','true','true','false'),(12,'not today its not','true','true','false'),(13,'the answer is no','true','true','false'),(14,'i dont know','false','false','true'),(15,'you tell me','false','false','true'),(16,'ask me next time','false','false','true'),(17,'no way','true','false','false'),(18,'absolutly not','true','false','false'),(19,'oh god no!!!','true','false','false'),(20,'im busy','false','true','false'),(21,'get outta here','false','true','false'),(22,'shoo!!!','false','true','false'),(23,'why dont you figure it out yourself','true','true','true'),(24,'IDK, get out of my face','true','true','true'),(25,'its a DBA error','true','true','true'),(26,'oraerror-04031','true','true','true');
/*!40000 ALTER TABLE `decisions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-01 19:15:35
