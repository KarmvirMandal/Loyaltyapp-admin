package com.mobiloitte.loyalty.admin.bean;

public class QuickUpdate {
	private String businessId;
	private String productId;
	private String quantity;
	
	
	
	
	public QuickUpdate(String businessId, String productId, String quantity) {
		super();
		this.businessId = businessId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public QuickUpdate() {
		
	}

	@Override
	public String toString() {
		return "QuickUpdate [businessId=" + businessId + ", productId=" + productId + ", quantity=" + quantity + "]";
	}

	

}
