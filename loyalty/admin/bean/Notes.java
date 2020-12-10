package com.mobiloitte.loyalty.admin.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Notes.
 */
public class Notes {

	/** The notes id. */
	private long notesId;

	/** The notes title. */
	private String notesTitle;

	/** The notes message. */
	private String notesMessage;

	/** The store id. */
	private Long storeId;

	/** The business id. */
	private Long businessId;

	/**
	 * Instantiates a new notes.
	 */
	public Notes() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the notes id.
	 *
	 * @return the notes id
	 */
	public long getNotesId() {
		return notesId;
	}

	/**
	 * Sets the notes id.
	 *
	 * @param notesId
	 *            the new notes id
	 */
	public void setNotesId(long notesId) {
		this.notesId = notesId;
	}

	/**
	 * Gets the notes title.
	 *
	 * @return the notes title
	 */
	public String getNotesTitle() {
		return notesTitle;
	}

	/**
	 * Sets the notes title.
	 *
	 * @param notesTitle
	 *            the new notes title
	 */
	public void setNotesTitle(String notesTitle) {
		this.notesTitle = notesTitle;
	}

	/**
	 * Gets the notes message.
	 *
	 * @return the notes message
	 */
	public String getNotesMessage() {
		return notesMessage;
	}

	/**
	 * Sets the notes message.
	 *
	 * @param notesMessage
	 *            the new notes message
	 */
	public void setNotesMessage(String notesMessage) {
		this.notesMessage = notesMessage;
	}

	/**
	 * Gets the store id.
	 *
	 * @return the store id
	 */
	public Long getStoreId() {
		return storeId;
	}

	/**
	 * Sets the store id.
	 *
	 * @param storeId
	 *            the new store id
	 */
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	/**
	 * Gets the business id.
	 *
	 * @return the business id
	 */
	public Long getBusinessId() {
		return businessId;
	}

	/**
	 * Sets the business id.
	 *
	 * @param businessId
	 *            the new business id
	 */
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Notes [notesId=" + notesId + ", notesTitle=" + notesTitle
				+ ", notesMessage=" + notesMessage + ", storeId=" + storeId
				+ ", businessId=" + businessId + "]";
	}

}
