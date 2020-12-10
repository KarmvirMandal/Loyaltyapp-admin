package com.mobiloitte.loyalty.admin.adminServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobiloitte.loyalty.admin.adminService.PartnerService;
import com.mobiloitte.loyalty.admin.bean.BusinessBean;
import com.mobiloitte.loyalty.admin.bean.BusinessType;
import com.mobiloitte.loyalty.admin.bean.StoreWeb;
import com.mobiloitte.loyalty.admin.dao.AdminDao;
import com.mobiloitte.loyalty.admin.dao.BusinessBeanDao;
import com.mobiloitte.loyalty.admin.dao.BusinessTypeDao;
import com.mobiloitte.loyalty.admin.dao.FindCheckListDao;
import com.mobiloitte.loyalty.admin.dao.LoyaltyPointStructureDao;
import com.mobiloitte.loyalty.admin.dao.PartnerDao;
import com.mobiloitte.loyalty.admin.dao.ShoppingProfileDao;
import com.mobiloitte.loyalty.admin.dao.StroreTimeDao;
import com.mobiloitte.loyalty.admin.dto.BusinessDetailsDTO;
import com.mobiloitte.loyalty.admin.dto.OwnerDetailsDto;
import com.mobiloitte.loyalty.admin.dto.StoreTimeDto;
import com.mobiloitte.loyalty.admin.model.FindCheckList;
import com.mobiloitte.loyalty.admin.model.LoyaltyPointStructure;
import com.mobiloitte.loyalty.admin.model.StoreTime;
import com.mobiloitte.loyalty.admin.model.User;

@Service
public class PartnerServiceImpl implements PartnerService {
	@Autowired
	PartnerDao partnerDao1;
	@Autowired
	AdminDao adminDao;
	@Autowired
	BusinessBeanDao businessBeanDao;
	@Autowired
	ShoppingProfileDao shoppingProfileDao;
	@Autowired
	PartnerDao partnerDao;
	@Autowired
	StroreTimeDao stroreTimeDao;
	@Autowired
	BusinessTypeDao businessTypeDao;
	@Autowired
	EntityManager em;
	@Autowired
	FindCheckListDao findCheckListDao;
	@Autowired
	LoyaltyPointStructureDao loyaltyPointStructureDao;

	@Override
	public Map<String, Object> totalPartners() {
		Map<String, Object> responce = new HashMap<>();
		List<Object> size = new LinkedList<>();
		List<StoreWeb> findall = shoppingProfileDao.findByisStatus(true);
		if (findall.isEmpty()) {
			Integer likeCounts2 = findall.size();
			size.add(likeCounts2);
			responce.put("status", 200);
			responce.put("message", size);
			return responce;
		}
		responce.put("status", 205);
		responce.put("message", "something went wrong");
		return responce;
	}

	@Override
	public Map<String, Object> getOwnerDetails(OwnerDetailsDto ownerDetailsDto) {
		try {
			Map<String, Object> response = new HashMap<>();
			if (ownerDetailsDto != null) {
				User user = new User();
				user.setUserName(ownerDetailsDto.getOwnerName());

				user.setAddress(ownerDetailsDto.getOwnerAddress());
				user.setEmail(ownerDetailsDto.getOwnerEmail());
				user.setPhone(ownerDetailsDto.getOwnerMobileNumber());
				user.setTell(ownerDetailsDto.getOwnerTell());
				user.setOwnerDetails(true);
				adminDao.save(user);
				response.put("status", 200);
				response.put("message", "OwnerDetails saved Successfully");
				return response;

			} else {
				response.put("status", 201);
				response.put("error", "Somthing went Wrong");
				return response;
			}
		} catch (Exception e) {

		}
		Map<String, Object> response = new HashMap<>();
		response.put("status", 205);
		response.put("message", "All Details Required!");
		return response;
	}

	@Override
	public List<Object> selectBusinessType() {
		List<Object> totoalSelectBusinessTypeIs = new ArrayList<Object>();
		try {
			List<BusinessType> businessTypes = businessTypeDao.findAll();
			for (BusinessType businessType : businessTypes) {
				totoalSelectBusinessTypeIs.add(businessType);
			}
			/*
			 * response.put("SucccessCode", 200);
			 * response.put("message",totoalSelectBusinessTypeIs);
			 */
			return totoalSelectBusinessTypeIs;
		} catch (Exception e) {

			/*
			 * response.put("SuccessCode", 205); response.put("message",
			 * "SomeThing Went Wrong");
			 */
			return totoalSelectBusinessTypeIs;

		}

	}

	/*
	 * @Override public Map<String, Object> businessDetails(BusinessDetailsDTO
	 * businessDetailsDTO) { try { Map<String, Object> response = new HashMap<>();
	 * if (businessDetailsDTO != null) { BusinessBean businessBean = new
	 * BusinessBean();
	 * businessBean.setBusinessName(businessDetailsDTO.getBusinessName());
	 * businessBean.setBusinessAddress(businessDetailsDTO.getBusinessAddress());
	 * businessBean.setBusinessEmail(businessDetailsDTO.getBusinessEmail());
	 * businessBean.setBusinessTell(businessDetailsDTO.getBusinessTell());
	 * businessBean.setSelectNumberOfStore(businessDetailsDTO.getNumberOfStore());
	 * businessBean.setSelectNumberOfBeacons(businessDetailsDTO.getNumberOfBeacons()
	 * ); businessBean.setBusinessTypeId(businessDetailsDTO.getBusinessTypeId()); //
	 * businessBean.setImage(businessDetailsDTO.getImages());
	 * businessBeanDao.save(businessBean); StoreTime storeTime = new StoreTime();
	 * storeTime.setDays(businessDetailsDTO.getDays());
	 * storeTime.setOpening(businessDetailsDTO.getOpeningTime());
	 * storeTime.setClosing(businessDetailsDTO.getClosingTime());
	 * stroreTimeDao.save(storeTime); response.put("status", 200);
	 * response.put("message", "BusinessDetails Successfull"); return response; }
	 * else { response.put("status", 201); response.put("error",
	 * "BusinessDetails UnSuccessfull"); return response; } } catch (Exception e) {
	 * } Map<String, Object> response = new HashMap<>(); response.put("status",
	 * 205); response.put("error", "password or null"); return response; }
	 */
	@Override
	public List<Object> GetPartnerSearchListWithFilter() {
		// Map<String, Object> response = new HashMap<>();
		List<Object> response = new ArrayList<Object>();
		List<Map<String, Object>> findByBestSellingService = partnerDao.getPartnerSearchListWithFilter();
		for (Object partnerList : findByBestSellingService) {
			response.add(partnerList);
		}
		return response;
	}

	@Override
	public List<Object> viewPartnerDetails(String businessId) {

		List<Map<String, Object>> pId = partnerDao.viewPartnerDetails(businessId);
		List<Object> response = new ArrayList<Object>();
		if (!pId.isEmpty()) {
			for (Object user : pId) {
				response.add(user);
				return response;
			}
		}
		return response;
	}

	@Override
	public List<Object> seebreezeTransaction(String businessId) {
		List<Map<String, Object>> pId = partnerDao.seebreezeTransaction(businessId);
		List<Object> response = new ArrayList<Object>();
		if (!pId.isEmpty()) {
			for (Object user : pId) {
				response.add(user);
				return response;
			}
		}
		return response;
	}

	@Override
	public List<Object> marketingDeals(String businessId) {
		List<Map<String, Object>> pId = partnerDao.marketingDeals(businessId);
		List<Object> response = new ArrayList<Object>();
		if (!pId.isEmpty()) {
			for (Object user : pId) {
				response.add(user);
				return response;
			}
		}
		return response;
	}

	@SuppressWarnings("unused")
	@Override
	public String ViewPartnerdetailsBlock(String businessId) {
		if (businessId != null) {
			Object businessDetails = partnerDao.findBybusinessIdforBlock(businessId);
			return "Block";
		}
		return "UnSucessFull";

	}

	@Override
	@SuppressWarnings("unused")
	public String ViewPartnerdetailsUnBlock(String businessId) {
		if (businessId != null) {
			Object businessDetails = partnerDao.findBybusinessIdforUnBlock(businessId);
			return "Unblock";
		}
		return "UnSucessFull";
	}

	@Override
	public List<Object> getRefundsDetailsAll() {
		List<Object> response = new ArrayList<Object>();
		List<Map<String, Object>> allData = partnerDao.findAllRefundsDetails();
		for (Object transactionList : allData) {
			response.add(transactionList);
		}
		return response;

	}

	@Override
	public List<Object> getRefundsDetailsAllForAction() {
		List<Object> response = new ArrayList<Object>();
		List<Map<String, Object>> AllData = partnerDao.findAllRefundsActionDetails();
		for (Object transactionList : AllData) {
			response.add(transactionList);
		}
		return response;
	}

	@Override
	public Map<String, Object> getTotalUserPartnersWithFilter(Date formDate, Date toDate) {
		Map<String, Object> responce = new HashMap<String, Object>();
		List<User> findBetweenDate = adminDao.findBycreateDateBetween(formDate, toDate);
		if (!findBetweenDate.isEmpty()) {
			Object count = findBetweenDate.size();
			responce.put("status", 200);
			responce.put("message", count);
			return responce;
		}
		responce.put("status", 205);
		responce.put("error", "No Data found");
		return responce;
	}

	@Override
	public Map<String, Object> getTotalUserPartnersLostWithFilter(Date fromDate, Date toDate) {
		Map<String, Object> responce = new HashMap<>();
		List<StoreWeb> findlostUser = shoppingProfileDao.findBycreationTimeBetween(fromDate, toDate);
		List<Object> vt = new ArrayList<>();
		if (!findlostUser.isEmpty()) {
			for (StoreWeb storeWeb : findlostUser) {
				if (storeWeb.isStatus() == false)
					vt.add(storeWeb);
			}
			Object v = vt.size();
			responce.put("status", 200);
			responce.put("message", v);
			return responce;
		} else {
			responce.put("status", 205);
			responce.put("error", "Data Not Found");
			return responce;

		}
	}

	@Override
	public Map<String, Object>hottestProductService(String business_types, Boolean check_hot_OR_loyalty, Date fromDate,
			Date toDate) {
		Map<String, Object>response=new HashMap<>();
		//List<Object> response = new ArrayList<>();
		List<Map<String, Object>> findHot = partnerDao.findByBusinessTypeNameHot(business_types, check_hot_OR_loyalty,
				fromDate, toDate);
		List<Map<String, Object>> findloyal = partnerDao.findByBusinessTypeNameLoyal(business_types,
				check_hot_OR_loyalty, fromDate, toDate);

		if (check_hot_OR_loyalty == true) {
			if (findHot != null) {
				for (Object list : findHot) {
					response.put("message",list);
				}
			}

		} else {
			if (findloyal != null) {
				for (Object list1 : findloyal) {
					response.put("message",list1);
				}
			}
		}
		return response;

	}

	@Override
	public List<Object> bestSellingItemsServices(String business_types, Date fromDate, Date toDate) {
		List<Object> response = new ArrayList<Object>();
		List<Map<String, Object>> findByBestSellingService = partnerDao
				.findByBestSellingServiceorProduct(business_types, fromDate, toDate);
		for (Object partnerList : findByBestSellingService) {
			response.add(partnerList);
		}

		// response.put("status", 200);
		// response.put("Messgae", responce2);
		return response;
	}

	@Override
	public List<Object> partnersWithHighestCheckIn(Date fromDate, Date toDate, String business_type) {

		List<Object> businessName = new ArrayList<>();
		List<Map<String, Object>> findByBestSellingService = partnerDao.findByPartnersWithHighestCheckIn(business_type,
				fromDate, toDate);

		for (Object list : findByBestSellingService)
			businessName.add(list);
		return businessName;
	}

	@Override
	public List<Object> transactionaDEtailsAll() {

		List<Object> response = new ArrayList<Object>();
		List<Map<String, Object>> AllData = partnerDao.findAllTransactionsDetails();
		for (Object transactionList : AllData) {
			response.add(transactionList);
		}
		return response;
	}

	@Override
	public List<Object> getPartnerDetailsAll() {
		List<Object> response = new LinkedList<Object>();
		List<Map<String, Object>> Allcataloguedata = partnerDao.findAll();
		for (Object catalogList : Allcataloguedata) {
			response.add(catalogList);
		}
		return response;

	}

	@Override
	public Map<String, Object> totalCustomerTransectionForCurrentMonth() {
		String data_from_query = "";
		Map<String, Object> response = new HashMap<String, Object>();
		List<Object> listdata = new ArrayList<>();
		List<Map<String, Object>> findBetweenDate = partnerDao.findBycreateDateBetweenCurrentMonth();
		data_from_query = findBetweenDate.get(0).get("total_transactions").toString();
		// data_from_query = findBetweenDate.toString();
		if (!findBetweenDate.isEmpty()) {
			listdata.add(data_from_query);
			String final_data = data_from_query.replace("[", "").replace("]", "");
			response.put("message", final_data);
			return response;
		}
		response.put("error", "No Data Found");
		return response;
	}

	@Override
	public Map<String, Object> topWordSearchForCurrentMonth() {
		String data_from_query = "";
		Map<String, Object> response = new HashMap<String, Object>();
		List<Map<String, Object>> findTopWordSearch = partnerDao
				.findTopWordSearchUsingBusinessNameAndDateBetweenCurrentMonth();
		data_from_query = findTopWordSearch.get(0).get("BUSINESS_NAME").toString();
		// String data_from_query = findTopWordSearch.toString();
		if (!findTopWordSearch.isEmpty()) {
			response.put("message", data_from_query);
			return response;
		}
		response.put("error", "No Data Found");
		return response;
	}

	@Override
	public Map<String, Object> totalCustomerForCurrentMonth() {
		String data_from_query = "";
		Map<String, Object> response = new HashMap<String, Object>();
		List<Map<String, Object>> findTotalCustomer = partnerDao.findCustomerCountDateBetweenCurrentMonth();
		data_from_query = findTotalCustomer.get(0).get("total_registered_customer").toString();
		// String data_from_query = findTotalCustomer.toString();
		if (!findTotalCustomer.isEmpty()) {
			response.put("message", data_from_query);
			return response;
		}
		response.put("error", "No Data Found");
		return response;
	}

	@Override
	public Map<String, Object> loyaltyPointStructure(LoyaltyPointStructure loyaltyPointStructure) {
		Map<String, Object> response = new HashMap<>();
		if (loyaltyPointStructure != null) {
			loyaltyPointStructure.setGold(loyaltyPointStructure.getGold());
			loyaltyPointStructure.setSilver(loyaltyPointStructure.getSilver());
			loyaltyPointStructure.setPlatinum(loyaltyPointStructure.getPlatinum());
			loyaltyPointStructureDao.save(loyaltyPointStructure);
			response.put("SucccessCode", 200);
			response.put("Message", "loyaltyPointStructure Successfull");
			return response;
		} else {
			response.put("SuccessCode", 201);
			response.put("Message", "loyaltyPointStructure UnSuccessfull");
			return response;
		}
	}

	@Override
	public Map<String, Object> findCheckList(FindCheckList findCheckList) {
		Map<String, Object> response = new HashMap<>();
		if (findCheckList != null) {
			findCheckList.setBankDetailsOnLetter(findCheckList.getBankDetailsOnLetter());
			findCheckList.setProofOfIEmailedIn(findCheckList.getProofOfIEmailedIn());
			findCheckList.setProofOfOwnership(findCheckList.getProofOfOwnership());
			findCheckList.setDateAndTimeOfInduction(findCheckList.getDateAndTimeOfInduction());
			findCheckListDao.save(findCheckList);
			response.put("SucccessCode", 200);
			response.put("Message", "loyaltyPointStructure Successfull");
			return response;
		} else {
			response.put("SuccessCode", 201);
			response.put("Message", "loyaltyPointStructure UnSuccessfull");
			return response;
		}
	}

	@Override
	public Map<String, Object> businessDetails(BusinessDetailsDTO businessDetailsDTO, StoreTimeDto storeTimeDto)
			throws SQLException {
		Map<String, Object> response = new HashMap<>();
		Map<String, Map<String, Object>> sert = new HashMap<String, Map<String, Object>>();
		List<Object> responce = new ArrayList<>();
		if (businessDetailsDTO != null) {
			int businessDeatils = partnerDao.SaveOfBusinessDetails(businessDetailsDTO);
		}
		if (storeTimeDto != null) {
			partnerDao.SaveOfTime(storeTimeDto);
			response.put("status", 200);
			response.put("message", "BusinessDetails Successfull");
			return response;
		}
		response.put("status", 205);
		response.put("message", "BusinessDetails UnSuccessfull");
		return response;
	}
	
	@Override
	public Map<String, Object> totalPartnerLostForCurrentMonth() {
		Map<String, Object> response = new HashMap<String, Object>();
		List<Map<String, Object>> findTotalCustomer = partnerDao.totalPartnerLosttDateBetweenCurrentMonth();
		String data_from_query =findTotalCustomer.get(0).get("partner_lost").toString();
		//String data_from_query = findTotalCustomer.toString();
		if (!findTotalCustomer.isEmpty()) {
			response.put("message", data_from_query);
			return response;
		}
		response.put("error", "No Data Found");
		return response;
	}


	@Override
	public Map<String, Object> hottestProductSearchForCurrentMonth() {
		Map<String, Object> response = new HashMap<String, Object>();
		List<Map<String, Object>> findTotalCustomer = partnerDao.hottestProductSearchBetweenCurrentMonth();
		String data_from_query = findTotalCustomer.get(0).get("Hotest_Product_services").toString();
		if (!findTotalCustomer.isEmpty()) {
			response.put("message",data_from_query);
			return response;
		}
		response.put("error","No Data Found");
		return response;
	}

	@Override
	public Map<String, Object> partnerWithHighestCheckinForCurrentMonth() {
		Map<String, Object> response = new HashMap<String, Object>();
		List<Map<String, Object>> findTotalCustomer = partnerDao.partnersWithHighestCheckinBetweenCurrentMonth();
		//String data_from_query = findTotalCustomer.get(0).get("total_registered_customer").toString();
		String data_from_query = findTotalCustomer.toString();
		if (!findTotalCustomer.isEmpty()) {
			response.put("message",data_from_query);
			return response;
		}
		response.put("error","No Data Found");
		return response;
	}

	@Override
	public Map<String, Object> bestSellingItemForCurrentMonth() {
		Map<String, Object> response = new HashMap<String, Object>();
		List<Map<String, Object>> findTotalCustomer = partnerDao.bestSellingItemForCurrentMonth();
		String data_from_query = findTotalCustomer.get(0).get("best_item").toString();
		//String data_from_query = findTotalCustomer.toString();	
		if (!findTotalCustomer.isEmpty()) {
			response.put("message",data_from_query);
			return response;
		}
		response.put("error","No Data Found");
		return response;
	}

	@Override
	public List<Object> topTenCustomerTransaction() {
		List<Map<String, Object>> AllData = partnerDao.topTenCustomerTransaction();
		List<Object> response = new ArrayList<Object>();
		for (Object topTenTopWord : AllData) {
			response.add(topTenTopWord);
		}
		return response;
		
	}

	@Override
	public List<Object> topTenUserRegister() {
		List<Map<String, Object>> AllData = partnerDao.topTenUserRegister();
		List<Object> response = new ArrayList<Object>();
		for (Object topTenTopWord : AllData) {
			response.add(topTenTopWord);
		}
		return response;
		
	
	}

	@Override
	public List<Object> topTenWordSearch() {

		List<Object> response = new ArrayList<Object>();
		List<Map<String, Object>> AllData = partnerDao.findTopTenTopWordSearch();
		for (Object topTenTopWord : AllData) {
			response.add(topTenTopWord);
		}
	
		return response;
	}

	@Override
	public List<Object> topTenPartnerLost() {
		List<Object> response = new ArrayList<Object>();
		List<Map<String, Object>> AllData = partnerDao.findTopTenPartnerLost();
		for (Object topTenpartnerLost : AllData) {
			response.add(topTenpartnerLost);
		}
	
		return response;
	}

	@Override
	public List<Object> topTenSellingItems() {
		List<Object> response = new ArrayList<Object>();
		List<Map<String, Object>> AllData = partnerDao.findTopTenSellingItems();
		for (Object topTenSellingItems : AllData) {
			response.add(topTenSellingItems);
		}
	
		return response;
	}

	@Override
	public List<Object> topTenHotProduct() {
		List<Object> response = new ArrayList<Object>();
		List<Map<String, Object>> AllData = partnerDao.findTopTenHotProduct();
		for (Object topTenHotProduct : AllData) {
			response.add(topTenHotProduct);
		}
	
		return response;
	}
	@Override
	public List<Object> topTenHighestcheckIn() {
		List<Object> response = new ArrayList<Object>();
		List<Map<String, Object>> AllData = partnerDao.findTopTenHighestCheckIn();
		for (Object topTenHighestCheckIn : AllData) {
			response.add(topTenHighestCheckIn);
		}
	
		return response;
	}
}
