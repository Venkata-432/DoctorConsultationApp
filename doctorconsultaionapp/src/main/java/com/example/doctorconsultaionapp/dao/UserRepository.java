package com.example.doctorconsultaionapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.doctorconsultaionapp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
