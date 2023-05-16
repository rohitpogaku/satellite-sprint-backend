package com.satinfo.demo.service;

import java.util.List;



import com.satinfo.demo.entity.Register;

import exceptionPackage.EmailNotFoundException;

public interface RegisterServiceDeclaration {

	
	 public List<Register> displayAll(); //display all data
	 
	 
	 public Register insertion(Register reg)throws Exception; //insert the data
	 

	 
	 public String authenticate(String email,String password);
	 
	 public void deleteById(int id);

	    Register getRegisterById(int id);
	    
	    public void updation (Register reg);
}
