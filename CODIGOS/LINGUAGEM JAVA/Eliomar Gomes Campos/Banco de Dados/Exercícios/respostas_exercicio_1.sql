-- Questao 1
CREATE DATABASE locadora_eliomar_db;

-- Questao 2
SHOW DATABASES;

-- Questao 3
DROP DATABASE locadora_eliomar_db;

-- Questao 4
SHOW DATABASES;

-- Questao 5
CREATE DATABASE locadora_eliomar_db;

-- Questao 6
SHOW DATABASES;

-- Questao 7
USE locadora_eliomar_db;

-- Questao 8
SHOW TABLES;

-- Questao 9
CREATE TABLE veiculos(
    veicu_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    veicu_modelo VARCHAR(50) NOT NULL,
    veicu_cor VARCHAR(50),
    veicu_ano INT,
    veicu_placa VARCHAR(50)
);

-- Questao 10
SHOW TABLES;

-- Questao 11
DROP TABLE veiculos;

-- Questao 12
SHOW TABLES;

-- Questao 14
DESCRIBE veiculos;

-- Questao 15
ALTER TABLE veiculos RENAME veiculo;

-- Questao 16
ALTER TABLE veiculo MODIFY veicu_ano VARCHAR(4);

-- Questao 17
DESCRIBE veiculo;

-- Questao 18
ALTER TABLE veiculo ADD veicu_tipo VARCHAR(50);

-- Questao 19
DESCRIBE veiculo;

-- Questao 20
ALTER TABLE veiculo CHANGE veicu_ano veicu_anomodelo VARCHAR(50);

-- Questao 21
DESCRIBE veiculo;

-- Questao 22
ALTER TABLE veiculo DROP veicu_tipo;

-- Questao 23
DESCRIBE veiculo;

-- Questao 24
ALTER TABLE veiculo MODIFY veicu_placa VARCHAR(50) NOT NULL AFTER veicu_id;

-- Questao 25
DESCRIBE veiculo;

-- Questao 26
ALTER TABLE veiculo CHANGE veicu_placa veicu_marca VARCHAR(50) NOT NULL;

-- Questao 27
ALTER TABLE veiculo CHANGE veicu_anomodelo veicu_anomodelo VARCHAR(50) AFTER veicu_modelo;

-- Questao 28
DESCRIBE veiculo;

-- Questao 29
-- Ir no menu Server - opcao Data export

-- Questao 30
DROP DATABASE locadora_eliomar_db;

-- Questao 31
SHOW DATABASES;

-- Questao 32
-- Ir no menu Server - opcao Data import

-- Questao 33
SHOW DATABASES;

-- Questao 34
USE locadora_eliomar_db;

-- Questao 35
SHOW TABLES;

-- Questao 36
DESCRIBE veiculo;





