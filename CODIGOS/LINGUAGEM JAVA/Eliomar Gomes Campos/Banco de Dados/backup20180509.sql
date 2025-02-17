CREATE DATABASE  IF NOT EXISTS `locadora_eliomar_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria` (
  `categ_id` int(11) NOT NULL AUTO_INCREMENT,
  `categ_nome` varchar(45) NOT NULL,
  PRIMARY KEY (`categ_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Passeio'),(2,'Carga'),(3,'Lotação');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cidade` (
  `cidad_id` int(11) NOT NULL AUTO_INCREMENT,
  `cidad_nome` varchar(45) NOT NULL,
  `estad_id` int(11) NOT NULL,
  PRIMARY KEY (`cidad_id`),
  KEY `fk_cidade_estado_idx` (`estad_id`),
  CONSTRAINT `fk_cidade_estado` FOREIGN KEY (`estad_id`) REFERENCES `estado` (`estad_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade`
--

LOCK TABLES `cidade` WRITE;
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` VALUES (1,'Paulo Afonso',1),(2,'Delmiro Gouveia',2),(3,'Santa Brígida',1),(4,'Rio Branco',3);
/*!40000 ALTER TABLE `cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `clien_id` int(11) NOT NULL AUTO_INCREMENT,
  `clien_nome` varchar(45) NOT NULL,
  `clien_cpf` varchar(11) DEFAULT NULL,
  `clien_email` varchar(45) DEFAULT NULL,
  `clien_diavencimento` int(11) DEFAULT NULL,
  `clien_pontosfidelidade` int(11) DEFAULT NULL,
  `ender_id` int(11) NOT NULL,
  `ender_idcobranca` int(11) NOT NULL,
  PRIMARY KEY (`clien_id`),
  KEY `fk_cliente_endereco1_idx` (`ender_id`),
  KEY `fk_cliente_endereco2_idx` (`ender_idcobranca`),
  CONSTRAINT `fk_cliente_endereco1` FOREIGN KEY (`ender_id`) REFERENCES `endereco` (`ender_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_endereco2` FOREIGN KEY (`ender_idcobranca`) REFERENCES `endereco` (`ender_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Eliomar Gomes Campos','5874521547','eliomar@gmail.com',10,500,1,1);
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
  `ender_numerocasa` varchar(45) DEFAULT NULL,
  `ender_cep` varchar(45) DEFAULT NULL,
  `cidad_id` int(11) NOT NULL,
  PRIMARY KEY (`ender_id`),
  KEY `fk_endereco_cidade1_idx` (`cidad_id`),
  CONSTRAINT `fk_endereco_cidade1` FOREIGN KEY (`cidad_id`) REFERENCES `cidade` (`cidad_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'Barcelona','BNH','30','54545444',1);
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado` (
  `estad_id` int(11) NOT NULL AUTO_INCREMENT,
  `estad_nome` varchar(45) NOT NULL,
  PRIMARY KEY (`estad_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,'Bahia'),(2,'Alagoas'),(3,'Acre');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcao`
--

DROP TABLE IF EXISTS `funcao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcao` (
  `funca_id` int(11) NOT NULL AUTO_INCREMENT,
  `funca_nome` varchar(45) NOT NULL,
  PRIMARY KEY (`funca_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcao`
--

LOCK TABLES `funcao` WRITE;
/*!40000 ALTER TABLE `funcao` DISABLE KEYS */;
INSERT INTO `funcao` VALUES (1,'Gerente'),(2,'Professor'),(3,'Analista de Sistemas');
/*!40000 ALTER TABLE `funcao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `funci_id` int(11) NOT NULL AUTO_INCREMENT,
  `funci_nome` varchar(45) NOT NULL,
  `funci_cpf` varchar(11) DEFAULT NULL,
  `funci_email` varchar(45) DEFAULT NULL,
  `funci_salario` double DEFAULT NULL,
  `funci_dataadmissao` date DEFAULT NULL,
  `funca_id` int(11) NOT NULL,
  `ender_id` int(11) NOT NULL,
  PRIMARY KEY (`funci_id`),
  KEY `fk_funcionario_funcao1_idx` (`funca_id`),
  KEY `fk_funcionario_endereco1_idx` (`ender_id`),
  CONSTRAINT `fk_funcionario_endereco1` FOREIGN KEY (`ender_id`) REFERENCES `endereco` (`ender_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_funcionario_funcao1` FOREIGN KEY (`funca_id`) REFERENCES `funcao` (`funca_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (1,'Rafaela Ramalho Wanderley','558874122','rafaela@gmail.com',5000,'2015-05-29',1,1);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_locacao`
--

DROP TABLE IF EXISTS `item_locacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_locacao` (
  `locac_id` int(11) NOT NULL,
  `veicu_id` int(11) NOT NULL,
  PRIMARY KEY (`locac_id`,`veicu_id`),
  KEY `fk_locacao_has_veiculo_veiculo1_idx` (`veicu_id`),
  KEY `fk_locacao_has_veiculo_locacao1_idx` (`locac_id`),
  CONSTRAINT `fk_locacao_has_veiculo_locacao1` FOREIGN KEY (`locac_id`) REFERENCES `locacao` (`locac_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_locacao_has_veiculo_veiculo1` FOREIGN KEY (`veicu_id`) REFERENCES `veiculo` (`veicu_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_locacao`
--

LOCK TABLES `item_locacao` WRITE;
/*!40000 ALTER TABLE `item_locacao` DISABLE KEYS */;
INSERT INTO `item_locacao` VALUES (1,3),(1,4);
/*!40000 ALTER TABLE `item_locacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locacao`
--

DROP TABLE IF EXISTS `locacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locacao` (
  `locac_id` int(11) NOT NULL AUTO_INCREMENT,
  `locac_datasaida` datetime DEFAULT NULL,
  `locac_dataentrega` datetime DEFAULT NULL,
  `locac_valortotal` double DEFAULT NULL,
  `locac_status` varchar(45) DEFAULT NULL,
  `clien_id` int(11) NOT NULL,
  `funci_id` int(11) NOT NULL,
  PRIMARY KEY (`locac_id`),
  KEY `fk_locacao_cliente1_idx` (`clien_id`),
  KEY `fk_locacao_funcionario1_idx` (`funci_id`),
  CONSTRAINT `fk_locacao_cliente1` FOREIGN KEY (`clien_id`) REFERENCES `cliente` (`clien_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_locacao_funcionario1` FOREIGN KEY (`funci_id`) REFERENCES `funcionario` (`funci_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locacao`
--

LOCK TABLES `locacao` WRITE;
/*!40000 ALTER TABLE `locacao` DISABLE KEYS */;
INSERT INTO `locacao` VALUES (1,'2018-05-09 21:24:00',NULL,NULL,'Locado',1,1);
/*!40000 ALTER TABLE `locacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veiculo`
--

DROP TABLE IF EXISTS `veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `veiculo` (
  `veicu_id` int(11) NOT NULL AUTO_INCREMENT,
  `veicu_marca` varchar(45) NOT NULL,
  `veicu_modelo` varchar(45) DEFAULT NULL,
  `veicu_anomodelo` varchar(45) DEFAULT NULL,
  `veicu_placa` varchar(45) NOT NULL,
  `veicu_cor` varchar(45) DEFAULT NULL,
  `veicu_valordiaria` double NOT NULL,
  `veicu_status` varchar(45) NOT NULL,
  `categ_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`veicu_id`),
  UNIQUE KEY `veicu_placa_UNIQUE` (`veicu_placa`),
  KEY `fk_veiculo_categoria1_idx` (`categ_id`),
  CONSTRAINT `fk_veiculo_categoria1` FOREIGN KEY (`categ_id`) REFERENCES `categoria` (`categ_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veiculo`
--

LOCK TABLES `veiculo` WRITE;
/*!40000 ALTER TABLE `veiculo` DISABLE KEYS */;
INSERT INTO `veiculo` VALUES (3,'Fiat','Bravo','2011','NFH5487','Branco',100.5,'Disponível',1),(4,'Chevrolet','Cruze','2015','DFG4875','Vermelho',150,'Locado',1),(5,'Volvo','H114','2018','FJG5874','Branco',300,'Disponível',2),(6,'Wolkswagen','Combi','2000','APO1296','Amarelo',20,'Manutenção',NULL);
/*!40000 ALTER TABLE `veiculo` ENABLE KEYS */;
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

-- Dump completed on 2018-05-09 21:58:56
