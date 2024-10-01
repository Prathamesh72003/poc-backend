package com.ideaclick.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ideaclick.poc.entity.studentEntity;

public interface studentRepo extends JpaRepository<studentEntity, Long> {

    
}
