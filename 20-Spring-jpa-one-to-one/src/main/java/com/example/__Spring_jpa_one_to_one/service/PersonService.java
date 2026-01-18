package com.example.__Spring_jpa_one_to_one.service;


import com.example.__Spring_jpa_one_to_one.entity.Passport;
import com.example.__Spring_jpa_one_to_one.entity.Person;
import com.example.__Spring_jpa_one_to_one.repo.PassportRepo;
import com.example.__Spring_jpa_one_to_one.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    @Autowired
    private PassportRepo passportRepo;

    public void savePerson(){
        Person person = new Person();
        person.setPersonName("Romit");
        person.setPersonGender("Male");
        person.setPersonDob(LocalDate.now().minusYears(20));


        Passport passport = new Passport();
        passport.setPassportNum("HKDJDK78397");
        passport.setIssuedDate(LocalDate.now());
        passport.setExpiryDate(LocalDate.now().plusYears(10));

        //association
        person.setPassport(passport);
        passport.setPerson(person);


        // now  saving the parent

        personRepo.save(person);

    }


    public void getPerson(){
        personRepo.findById(1);
    }

    public void getPassport(){
        passportRepo.findById(1);
    }

    public void deletePerson(){
        personRepo.deleteById(1);
    }
}
