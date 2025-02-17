CREATE DATABASE  IF NOT EXISTS `hotelaria_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hotelaria_db`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: hotelaria_db
-- ------------------------------------------------------
-- Server version	5.7.13

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
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cidade` (
  `cidad_id` int(11) NOT NULL AUTO_INCREMENT,
  `cidad_nome` varchar(45) DEFAULT NULL,
  `estad_id` int(11) NOT NULL,
  PRIMARY KEY (`cidad_id`),
  KEY `fk_Cidade_Estado1_idx` (`estad_id`),
  CONSTRAINT `fk_Cidade_Estado1` FOREIGN KEY (`estad_id`) REFERENCES `estado` (`estad_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade`
--

LOCK TABLES `cidade` WRITE;
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` VALUES (1,'Delmiro Gouveia',1),(2,'Água Branca',1),(3,'Paulo Afonso',2),(4,'Jeremoabo',2),(5,'Glória',2),(6,'Recife',4),(7,'Aracaju',3);
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
  `clien_cpf` varchar(50) DEFAULT NULL,
  `clien_nome` varchar(50) DEFAULT NULL,
  `clien_status` varchar(45) DEFAULT NULL,
  `clien_sexo` varchar(50) DEFAULT NULL,
  `profi_id` int(11) NOT NULL,
  `ender_id` int(11) NOT NULL,
  PRIMARY KEY (`clien_id`),
  KEY `fk_cliente_profissao1_idx` (`profi_id`),
  KEY `fk_cliente_endereco1_idx` (`ender_id`),
  CONSTRAINT `fk_cliente_endereco1` FOREIGN KEY (`ender_id`) REFERENCES `endereco` (`ender_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_profissao1` FOREIGN KEY (`profi_id`) REFERENCES `profissao` (`profi_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'23374653849','Eliomar Gomes Campos','Adimplente','Masculino',2,1),(2,'12312312333','Maria das Graças Gomes','Adimplente','Feminino',2,1),(3,'83773764909','Eleomar Lopes Campos','Inadimplente','Masculino',1,1),(4,'88388388774','Rafaela Ramalho Wanderley','Inadimplente','Feminino',3,4),(5,'42222234444','Edite Gomes Ramalho','Adimplente','Feminino',5,4),(6,'99998984884','Emanuelly da Silva','Adimplente','Feminino',4,3),(7,'91838883838','Mário Gonçalves dos Santos','Inadimplente','Masculino',5,5);
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
  `ender_rua` varchar(45) DEFAULT NULL,
  `ender_cep` varchar(45) DEFAULT NULL,
  `ender_bairro` varchar(45) DEFAULT NULL,
  `ender_numero` varchar(45) DEFAULT NULL,
  `cidad_id` int(11) NOT NULL,
  PRIMARY KEY (`ender_id`),
  KEY `fk_Endereco_Cidade1_idx` (`cidad_id`),
  CONSTRAINT `fk_Endereco_Cidade1` FOREIGN KEY (`cidad_id`) REFERENCES `cidade` (`cidad_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'Barcelona','8374643','BNH','30',3),(2,'D','3423444','Centro','1',3),(3,'São Judas Tadeu','4444444','Cohab Nova','32',1),(4,'São João','1312312','Cohab Nova','20',1),(5,'São Francisco','2123122','Jardim Bahia','33',3);
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadia`
--

DROP TABLE IF EXISTS `estadia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadia` (
  `estad_id` int(11) NOT NULL AUTO_INCREMENT,
  `estad_datacheckin` date DEFAULT NULL,
  `estad_datacheckout` date DEFAULT NULL,
  `estad_quantidadedias` int(11) DEFAULT NULL,
  `estad_valortotal` double DEFAULT NULL,
  `estad_status` varchar(50) DEFAULT NULL,
  `quart_id` int(11) NOT NULL,
  `clien_id` int(11) NOT NULL,
  PRIMARY KEY (`estad_id`),
  KEY `fk_Estadia_Quarto1_idx` (`quart_id`),
  KEY `fk_estadia_cliente1_idx` (`clien_id`),
  CONSTRAINT `fk_Estadia_Quarto1` FOREIGN KEY (`quart_id`) REFERENCES `quarto` (`quart_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_estadia_cliente1` FOREIGN KEY (`clien_id`) REFERENCES `cliente` (`clien_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadia`
--

LOCK TABLES `estadia` WRITE;
/*!40000 ALTER TABLE `estadia` DISABLE KEYS */;
INSERT INTO `estadia` VALUES (1,'2017-10-16','2018-03-15',10,244.55,'Encerrada',11,3),(2,'2017-08-12','2017-07-12',2,1616.14,'Cancelada',5,7),(3,'2017-10-05','2018-02-24',2,1256.48,'Encerrada',1,4),(4,'2017-10-27','2018-06-13',4,935.58,'Em andamento',3,7),(5,'2017-07-29','2017-10-25',10,1701.3,'Encerrada',2,4),(6,'2018-02-07','2017-06-19',6,793.36,'Cancelada',10,7),(7,'2018-05-09','2017-12-22',9,1631.29,'Em andamento',4,2),(8,'2017-08-02','2017-08-14',2,1514.18,'Encerrada',2,3),(9,'2017-10-01','2017-09-29',2,468.14,'Em andamento',6,5),(10,'2017-09-21','2018-02-21',8,1342.67,'Encerrada',4,4),(11,'2017-09-04','2017-10-18',8,1170.57,'Encerrada',9,5),(12,'2017-08-26','2017-09-29',9,1226.31,'Cancelada',6,4),(13,'2017-08-23','2017-09-15',2,346.06,'Em andamento',10,2),(14,'2017-09-25','2018-03-29',2,1446.86,'Encerrada',9,3),(15,'2017-06-29','2018-05-05',5,483.33,'Cancelada',5,1),(16,'2017-12-30','2018-02-10',8,427.21,'Encerrada',10,3),(17,'2018-04-25','2018-02-08',3,898.93,'Em andamento',7,1),(18,'2018-01-13','2017-12-11',3,1526.59,'Encerrada',9,4),(19,'2018-04-06','2018-03-27',2,251.07,'Em andamento',7,7),(20,'2017-10-10','2017-09-06',9,1351.47,'Encerrada',7,2),(21,'2017-06-30','2017-11-24',9,1142.54,'Cancelada',9,1),(22,'2017-07-13','2017-11-27',2,379.65,'Em andamento',10,3),(23,'2018-04-04','2018-05-04',10,1148.37,'Encerrada',1,4),(24,'2018-02-11','2017-12-18',5,586.7,'Encerrada',10,1),(25,'2018-03-24','2017-07-16',10,285.41,'Em andamento',7,1),(26,'2018-06-11','2017-10-27',8,1520.93,'Encerrada',4,7),(27,'2017-07-28','2017-09-14',2,1050.17,'Em andamento',7,4),(28,'2017-07-02','2018-04-29',8,1038.26,'Cancelada',8,5),(29,'2018-02-24','2017-11-23',6,1654.26,'Encerrada',8,7),(30,'2018-03-03','2018-05-24',2,150.18,'Em andamento',6,7),(31,'2017-12-03','2017-11-25',1,912.01,'Cancelada',10,3),(32,'2017-08-24','2018-03-09',7,1061.65,'Encerrada',1,3),(33,'2018-03-24','2017-11-30',9,430.82,'Em andamento',11,1),(34,'2017-10-27','2017-06-18',3,759.42,'Cancelada',6,2),(35,'2017-09-28','2018-06-01',3,1522.06,'Encerrada',10,7),(36,'2018-05-11','2017-09-02',2,564.62,'Encerrada',11,1),(37,'2017-08-14','2018-03-27',2,1057.68,'Em andamento',6,7),(38,'2017-10-15','2018-04-28',9,815.36,'Encerrada',3,3),(39,'2017-11-02','2017-08-01',7,1455.38,'Encerrada',5,2),(40,'2017-09-11','2017-12-02',2,364.84,'Encerrada',4,4),(41,'2017-09-01','2018-04-26',6,164.21,'Em andamento',11,2),(42,'2018-01-10','2018-04-22',2,240.71,'Encerrada',8,3),(43,'2017-10-29','2017-07-22',7,148.62,'Encerrada',5,6),(44,'2017-07-27','2017-11-22',5,1741.98,'Em andamento',6,3),(45,'2018-05-06','2018-06-01',2,1777.72,'Encerrada',4,2),(46,'2017-11-15','2018-02-10',7,246.05,'Cancelada',1,2),(47,'2018-01-03','2018-04-17',9,852.92,'Encerrada',4,6),(48,'2017-12-08','2017-12-10',6,1259.38,'Em andamento',8,2),(49,'2017-09-22','2018-01-27',8,1802.28,'Encerrada',5,4),(50,'2018-02-22','2017-08-27',7,952.33,'Encerrada',2,6),(51,'2018-01-09','2018-06-09',4,316.96,'Cancelada',5,2),(52,'2017-12-07','2017-07-12',9,1222.86,'Encerrada',4,6),(53,'2017-08-08','2017-11-13',8,446.55,'Em andamento',5,1),(54,'2017-06-24','2017-07-31',6,1416.7,'Encerrada',8,6),(55,'2018-02-14','2017-12-28',6,611.44,'Encerrada',3,4),(56,'2018-01-23','2018-01-22',2,1673.32,'Em andamento',7,2),(57,'2018-03-21','2017-08-16',9,1416.03,'Encerrada',9,4),(58,'2018-06-06','2017-10-20',2,127.88,'Cancelada',1,2),(59,'2018-01-10','2018-01-13',9,944.01,'Encerrada',1,5),(60,'2017-08-24','2017-08-29',7,1074.17,'Em andamento',9,1),(61,'2017-07-14','2018-05-24',3,955.37,'Encerrada',8,3),(62,'2018-04-17','2018-03-10',3,1186.52,'Encerrada',2,3),(63,'2017-10-06','2017-07-22',7,1112.95,'Cancelada',4,5),(64,'2018-06-12','2017-11-16',6,1482.23,'Em andamento',10,4),(65,'2018-04-22','2017-07-11',4,757.38,'Encerrada',7,7),(66,'2017-12-20','2017-09-01',6,1756.43,'Cancelada',2,2),(67,'2018-02-23','2017-09-07',9,1981.58,'Encerrada',1,6),(68,'2017-09-01','2018-01-18',10,204.91,'Encerrada',3,7),(69,'2018-05-06','2017-07-05',10,1943.77,'Encerrada',10,6),(70,'2018-05-02','2018-03-27',7,1503.17,'Encerrada',8,1),(71,'2017-07-27','2017-10-05',3,991.28,'Encerrada',5,2),(72,'2017-07-27','2018-03-05',2,1595.26,'Em andamento',7,1),(73,'2017-11-25','2017-10-29',4,829.03,'Cancelada',1,6),(74,'2018-02-22','2017-12-12',7,1533.17,'Encerrada',2,7),(75,'2018-05-20','2017-08-23',10,156.19,'Encerrada',6,3),(76,'2017-08-24','2018-01-03',8,657.54,'Em andamento',11,4),(77,'2017-06-27','2018-04-10',6,1991.06,'Encerrada',11,5),(78,'2017-07-21','2017-10-03',8,1006.81,'Encerrada',5,4),(79,'2017-11-09','2017-08-06',2,1498.72,'Em andamento',6,5),(80,'2018-05-23','2017-10-15',1,476.77,'Encerrada',2,4),(81,'2017-12-29','2018-05-30',1,1118.25,'Encerrada',6,4),(82,'2018-02-24','2017-07-19',10,1975.05,'Cancelada',5,3),(83,'2017-07-15','2017-11-24',7,666.09,'Encerrada',10,5),(84,'2018-02-18','2018-03-10',7,1048.83,'Encerrada',7,5),(85,'2017-12-03','2017-07-18',8,1417.6,'Encerrada',2,6),(86,'2018-05-27','2017-11-13',5,529.99,'Cancelada',5,1),(87,'2018-04-13','2018-02-15',5,1192.41,'Encerrada',1,1),(88,'2018-02-18','2017-08-02',7,1191.81,'Encerrada',11,6),(89,'2017-07-20','2018-03-24',1,1620.28,'Encerrada',2,6),(90,'2018-06-09','2017-07-04',2,154.43,'Em andamento',4,2),(91,'2017-07-07','2017-08-25',2,1699.64,'Encerrada',6,5),(92,'2018-01-06','2017-06-15',5,481.26,'Em andamento',1,3),(93,'2018-03-03','2018-04-16',6,1455.02,'Encerrada',3,7),(94,'2018-03-02','2018-03-22',2,372.99,'Encerrada',4,2),(95,'2018-02-07','2017-12-14',1,1614.66,'Em andamento',5,6),(96,'2017-11-24','2018-05-22',5,657,'Encerrada',11,7),(97,'2017-09-03','2017-08-05',8,623.04,'Encerrada',1,6),(98,'2017-09-28','2018-05-24',8,1479.17,'Encerrada',9,2),(99,'2017-07-16','2017-12-12',3,1054.7,'Em andamento',2,2),(100,'2018-05-19','2017-08-21',4,392.78,'Encerrada',10,7),(101,'2018-02-16','2018-02-12',10,1293.63,'Encerrada',2,4),(102,'2017-11-14','2018-04-06',10,1637.1,'Encerrada',6,3),(103,'2017-08-15','2017-08-04',4,1287.73,'Encerrada',11,6),(104,'2018-05-26','2018-04-26',10,1281.85,'Em andamento',2,6),(105,'2017-09-26','2018-04-08',9,944.35,'Encerrada',10,6),(106,'2017-11-14','2017-10-22',6,1467.76,'Em andamento',6,5),(107,'2018-04-18','2018-05-22',3,156.84,'Encerrada',5,5),(108,'2017-09-30','2017-08-31',9,612.34,'Encerrada',1,3),(109,'2018-05-10','2018-06-03',9,486.57,'Em andamento',10,5),(110,'2017-08-23','2017-12-25',3,1845.9,'Em andamento',5,6),(111,'2017-12-31','2018-02-11',5,1633.06,'Encerrada',9,1),(112,'2017-09-07','2017-11-14',4,1981.45,'Encerrada',8,6),(113,'2018-01-06','2017-09-15',8,635.98,'Em andamento',7,4),(114,'2017-10-10','2017-11-20',4,1435.57,'Encerrada',5,4),(115,'2017-09-25','2017-11-28',9,265.04,'Encerrada',9,3),(116,'2017-12-30','2018-03-19',8,1414.4,'Encerrada',3,5),(117,'2017-10-15','2018-03-07',6,1977.65,'Encerrada',5,7),(118,'2018-03-02','2017-10-18',8,1817.84,'Em andamento',11,5),(119,'2017-10-02','2017-07-23',9,578.6,'Encerrada',2,3),(120,'2017-08-23','2018-02-03',2,1317.82,'Encerrada',2,3),(121,'2017-08-11','2017-11-15',1,1520.82,'Em andamento',4,5),(122,'2017-11-05','2017-11-08',8,1351.79,'Encerrada',11,2),(123,'2017-07-17','2018-04-03',3,1677.42,'Encerrada',4,3),(124,'2018-01-29','2017-08-01',1,1139.92,'Encerrada',10,5),(125,'2018-01-09','2017-09-25',9,522.95,'Em andamento',10,3),(126,'2017-06-18','2018-03-10',8,1070.96,'Encerrada',5,5),(127,'2017-12-23','2018-05-05',1,767.65,'Encerrada',9,6),(128,'2017-11-13','2018-05-31',2,1537.47,'Encerrada',8,3),(129,'2017-09-14','2018-02-15',6,1673.08,'Encerrada',7,2),(130,'2017-11-25','2018-02-02',4,1899.89,'Em andamento',4,6),(131,'2017-08-04','2017-09-03',6,901.18,'Em andamento',9,4),(132,'2018-02-18','2017-11-25',7,966.45,'Encerrada',1,6),(133,'2018-01-17','2018-06-05',9,1758.74,'Encerrada',2,4),(134,'2017-10-04','2017-12-12',8,1711.36,'Encerrada',2,4),(135,'2018-03-23','2017-07-17',6,1154.54,'Em andamento',10,3),(136,'2017-10-29','2017-07-03',8,1171.78,'Encerrada',5,2),(137,'2017-08-18','2017-07-21',1,1332.22,'Em andamento',11,6),(138,'2017-07-01','2017-10-10',1,1017.64,'Encerrada',6,5),(139,'2017-07-02','2017-06-19',4,1482.23,'Encerrada',6,6),(140,'2017-08-05','2017-09-24',1,769.88,'Em andamento',2,4),(141,'2018-02-17','2017-07-02',6,1612.52,'Encerrada',7,5),(142,'2018-02-03','2018-03-12',3,141.55,'Em andamento',5,7),(143,'2017-07-28','2018-01-20',4,1815.85,'Encerrada',3,4),(144,'2018-04-25','2017-08-31',7,607.37,'Encerrada',3,4),(145,'2017-11-11','2017-12-11',4,1567.27,'Em andamento',6,2),(146,'2018-02-13','2018-03-08',7,670.67,'Encerrada',9,3),(147,'2018-03-27','2017-11-03',10,1004.38,'Encerrada',10,5),(148,'2017-11-25','2017-07-03',5,1072.3,'Em andamento',6,3),(149,'2018-01-17','2017-12-11',5,528.59,'Encerrada',8,3),(150,'2017-07-13','2018-06-05',2,1230.05,'Em andamento',10,6),(151,'2018-04-05','2017-06-21',10,1647.02,'Encerrada',10,7),(152,'2017-10-14','2017-12-08',4,247.06,'Encerrada',4,7),(153,'2018-05-15','2018-01-22',10,808.62,'Em andamento',1,4),(154,'2017-08-10','2017-08-08',7,898.87,'Encerrada',3,6),(155,'2017-12-29','2018-03-03',4,1294.51,'Encerrada',6,7),(156,'2017-10-26','2017-12-04',10,973.94,'Encerrada',5,6),(157,'2017-09-16','2017-06-21',3,1362.55,'Encerrada',10,2),(158,'2018-03-06','2018-02-02',9,1231.16,'Encerrada',10,7),(159,'2018-01-20','2018-01-26',10,1343.96,'Encerrada',1,3),(160,'2017-10-12','2018-01-08',10,1138.74,'Encerrada',3,2),(161,'2017-08-04','2018-02-09',10,1702.27,'Encerrada',4,2),(162,'2018-01-20','2017-07-16',5,1339.07,'Encerrada',2,1),(163,'2017-11-27','2018-01-22',3,904.19,'Encerrada',1,3),(164,'2018-02-28','2017-12-27',10,1616.63,'Encerrada',4,6),(165,'2017-12-13','2018-03-30',9,577.87,'Encerrada',9,1),(166,'2017-11-20','2017-09-08',5,907.72,'Encerrada',6,5),(167,'2017-10-11','2017-08-09',3,1709.5,'Encerrada',8,5),(168,'2018-03-02','2017-07-20',3,439,'Encerrada',4,2),(169,'2018-03-30','2018-05-21',9,1647.38,'Em andamento',10,3),(170,'2017-12-22','2017-08-24',5,350.39,'Encerrada',11,1),(171,'2018-04-28','2017-11-09',10,1947.11,'Encerrada',5,4),(172,'2017-10-27','2017-11-26',10,1694.67,'Encerrada',7,3),(173,'2018-01-20','2017-10-23',6,457.07,'Encerrada',6,6),(174,'2017-09-02','2018-02-19',9,1435.08,'Em andamento',4,7),(175,'2018-05-15','2018-05-13',2,1318.28,'Encerrada',5,2),(176,'2017-10-01','2018-04-01',6,1904.91,'Encerrada',7,3),(177,'2018-02-16','2018-04-26',7,108.63,'Em andamento',6,2),(178,'2017-10-12','2017-11-03',8,962.15,'Encerrada',1,6),(179,'2018-05-25','2017-07-04',2,778.22,'Em andamento',10,4),(180,'2017-08-18','2018-04-04',9,525.84,'Encerrada',11,1),(181,'2018-03-15','2018-03-22',5,860.62,'Cancelada',1,4),(182,'2017-11-20','2018-03-31',7,1174.5,'Encerrada',11,5),(183,'2018-04-09','2017-10-05',6,1948.21,'Cancelada',5,7),(184,'2017-06-21','2017-10-30',6,1613.59,'Encerrada',3,7),(185,'2018-03-07','2017-12-13',3,548.02,'Encerrada',9,5),(186,'2017-12-17','2017-07-17',5,972.57,'Encerrada',6,4),(187,'2017-11-19','2018-01-08',9,1610.96,'Cancelada',2,6),(188,'2017-10-23','2018-03-10',9,1408.27,'Encerrada',10,4),(189,'2018-02-15','2017-11-20',7,1328.24,'Encerrada',6,2),(190,'2017-08-05','2017-08-28',3,444.67,'Em andamento',9,7),(191,'2017-12-08','2018-06-07',8,547.39,'Encerrada',6,2),(192,'2018-03-24','2017-10-09',7,189.38,'Encerrada',7,3),(193,'2018-05-12','2018-02-24',2,1171.81,'Cancelada',2,6),(194,'2018-03-31','2017-12-14',10,1186.35,'Cancelada',11,2),(195,'2017-10-01','2017-09-17',6,534.58,'Em andamento',8,3),(196,'2017-08-26','2017-07-15',2,1230.84,'Encerrada',6,7),(197,'2017-11-26','2018-02-10',9,352.89,'Encerrada',5,3),(198,'2017-11-21','2017-11-27',6,1821.75,'Cancelada',8,3),(199,'2017-10-02','2018-03-19',9,366.27,'Encerrada',9,5),(200,'2017-12-01','2018-04-25',1,1290.2,'Encerrada',10,6);
/*!40000 ALTER TABLE `estadia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado` (
  `estad_id` int(11) NOT NULL AUTO_INCREMENT,
  `estad_nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`estad_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,'Alagoas'),(2,'Bahia'),(3,'Sergipe'),(4,'Pernambuco');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profissao`
--

DROP TABLE IF EXISTS `profissao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profissao` (
  `profi_id` int(11) NOT NULL AUTO_INCREMENT,
  `profi_nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`profi_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profissao`
--

LOCK TABLES `profissao` WRITE;
/*!40000 ALTER TABLE `profissao` DISABLE KEYS */;
INSERT INTO `profissao` VALUES (1,'Vigilante'),(2,'Professor'),(3,'Analista de Sistemas'),(4,'Desenvolvedor Web'),(5,'Técnico em Computadores');
/*!40000 ALTER TABLE `profissao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quarto`
--

DROP TABLE IF EXISTS `quarto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quarto` (
  `quart_id` int(11) NOT NULL AUTO_INCREMENT,
  `quart_valordiaria` double DEFAULT NULL,
  `quart_numero` varchar(45) DEFAULT NULL,
  `tipo_id` int(11) NOT NULL,
  PRIMARY KEY (`quart_id`),
  KEY `fk_Quarto_TipoQuarto1_idx` (`tipo_id`),
  CONSTRAINT `fk_Quarto_TipoQuarto1` FOREIGN KEY (`tipo_id`) REFERENCES `tipo` (`tipo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quarto`
--

LOCK TABLES `quarto` WRITE;
/*!40000 ALTER TABLE `quarto` DISABLE KEYS */;
INSERT INTO `quarto` VALUES (1,100,'101',1),(2,100,'102',1),(3,150,'201',2),(4,150,'202',2),(5,200,'301',3),(6,250,'302',4),(7,250,'303',4),(8,250,'304',4),(9,250,'305',4),(10,300,'401',5),(11,300,'402',5);
/*!40000 ALTER TABLE `quarto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo`
--

DROP TABLE IF EXISTS `tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo` (
  `tipo_id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_nome` varchar(45) DEFAULT NULL,
  `tipo_descricao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tipo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo`
--

LOCK TABLES `tipo` WRITE;
/*!40000 ALTER TABLE `tipo` DISABLE KEYS */;
INSERT INTO `tipo` VALUES (1,'Executivo I','Quarto Simples com ventilador'),(2,'Executivo II','Quarto Simples com Arcondicionado '),(3,'Luxo I','Quarto com Tv Internet e arcondicionado'),(4,'Luxo II','Quarto com Banheira'),(5,'Luxo III','Quarto com Banheira com hidromassagem');
/*!40000 ALTER TABLE `tipo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-14 18:44:47
