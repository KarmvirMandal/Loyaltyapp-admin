package com.mobiloitte.loyalty.admin.bean;

import java.util.List;



public class QuickUpdateList {

//	private String businessId;
	
//	@SerializedName("productId")
//	@Expose
	private List<String> productId=null;
	
//	@SerializedName("quantity")
//	@Expose
	private List<String> quantity=null;

	@Override
	public String toString() {
		return "QuickUpdateList [productId=" + productId + ", quantity=" + quantity + "]";
	}

	public List<String> getProductId() {
		return productId;
	}

	public void setProductId(List<String> productId) {
		this.productId = productId;
	}

	public List<String> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<String> quantity) {
		this.quantity = quantity;
	}


	
	
	
}
