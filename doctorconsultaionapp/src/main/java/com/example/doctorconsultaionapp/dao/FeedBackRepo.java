package com.example.doctorconsultaionapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.doctorconsultaionapp.entity.FeedBack;

public interface FeedBackRepo extends JpaRepository<FeedBack, Integer>{

}
