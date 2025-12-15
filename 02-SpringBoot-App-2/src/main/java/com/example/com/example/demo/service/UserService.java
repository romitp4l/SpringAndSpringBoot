package com.example.com.example.demo.service;

import com.example.com.example.demo.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private UserDAO dao;

    // This is for setter method dependency injection
//    @Autowired
//    public void setDao(UserDAO dao) {
//        System.out.println("UserService  :: setDao() method called ...");
//        this.dao = dao;
//    }

    public UserService() {
        System.out.println("UserService ::  0 - param  constructor");
    }


    //Contructor DI

    @Autowired
    public UserService(UserDAO dao) {
        System.out.println("UserService :: Arg - Constructor");
        this.dao = dao;
    }
    public void getUsername(Integer id){

        String name = dao.findNameById(id);
        System.out.println(name);

    }
}