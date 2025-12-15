package com.example.com.example.demo.service;

import com.example.com.example.demo.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private UserDAO dao;

    @Autowired
    public void setDao(UserDAO dao) {
        System.out.println("UserService  :: setDao() method called ...");
        this.dao = dao;
    }

    public UserService() {
        System.out.println("UserService :: constructor");
    }

    public void getUsername(Integer id){

        String name = dao.findNameById(id);
        System.out.println(name);

    }
}