package com.mobiloitte.loyalty.admin.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BackendItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String productName;
	private String productDescription;
	private String stockId;
	private String storageId;
	private String useOfItem;
	private long supplierId;
	private String backEndQuantity; 
	private String selectUnit;
	private String purchasedPrice;
	private String expiryDate;
	private String reOrderPoint;
	private String businessId;
	private String storeId;
	private String inventoryDate;

	
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
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getStorageId() {
		return storageId;
	}
	public void setStorageId(String storageId) {
		this.storageId = storageId;
	}
	public String getUseOfItem() {
		return useOfItem;
	}
	public void setUseOfItem(String useOfItem) {
		this.useOfItem = useOfItem;
	}
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public String getBackEndQuantity() {
		return backEndQuantity;
	}
	public void setBackEndQuantity(String backEndQuantity) {
		this.backEndQuantity = backEndQuantity;
	}
	public String getSelectUnit() {
		return selectUnit;
	}
	public void setSelectUnit(String selectUnit) {
		this.selectUnit = selectUnit;
	}
	public String getPurchasedPrice() {
		return purchasedPrice;
	}
	public void setPurchasedPrice(String purchasedPrice) {
		this.purchasedPrice = purchasedPrice;
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
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	
	
	@Override
	public String toString() {
		return "BackendItem [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", stockId=" + stockId + ", storageId=" + storageId + ", useOfItem=" + useOfItem + ", supplierId="
				+ supplierId + ", backEndQuantity=" + backEndQuantity + ", selectUnit=" + selectUnit
				+ ", purchasedPrice=" + purchasedPrice + ", expiryDate=" + expiryDate + ", reOrderPoint=" + reOrderPoint
				+ ", businessId=" + businessId + ", storeId=" + storeId + "]";
	}
	
	
	
	
}
