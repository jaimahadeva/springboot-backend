package com.example.prep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.prep.modal.EcoProductsUser;

@Repository
public interface EcoProductsUserRepo extends JpaRepository<EcoProductsUser, Long> {

}
