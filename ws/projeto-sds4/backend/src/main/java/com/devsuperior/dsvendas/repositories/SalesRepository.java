package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long>{

}