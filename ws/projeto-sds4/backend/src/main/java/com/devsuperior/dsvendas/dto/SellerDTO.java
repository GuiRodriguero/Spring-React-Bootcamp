package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.Data;

@Data
public class SellerDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	//DTO
	public SellerDTO(Seller entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
}
