
package com.example.prep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prep.modal.learninCourses;
@Repository
public interface learningRepo extends JpaRepository<learninCourses, Long> {

}
