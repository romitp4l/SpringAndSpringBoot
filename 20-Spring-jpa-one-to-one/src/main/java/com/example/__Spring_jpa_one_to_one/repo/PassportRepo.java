package com.example.__Spring_jpa_one_to_one.repo;

import com.example.__Spring_jpa_one_to_one.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepo extends JpaRepository<Passport,Integer> {
}
