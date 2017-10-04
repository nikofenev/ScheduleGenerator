-- MySQL dump 10.13  Distrib 5.7.17, for osx10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: schedu
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
-- Table structure for table `userAvailability`
--

DROP TABLE IF EXISTS `userAvailability`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userAvailability` (
  `id` int(7) NOT NULL,
  `work_date_day` date NOT NULL,
  `available_from` int(2) NOT NULL,
  `available_to` int(2) NOT NULL,
  `typePermOrTemp` varchar(10) NOT NULL,
  `users_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `userAvailability_users` (`users_id`),
  CONSTRAINT `userAvailability_users` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userAvailability`
--

LOCK TABLES `userAvailability` WRITE;
/*!40000 ALTER TABLE `userAvailability` DISABLE KEYS */;
/*!40000 ALTER TABLE `userAvailability` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userSchedule`
--

DROP TABLE IF EXISTS `userSchedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userSchedule` (
  `id` int(7) NOT NULL,
  `start_work` int(2) NOT NULL,
  `end_work` int(2) NOT NULL,
  `work_date` date NOT NULL,
  `users_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `userScedule_users` (`users_id`),
  CONSTRAINT `userScedule_users` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userSchedule`
--

LOCK TABLES `userSchedule` WRITE;
/*!40000 ALTER TABLE `userSchedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `userSchedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_roles` (
  `user_name` varchar(15) NOT NULL,
  `role_name` varchar(15) NOT NULL,
  PRIMARY KEY (`user_name`,`role_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES ('admin','administrator'),('niko','registered-user');
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `user_name` varchar(15) NOT NULL,
  `user_pass` varchar(15) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `job_title` varchar(20) NOT NULL,
  `performance` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','Admin','Adminov','manager',5),(2,'niko','niko','Nikolay','Fenev','bartender',5);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-04 13:02:15
