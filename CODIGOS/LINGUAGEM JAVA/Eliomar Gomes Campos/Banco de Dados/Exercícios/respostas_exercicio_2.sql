-- Questao 1
SELECT * FROM veiculo;

-- Questao 2
INSERT INTO veiculo (veicu_marca, veicu_modelo) VALUES ('Fiat','Bravo Absolute');

-- Questao 3
INSERT INTO veiculo (veicu_marca, veicu_modelo, veicu_anomodelo) VALUES ('Chevrolet','Camaro', '2012');

-- Questao 4
DELETE FROM veiculo;

-- Questao 5
INSERT INTO veiculo VALUES (0,'Fiat','Bravo Absolute',NULL,NULL),(0,'Chevrolet','Camaro', NULL, '2012');

-- Questao 6
UPDATE veiculo SET veicu_anomodelo='2010';

-- Questao 7
UPDATE veiculo SET veicu_cor='Amarelo' WHERE veicu_modelo='Camaro';

-- Questao 8
UPDATE veiculo SET veicu_cor='Vermelho', veicu_anomodelo='2018' WHERE veicu_id=2; 

-- Questao 9
TRUNCATE veiculo;
