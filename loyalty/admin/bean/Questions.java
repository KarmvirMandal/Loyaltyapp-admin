package com.mobiloitte.loyalty.admin.bean;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Questions.
 */
public class Questions {

	/** The question id. */
	private Long questionId;

	/** The question. */
	private String question;

	/** The response type combo. */
	private String responseTypeCombo;

	/** The new options. */
	private List<String> newOptions;

	/** The options. */
	private List<String> options;

	/** The option id. */
	private List<String> optionId;

	/** The del option id. */
	private Long delOptionId;

	/**
	 * Gets the question.
	 *
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Sets the question.
	 *
	 * @param question
	 *            the new question
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * Gets the response type combo.
	 *
	 * @return the response type combo
	 */
	public String getResponseTypeCombo() {
		return responseTypeCombo;
	}

	/**
	 * Sets the response type combo.
	 *
	 * @param responseTypeCombo
	 *            the new response type combo
	 */
	public void setResponseTypeCombo(String responseTypeCombo) {
		this.responseTypeCombo = responseTypeCombo;
	}

	/**
	 * Gets the question id.
	 *
	 * @return the question id
	 */
	public Long getQuestionId() {
		return questionId;
	}

	/**
	 * Sets the question id.
	 *
	 * @param questionId
	 *            the new question id
	 */
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	/**
	 * Gets the options.
	 *
	 * @return the options
	 */
	public List<String> getOptions() {
		return options;
	}

	/**
	 * Sets the options.
	 *
	 * @param options
	 *            the new options
	 */
	public void setOptions(List<String> options) {
		this.options = options;
	}

	/**
	 * Gets the option id.
	 *
	 * @return the option id
	 */
	public List<String> getOptionId() {
		return optionId;
	}

	/**
	 * Sets the option id.
	 *
	 * @param optionId
	 *            the new option id
	 */
	public void setOptionId(List<String> optionId) {
		this.optionId = optionId;
	}

	/**
	 * Gets the new options.
	 *
	 * @return the new options
	 */
	public List<String> getNewOptions() {
		return newOptions;
	}

	/**
	 * Sets the new options.
	 *
	 * @param newOptions
	 *            the new new options
	 */
	public void setNewOptions(List<String> newOptions) {
		this.newOptions = newOptions;
	}

	/**
	 * Gets the del option id.
	 *
	 * @return the del option id
	 */
	public Long getDelOptionId() {
		return delOptionId;
	}

	/**
	 * Sets the del option id.
	 *
	 * @param delOptionId
	 *            the new del option id
	 */
	public void setDelOptionId(Long delOptionId) {
		this.delOptionId = delOptionId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question
				+ ", responseTypeCombo=" + responseTypeCombo + ", newOptions="
				+ newOptions + ", options=" + options + ", optionId=" + optionId
				+ ", delOptionId=" + delOptionId + "]";
	}

}
