package com.mobiloitte.loyalty.admin.bean;

import org.springframework.web.multipart.MultipartFile;

// TODO: Auto-generated Javadoc
/**
 * The Class InventoryBean.
 */
public class InventoryBean {

	/** The service id. */
	private int serviceId;

	/** The item name. */
	private String itemName;

	/** The category. */
	private String category;

	/** The category id. */
	private String categoryId;

	/** The supplier id. */
	private long supplierId;

	/** The quantity. */
	private String quantity;

	/** The date of purchase. */
	private String dateOfPurchase;

	/** The misc info. */
	private String miscInfo;

	/** The item type. */
	private String itemType;

	/** The purchase price. */
	private String purchasePrice;

	/** The price. */
	private String price;

	/** The stock. */
	private String stock;

	/** The file. */
	private MultipartFile file;

	/** The exp date. */
	private String expDate;

	/** The thres hold. */
	private String thresHold;

	/** The store id. */
	private String storeId;

	/** The product image. */
	private String productImage;

	/**
	 * Gets the purchase price.
	 *
	 * @return the purchase price
	 */
	public String getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * Sets the purchase price.
	 *
	 * @param purchasePrice the new purchase price
	 */
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * Gets the file.
	 *
	 * @return the file
	 */
	public MultipartFile getFile() {
		return file;
	}

	/**
	 * Sets the file.
	 *
	 * @param file the new file
	 */
	public void setFile(MultipartFile file) {
		this.file = file;
	}

	/**
	 * Gets the item name.
	 *
	 * @return the item name
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * Sets the item name.
	 *
	 * @param itemName the new item name
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the date of purchase.
	 *
	 * @return the date of purchase
	 */
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	/**
	 * Sets the date of purchase.
	 *
	 * @param dateOfPurchase the new date of purchase
	 */
	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	/**
	 * Gets the misc info.
	 *
	 * @return the misc info
	 */
	public String getMiscInfo() {
		return miscInfo;
	}

	/**
	 * Sets the misc info.
	 *
	 * @param miscInfo the new misc info
	 */
	public void setMiscInfo(String miscInfo) {
		this.miscInfo = miscInfo;
	}

	/**
	 * Gets the store id.
	 *
	 * @return the store id
	 */
	public String getStoreId() {
		return storeId;
	}

	/**
	 * Sets the store id.
	 *
	 * @param storeId the new store id
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	/**
	 * Gets the category id.
	 *
	 * @return the category id
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * Sets the category id.
	 *
	 * @param categoryId the new category id
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * Gets the exp date.
	 *
	 * @return the exp date
	 */
	public String getExpDate() {
		return expDate;
	}

	/**
	 * Sets the exp date.
	 *
	 * @param expDate the new exp date
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	/**
	 * Gets the thres hold.
	 *
	 * @return the thres hold
	 */
	public String getThresHold() {
		return thresHold;
	}

	/**
	 * Sets the thres hold.
	 *
	 * @param thresHold the new thres hold
	 */
	public void setThresHold(String thresHold) {
		this.thresHold = thresHold;
	}

	/**
	 * Gets the supplier id.
	 *
	 * @return the supplierId
	 */
	public long getSupplierId() {
		return supplierId;
	}

	/**
	 * Sets the supplier id.
	 *
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	/**
	 * Gets the item type.
	 *
	 * @return the itemType
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * Sets the item type.
	 *
	 * @param itemType the itemType to set
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	/**
	 * Gets the stock.
	 *
	 * @return the stock
	 */
	public String getStock() {
		return stock;
	}

	/**
	 * Sets the stock.
	 *
	 * @param stock the stock to set
	 */
	public void setStock(String stock) {
		this.stock = stock;
	}

	/**
	 * Gets the service id.
	 *
	 * @return the service id
	 */
	public int getServiceId() {
		return serviceId;
	}

	/**
	 * Sets the service id.
	 *
	 * @param serviceId the new service id
	 */
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * Gets the product image.
	 *
	 * @return the product image
	 */
	public String getProductImage() {
		return productImage;
	}

	/**
	 * Sets the product image.
	 *
	 * @param productImage the new product image
	 */
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

}
