package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.syscaso.entity.Renta;
@Repository
public interface RentaRepository extends JpaRepository<Renta, Long>{

}