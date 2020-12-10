/**
 * 
 */
package com.mobiloitte.loyalty.admin.bean;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class BusinessBean.
 *
 * @author Sahil Nagpal
 */
@Entity
@Table(name = "business")
public class BusinessBean{
	// private static final long serialVersionUID = -3254406057751181181L;

	/** The business id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PK_BUSINESS_ID")
	private Long businessId;
	@Column(name = "BUSINESS_NAME")
	private String businessName;
	private String businessAddress;
	private String businessTell;
	@Column(name="EMAIL")
	private String businessEmail;
	@Column(name="BUSINESS_IMAGE")
	private String image;
	private Long selectNumberOfStore;
	@Column(name="CREATION_DATE")
	private Timestamp CREATION_DATE;
	 @Column(nullable=false)
	private boolean isStatus=true;

	public Timestamp getCREATION_DATE() {
		return CREATION_DATE;
	}

	public void setCREATION_DATE(Timestamp cREATION_DATE) {
		CREATION_DATE = cREATION_DATE;
	}

	public boolean isStatus() {
		return isStatus;
	}

	public void setStatus(boolean isStatus) {
		this.isStatus = isStatus;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getSelectNumberOfStore() {
		return selectNumberOfStore;
	}

	public void setSelectNumberOfStore(Long selectNumberOfStore) {
		this.selectNumberOfStore = selectNumberOfStore;
	}

	public Long getSelectNumberOfBeacons() {
		return selectNumberOfBeacons;
	}

	public void setSelectNumberOfBeacons(Long selectNumberOfBeacons) {
		this.selectNumberOfBeacons = selectNumberOfBeacons;
	}

	private Long selectNumberOfBeacons;
		

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getBusinessTell() {
		return businessTell;
	}

	public void setBusinessTell(String businessTell) {
		this.businessTell = businessTell;
	}

	public String getBusinessEmail() {
		return businessEmail;
	}

	public void setBusinessEmail(String businessEmail) {
		this.businessEmail = businessEmail;
	}

	public String getBusinessName() {
		
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessTypeId() {
		return businessTypeId;
	}

	public void setBusinessTypeId(String businessTypeId) {
		this.businessTypeId = businessTypeId;
	}

	/** The one star. */
	@Column(name="ONE_START_POINTS")
	private int oneStar;

	/** The two star. */
	@Column(name="TWO_START_POINTS")
	private int twoStar;

	/** The three star. */
	@Column(name="THREE_STAR_POINTS")
	private int threeStar;

	/** The price. */
	@Column(name="PRICE_PER_LOYALTY_POINT")
	private double price;
	@Column(name = "FK_BUSINESS_TYPE_ID")
	private String businessTypeId;


	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	/**
	 * Gets the one star.
	 *
	 * @return the oneStar
	 */
	public int getOneStar() {
		return oneStar;
	}

	/**
	 * Sets the one star.
	 *
	 * @param oneStar the oneStar to set
	 */
	public void setOneStar(int oneStar) {
		this.oneStar = oneStar;
	}

	/**
	 * Gets the two star.
	 *
	 * @return the twoStar
	 */
	public int getTwoStar() {
		return twoStar;
	}

	/**
	 * Sets the two star.
	 *
	 * @param twoStar the twoStar to set
	 */
	public void setTwoStar(int twoStar) {
		this.twoStar = twoStar;
	}

	/**
	 * Gets the three star.
	 *
	 * @return the threeStar
	 */
	public int getThreeStar() {
		return threeStar;
	}

	/**
	 * Sets the three star.
	 *
	 * @param threeStar the threeStar to set
	 */
	public void setThreeStar(int threeStar) {
		this.threeStar = threeStar;
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
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Gets the business id.
	 *
	 * @return the businessId
	 */
	public long getBusinessId() {
		return businessId;
	}

	/**
	 * Sets the business id.
	 *
	 * @param businessId the businessId to set
	 */
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}
}
