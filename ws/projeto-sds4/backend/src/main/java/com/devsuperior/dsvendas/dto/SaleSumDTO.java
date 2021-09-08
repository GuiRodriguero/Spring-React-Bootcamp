package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.Data;

@Data
public class SaleSumDTO implements Serializable  {
	
	//Criamos para que possamos obter a soma de todas as vendas de um vendedor
	
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Double sum;
		
	public SaleSumDTO(Seller seller, Double sum) {
			
		this.sellerName = seller.getName();
		this.sum = sum;
	}

}
