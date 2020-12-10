package com.mobiloitte.loyalty.admin.bean;

import org.springframework.web.multipart.MultipartFile;

public class FrontCatalogueItem {
	
	private long id;
	private boolean yes;
	private boolean no;
	private String productName;
	private String brand;
	private String productDescritption;
	private String barcode;
	private MultipartFile image;
	private long supplierId;
	private String quantity;
	private String sellingPrice;
	private String purchasePrice;
	private String markUpPrice;
	private String expiryDate;
	private String date;
	private String inventoryDate;
	
	private String productCategoryId;
	




	private String reOrderPoint;
	private String businessId;
	private String storeId;
	
	
	
	
	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(String inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public String getProductDescritption() {
		return productDescritption;
	}




	public void setProductDescritption(String productDescritption) {
		this.productDescritption = productDescritption;
	}




	public String getBarcode() {
		return barcode;
	}




	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}




	public MultipartFile getImage() {
		return image;
	}




	public void setImage(MultipartFile image) {
		this.image = image;
	}




	public long getSupplierId() {
		return supplierId;
	}




	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}




	public String getQuantity() {
		return quantity;
	}




	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}




	public String getSellingPrice() {
		return sellingPrice;
	}




	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}




	public String getPurchasePrice() {
		return purchasePrice;
	}




	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}




	public String getMarkUpPrice() {
		return markUpPrice;
	}




	public void setMarkUpPrice(String markUpPrice) {
		this.markUpPrice = markUpPrice;
	}




	public String getExpiryDate() {
		return expiryDate;
	}




	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}




	public String getReOrderPoint() {
		return reOrderPoint;
	}




	public void setReOrderPoint(String reOrderPoint) {
		this.reOrderPoint = reOrderPoint;
	}




	public String getBusinessId() {
		return businessId;
	}




	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}




	@Override
	public String toString() {
		return "FrontCatalogueItem [id=" + id + ", yes=" + yes + ", no=" + no + ", productName=" + productName
				+ ", brand=" + brand + ", productDescritption=" + productDescritption + ", barcode=" + barcode
				+ ", image=" + image + ", supplierId=" + supplierId + ", quantity=" + quantity + ", sellingPrice="
				+ sellingPrice + ", purchasePrice=" + purchasePrice + ", markUpPrice=" + markUpPrice + ", expiryDate="
				+ expiryDate + ", reOrderPoint=" + reOrderPoint + "]";
	}

	public String getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	
	
	
}







