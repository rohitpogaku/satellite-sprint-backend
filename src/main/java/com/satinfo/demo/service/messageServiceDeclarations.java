package com.satinfo.demo.service;

import java.util.List;

import com.satinfo.demo.entity.message;

public interface messageServiceDeclarations {

    List<message> getAllMessages();

    void insertMessage(message m);
}
