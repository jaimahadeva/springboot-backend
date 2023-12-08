package com.example.prep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prep.modal.EcoProductReviewReplies;

@Repository
public interface EcoProductReviewRepliesRepo  extends JpaRepository<EcoProductReviewReplies, Long> {

}
