package com.mobiloitte.loyalty.admin.bean;

import java.util.List;

public class ServiceCombo {

	/*private long id;
	private boolean yes;
	private boolean no;
	private String serviceName;
	private String serviceDescription;
	private MultipartFile image;
	private String sellingPrice;
	private String frontServiceQuantity;
	private long frontServiceId;
	private String backendQuantity;
	private long backendItemId;
	private String businessId;
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
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public String getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getFrontServiceQuantity() {
		return frontServiceQuantity;
	}
	public void setFrontServiceQuantity(String frontServiceQuantity) {
		this.frontServiceQuantity = frontServiceQuantity;
	}
	public long getFrontServiceId() {
		return frontServiceId;
	}
	public void setFrontServiceId(long frontServiceId) {
		this.frontServiceId = frontServiceId;
	}
	public String getBackendQuantity() {
		return backendQuantity;
	}
	public void setBackendQuantity(String backendQuantity) {
		this.backendQuantity = backendQuantity;
	}
	public long getBackendItemId() {
		return backendItemId;
	}
	public void setBackendItemId(long backendItemId) {
		this.backendItemId = backendItemId;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	@Override
	public String toString() {
		return "ServiceCombo [id=" + id + ", yes=" + yes + ", no=" + no + ", serviceName=" + serviceName
				+ ", serviceDescription=" + serviceDescription + ", image=" + image + ", sellingPrice=" + sellingPrice
				+ ", frontServiceQuantity=" + frontServiceQuantity + ", frontServiceId=" + frontServiceId
				+ ", backendQuantity=" + backendQuantity + ", backendItemId=" + backendItemId + ", businessId="
				+ businessId + "]";
	}
	
	*/
	private long id;
	private boolean yes;
	private boolean no;
	private String productName;
	private String productNameId;
	public String getProductNameId() {
		return productNameId;
	}
	public void setProductNameId(String productNameId) {
		this.productNameId = productNameId;
	}
	private long productItemsId;
	private String productDescription;
	private String image;
	private String sellingPrice;
	private String businessId;
	private String storeId;
	List<Products> products;
	private String productCategoryId;
	private String inventoryDate;
	
	public String getInventoryDate() {
		return inventoryDate;
	}
	public void setInventoryDate(String inventoryDate) {
		this.inventoryDate = inventoryDate;
	}
	public String getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
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
	public long getProductItemsId() {
		return productItemsId;
	}
	public void setProductItemsId(long productItemsId) {
		this.productItemsId = productItemsId;
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
	/*public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}*/
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
		return "ComboCatalogueItem [id=" + id + ", yes=" + yes + ", no=" + no + ", productName=" + productName
				+ ", productItemsId=" + productItemsId + ", productDescription=" + productDescription + ", image="
				+ image + ", sellingPrice=" + sellingPrice + ", businessId=" + businessId + "]";
	}
	
	
}
