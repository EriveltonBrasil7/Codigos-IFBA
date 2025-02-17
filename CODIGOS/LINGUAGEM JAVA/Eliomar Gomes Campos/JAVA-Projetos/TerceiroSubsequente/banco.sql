CREATE DATABASE  IF NOT EXISTS `locadora_terceiro_sub` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `locadora_terceiro_sub`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: locadora_terceiro_sub
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB

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
-- Table structure for table `veiculo`
--

DROP TABLE IF EXISTS `veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `veiculo` (
  `veiculo_id` int(11) NOT NULL AUTO_INCREMENT,
  `veiculo_nome` varchar(45) DEFAULT NULL,
  `veiculo_marca` varchar(45) DEFAULT NULL,
  `veiculo_modelo` varchar(45) DEFAULT NULL,
  `veiculo_placa` varchar(45) DEFAULT NULL,
  `veiculo_cor` varchar(45) DEFAULT NULL,
  `veiculo_ano` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`veiculo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veiculo`
--

LOCK TABLES `veiculo` WRITE;
/*!40000 ALTER TABLE `veiculo` DISABLE KEYS */;
INSERT INTO `veiculo` VALUES (3,'asdas','asda','asdas','asdas','asd','asd'),(4,'asd','asd','asda','asda','asd','asd'),(5,'werwe','asdasd','asd','asd','asd','asd'),(6,'asd','asd','asd','asd','asd','asd'),(7,'fff','fff','ff','ff','ff','ff'),(8,'ff','ff','ff','ff','fff','fff'),(9,'teste','teste','teste','teste','teste','teste'),(10,'teste','teste','teste','teste','teste','teste');
/*!40000 ALTER TABLE `veiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-01 22:02:17
