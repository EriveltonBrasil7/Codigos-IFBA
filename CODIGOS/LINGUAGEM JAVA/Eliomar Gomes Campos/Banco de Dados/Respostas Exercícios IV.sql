# Questão 01
SELECT l.locac_id, l.locac_datasaida, f.funci_nome
FROM locacao AS l LEFT JOIN funcionario AS f ON l.funci_id = f.funci_id
WHERE l.locac_status = 'locado'
ORDER BY l.locac_datasaida;

# Questão 02
SELECT l.locac_id, l.locac_datasaida, f.funci_nome, c.clien_nome
from locacao AS l LEFT JOIN funcionario AS f ON l.funci_id = f.funci_id
			      LEFT JOIN cliente AS c ON l.clien_id = c.clien_id
WHERE l.locac_status = 'locado'
ORDER BY l.locac_datasaida;


# Questão 03
SELECT l.locac_id, l.locac_datasaida, f.funci_nome, c.clien_nome, 
			e.ender_rua, e.ender_bairro, ci.cidad_nome, es.estad_nome 
from locacao AS l LEFT JOIN funcionario AS f ON l.funci_id = f.funci_id
			      LEFT JOIN cliente AS c ON l.clien_id = c.clien_id
                  LEFT JOIN endereco AS e ON c.ender_idcobranca = e.ender_id
                  LEFT JOIN cidade AS ci ON e.cidad_id = ci.cidad_id 
                  LEFT JOIN estado AS es ON ci.estad_id = es.estad_id
WHERE l.locac_status = 'locado'
ORDER BY l.locac_datasaida, c.clien_nome; 


# Questão 04
SELECT l.locac_id, l.locac_datasaida, f.funci_nome, c.clien_nome, 
			e.ender_rua, e.ender_bairro, ci.cidad_nome, es.estad_nome,
            v.veicu_modelo
FROM item_locacao AS il LEFT JOIN locacao AS l ON il.locac_id = l.locac_id
						LEFT JOIN veiculo AS v ON il.veicu_id = v.veicu_id
                        LEFT JOIN funcionario AS f ON l.funci_id = f.funci_id
                        LEFT JOIN cliente AS c ON l.clien_id = c.clien_id
                        LEFT JOIN endereco AS e ON c.ender_idcobranca = e.ender_id
                        LEFT JOIN cidade AS ci ON e.cidad_id = ci.cidad_id 
						LEFT JOIN estado AS es ON ci.estad_id = es.estad_id
WHERE l.locac_status = 'locado' AND v.veicu_modelo = 'cruze'
ORDER BY l.locac_datasaida, c.clien_nome; 












