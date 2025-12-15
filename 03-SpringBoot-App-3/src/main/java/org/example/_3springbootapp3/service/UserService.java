package org.example._3springbootapp3.service;


import org.example._3springbootapp3.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class UserService {

    private IUserDao userDao;

    private EmailService emailService;

    private PwdService pwdService;

//    @Autowired
//    public void setUserDao(IUserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    @Autowired
//    public void setEmailService(EmailService emailService) {
//        this.emailService = emailService;
//    }
//
//    @Autowired
//    public void setPwdService(PwdService pwdService) {
//        this.pwdService = pwdService;
//    }


    public UserService() {
        System.out.println(" 0 - Param constructor of the UserService");
    }


    @Autowired
    public UserService(IUserDao userDao, EmailService emailService, PwdService pwdService) {
        this.userDao = userDao;
        this.emailService = emailService;
        this.pwdService = pwdService;

        System.out.println(" 3 - Arg.  constructor of the UserService");
    }

    public void registerUser(String name , String email , String pwd ){


        //encrypt passwd
        String encryptPwd = pwdService.encryptPassword(pwd);


        //save user in the db
        boolean isSaved = userDao.saveUser(name, email, encryptPwd);

        //Send email confirmation
        if (isSaved){
            boolean isSent = emailService.sendEmail(email, "Test Subject ", "Test Body");

            if (isSent){
                System.out.println("User has been saved successfully");
            }
        }else {
            System.out.println("User registration failed");
        }

    }
}
