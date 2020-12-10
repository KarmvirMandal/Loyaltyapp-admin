package com.mobiloitte.loyalty.admin.model;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckIn.
 */
public class CheckIn {

	/** The user checked in id. */
	private String userCheckedInId;

	/** The user id. */
	private String userId;

	/** The store id. */
	private String storeId;

	/** The type. */
	private String type;

	/** The check out type. */
	private String checkOutType;
	/** The business id. */
	private String businessId;
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Gets the check out type.
	 *
	 * @return the check out type
	 */
	public String getCheckOutType() {
		return checkOutType;
	}

	/**
	 * Sets the check out type.
	 *
	 * @param checkOutType
	 *            the new check out type
	 */
	public void setCheckOutType(String checkOutType) {
		this.checkOutType = checkOutType;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId
	 *            the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * @param storeId
	 *            the new store id
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	/**
	 * Gets the user checked in id.
	 *
	 * @return the user checked in id
	 */
	public String getUserCheckedInId() {
		return userCheckedInId;
	}

	/**
	 * Sets the user checked in id.
	 *
	 * @param userCheckedInId
	 *            the new user checked in id
	 */
	public void setUserCheckedInId(String userCheckedInId) {
		this.userCheckedInId = userCheckedInId;
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
	 * @param type
	 *            the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the business id.
	 *
	 * @return the business id
	 */
	public String getBusinessId() {
		return businessId;
	}

	/**
	 * Sets the business id.
	 *
	 * @param businessId
	 *            the new business id
	 */
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
}
