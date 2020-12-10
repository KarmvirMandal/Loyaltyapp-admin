package com.mobiloitte.loyalty.admin.adminService;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.mobiloitte.loyalty.admin.dto.BusinessDetailsDTO;
import com.mobiloitte.loyalty.admin.dto.OwnerDetailsDto;
import com.mobiloitte.loyalty.admin.dto.StoreTimeDto;
import com.mobiloitte.loyalty.admin.model.FindCheckList;
import com.mobiloitte.loyalty.admin.model.LoyaltyPointStructure;

public interface PartnerService {

	Map<String, Object> totalPartners();

	Map<String, Object> getOwnerDetails(OwnerDetailsDto ownerDetailsDto);

	List<Object> selectBusinessType();

	/*
	 * Map<String, Object> businessDetails(BusinessDetailsDTO businessDetailsDTO);
	 */

	List<Object> GetPartnerSearchListWithFilter();

	List<Object> viewPartnerDetails(String businessId);

	List<Object> seebreezeTransaction(String businessId);

	List<Object> marketingDeals(String businessId);

	String ViewPartnerdetailsBlock(String businessId);

	String ViewPartnerdetailsUnBlock(String businessId);

	List<Object> getRefundsDetailsAll();

	List<Object> getRefundsDetailsAllForAction();

	Map<String, Object> getTotalUserPartnersWithFilter(Date formDate, Date toDate);

	Map<String, Object> getTotalUserPartnersLostWithFilter(Date fromDate, Date toDate);

	Map<String, Object> hottestProductService(String business_type, Boolean check_hot_loyalty, Date toDate, Date fromDate);

	List<Object> bestSellingItemsServices(String business_types, Date fromDate, Date toDate);

	List<Object> partnersWithHighestCheckIn(Date fromDate, Date toDate, String business_type);

	List<Object> transactionaDEtailsAll();

	List<Object> getPartnerDetailsAll();

	Map<String, Object> totalCustomerForCurrentMonth();

	Map<String, Object> topWordSearchForCurrentMonth();

	Map<String, Object> totalCustomerTransectionForCurrentMonth();

	Map<String, Object> loyaltyPointStructure(LoyaltyPointStructure loyaltyPointStructure);

	Map<String, Object> findCheckList(FindCheckList findCheckList);

	Map<String, Object> businessDetails(BusinessDetailsDTO businessDetailsDTO, StoreTimeDto storeTimeDto)
			throws SQLException;
	

	Map<String, Object> totalPartnerLostForCurrentMonth();

	Map<String, Object> hottestProductSearchForCurrentMonth();

	Map<String, Object> partnerWithHighestCheckinForCurrentMonth();



	Map<String, Object> bestSellingItemForCurrentMonth();

	List<Object> topTenCustomerTransaction();

	List<Object> topTenUserRegister();

	List<Object> topTenWordSearch();

	List<Object> topTenPartnerLost();

	List<Object> topTenSellingItems();

	List<Object> topTenHotProduct();

	List<Object> topTenHighestcheckIn();
	
	
	
	
	
	
	
	

}
