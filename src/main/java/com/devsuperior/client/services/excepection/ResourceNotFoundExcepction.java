package com.devsuperior.client.services.excepection;

public class ResourceNotFoundExcepction extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExcepction(String msg) {
		super(msg);
	}

}
