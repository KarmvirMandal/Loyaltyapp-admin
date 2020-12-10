package com.mobiloitte.loyalty.admin.model;

import java.util.ArrayList;
import java.util.HashMap;

// TODO: Auto-generated Javadoc
/**
 * The Class Questionnaire.
 */
public class Questionnaire {

	/** The business id. */
	private String businessId;

	/** The user id. */
	private String userId;

	/** The questionnaire id. */
	private String questionnaireId;

	/** The order id. */
	private String orderId;

	/** The answers. */
	private ArrayList<HashMap<String, Object>> answers;

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

	/**
	 * Gets the questionnaire id.
	 *
	 * @return the questionnaire id
	 */
	public String getQuestionnaireId() {
		return questionnaireId;
	}

	/**
	 * Sets the questionnaire id.
	 *
	 * @param questionnaireId
	 *            the new questionnaire id
	 */
	public void setQuestionnaireId(String questionnaireId) {
		this.questionnaireId = questionnaireId;
	}

	/**
	 * Gets the answers.
	 *
	 * @return the answers
	 */
	public ArrayList<HashMap<String, Object>> getAnswers() {
		return answers;
	}

	/**
	 * Sets the answers.
	 *
	 * @param answers
	 *            the answers
	 */
	public void setAnswers(ArrayList<HashMap<String, Object>> answers) {
		this.answers = answers;
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
	 * Gets the order id.
	 *
	 * @return the order id
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * Sets the order id.
	 *
	 * @param orderId
	 *            the new order id
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
