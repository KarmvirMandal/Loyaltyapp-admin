package com.mobiloitte.loyalty.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FindCheckList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String proofOfIEmailedIn;
	private String ProofOfOwnership;
	private String bankDetailsOnLetter;
	private String dateAndTimeOfInduction;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProofOfIEmailedIn() {
		return proofOfIEmailedIn;
	}
	public void setProofOfIEmailedIn(String proofOfIEmailedIn) {
		this.proofOfIEmailedIn = proofOfIEmailedIn;
	}
	public String getProofOfOwnership() {
		return ProofOfOwnership;
	}
	public void setProofOfOwnership(String proofOfOwnership) {
		ProofOfOwnership = proofOfOwnership;
	}
	public String getBankDetailsOnLetter() {
		return bankDetailsOnLetter;
	}
	public void setBankDetailsOnLetter(String bankDetailsOnLetter) {
		this.bankDetailsOnLetter = bankDetailsOnLetter;
	}
	public String getDateAndTimeOfInduction() {
		return dateAndTimeOfInduction;
	}
	public void setDateAndTimeOfInduction(String dateAndTimeOfInduction) {
		this.dateAndTimeOfInduction = dateAndTimeOfInduction;
	}
}
