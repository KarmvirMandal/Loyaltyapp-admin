package com.mobiloitte.loyalty.admin.bean;

import org.springframework.web.multipart.MultipartFile;

public class FrontService {

	private long id;
	private boolean yes;
	private boolean no;
	private String serviceName;
	private String serviceDescription;
	private MultipartFile image;
	
	private String sellingPrice;
	private String businessId;
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
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	private String storeId;
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
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	@Override
	public String toString() {
		return "FrontService [id=" + id + ", yes=" + yes + ", no=" + no + ", serviceName=" + serviceName
				+ ", serviceDescription=" + serviceDescription + ", image=" + image + ", sellingPrice=" + sellingPrice
				+ ", businessId=" + businessId + "]";
	}
	
	
	
	
}
