package com.mobiloitte.loyalty.admin.model;

import java.sql.Timestamp;

// TODO: Auto-generated Javadoc
/**
 * The Class Cart.
 */
public class Cart {

	/** The deals in cart id. */
	private long dealsInCartId;

	/** The user id. */
	private long userId;

	/** The store id. */
	private long storeId;

	/** The creation date. */
	private Timestamp creationDate;

	/** The deal id. */
	private long dealId;

	/** The status. */
	private int status;

	/**
	 * Gets the deals in cart id.
	 *
	 * @return the deals in cart id
	 */
	public long getDealsInCartId() {
		return dealsInCartId;
	}

	/**
	 * Sets the deals in cart id.
	 *
	 * @param dealsInCartId
	 *            the new deals in cart id
	 */
	public void setDealsInCartId(long dealsInCartId) {
		this.dealsInCartId = dealsInCartId;
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
	 * @param userId
	 *            the new user id
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
	 * @param storeId
	 *            the new store id
	 */
	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	/**
	 * Gets the creation date.
	 *
	 * @return the creation date
	 */
	public Timestamp getCreationDate() {
		return creationDate;
	}

	/**
	 * Sets the creation date.
	 *
	 * @param creationDate
	 *            the new creation date
	 */
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Gets the deal id.
	 *
	 * @return the deal id
	 */
	public long getDealId() {
		return dealId;
	}

	/**
	 * Sets the deal id.
	 *
	 * @param dealId
	 *            the new deal id
	 */
	public void setDealId(long dealId) {
		this.dealId = dealId;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the new status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
