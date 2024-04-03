package com.java.sport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.sport.model.user; 
@Repository
public interface userrepo extends JpaRepository<user, Integer> {    
}