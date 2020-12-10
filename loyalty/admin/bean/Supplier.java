package com.mobiloitte.loyalty.admin.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Supplier.
 */
@Entity
@Table
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** The supplier id. */
	private int supplierId;

	/** The supplier name. */
	private String supplierName;

	/** The address. */
	private String address;

	/** The telephone number. */
	private String telephoneNumber;

	/** The mobile. */
	private String mobile;

	/** The supplier of. */
	private String supplierOf;

	/** The misc info. */
	private String miscInfo;

	private String businessId;
	
	private String storeId;
	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	/**
	 * Gets the supplier id.
	 *
	 * @return the supplier id
	 */
	public int getSupplierId() {
		return supplierId;
	}

	/**
	 * Sets the supplier id.
	 *
	 * @param supplierId
	 *            the new supplier id
	 */
	public void setSupplierId(int supplierId) {

		this.supplierId = supplierId;
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
	 * @param address
	 *            the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the telephone number.
	 *
	 * @return the telephone number
	 */
	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * Sets the telephone number.
	 *
	 * @param telephoneNumber
	 *            the new telephone number
	 */
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	/**
	 * Gets the mobile.
	 *
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets the mobile.
	 *
	 * @param mobile
	 *            the new mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * Gets the supplier of.
	 *
	 * @return the supplier of
	 */
	public String getSupplierOf() {
		return supplierOf;
	}

	/**
	 * Sets the supplier of.
	 *
	 * @param supplierOf
	 *            the new supplier of
	 */
	public void setSupplierOf(String supplierOf) {
		this.supplierOf = supplierOf;
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
	 * @param miscInfo
	 *            the new misc info
	 */
	public void setMiscInfo(String miscInfo) {
		this.miscInfo = miscInfo;
	}

	/**
	 * Gets the supplier name.
	 *
	 * @return the supplier name
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * Sets the supplier name.
	 *
	 * @param supplierName
	 *            the new supplier name
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName="
				+ supplierName + ", address=" + address + ", telephoneNumber="
				+ telephoneNumber + ", mobile=" + mobile + ", supplierOf="
				+ supplierOf + ", miscInfo=" + miscInfo + "]";
	}

}
