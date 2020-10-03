package com.devsuperior.client.services.excepection;

public class DataBaseExcepction extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataBaseExcepction(String msg) {
		super(msg);
	}

}
