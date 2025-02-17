CREATE DATABASE  IF NOT EXISTS `biblioteca_db` 

USE `biblioteca_db`;

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `clie_id` int(11) NOT NULL AUTO_INCREMENT,
  `clie_nome` varchar(50) NOT NULL,
  `clie_sexo` char(1) DEFAULT NULL,
  `clie_nascimento` date DEFAULT NULL,
  `clie_telefone` varchar(50) DEFAULT NULL,
  `clie_email` varchar(50) DEFAULT NULL,
  `clie_cidade` varchar(50) DEFAULT NULL,
  `clie_estado` varchar(50) DEFAULT NULL,
  `clie_endereco` varchar(100) DEFAULT NULL,
  `clie_ativo` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`clie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



