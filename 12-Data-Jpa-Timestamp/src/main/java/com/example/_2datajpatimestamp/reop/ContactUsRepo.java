package com.example._2datajpatimestamp.reop;

import com.example._2datajpatimestamp.entity.ContactUsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactUsRepo extends JpaRepository<ContactUsEntity,Integer> {
}
