package com.satinfo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satinfo.demo.entity.Register;
import com.satinfo.demo.service.RegisterServiceDeclaration;

import helper.Message;

@RestController
@RequestMapping("/api/v1/register")
public class RegisterController {

    private RegisterServiceDeclaration regser;


    @Autowired
    public RegisterController(RegisterServiceDeclaration regser) {

        this.regser = regser;
    }

    @PostMapping("/save")

    public Register insertion(@RequestBody Register reg) throws Exception {
        System.out.println(reg);
        return regser.insertion(reg);

    }

    @GetMapping("/authenticate/{email}/{password}")

    public ResponseEntity<?> auth(@PathVariable("email") String email, @PathVariable("password") String password) {
        System.out.println("email" + email);
//		 return  ResponseEntity.ok((regser.authenticate(email, password)));
        String result = (regser.authenticate(email, password));
        return ResponseEntity.ok(new Message(result));
    }

    //get details
    @GetMapping("/all")
    public List<Register> displayAll() {
        return regser.displayAll();
    }


    //deleting
    @DeleteMapping("/{registerId}")
    public void deleteById(@PathVariable("registerId") int id) {
        regser.deleteById(id);
    }

    @GetMapping("/{registerId}")
    public Register getRegisterById(@PathVariable("registerId") int id) {
        return regser.getRegisterById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Register reg) {

        regser.updation(reg);
    }
}
