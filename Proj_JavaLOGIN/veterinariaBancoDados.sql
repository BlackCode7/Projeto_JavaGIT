
create database veterinariaDB;

use veterinariaDB;
-- Bloco de instrução para criar a tabela em db_veterinariabandeirantes
create table T_usuarios(
idusuario int primary key auto_increment,
usuario1 varchar(35) not null,
password1 varchar(35) not null
);

describe T_usuarios;

-- lendo os dados na tabela usuarios
select * from T_usuarios;

-- Inserir dados no banco
insert into T_usuarios(idusuario,usuario1,password1)
values(0,'Anderson','b166er');

insert into T_usuarios(idusuario,usuario1,password1)
values(6,'Simone','b166er1');

insert into T_usuarios(idusuario,usuario1,password1)
values(4,'Elaine','b166er12');

-- Modificando ou atualizando os dados na tabela usuario
-- preciso do id para fazer a modificação
-- ATENÇÃO = aqui é preciso usar a cláusura 'where' para modificar somente
-- o campo que precisa de modificação
-- update usuarios set password='b166er!' where idusuario=4;

-- Deletando um dados da tabela
-- delete from usuarios where idusuario=0;
-- select * from usuarios;


