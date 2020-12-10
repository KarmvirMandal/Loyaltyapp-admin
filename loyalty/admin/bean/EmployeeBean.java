package com.mobiloitte.loyalty.admin.bean;

import org.springframework.web.multipart.MultipartFile;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeBean.
 */
public class EmployeeBean {

	/** The user id. */
	private String userId;

	/** The store id. */
	private String storeId;

	/** The store id. */
	private String businessId;

	/** The user name. */
	private String userName;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The email. */
	private String email;

	/** The phone. */
	private String phone;

	/** The password. */
	private String password;

	/** The profile image. */
	private MultipartFile profileImage;

	/** The profile image name. */
	private String profileImageName;

	// , BUSINESS_HUB, ANALYTICS, MARKETING, OPERATION, INVENTORY,
	// STORE_MANAGEMENT

	/** The business hub. */
	private String businessHub;

	/** The analytics. */
	private String analytics;

	/** The marketing. */
	private String marketing;

	/** The operation. */
	private String operation;

	/** The inventory. */
	private String inventory;

	/** The store management. */
	private String storeManagement;

	/** The create store manager. */
	private String createStoreManager;

	/**
	 * Gets the business hub.
	 *
	 * @return the business hub
	 */
	public String getBusinessHub() {
		return businessHub;
	}

	/**
	 * Sets the business hub.
	 *
	 * @param businessHub
	 *            the new business hub
	 */
	public void setBusinessHub(String businessHub) {
		this.businessHub = businessHub;
	}

	/**
	 * Gets the analytics.
	 *
	 * @return the analytics
	 */
	public String getAnalytics() {
		return analytics;
	}

	/**
	 * Sets the analytics.
	 *
	 * @param analytics
	 *            the new analytics
	 */
	public void setAnalytics(String analytics) {
		this.analytics = analytics;
	}

	/**
	 * Gets the marketing.
	 *
	 * @return the marketing
	 */
	public String getMarketing() {
		return marketing;
	}

	/**
	 * Sets the marketing.
	 *
	 * @param marketing
	 *            the new marketing
	 */
	public void setMarketing(String marketing) {
		this.marketing = marketing;
	}

	/**
	 * Gets the operation.
	 *
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * Sets the operation.
	 *
	 * @param operation
	 *            the new operation
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * Gets the inventory.
	 *
	 * @return the inventory
	 */
	public String getInventory() {
		return inventory;
	}

	/**
	 * Sets the inventory.
	 *
	 * @param inventory
	 *            the new inventory
	 */
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	/**
	 * Gets the store management.
	 *
	 * @return the store management
	 */
	public String getStoreManagement() {
		return storeManagement;
	}

	/**
	 * Sets the store management.
	 *
	 * @param store_management
	 *            the new store management
	 */
	public void setStoreManagement(String store_management) {
		this.storeManagement = store_management;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
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
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName
	 *            the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email
	 *            the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone
	 *            the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the profile image name.
	 *
	 * @return the profile image name
	 */
	public String getProfileImageName() {
		return profileImageName;
	}

	/**
	 * Sets the profile image name.
	 *
	 * @param profileImageName
	 *            the new profile image name
	 */
	public void setProfileImageName(String profileImageName) {
		this.profileImageName = profileImageName;
	}

	/**
	 * Gets the profile image.
	 *
	 * @return the profile image
	 */
	public MultipartFile getProfileImage() {
		return profileImage;
	}

	/**
	 * Sets the profile image.
	 *
	 * @param profileImage
	 *            the new profile image
	 */
	public void setProfileImage(MultipartFile profileImage) {
		this.profileImage = profileImage;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeBean [userId=" + userId + ", storeId=" + storeId
				+ ", businessId=" + businessId + ", userName=" + userName
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + ", password="
				+ password + ", profileImage=" + profileImage
				+ ", profileImageName=" + profileImageName + ", businessHub="
				+ businessHub + ", analytics=" + analytics + ", marketing="
				+ marketing + ", operation=" + operation + ", inventory="
				+ inventory + ", storeManagement=" + storeManagement + "]";
	}

	/**
	 * Gets the creates the store manager.
	 *
	 * @return the creates the store manager
	 */
	public String getCreateStoreManager() {
		return createStoreManager;
	}

	/**
	 * Sets the creates the store manager.
	 *
	 * @param createStoreManager
	 *            the new creates the store manager
	 */
	public void setCreateStoreManager(String createStoreManager) {
		this.createStoreManager = createStoreManager;
	}

}
