package com.mobiloitte.loyalty.admin.bean;

public class TargetBean {

	private long id;
	private String date;
	private String amount;
	private String day;
	private String month;
	private long fk_business_id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return "TargetBean [id=" + id + ", date=" + date + ", amount=" + amount + ", day=" + day + ", month=" + month
				+ "]";
	}
	public long getFk_business_id() {
		return fk_business_id;
	}
	public void setFk_business_id(long fk_business_id) {
		this.fk_business_id = fk_business_id;
	}
	
	
	
	
}
