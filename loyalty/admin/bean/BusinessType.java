package com.mobiloitte.loyalty.admin.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "business_Type")
public class BusinessType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_business_type_id")
	private Long businessTypeId;
	@Column(name = "BUSINESS_TYPE_NAME")
	private String businessTypeName;
	@Column(name = "fk_business_category_id")
	private boolean businessCategoryId;
	@Column(name = "IS_TABLE_EXIST")
	private boolean isTableExit;
	public Long getBusinessTypeId() {
		return businessTypeId;
	}
	public void setBusinessTypeId(Long businessTypeId) {
		this.businessTypeId = businessTypeId;
	}
	public String getBusinessTypeName() {
		return businessTypeName;
	}
	public void setBusinessTypeName(String businessTypeName) {
		this.businessTypeName = businessTypeName;
	}
	public boolean isBusinessCategoryId() {
		return businessCategoryId;
	}
	public void setBusinessCategoryId(boolean businessCategoryId) {
		this.businessCategoryId = businessCategoryId;
	}
	public boolean isTableExit() {
		return isTableExit;
	}
	public void setTableExit(boolean isTableExit) {
		this.isTableExit = isTableExit;
	}
}
