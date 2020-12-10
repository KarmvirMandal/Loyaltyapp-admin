package com.mobiloitte.loyalty.admin.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table
public class StaticContent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long staticContentId;

	private String pageKey;

	@Lob
	private String pageData;

	private Boolean isDeleted;

	public Long getStaticContentId() {
		return staticContentId;
	}

	public void setStaticContentId(Long staticContentId) {
		this.staticContentId = staticContentId;
	}

	public String getPageKey() {
		return pageKey;
	}

	public void setPageKey(String pageKey) {
		this.pageKey = pageKey;
	}

	public String getPageData() {
		return pageData;
	}

	public void setPageData(String pageData) {
		this.pageData = pageData;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}