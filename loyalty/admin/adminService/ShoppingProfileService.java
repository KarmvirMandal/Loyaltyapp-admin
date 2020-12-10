package com.mobiloitte.loyalty.admin.adminService;

import java.util.List;
import java.util.Map;

import com.mobiloitte.loyalty.admin.dto.ShoppingProfileDto;

public interface ShoppingProfileService {

	List<ShoppingProfileDto> getShoppingProfile();

	Map<String, Object> addfilterInGetShoppingProfile(String search);
	

}
