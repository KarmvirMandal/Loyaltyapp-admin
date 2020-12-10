package com.mobiloitte.loyalty.admin.dto;

public class BusinessDetailsDTO {
	private String business_name;
	private String business_Address;
	private String business_tell;
	private String email;
	private String business_images;
	private Long select_Number_Of_Store;
	private Long select_number_of_beacons;
	private boolean is_status = false;

	public boolean isIs_status() {
		return is_status;
	}

	public void setIs_status(boolean is_status) {
		this.is_status = is_status;
	}

	public String getBusiness_name() {
		return business_name;
	}

	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}

	public String getBusiness_Address() {
		return business_Address;
	}

	public void setBusiness_Address(String business_Address) {
		this.business_Address = business_Address;
	}

	public String getBusiness_tell() {
		return business_tell;
	}

	public void setBusiness_tell(String business_tell) {
		this.business_tell = business_tell;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBusiness_images() {
		return business_images;
	}

	public void setBusiness_images(String business_images) {
		this.business_images = business_images;
	}

	public Long getSelect_Number_Of_Store() {
		return select_Number_Of_Store;
	}

	public void setSelect_Number_Of_Store(Long select_Number_Of_Store) {
		this.select_Number_Of_Store = select_Number_Of_Store;
	}

	public Long getSelect_number_of_beacons() {
		return select_number_of_beacons;
	}

	public void setSelect_number_of_beacons(Long select_number_of_beacons) {
		this.select_number_of_beacons = select_number_of_beacons;
	}

}