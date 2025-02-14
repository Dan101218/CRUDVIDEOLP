package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syscaso.entity.Facultad;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad, Long> {

}
