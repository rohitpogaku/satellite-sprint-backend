package com.satinfo.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satinfo.demo.entity.message;

public interface messageRepository extends JpaRepository<message, Integer> {

}
