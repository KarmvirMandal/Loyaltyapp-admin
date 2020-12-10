package com.mobiloitte.loyalty.admin.bean;

import java.util.List;

public class FrontBackService {

	private long id;
	private boolean yes;
	private boolean no;
	private String productName;
	private String productDescription;
	private String image;
	private String sellingPrice;
	private String businessId;
	private String storeId;
	List<Products> products;
	private String productNameId;
	private String inventoryDate;
	
	
	public String getInventoryDate() {
		return inventoryDate;
	}
	public void setInventoryDate(String inventoryDate) {
		this.inventoryDate = inventoryDate;
	}
	public String getProductNameId() {
		return productNameId;
	}
	public void setProductNameId(String productNameId) {
		this.productNameId = productNameId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isYes() {
		return yes;
	}
	public void setYes(boolean yes) {
		this.yes = yes;
	}
	public boolean isNo() {
		return no;
	}
	public void setNo(boolean no) {
		this.no = no;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
	
	
	
	
	
}
