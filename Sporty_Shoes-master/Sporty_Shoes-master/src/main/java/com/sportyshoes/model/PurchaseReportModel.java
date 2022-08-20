package com.sportyshoes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseReportModel {
	private String category;
	private Long userId;
	private Long shoeId;
}
