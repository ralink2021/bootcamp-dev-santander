package com.project.bootcamp.exceptions;

public class BusinessExceptions extends RuntimeException{
	
	//Construtor que ira Receber a Mensagem de Erro da Aplicação
	public BusinessExceptions(String message) {
		super(message);
	}
}
