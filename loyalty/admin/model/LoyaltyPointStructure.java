package com.mobiloitte.loyalty.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LoyaltyPointStructure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long silver;
	private Long gold;
	public Long getGold() {
		return gold;
	}
	public void setGold(Long gold) {
		this.gold = gold;
	}
	private Long platinum;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSilver() {
		return silver;
	}
	public void setSilver(Long silver) {
		this.silver = silver;
	}
	public Long getPlatinum() {
		return platinum;
	}
	public void setPlatinum(Long platinum) {
		this.platinum = platinum;
	}

}
