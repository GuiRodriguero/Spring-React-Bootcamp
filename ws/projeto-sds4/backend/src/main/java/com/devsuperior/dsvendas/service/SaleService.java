package com.devsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SalesRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SalesRepository repository;

	@Autowired
	private SellerRepository sellerRepository;
	
	//Paginação + melhoria da consulta SQL
	@Transactional(readOnly = true)//melhoria da consulta SQL
	public Page<SaleDTO> findAll(Pageable pageable){//Paginação
		sellerRepository.findAll(); //melhoria da consulta SQL
		Page<Sale> result = repository.findAll(pageable);//Paginação
		return result.map(x -> new SaleDTO(x));//Paginação
	}
}