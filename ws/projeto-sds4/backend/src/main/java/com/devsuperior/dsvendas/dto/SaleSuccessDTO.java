package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.Data;

@Data
public class SaleSuccessDTO {

	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}
}
