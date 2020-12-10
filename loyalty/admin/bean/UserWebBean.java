package com.mobiloitte.loyalty.admin.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class UserWebBean.
 */

public class UserWebBean {

	/** The email. */
	private String email;

	/** The password. */
	private String password;

	/** The hidden next. */
	private String hiddenNext;

	/** The remember chk box. */
	private boolean rememberChkBox;

	/** The remember token. */
	private String remember_token;

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
	 * Gets the hidden next.
	 *
	 * @return the hidden next
	 */
	public String getHiddenNext() {
		return hiddenNext;
	}

	/**
	 * Sets the hidden next.
	 *
	 * @param hiddenNext
	 *            the new hidden next
	 */
	public void setHiddenNext(String hiddenNext) {
		this.hiddenNext = hiddenNext;
	}

	/**
	 * Checks if is remember chk box.
	 *
	 * @return true, if is remember chk box
	 */
	public boolean isRememberChkBox() {
		return rememberChkBox;
	}

	/**
	 * Sets the remember chk box.
	 *
	 * @param rememberChkBox
	 *            the new remember chk box
	 */
	public void setRememberChkBox(boolean rememberChkBox) {
		this.rememberChkBox = rememberChkBox;
	}

	/**
	 * Gets the remember token.
	 *
	 * @return the remember token
	 */
	public String getRemember_token() {
		return remember_token;
	}

	/**
	 * Sets the remember token.
	 *
	 * @param remember_token
	 *            the new remember token
	 */
	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserWebBean [email=" + email + ", password=" + password
				+ ", hiddenNext=" + hiddenNext + ", rememberChkBox="
				+ rememberChkBox + ", remember_token=" + remember_token + "]";
	}

}
