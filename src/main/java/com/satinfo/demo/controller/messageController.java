package com.satinfo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.satinfo.demo.entity.message;
import com.satinfo.demo.service.messageServiceImplementations;

@RestController
@RequestMapping("/api/v1/message")
public class messageController {

    private final messageServiceImplementations messageServiceImplementations;

    @Autowired
    public messageController(messageServiceImplementations messageServiceImplementations) {
        this.messageServiceImplementations = messageServiceImplementations;
    }

    @GetMapping
    public List<message> getAllMessages() {
        return messageServiceImplementations.getAllMessages();
    }

    @PostMapping
    public void insertPost(@RequestBody message m) {
        m.setM_id(0);
        messageServiceImplementations.insertMessage(m);
    }
}
