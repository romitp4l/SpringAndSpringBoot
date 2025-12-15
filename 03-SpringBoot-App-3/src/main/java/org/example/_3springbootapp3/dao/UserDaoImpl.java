package org.example._3springbootapp3.dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class UserDaoImpl implements IUserDao{
    @Override
    public boolean saveUser(String name, String email, String pwd) {

        System.out.println("Record  in the DB......");
        return true;
    }

}
