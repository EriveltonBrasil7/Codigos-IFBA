create table cliente(
   clie_id int not null auto_increment primary key,
   clie_nome varchar(50) not null,
   clie_sexo char(1) null,
   clie_nascimento date null,
   clie_telefone varchar(50) null,
   clie_email varchar(50) null,
   clie_cidade varchar(50) null,
   clie_estado varchar(50) null,
   clie_endereco varchar(100) null,
   clie_ativo boolean null
); 





