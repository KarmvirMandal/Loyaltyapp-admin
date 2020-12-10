package com.mobiloitte.loyalty.admin.bean;

import java.util.List;
public class BackCatalogueItem {

	private long id;
	private boolean yes;
	private boolean no;

	private String productName;
	private String productNameId;
	private String inventoryDate;

	
	public String getProductNameId() {
		return productNameId;
	}

	public void setProductNameId(String productNameId) {
		this.productNameId = productNameId;
	}

	private String productCategoryId;
	public String getProductName() {
		return productName;
	}

	public String getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	private long backendItemId;
	private String productDescription;
	// private MultipartFile imageMultipart;
	private String image;
	private String sellingPrice;
	List<Products> products;

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

	public long getBackendItemId() {
		return backendItemId;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public void setBackendItemId(long backendItemId) {
		this.backendItemId = backendItemId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
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

	@Override
	public String toString() {
		return "BackCatalogueItem [id=" + id + ", yes=" + yes + ", no=" + no + ", productName=" + productName
				+ ", backendItemId=" + backendItemId + ", productDescription=" + productDescription + ", image=" + image
				+ ", sellingPrice=" + sellingPrice + ", products=" + products + ", businessId=" + businessId + "]";
	}

}
