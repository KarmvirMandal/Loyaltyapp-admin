package com.mobiloitte.loyalty.admin.bean;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class CampaignBean.
 *
 * @author Sahil Nagpal
 */
@Entity
@Table(name = "deals")
public class CampaignBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PK_DEAL_ID")
	private long dealId;
	/** The start time. */
	private String startTime;

	/** The deals with day. */
	private String dealsWithDay;

	/** The end time. */
	private String endTime;

	/** The day. */
	private String day;

	/** The deal id. */
	

	/** The is hot. */
	@Column(name = "IS_HOT")
	private int isHot;

	/** The is loyalty. */
	@Column(name = "IS_LOYALTY")
	private int isLoyalty;

	/** The store id. */
	private long storeId;

	/** The deal desc. */
	private String dealDesc;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/** The deals price. */
	private String dealsPrice;

	/** The creation date. */
	@Column(name="CREATION_DATE")
	private Date creationDate;

	/** The updation date. */
	private long updationDate;

	/** The store product service id. */
	private long storeProductServiceId;

	/** The deal image. */
	private String dealImage;
	private String startDate;

	/** The expiry date. */
	private String expiryDate;

	/** The loyalty point check. */
	private int loyaltyPointCheck;

	/** The businessid. */
	@Column(name="FK_BUSINESS_ID")
	private long businessid;

	/** The deal type id. */
	private long dealTypeId;

	/** The discount percent. */
	private String discountPercent;

	/** The store list. */
	private String storeList;

	/** The buy item ids. */
	private String buyItemIds;

	/** The get item ids. */
	private String getItemIds;

	/** The spend amount. */
	private String spendAmount;

	/** The view count. */
	private long viewCount;

	/** The redeem count. */
	private long redeemCount;

	/** The loyalty point. */
	private String loyaltyPoint;

	/** The loyalty check point. */
	private String loyaltyCheckPoint;

	/** The star. */
	private int star;

	private String selectCategory;

	public String getSelectCategory() {
		return selectCategory;
	}

	public void setSelectCategory(String selectCategory) {
		this.selectCategory = selectCategory;
	}

	public String getSelectSubCategory() {
		return selectSubCategory;
	}

	public void setSelectSubCategory(String selectSubCategory) {
		this.selectSubCategory = selectSubCategory;
	}

	private String selectSubCategory;

	/**
	 * Gets the start time.
	 *
	 * @return the start time
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Sets the start time.
	 *
	 * @param startTime the new start time
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * Gets the end time.
	 *
	 * @return the end time
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * Sets the end time.
	 *
	 * @param endTime the new end time
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * Gets the deal id.
	 *
	 * @return the dealId
	 */
	public long getDealId() {
		return dealId;
	}

	/**
	 * Sets the deal id.
	 *
	 * @param dealId the dealId to set
	 */
	public void setDealId(long dealId) {
		this.dealId = dealId;
	}

	/**
	 * Gets the checks if is hot.
	 *
	 * @return the isHot
	 */
	public int getIsHot() {
		return isHot;
	}

	/**
	 * Sets the checks if is hot.
	 *
	 * @param isHot the isHot to set
	 */
	public void setIsHot(int isHot) {
		this.isHot = isHot;
	}

	/**
	 * Gets the checks if is loyalty.
	 *
	 * @return the isLoyalty
	 */
	public int getIsLoyalty() {
		return isLoyalty;
	}

	/**
	 * Sets the checks if is loyalty.
	 *
	 * @param isLoyalty the isLoyalty to set
	 */
	public void setIsLoyalty(int isLoyalty) {
		this.isLoyalty = isLoyalty;
	}

	/**
	 * Gets the store id.
	 *
	 * @return the storeId
	 */
	public long getStoreId() {
		return storeId;
	}

	/**
	 * Sets the store id.
	 *
	 * @param storeId the storeId to set
	 */
	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	/**
	 * Gets the deal desc.
	 *
	 * @return the dealDesc
	 */
	public String getDealDesc() {
		return dealDesc;
	}

	/**
	 * Sets the deal desc.
	 *
	 * @param dealDesc the dealDesc to set
	 */
	public void setDealDesc(String dealDesc) {
		this.dealDesc = dealDesc;
	}

	/**
	 * Gets the creation date.
	 *
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Sets the creation date.
	 *
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Gets the updation date.
	 *
	 * @return the updationDate
	 */
	public long getUpdationDate() {
		return updationDate;
	}

	/**
	 * Sets the updation date.
	 *
	 * @param updationDate the updationDate to set
	 */
	public void setUpdationDate(long updationDate) {
		this.updationDate = updationDate;
	}

	/**
	 * Gets the store product service id.
	 *
	 * @return the storeProductServiceId
	 */
	public long getStoreProductServiceId() {
		return storeProductServiceId;
	}

	/**
	 * Sets the store product service id.
	 *
	 * @param storeProductServiceId the storeProductServiceId to set
	 */
	public void setStoreProductServiceId(long storeProductServiceId) {
		this.storeProductServiceId = storeProductServiceId;
	}

	/**
	 * Gets the deal image.
	 *
	 * @return the dealImage
	 */
	public String getDealImage() {
		return dealImage;
	}

	/**
	 * Sets the deal image.
	 *
	 * @param dealImage the dealImage to set
	 */
	public void setDealImage(String dealImage) {
		this.dealImage = dealImage;
	}

	/**
	 * Gets the expiry date.
	 *
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Sets the expiry date.
	 *
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * Gets the loyalty point check.
	 *
	 * @return the loyaltyPointCheck
	 */
	public int getLoyaltyPointCheck() {
		return loyaltyPointCheck;
	}

	/**
	 * Sets the loyalty point check.
	 *
	 * @param loyaltyPointCheck the loyaltyPointCheck to set
	 */
	public void setLoyaltyPointCheck(int loyaltyPointCheck) {
		this.loyaltyPointCheck = loyaltyPointCheck;
	}

	/**
	 * Gets the businessid.
	 *
	 * @return the businessid
	 */
	public long getBusinessid() {
		return businessid;
	}

	/**
	 * Sets the businessid.
	 *
	 * @param businessid the businessid to set
	 */
	public void setBusinessid(long businessid) {
		this.businessid = businessid;
	}

	/**
	 * Gets the deal type id.
	 *
	 * @return the dealTypeId
	 */
	public long getDealTypeId() {
		return dealTypeId;
	}

	/**
	 * Sets the deal type id.
	 *
	 * @param dealTypeId the dealTypeId to set
	 */
	public void setDealTypeId(long dealTypeId) {
		this.dealTypeId = dealTypeId;
	}

	/**
	 * Gets the discount percent.
	 *
	 * @return the discountPercent
	 */
	public String getDiscountPercent() {
		return discountPercent;
	}

	/**
	 * Sets the discount percent.
	 *
	 * @param discountPercent the discountPercent to set
	 */
	public void setDiscountPercent(String discountPercent) {
		this.discountPercent = discountPercent;
	}

	/**
	 * Gets the buy item ids.
	 *
	 * @return the buyItemIds
	 */
	public String getBuyItemIds() {
		return buyItemIds;
	}

	/**
	 * Sets the buy item ids.
	 *
	 * @param buyItemIds the buyItemIds to set
	 */
	public void setBuyItemIds(String buyItemIds) {
		this.buyItemIds = buyItemIds;
	}

	/**
	 * Gets the gets the item ids.
	 *
	 * @return the getItemIds
	 */
	public String getGetItemIds() {
		return getItemIds;
	}

	/**
	 * Sets the gets the item ids.
	 *
	 * @param getItemIds the getItemIds to set
	 */
	public void setGetItemIds(String getItemIds) {
		this.getItemIds = getItemIds;
	}

	/**
	 * Gets the spend amount.
	 *
	 * @return the spendAmount
	 */
	public String getSpendAmount() {
		return spendAmount;
	}

	/**
	 * Sets the spend amount.
	 *
	 * @param spendAmount the spendAmount to set
	 */
	public void setSpendAmount(String spendAmount) {
		this.spendAmount = spendAmount;
	}

	/**
	 * Gets the view count.
	 *
	 * @return the viewCount
	 */
	public long getViewCount() {
		return viewCount;
	}

	/**
	 * Sets the view count.
	 *
	 * @param viewCount the viewCount to set
	 */
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	/**
	 * Gets the redeem count.
	 *
	 * @return the redeemCount
	 */
	public long getRedeemCount() {
		return redeemCount;
	}

	/**
	 * Sets the redeem count.
	 *
	 * @param redeemCount the redeemCount to set
	 */
	public void setRedeemCount(long redeemCount) {
		this.redeemCount = redeemCount;
	}

	/**
	 * Gets the store list.
	 *
	 * @return the storeList
	 */
	public String getStoreList() {
		return storeList;
	}

	/**
	 * Sets the store list.
	 *
	 * @param storeList the storeList to set
	 */
	public void setStoreList(String storeList) {
		this.storeList = storeList;
	}

	/**
	 * Gets the star.
	 *
	 * @return the star
	 */
	public int getStar() {
		return star;
	}

	/**
	 * Sets the star.
	 *
	 * @param star the star to set
	 */
	public void setStar(int star) {
		this.star = star;
	}

	/**
	 * Gets the loyalty point.
	 *
	 * @return the loyalty point
	 */
	public String getLoyaltyPoint() {
		return loyaltyPoint;
	}

	/**
	 * Sets the loyalty point.
	 *
	 * @param loyaltyPoint the new loyalty point
	 */
	public void setLoyaltyPoint(String loyaltyPoint) {
		this.loyaltyPoint = loyaltyPoint;
	}

	/**
	 * Gets the day.
	 *
	 * @return the day
	 */
	public String getDay() {
		return day;
	}

	/**
	 * Sets the day.
	 *
	 * @param day the new day
	 */
	public void setDay(String day) {
		this.day = day;
	}

	/**
	 * Gets the deals price.
	 *
	 * @return the deals price
	 */
	public String getDealsPrice() {
		return dealsPrice;
	}

	/**
	 * Sets the deals price.
	 *
	 * @param dealsPrice the new deals price
	 */
	public void setDealsPrice(String dealsPrice) {
		this.dealsPrice = dealsPrice;
	}

	/**
	 * Gets the deals with day.
	 *
	 * @return the deals with day
	 */
	public String getDealsWithDay() {
		return dealsWithDay;
	}

	/**
	 * Sets the deals with day.
	 *
	 * @param dealsWithDay the new deals with day
	 */
	public void setDealsWithDay(String dealsWithDay) {
		this.dealsWithDay = dealsWithDay;
	}

	@Override
	public String toString() {
		return "CampaignBean [startTime=" + startTime + ", dealsWithDay=" + dealsWithDay + ", endTime=" + endTime
				+ ", day=" + day + ", dealId=" + dealId + ", isHot=" + isHot + ", isLoyalty=" + isLoyalty + ", storeId="
				+ storeId + ", dealDesc=" + dealDesc + ", dealsPrice=" + dealsPrice + ", creationDate=" + creationDate
				+ ", updationDate=" + updationDate + ", storeProductServiceId=" + storeProductServiceId + ", dealImage="
				+ dealImage + ", startDate=" + startDate + ", expiryDate=" + expiryDate + ", loyaltyPointCheck="
				+ loyaltyPointCheck + ", businessid=" + businessid + ", dealTypeId=" + dealTypeId + ", discountPercent="
				+ discountPercent + ", storeList=" + storeList + ", buyItemIds=" + buyItemIds + ", getItemIds="
				+ getItemIds + ", spendAmount=" + spendAmount + ", viewCount=" + viewCount + ", redeemCount="
				+ redeemCount + ", loyaltyPoint=" + loyaltyPoint + ", loyaltyCheckPoint=" + loyaltyCheckPoint
				+ ", star=" + star + ", selectCategory=" + selectCategory + ", selectSubCategory=" + selectSubCategory
				+ "]";
	}

	/**
	 * Gets the loyalty check point.
	 *
	 * @return the loyalty check point
	 */
	public String getLoyaltyCheckPoint() {
		return loyaltyCheckPoint;
	}

	/**
	 * Sets the loyalty check point.
	 *
	 * @param loyaltyCheckPoints the new loyalty check point
	 */
	public void setLoyaltyCheckPoint(String loyaltyCheckPoints) {
		this.loyaltyCheckPoint = loyaltyCheckPoints;
	}

}
