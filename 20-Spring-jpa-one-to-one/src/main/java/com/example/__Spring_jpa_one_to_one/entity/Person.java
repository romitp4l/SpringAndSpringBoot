package com.example.__Spring_jpa_one_to_one.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;


@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;
    private String personName;
    private LocalDate personDob;
    private String personGender;



    // It is the owner of the relation
    @OneToOne(mappedBy = "person" , cascade = CascadeType.ALL)
    private Passport passport;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public LocalDate getPersonDob() {
        return personDob;
    }

    public void setPersonDob(LocalDate personDob) {
        this.personDob = personDob;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}
