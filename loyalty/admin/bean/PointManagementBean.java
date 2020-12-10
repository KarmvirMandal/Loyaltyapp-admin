/**
 * 
 */
package com.mobiloitte.loyalty.admin.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class PointManagementBean.
 *
 * @author Sahil Nagpal
 */
public class PointManagementBean {

	/** The one star. */
	private int oneStar;

	/** The two star. */
	private int twoStar;

	/** The three star. */
	private int threeStar;

	/** The price. */
	private double price;

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
	 * @param oneStar
	 *            the oneStar to set
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
	 * @param twoStar
	 *            the twoStar to set
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
	 * @param threeStar
	 *            the threeStar to set
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
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PointManagementBean [oneStar=" + oneStar + ", twoStar="
				+ twoStar + ", threeStar=" + threeStar + ", price=" + price
				+ "]";
	}

}
