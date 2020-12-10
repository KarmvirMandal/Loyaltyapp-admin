package com.mobiloitte.loyalty.admin.bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class StoreWeb.
 */
@Entity
@Table(name = "store")
public class StoreWeb {

	/** The store id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PK_STORE_ID")
	private Long storeId;

	/** The store time id. */
	private Long storeTimeId;

	/** The store name. */
	private String storeName;

	/** The contact name. */
	private String contactName;

	/** The address. */
	private String address;

	/** The contact no. */
	private String contactNo;

	/** The area code. */
	private String areaCode;

	/** The start time. */
	@Column(name = "START_TIME")
	private String startTime;

	/** The end time. */
	@Column(name = "END_TIME")
	private String endTime;

	/** The latitude. */
	private String latitude;

	/** The longitude. */
	private String longitude;

	/** The uuid. */
	private String uuid;

	/** The major no. */
	private String majorNo;

	/** The minor no. */
	private String minorNo;
	@Column(name="STATUS")
	private boolean isStatus;
	@Column(name="CREATION_DATE")
    private Date creationTime;
	/** The day. */
	// private List<String> day;


	/**
	 * Gets the store id.
	 *
	 * @return the store id
	 */
	public Long getStoreId() {
		return storeId;
	}

	public boolean isStatus() {
		return isStatus;
	}

	public void setStatus(boolean isStatus) {
		this.isStatus = isStatus;
	}


	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * Sets the store id.
	 *
	 * @param storeId the new store id
	 */
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	/**
	 * Gets the store time id.
	 *
	 * @return the store time id
	 */
	public Long getStoreTimeId() {
		return storeTimeId;
	}

	/**
	 * Sets the store time id.
	 *
	 * @param storeTimeId the new store time id
	 */
	public void setStoreTimeId(Long storeTimeId) {
		this.storeTimeId = storeTimeId;
	}

	/**
	 * Gets the store name.
	 *
	 * @return the store name
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * Sets the store name.
	 *
	 * @param storeName the new store name
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	/**
	 * Gets the contact name.
	 *
	 * @return the contact name
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * Sets the contact name.
	 *
	 * @param contactName the new contact name
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the contact no.
	 *
	 * @return the contact no
	 */
	public String getContactNo() {
		return contactNo;
	}

	/**
	 * Sets the contact no.
	 *
	 * @param contactNo the new contact no
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 * Gets the area code.
	 *
	 * @return the area code
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * Sets the area code.
	 *
	 * @param areaCode the new area code
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

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
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the uuid.
	 *
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * Sets the uuid.
	 *
	 * @param uuid the new uuid
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * Gets the major no.
	 *
	 * @return the major no
	 */
	public String getMajorNo() {
		return majorNo;
	}

	/**
	 * Sets the major no.
	 *
	 * @param majorNo the new major no
	 */
	public void setMajorNo(String majorNo) {
		this.majorNo = majorNo;
	}

	/**
	 * Gets the minor no.
	 *
	 * @return the minor no
	 */
	public String getMinorNo() {
		return minorNo;
	}

	/**
	 * Sets the minor no.
	 *
	 * @param minorNo the new minor no
	 */
	public void setMinorNo(String minorNo) {
		this.minorNo = minorNo;
	}

	/**
	 * Gets the day.
	 *
	 * @return the day
	 */
//	public List<String> getDay() {
//		return day;
//	}
//
//	/**
//	 * Sets the day.
//	 *
//	 * @param day
//	 *            the new day
//	 */
//	public void setDay(List<String> day) {
//		this.day = day;
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "storeName=" + storeName + ",contactName=" + contactName + ",address=" + address + ",contactNo="
				+ contactNo + ",areaCode=" + areaCode + ",startTime=" + startTime + ",endTime=" + endTime + ",latitude="
				+ latitude + ",longitude=" + longitude + ",uuid=" + uuid + ",majorNo=" + majorNo + ",minorNo="
				+ minorNo;

	}

}
