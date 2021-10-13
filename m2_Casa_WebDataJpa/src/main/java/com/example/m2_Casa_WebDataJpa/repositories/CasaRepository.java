package com.example.m2_Casa_WebDataJpa.repositories;

import com.example.m2_Casa_WebDataJpa.entities.Casa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasaRepository extends JpaRepository <Casa, Long >{

}
