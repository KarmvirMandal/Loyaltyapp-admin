package com.mobiloitte.loyalty.admin.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductAnalytics.
 */
public class ProductAnalytics {

	/** The product. */
	private String product;

	/** The product category. */
	private String productCategory;

	/**
	 * Gets the product.
	 *
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * Sets the product.
	 *
	 * @param product
	 *            the new product
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * Gets the product category.
	 *
	 * @return the product category
	 */
	public String getProductCategory() {
		return productCategory;
	}

	/**
	 * Sets the product category.
	 *
	 * @param productCategory
	 *            the new product category
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductAnalytics [product=" + product + ", productCategory="
				+ productCategory + "]";
	}

}
