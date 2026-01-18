package com.example.__Spring_jpa_one_to_one.repo;

import com.example.__Spring_jpa_one_to_one.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository <Person,Integer>{
}
