package com.mobiloitte.loyalty.admin.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Order.
 */
@Entity
@Table(name = "order_details")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** The order id. */
	@Column(name = "PK_ORDER_ID")
	private long orderId;

	/** The price. */
	private double price;

	/** The type. */
	private String type;

	/** The user id. */
	private long userId;

	/** The store id. */
	private long storeId;

	/** The business id. */
	private long businessId;

	/** The total. */
	@Column(name = "TOTAL")
	private Long total;

	/** The vat. */
	private String vat;

	/** The service tax. */
	private String serviceTax;

	/** The Grand total. */
	private String GrandTotal;

	/** The order time. */
	@Column(name = "ORDER_TIME")
	private Date orderTime;

	/** The points. */
	private String points;

	/** The table no. */
	private String tableNo;

	/** The employee id. */
	// private String price;
	private long employeeId;

	/** The payment amount. */
	private double paymentAmount;

	/** The payment mode. */
	private String paymentMode;

	/** The nonce. */
	private String nonce;

	/** The product id. */
	private String productId;

	/** The role. */
	private String role;

	/** The confirm from. */
	private String confirmFrom;

	/** The business name. */
	@Column(name = "BUSINESS_NAME")
	private String businessName;

	/** The discount. */
	private double discount;

	/** The business image. */
	private String businessImage;

	private double freeItemDiscount;

	/** The get item list. */
	private ArrayList<Map<String, Object>> getItemList;

	/** The order items. */
	private ArrayList<HashMap<String, String>> orderItems;

	/** The deals list. */
	private ArrayList<HashMap<String, String>> dealsList;

	/*
	 * //Ashutosh private long refundItemCount=0;
	 * 
	 * 
	 * 
	 * 
	 * public long getRefundItemCount() { return refundItemCount; }
	 * 
	 * public void setRefundItemCount(long refundItemCount) { this.refundItemCount =
	 * refundItemCount; }
	 */

	/**
	 * Gets the order id.
	 *
	 * @return the order id
	 */
	public long getOrderId() {
		return orderId;
	}

	/**
	 * Sets the order id.
	 *
	 * @param orderId the new order id
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * Gets the store id.
	 *
	 * @return the store id
	 */
	public long getStoreId() {
		return storeId;
	}

	/**
	 * Sets the store id.
	 *
	 * @param storeId the new store id
	 */
	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	/**
	 * Gets the business id.
	 *
	 * @return the business id
	 */
	public long getBusinessId() {
		return businessId;
	}

	/**
	 * Sets the business id.
	 *
	 * @param businessId the new business id
	 */
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}

	/**
	 * Gets the vat.
	 *
	 * @return the vat
	 */
	public String getVat() {
		return vat;
	}

	/**
	 * Sets the vat.
	 *
	 * @param vat the new vat
	 */
	public void setVat(String vat) {
		this.vat = vat;
	}

	/**
	 * Gets the service tax.
	 *
	 * @return the service tax
	 */
	public String getServiceTax() {
		return serviceTax;
	}

	/**
	 * Sets the service tax.
	 *
	 * @param serviceTax the new service tax
	 */
	public void setServiceTax(String serviceTax) {
		this.serviceTax = serviceTax;
	}

	/**
	 * Gets the grand total.
	 *
	 * @return the grand total
	 */
	public String getGrandTotal() {
		return GrandTotal;
	}

	/**
	 * Sets the grand total.
	 *
	 * @param grandTotal the new grand total
	 */
	public void setGrandTotal(String grandTotal) {
		GrandTotal = grandTotal;
	}

	/**
	 * Gets the order time.
	 *
	 * @return the order time
	 */

	public Date getOrderTime() {
		return orderTime;
	}

	/**
	 * Sets the order time.
	 *
	 * @param orderTime the new order time
	 */
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * Gets the points.
	 *
	 * @return the points
	 */
	public String getPoints() {
		return points;
	}

	/**
	 * Sets the points.
	 *
	 * @param points the new points
	 */
	public void setPoints(String points) {
		this.points = points;
	}

	/**
	 * Gets the order items.
	 *
	 * @return the order items
	 */
	public ArrayList<HashMap<String, String>> getOrderItems() {
		return orderItems;
	}

	/**
	 * Sets the order items.
	 *
	 * @param orderItems the order items
	 */
	public void setOrderItems(ArrayList<HashMap<String, String>> orderItems) {
		this.orderItems = orderItems;
	}

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public Long getTotal() {
		return total;
	}

	/**
	 * Sets the total.
	 *
	 * @param total the new total
	 */
	public void setTotal(Long total) {
		this.total = total;
	}

	/**
	 * Gets the deals list.
	 *
	 * @return the deals list
	 */
	public ArrayList<HashMap<String, String>> getDealsList() {
		return dealsList;
	}

	/**
	 * Sets the deals list.
	 *
	 * @param dealsList the deals list
	 */
	public void setDealsList(ArrayList<HashMap<String, String>> dealsList) {
		this.dealsList = dealsList;
	}

	/**
	 * Gets the table no.
	 *
	 * @return the table no
	 */
	public String getTableNo() {
		return tableNo;
	}

	/**
	 * Sets the table no.
	 *
	 * @param tableNo the new table no
	 */
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

	/**
	 * Gets the employee id.
	 *
	 * @return the employee id
	 */
	public long getEmployeeId() {
		return employeeId;
	}

	/**
	 * Sets the employee id.
	 *
	 * @param employeeId the new employee id
	 */
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Gets the payment amount.
	 *
	 * @return the payment amount
	 */
	public double getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * Sets the payment amount.
	 *
	 * @param paymentAmount the new payment amount
	 */
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	/**
	 * Gets the nonce.
	 *
	 * @return the nonce
	 */
	public String getNonce() {
		return nonce;
	}

	/**
	 * Sets the nonce.
	 *
	 * @param nonce the new nonce
	 */
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	/**
	 * Gets the payment mode.
	 *
	 * @return the payment mode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
	 * Sets the payment mode.
	 *
	 * @param paymentMode the new payment mode
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Gets the product id.
	 *
	 * @return the product id
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * Sets the product id.
	 *
	 * @param productId the new product id
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * Gets the confirm from.
	 *
	 * @return the confirm from
	 */
	public String getConfirmFrom() {
		return confirmFrom;
	}

	/**
	 * Sets the confirm from.
	 *
	 * @param confirmFrom the new confirm from
	 */
	public void setConfirmFrom(String confirmFrom) {
		this.confirmFrom = confirmFrom;
	}

	/**
	 * Gets the business name.
	 *
	 * @return the business name
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * Sets the business name.
	 *
	 * @param businessName the new business name
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	/**
	 * Gets the discount.
	 *
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * Sets the discount.
	 *
	 * @param discount the new discount
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * Gets the gets the item list.
	 *
	 * @return the gets the item list
	 */
	public ArrayList<Map<String, Object>> getGetItemList() {
		return getItemList;
	}

	/**
	 * Sets the get item list.
	 *
	 * @param getItemList the get item list
	 */
	public void setGetItemList(ArrayList<Map<String, Object>> getItemList) {
		this.getItemList = getItemList;
	}

	/**
	 * Gets the business image.
	 *
	 * @return the business image
	 */
	public String getBusinessImage() {
		return businessImage;
	}

	/**
	 * Sets the business image.
	 *
	 * @param businessImage the new business image
	 */
	public void setBusinessImage(String businessImage) {
		this.businessImage = businessImage;
	}

	public double getFreeItemDiscount() {
		return freeItemDiscount;
	}

	public void setFreeItemDiscount(double freeItemDiscount) {
		this.freeItemDiscount = freeItemDiscount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", price=" + price + ", type=" + type + ", userId=" + userId + ", storeId="
				+ storeId + ", businessId=" + businessId + ", total=" + total + ", vat=" + vat + ", serviceTax="
				+ serviceTax + ", GrandTotal=" + GrandTotal + ", orderTime=" + orderTime + ", points=" + points
				+ ", tableNo=" + tableNo + ", employeeId=" + employeeId + ", paymentAmount=" + paymentAmount
				+ ", paymentMode=" + paymentMode + ", nonce=" + nonce + ", productId=" + productId + ", role=" + role
				+ ", confirmFrom=" + confirmFrom + ", businessName=" + businessName + ", discount=" + discount
				+ ", businessImage=" + businessImage + ", freeItemDiscount=" + freeItemDiscount + ", getItemList="
				+ getItemList + ", orderItems=" + orderItems + ", dealsList=" + dealsList + "]";
	}

}
