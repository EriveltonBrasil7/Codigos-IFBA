CREATE DATABASE  IF NOT EXISTS `biblioteca_integrado` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `biblioteca_integrado`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: biblioteca_integrado
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
-- Table structure for table `cargo`
--

DROP TABLE IF EXISTS `cargo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cargo` (
  `cargo_id` int(11) NOT NULL AUTO_INCREMENT,
  `cargo_nome` varchar(45) NOT NULL,
  `cargo_descricao` varchar(100) DEFAULT NULL,
  `cargo_auxalimentacao` double DEFAULT NULL,
  `cargo_preco` double DEFAULT NULL,
  `cargo_tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cargo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargo`
--

LOCK TABLES `cargo` WRITE;
/*!40000 ALTER TABLE `cargo` DISABLE KEYS */;
INSERT INTO `cargo` VALUES (1,'Secretária','asdasdasdas',100,33,'Alimentos'),(2,'Estagiária','asdasda',200,444,'Alimentos'),(3,'Vigilante','Muitas coisas',844,33,'Frios'),(4,'Presidente','sdfsdfs',555,4355,'Alimentos'),(6,'asda','sasda',333,55,'Perfumaria');
/*!40000 ALTER TABLE `cargo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `funci_id` int(11) NOT NULL AUTO_INCREMENT,
  `funci_nome` varchar(45) DEFAULT NULL,
  `funci_cpf` varchar(45) DEFAULT NULL,
  `funci_sexo` varchar(45) DEFAULT NULL,
  `cargo_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`funci_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (1,'Eliomar Gomes Campos','234234','Masculino',3),(2,'Rafaela Campos','343434','Feminino',3),(3,'Maria Gomes','4444','Feminino',1);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-25 14:06:39
