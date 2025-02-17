-- Questao 1
SELECT * 
FROM veiculo;


-- Questao 2
SELECT veicu_marca, veicu_cor 
FROM veiculo;


-- Questao 3
SELECT veicu_marca AS Marca, veicu_cor AS Cor 
FROM veiculo;


-- Questao 4
SELECT * 
FROM veiculo
WHERE veicu_id = 10;


-- Questao 5
SELECT * 
FROM veiculo
WHERE veicu_id != 10;


-- Questao 6
SELECT * 
FROM veiculo
WHERE veicu_id > 10;


-- Questao 7
SELECT * 
FROM veiculo
WHERE veicu_id < 10;


-- Questao 8
SELECT * 
FROM veiculo
WHERE veicu_id >= 10 AND veicu_id <= 20;


-- Questao 9
SELECT * 
FROM veiculo
WHERE veicu_id BETWEEN 10 AND 20;


-- Questao 10
SELECT * 
FROM veiculo
WHERE veicu_id = 10 OR veicu_id = 20 OR veicu_id = 30 OR veicu_id = 50;


-- Questao 11
SELECT * 
FROM veiculo
WHERE veicu_id IN (10,20,30,50);


-- Questao 12
SELECT * 
FROM veiculo
WHERE veicu_id <> 10 AND veicu_id <> 20 AND veicu_id <> 30 AND veicu_id <> 50;


-- Questao 13
SELECT * 
FROM veiculo
WHERE veicu_id NOT IN (10,20,30,50);


-- Questao 14
SELECT * 
FROM veiculo
WHERE veicu_marca like '%a';


-- Questao 15
SELECT * 
FROM veiculo
WHERE veicu_marca like 'a%';


-- Questao 16
SELECT * 
FROM veiculo
WHERE veicu_marca like '%a%';


-- Questao 17
SELECT * 
FROM veiculo
WHERE veicu_marca like '__a%';


-- Questao 18
SELECT * 
FROM veiculo
WHERE veicu_marca like '_a_';


-- Questao 19
SELECT * 
FROM veiculo
WHERE veicu_marca like '_a__';


-- Questao 20
SELECT * 
FROM veiculo
ORDER BY veicu_marca;


-- Questao 21
SELECT * 
FROM veiculo
ORDER BY veicu_marca DESC;


-- Questao 22
SELECT * 
FROM veiculo
ORDER BY veicu_id DESC;


-- Questao 23
SELECT * 
FROM veiculo
WHERE veicu_anomodelo > 2010
ORDER BY veicu_marca;


-- Questao 24
SELECT * 
FROM veiculo
WHERE veicu_anomodelo > 2010
ORDER BY veicu_marca, veicu_modelo, veicu_anomodelo;