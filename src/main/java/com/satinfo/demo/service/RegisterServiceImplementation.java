package com.satinfo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.satinfo.demo.entity.Register;
import com.satinfo.demo.persistance.RegisterRepositary;

import exceptionPackage.EmailNotFoundException;
import exceptionPackage.PasswordNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class RegisterServiceImplementation implements RegisterServiceDeclaration{

	
	private RegisterRepositary registerRepository;
	
	
	@Autowired
	public RegisterServiceImplementation(RegisterRepositary registerRepository) {
		
		this.registerRepository = registerRepository;
	}

	@Override
	public List<Register> displayAll() {
		
		return registerRepository.findAll();
	}

	@Override
	public Register insertion(Register reg) throws Exception {
		if(registerRepository.findByEmail(reg.getEmail())!=null) {
			
			throw new EmailNotFoundException("Email is Already taken");
		}
		System.out.println(reg.getEmail());
		Register register=new Register();
		if(reg.getEmail()!=null) {
			register.setEmail(reg.getEmail());
			
		}
		else {
			throw new EmailNotFoundException("EmailId is not found");
		}
		
		BCryptPasswordEncoder bCrypt=new BCryptPasswordEncoder();
		 String encryptPwd= bCrypt.encode(reg.getPassword());
		 reg.setPassword(encryptPwd); 
		if(reg.getPassword()!=null) {
			register.setPassword(reg.getPassword());
		}
		else {
			throw new PasswordNotFoundException("Password is not found");
		}
	 
		register.setFirstname(reg.getFirstname());
		register.setLastname(reg.getLastname());
		register.setGender(reg.getGender());
		register.setRole(reg.getRole());
		
		return registerRepository.save(register);
	}

//	@Override
//	public void deleteById(int id) {
//		
//		
//	}

	@Override

	public String authenticate(String email, String password) {
		
		BCryptPasswordEncoder bCrypt=new BCryptPasswordEncoder();
		Register register=registerRepository.findByEmail(email);
		if(register==null) {
			return "EmailId is invalid";
		}
		String hashedPassword = register.getPassword();
		if(bCrypt.matches(password, hashedPassword)) {
			return "you have logged in sucessfully";
		}
		else {
			return " invalid Password";
		}
        		
		
	}
//Delteing the user
	@Override
	  @Transactional
	public void deleteById(int id) {
		registerRepository.deleteById(id);
		
	}

	//Getting User By Id
	@Override
	@Transactional
	public Register getRegisterById(int id) {
		
		return registerRepository.findById(id).get();
	}

	//updation
	@Override
	@Transactional
	public void updation(Register reg) {
		
		registerRepository.save(reg);
		
	}

}
