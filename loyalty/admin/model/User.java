package com.mobiloitte.loyalty.admin.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mobiloitte.loyalty.admin.enums.UserStatus;

@Entity
@Table(name = "user")
public class User {
	@Column(name = "PK_USER_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** The user id. */
	
	private String userId;
	@Column(name = "OWNER_DETAILS")
	private Boolean ownerDetails;
	

	public Boolean getOwnerDetails() {
		return ownerDetails;
	}

	public void setOwnerDetails(Boolean ownerDetails) {
		this.ownerDetails = ownerDetails;
	}

	/** The brain tree tokens. */
	private String brainTreeTokens;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/** The user name. */
	@Column(name = "USER_NAME")
	private String userName;

	/** The first name. */
	@Column(name = "FIRST_NAME")
	private String firstName;

	/** The last name. */
	@Column(name = "LAST_NAME")
	private String lastName;

	/** The email. */
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ADDRESS")
	private String address;
	/** The phone. */
	private String tell;
	/** The Mo. No.. */
	private String phone;

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	/** The password. */
	private String password;

	/** The profile image. */
	private String profileImage;

	/** The device key. */
	private String deviceKey;

	/** The device token. */
	private String deviceToken;

	/** The device type. */
	private String deviceType;

	/** The social id. */
	private String socialId;

	/** The area code. */
	private String areaCode;

	/** The country code. */
	private String countryCode;

	/** The social login type. */
	private String socialLoginType;

	/** The new password. */
	private String newPassword;

	/** The otp. */
	private String otp;

	/** The refer by id. */
	private String referById;

	/** The reference id. */
	private String referenceId;

	/** The customer token. */
	private String customerToken;

	/** The jwt token. */
	private String jwtToken;
	@Column(name = "CREATION_DATE")
	private Date createDate;
	private boolean isStatus = true;
	@Column(columnDefinition = "varchar(32)")
	@Enumerated(EnumType.STRING)
	private UserStatus userStatus;
	@Column(name="ROLE")
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	public boolean isStatus() {
		return isStatus;
	}

	public void setStatus(boolean isStatus) {
		this.isStatus = isStatus;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * Gets the jwt token.
	 *
	 * @return the jwt token
	 */
	public String getJwtToken() {
		return jwtToken;
	}

	/**
	 * Sets the jwt token.
	 *
	 * @param jwtToken the new jwt token
	 */
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
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
	 * @param firstName the new first name
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
	 * @param lastName the new last name
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
	 * @param email the new email
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
	 * @param phone the new phone
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
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the device key.
	 *
	 * @return the device key
	 */
	public String getDeviceKey() {
		return deviceKey;
	}

	/**
	 * Sets the device key.
	 *
	 * @param deviceKey the new device key
	 */
	public void setDeviceKey(String deviceKey) {
		this.deviceKey = deviceKey;
	}

	/**
	 * Gets the device token.
	 *
	 * @return the device token
	 */
	public String getDeviceToken() {
		return deviceToken;
	}

	/**
	 * Sets the device token.
	 *
	 * @param deviceToken the new device token
	 */
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	/**
	 * Gets the device type.
	 *
	 * @return the device type
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * Sets the device type.
	 *
	 * @param deviceType the new device type
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * Gets the social id.
	 *
	 * @return the social id
	 */
	public String getSocialId() {
		return socialId;
	}

	/**
	 * Sets the social id.
	 *
	 * @param socialId the new social id
	 */
	public void setSocialId(String socialId) {
		this.socialId = socialId;
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
	 * Gets the country code.
	 *
	 * @return the country code
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the country code.
	 *
	 * @param countryCode the new country code
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Gets the social login type.
	 *
	 * @return the social login type
	 */
	public String getSocialLoginType() {
		return socialLoginType;
	}

	/**
	 * Gets the refer by id.
	 *
	 * @return the refer by id
	 */
	public String getReferById() {
		return referById;
	}

	/**
	 * Gets the reference id.
	 *
	 * @return the reference id
	 */
	public String getReferenceId() {
		return referenceId;
	}

	/**
	 * Sets the refer by id.
	 *
	 * @param referById the new refer by id
	 */
	public void setReferById(String referById) {
		this.referById = referById;
	}

	/**
	 * Sets the reference id.
	 *
	 * @param referenceId the new reference id
	 */
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	/**
	 * Sets the social login type.
	 *
	 * @param socialLoginType the new social login type
	 */
	public void setSocialLoginType(String socialLoginType) {
		this.socialLoginType = socialLoginType;
	}

	/**
	 * Gets the profile image.
	 *
	 * @return the profile image
	 */
	public String getProfileImage() {
		return profileImage;
	}

	/**
	 * Sets the profile image.
	 *
	 * @param profileImage the new profile image
	 */
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	/**
	 * Gets the new password.
	 *
	 * @return the new password
	 */
	public String getNewPassword() {
		return newPassword;
	}

	/**
	 * Sets the new password.
	 *
	 * @param newPassword the new new password
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	/**
	 * Gets the otp.
	 *
	 * @return the otp
	 */
	public String getOtp() {
		return otp;
	}

	/**
	 * Sets the otp.
	 *
	 * @param otp the new otp
	 */
	public void setOtp(String otp) {
		this.otp = otp;
	}

	/**
	 * Gets the customer token.
	 *
	 * @return the customer token
	 */
	public String getCustomerToken() {
		return customerToken;
	}

	/**
	 * Sets the customer token.
	 *
	 * @param customerToken the new customer token
	 */
	public void setCustomerToken(String customerToken) {
		this.customerToken = customerToken;
	}

	/**
	 * Gets the brain tree tokens.
	 *
	 * @return the brain tree tokens
	 */
	public String getBrainTreeTokens() {
		return brainTreeTokens;
	}

	/**
	 * Sets the brain tree tokens.
	 *
	 * @param brainTreeTokens the new brain tree tokens
	 */
	public void setBrainTreeTokens(String brainTreeTokens) {
		this.brainTreeTokens = brainTreeTokens;
	}

}
