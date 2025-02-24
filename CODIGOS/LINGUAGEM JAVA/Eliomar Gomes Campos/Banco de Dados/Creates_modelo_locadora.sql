-- MySQL Script generated by MySQL Workbench
-- 06/09/18 15:26:11
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema locadora_eliomar_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema locadora_eliomar_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `locadora_eliomar_db` DEFAULT CHARACTER SET utf8 ;
USE `locadora_eliomar_db` ;

-- -----------------------------------------------------
-- Table `locadora_eliomar_db`.`estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locadora_eliomar_db`.`estado` (
  `estad_id` INT NOT NULL AUTO_INCREMENT,
  `estad_nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`estad_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `locadora_eliomar_db`.`cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locadora_eliomar_db`.`cidade` (
  `cidad_id` INT NOT NULL AUTO_INCREMENT,
  `cidad_nome` VARCHAR(45) NOT NULL,
  `estad_id` INT NOT NULL,
  PRIMARY KEY (`cidad_id`),
  INDEX `fk_cidade_estado_idx` (`estad_id` ASC),
  CONSTRAINT `fk_cidade_estado`
    FOREIGN KEY (`estad_id`)
    REFERENCES `locadora_eliomar_db`.`estado` (`estad_id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `locadora_eliomar_db`.`endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locadora_eliomar_db`.`endereco` (
  `ender_id` INT NOT NULL AUTO_INCREMENT,
  `ender_rua` VARCHAR(45) NOT NULL,
  `ender_bairro` VARCHAR(45) NULL,
  `ender_numerocasa` VARCHAR(45) NULL,
  `ender_cep` VARCHAR(45) NULL,
  `cidad_id` INT NOT NULL,
  PRIMARY KEY (`ender_id`),
  INDEX `fk_endereco_cidade1_idx` (`cidad_id` ASC),
  CONSTRAINT `fk_endereco_cidade1`
    FOREIGN KEY (`cidad_id`)
    REFERENCES `locadora_eliomar_db`.`cidade` (`cidad_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `locadora_eliomar_db`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locadora_eliomar_db`.`categoria` (
  `categ_id` INT NOT NULL AUTO_INCREMENT,
  `categ_nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`categ_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `locadora_eliomar_db`.`veiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locadora_eliomar_db`.`veiculo` (
  `veicu_id` INT NOT NULL AUTO_INCREMENT,
  `veicu_marca` VARCHAR(45) NOT NULL,
  `veicu_modelo` VARCHAR(45) NULL,
  `veicu_anomodelo` VARCHAR(45) NULL,
  `veicu_placa` VARCHAR(45) NOT NULL,
  `veicu_cor` VARCHAR(45) NULL,
  `veicu_valordiaria` DOUBLE NOT NULL,
  `veicu_status` VARCHAR(45) NOT NULL,
  `categ_id` INT NULL,
  PRIMARY KEY (`veicu_id`),
  INDEX `fk_veiculo_categoria1_idx` (`categ_id` ASC),
  UNIQUE INDEX `veicu_placa_UNIQUE` (`veicu_placa` ASC),
  CONSTRAINT `fk_veiculo_categoria1`
    FOREIGN KEY (`categ_id`)
    REFERENCES `locadora_eliomar_db`.`categoria` (`categ_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `locadora_eliomar_db`.`funcao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locadora_eliomar_db`.`funcao` (
  `funca_id` INT NOT NULL AUTO_INCREMENT,
  `funca_nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`funca_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `locadora_eliomar_db`.`funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locadora_eliomar_db`.`funcionario` (
  `funci_id` INT NOT NULL AUTO_INCREMENT,
  `funci_nome` VARCHAR(45) NOT NULL,
  `funci_cpf` VARCHAR(11) NULL,
  `funci_email` VARCHAR(45) NULL,
  `funci_salario` DOUBLE NULL,
  `funci_dataadmissao` DATE NULL,
  `funca_id` INT NOT NULL,
  `ender_id` INT NOT NULL,
  PRIMARY KEY (`funci_id`),
  INDEX `fk_funcionario_funcao1_idx` (`funca_id` ASC),
  INDEX `fk_funcionario_endereco1_idx` (`ender_id` ASC),
  CONSTRAINT `fk_funcionario_funcao1`
    FOREIGN KEY (`funca_id`)
    REFERENCES `locadora_eliomar_db`.`funcao` (`funca_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_funcionario_endereco1`
    FOREIGN KEY (`ender_id`)
    REFERENCES `locadora_eliomar_db`.`endereco` (`ender_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `locadora_eliomar_db`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locadora_eliomar_db`.`cliente` (
  `clien_id` INT NOT NULL AUTO_INCREMENT,
  `clien_nome` VARCHAR(45) NOT NULL,
  `clien_cpf` VARCHAR(11) NULL,
  `clien_email` VARCHAR(45) NULL,
  `clien_diavencimento` INT NULL,
  `clien_pontosfidelidade` INT NULL,
  `ender_id` INT NOT NULL,
  `ender_idcobranca` INT NOT NULL,
  PRIMARY KEY (`clien_id`),
  INDEX `fk_cliente_endereco1_idx` (`ender_id` ASC),
  INDEX `fk_cliente_endereco2_idx` (`ender_idcobranca` ASC),
  CONSTRAINT `fk_cliente_endereco1`
    FOREIGN KEY (`ender_id`)
    REFERENCES `locadora_eliomar_db`.`endereco` (`ender_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_endereco2`
    FOREIGN KEY (`ender_idcobranca`)
    REFERENCES `locadora_eliomar_db`.`endereco` (`ender_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `locadora_eliomar_db`.`locacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locadora_eliomar_db`.`locacao` (
  `locac_id` INT NOT NULL AUTO_INCREMENT,
  `locac_datasaida` DATETIME NULL,
  `locac_dataentrega` DATETIME NULL,
  `locac_valortotal` DOUBLE NULL,
  `locac_status` VARCHAR(45) NULL,
  `clien_id` INT NOT NULL,
  `funci_id` INT NOT NULL,
  PRIMARY KEY (`locac_id`),
  INDEX `fk_locacao_cliente1_idx` (`clien_id` ASC),
  INDEX `fk_locacao_funcionario1_idx` (`funci_id` ASC),
  CONSTRAINT `fk_locacao_cliente1`
    FOREIGN KEY (`clien_id`)
    REFERENCES `locadora_eliomar_db`.`cliente` (`clien_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_locacao_funcionario1`
    FOREIGN KEY (`funci_id`)
    REFERENCES `locadora_eliomar_db`.`funcionario` (`funci_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `locadora_eliomar_db`.`item_locacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locadora_eliomar_db`.`item_locacao` (
  `locac_id` INT NOT NULL,
  `veicu_id` INT NOT NULL,
  PRIMARY KEY (`locac_id`, `veicu_id`),
  INDEX `fk_locacao_has_veiculo_veiculo1_idx` (`veicu_id` ASC),
  INDEX `fk_locacao_has_veiculo_locacao1_idx` (`locac_id` ASC),
  CONSTRAINT `fk_locacao_has_veiculo_locacao1`
    FOREIGN KEY (`locac_id`)
    REFERENCES `locadora_eliomar_db`.`locacao` (`locac_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_locacao_has_veiculo_veiculo1`
    FOREIGN KEY (`veicu_id`)
    REFERENCES `locadora_eliomar_db`.`veiculo` (`veicu_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
