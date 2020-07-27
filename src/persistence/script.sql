create database PLANSAUDE;

user PLANSAUDE;

create table Cliente (idCliente int primary key auto_increment,
		nome varchar (50),
		telefone int (12),
		cpf int (11)
);

create table Dependente (

	sexo varchar (1),
	idade varchar (2)

);

create table Endereco (

	rua varchar (60),
	numero int (4),
	complemento varchar (100)


);


create table TipoPlano(

	basico varchar (50),
	familia varchar (50),
	premium varchar (50)


);
