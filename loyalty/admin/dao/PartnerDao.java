package com.mobiloitte.loyalty.admin.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.mobiloitte.loyalty.admin.dto.BusinessDetailsDTO;
import com.mobiloitte.loyalty.admin.dto.StoreTimeDto;

public interface PartnerDao {

	List<Map<String, Object>> getPartnerSearchListWithFilter();

	List<Map<String, Object>> viewPartnerDetails(String businessId);

	List<Map<String, Object>> seebreezeTransaction(String businessId);

	List<Map<String, Object>> marketingDeals(String businessId);

	Object findBybusinessIdforBlock(String businessId);

	Object findBybusinessIdforUnBlock(String businessId);

	List<Map<String, Object>> findAllRefundsDetails();

	List<Map<String, Object>> findAllRefundsActionDetails();

	List<Map<String, Object>> findByBestSellingServiceorProduct(String business_types, Date fromDate, Date toDate);

	List<Map<String, Object>> findByPartnersWithHighestCheckIn(String business_types, Date fromDate, Date toDate);

	List<Map<String, Object>> findAllTransactionsDetails();

	List<Map<String, Object>> findAll();

	List<Map<String, Object>> findByBusinessTypeNameHot(String business_types, Boolean check_hot_OR_loyalty,
			Date fromDate, Date toDate);

	List<Map<String, Object>> findByBusinessTypeNameLoyal(String business_types, Boolean check_hot_OR_loyalty,
			Date fromDate, Date toDate);

	List<Map<String, Object>> findBycreateDateBetweenCurrentMonth();

	List<Map<String, Object>> findCustomerCountDateBetweenCurrentMonth();

	List<Map<String, Object>> findTopWordSearchUsingBusinessNameAndDateBetweenCurrentMonth();

	int SaveOfBusinessDetails(BusinessDetailsDTO businessDetailsDTO);

	void SaveOfTime(StoreTimeDto storeTimeDto);

	List<Map<String, Object>> totalPartnerLosttDateBetweenCurrentMonth();

	List<Map<String, Object>> hottestProductSearchBetweenCurrentMonth();

	List<Map<String, Object>> partnersWithHighestCheckinBetweenCurrentMonth();

	List<Map<String, Object>> bestSellingItemForCurrentMonth();

	List<Map<String, Object>> topTenCustomerTransaction();

	List<Map<String, Object>> topTenUserRegister();

	List<Map<String, Object>> findTopTenTopWordSearch();

	List<Map<String, Object>> findTopTenPartnerLost();

	List<Map<String, Object>> findTopTenSellingItems();

	List<Map<String, Object>> findTopTenHotProduct();

	List<Map<String, Object>> findTopTenHighestCheckIn();
	
	
	
	
	
	
	
}
