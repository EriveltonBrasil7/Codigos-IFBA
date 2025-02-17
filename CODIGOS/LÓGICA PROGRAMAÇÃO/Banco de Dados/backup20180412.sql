CREATE DATABASE  IF NOT EXISTS `locadora_eliomar_db` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `locadora_eliomar_db`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: locadora_eliomar_db
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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `clien_id` int(11) NOT NULL AUTO_INCREMENT,
  `clien_nome` varchar(45) DEFAULT NULL,
  `clien_cpf` varchar(11) DEFAULT NULL,
  `clien_email` varchar(45) DEFAULT NULL,
  `clien_diavencimento` varchar(2) DEFAULT NULL,
  `clien_pontosfidelidade` int(11) DEFAULT NULL,
  `ender_id` int(11) NOT NULL,
  PRIMARY KEY (`clien_id`),
  KEY `fk_cliente_endereco_idx` (`ender_id`),
  CONSTRAINT `fk_cliente_endereco` FOREIGN KEY (`ender_id`) REFERENCES `endereco` (`ender_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Eliomar Gomes Campos','545654654','eliomar@gmail.com','10',5000,1),(2,'Eleomar Lopes Campos','465444','eleom@hotmail.com','5',14000,1),(3,'Edite Ramalho','46546541','edite@gmail.com','14',5000,3);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco` (
  `ender_id` int(11) NOT NULL AUTO_INCREMENT,
  `ender_rua` varchar(45) NOT NULL,
  `ender_bairro` varchar(45) DEFAULT NULL,
  `ender_cidade` varchar(45) DEFAULT NULL,
  `ender_numerocasa` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ender_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'Barcelona','BNH','Paulo Afonso','30'),(2,'São Judas Tadeu','Cohab Nova','Delmiro Gouveia','40'),(3,'Quadra D','Cahab Velha','Delmiro Gouveia','54');
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'locadora_eliomar_db'
--

--
-- Dumping routines for database 'locadora_eliomar_db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-12 21:59:29
