package com.example.com.example.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDAO {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl :: Constructor");
    }

    @Override
    public String findNameById(int id) {
        if (id == 100){
            return "Romit";
        } else if (id == 200) {
            return "James";
        }
        return null;
    }
}
