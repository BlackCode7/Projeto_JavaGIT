use veterinariadb;
describe t_usuarios;
select * from t_usuarios;
-- adicionando mais um campo na tabela t_usuarios
alter table t_usuarios add column perfil varchar(20) not null;
-- acrescentando um perfil ao cadastro de usuario
update t_usuarios set perfil='admin' where idusuario=1; -- Anderson
update t_usuarios set perfil='admin' where idusuario=4; -- Elaine
update t_usuarios set perfil='usuario' where idusuario=6; -- Simone