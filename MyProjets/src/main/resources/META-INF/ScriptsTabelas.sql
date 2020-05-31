-- Scripts para cria��o do projeto --

CREATE TABLE FUNCIONARIO (
	matricula VARCHAR(100) NOT NULL,
	nome VARCHAR(100) NOT NULL,
	cpf VARCHAR(100) NOT NULL,
	rg VARCHAR(100) NOT NULL,
	ctps VARCHAR(100) NOT NULL,
	email VARCHAR(100) NOT NULL,
	cargo VARCHAR(100) NOT NULL,
	salario VARCHAR(100) NOT NULL,
  
 	PRIMARY KEY (matricula) 
);

CREATE TABLE ENDERECO (
	cep VARCHAR(100) NOT NULL,
	tipologradouro VARCHAR(100) NOT NULL,
	logradouro VARCHAR(100) NOT NULL,
	bairro VARCHAR(100) NOT NULL,
	cidade VARCHAR(100) NOT NULL,
	uf VARCHAR(100) NOT NULL,
	
  
 	PRIMARY KEY (cep) 
);




CREATE TABLE TELEFONE (
	celular VARCHAR(100) NOT NULL,
	recado VARCHAR(100) NOT NULL,
	comercial VARCHAR(100) NOT NULL,
	
	
  
 	PRIMARY KEY (celular) 
);