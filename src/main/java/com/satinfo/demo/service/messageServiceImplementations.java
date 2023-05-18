package com.satinfo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.satinfo.demo.entity.message;
import com.satinfo.demo.persistance.messageRepository;

import jakarta.transaction.Transactional;

@Service
public class messageServiceImplementations implements messageServiceDeclarations {
	private final messageRepository messageRepository;
	
	 @Autowired
	    public messageServiceImplementations(messageRepository messageRepository) {
	        this.messageRepository = messageRepository;
	    }

	    @Override
	    @Transactional
	    public List<message> getAllMessages() {
	        return messageRepository.findAll();
	    }

	    @Override
	    @Transactional
	    public void insertMessage(message m) {
	        messageRepository.save(m);
	    }

}
