package com.mobiloitte.loyalty.admin.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store_time")
public class StoreTime {
	public long getStoreTimeId() {
		return storeTimeId;
	}
	public void setStoreTimeId(long storeTimeId) {
		this.storeTimeId = storeTimeId;
	}
	public String getDays() {
		return Days;
	}
	public void setDays(String days) {
		Days = days;
	}
	public String getOpening() {
		return opening;
	}
	public void setOpening(String opening) {
		this.opening = opening;
	}
	public String getClosing() {
		return closing;
	}
	public void setClosing(String closing) {
		this.closing = closing;
	}
	public Timestamp getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}
	public Timestamp getUpdationTime() {
		return updationTime;
	}
	public void setUpdationTime(Timestamp updationTime) {
		this.updationTime = updationTime;
	}
	public Long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="STORE_TIME_ID")
	private long storeTimeId;
	@Column(name="DAY")
	private String  Days;
	@Column(name="START_TIME")
	private String opening;
	@Column(name="CLOSE_TIME")
	private String closing;
	@Column(name="CREATION_TIME")
	private Timestamp creationTime;
	@Column(name="UPDATION_TIME")
	private Timestamp updationTime;
	@Column(name="FK_BUSINESS_ID")
	private Long businessId;
	@Column(name="FK_STORE_ID")
	private Long storeId;

}
