package com.example.AuliaRizqisyarifa19090119.repository;

import com.example.AuliaRizqisyarifa19090119.domain.Fakta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaktaRepo extends JpaRepository<Fakta, Long> {
}
