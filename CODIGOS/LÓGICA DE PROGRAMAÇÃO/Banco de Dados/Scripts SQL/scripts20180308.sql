use biblioteca_db;

insert into cliente (clie_nome, clie_sexo,clie_cidade)
		values ('Maria do rosário', 'F', 'Glória'),
				('Bolsonaro','M','Delmiro'),
				('Lula','M','Taubaté');

SELECT * FROM cliente;

DELETE FROM cliente;

TRUNCATE cliente;

UPDATE cliente SET clie_nome='Luiz Inácio', clie_nascimento='1990-12-01' WHERE clie_id = 6;


