package com.mobiloitte.loyalty.admin.bean;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class QuestionnaireWebBean.
 */
public class QuestionnaireWebBean {

	/** The business id. */
	private String businessId;

	/** The user id. */
	private String userId;

	/** The questionnaire id. */
	private String questionnaireId;

	/** The questionnaire name. */
	private String questionnaireName;

	/** The start date. */
	private String startDate;

	/** The end date. */
	private String endDate;

	/** The target service. */
	private String targetService;

	/** The questionnaire at. */
	private String questionnaireAt;

	/** The points. */
	private String points;

	/** The questions. */
	private List<Questions> questions;

	/** The option id 1. */
	private String optionId1;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/** The option id 2. */
	private String optionId2;

	/** The option id 3. */
	private String optionId3;

	/** The option id 4. */
	private String optionId4;

	/** product name ***/
	private String productName;

	/**
	 * Gets the option id 1.
	 *
	 * @return the option id 1
	 */
	public String getOptionId1() {
		return optionId1;
	}

	/**
	 * Sets the option id 1.
	 *
	 * @param optionId1
	 *            the new option id 1
	 */
	public void setOptionId1(String optionId1) {
		this.optionId1 = optionId1;
	}

	/**
	 * Gets the option id 2.
	 *
	 * @return the option id 2
	 */
	public String getOptionId2() {
		return optionId2;
	}

	/**
	 * Sets the option id 2.
	 *
	 * @param optionId2
	 *            the new option id 2
	 */
	public void setOptionId2(String optionId2) {
		this.optionId2 = optionId2;
	}

	/**
	 * Gets the option id 3.
	 *
	 * @return the option id 3
	 */
	public String getOptionId3() {
		return optionId3;
	}

	/**
	 * Sets the option id 3.
	 *
	 * @param optionId3
	 *            the new option id 3
	 */
	public void setOptionId3(String optionId3) {
		this.optionId3 = optionId3;
	}

	/**
	 * Gets the option id 4.
	 *
	 * @return the option id 4
	 */
	public String getOptionId4() {
		return optionId4;
	}

	/**
	 * Sets the option id 4.
	 *
	 * @param optionId4
	 *            the new option id 4
	 */
	public void setOptionId4(String optionId4) {
		this.optionId4 = optionId4;
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
	 * Gets the questionnaire name.
	 *
	 * @return the questionnaire name
	 */
	public String getQuestionnaireName() {
		return questionnaireName;
	}

	/**
	 * Sets the questionnaire name.
	 *
	 * @param questionnaireName
	 *            the new questionnaire name
	 */
	public void setQuestionnaireName(String questionnaireName) {
		this.questionnaireName = questionnaireName;
	}

	/**
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate
	 *            the new start date
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate
	 *            the new end date
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the target service.
	 *
	 * @return the target service
	 */
	public String getTargetService() {
		return targetService;
	}

	/**
	 * Sets the target service.
	 *
	 * @param targetService
	 *            the new target service
	 */
	public void setTargetService(String targetService) {
		this.targetService = targetService;
	}

	/**
	 * Gets the questionnaire at.
	 *
	 * @return the questionnaire at
	 */
	public String getQuestionnaireAt() {
		return questionnaireAt;
	}

	/**
	 * Sets the questionnaire at.
	 *
	 * @param questionnaireAt
	 *            the new questionnaire at
	 */
	public void setQuestionnaireAt(String questionnaireAt) {
		this.questionnaireAt = questionnaireAt;
	}

	/**
	 * Gets the points.
	 *
	 * @return the points
	 */
	public String getPoints() {
		return points;
	}

	/**
	 * Sets the points.
	 *
	 * @param points
	 *            the new points
	 */
	public void setPoints(String points) {
		this.points = points;
	}

	/**
	 * Gets the questions.
	 *
	 * @return the questions
	 */
	public List<Questions> getQuestions() {
		return questions;
	}

	/**
	 * Sets the questions.
	 *
	 * @param questions
	 *            the new questions
	 */
	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "QuestionnaireWebBean [businessId=" + businessId + ", userId=" + userId + ", questionnaireId="
				+ questionnaireId + ", questionnaireName=" + questionnaireName + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", targetService=" + targetService + ", questionnaireAt=" + questionnaireAt
				+ ", points=" + points + ", questions=" + questions + ", optionId1=" + optionId1 + ", optionId2="
				+ optionId2 + ", optionId3=" + optionId3 + ", optionId4=" + optionId4 + ", productName=" + productName
				+ "]";
	}

}
