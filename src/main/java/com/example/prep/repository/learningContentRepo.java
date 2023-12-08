package com.example.prep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prep.modal.learningContent;
@Repository
public interface learningContentRepo extends JpaRepository<learningContent, Long> {

}
