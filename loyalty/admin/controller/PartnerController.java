package com.mobiloitte.loyalty.admin.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mobiloitte.loyalty.admin.adminService.PartnerService;
import com.mobiloitte.loyalty.admin.dto.BusinessDetailsDTO;
import com.mobiloitte.loyalty.admin.dto.OwnerDetailsDto;
import com.mobiloitte.loyalty.admin.dto.StoreTimeDto;
import com.mobiloitte.loyalty.admin.model.FindCheckList;
import com.mobiloitte.loyalty.admin.model.LoyaltyPointStructure;

@Controller
public class PartnerController {
	@Autowired
	PartnerService partnerService;

	@GetMapping(value = "get-refunds-details-pending-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getRefundsDetailsAll(Model model, HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {

			List<Object> response = partnerService.getRefundsDetailsAll();
			List<Object> response2 = partnerService.getRefundsDetailsAllForAction();
			model.addAttribute("Refunds_Details_list", response);
			model.addAttribute("Refunds_Details_list_Action", response2);
			return "refund_details";
		} else
			return "redirect:/login";

	}

	@PostMapping(value = "getOwnerDetails")
	public String getOwnerDetails(@ModelAttribute(name = "ownerDetailsDto") @Valid OwnerDetailsDto ownerDetailsDto,
			HttpSession session, RedirectAttributes redirectAttributes, Model model) {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response = partnerService.getOwnerDetails(ownerDetailsDto);

			if (response.containsValue(200)) {
				return "partner_setup";
			} else
				return "partner_setup";
		} else
			return "redirect:/login";
	}
	/*
	 * @GetMapping(value = "partners_home") public String
	 * selectBusinessType(HttpSession session, RedirectAttributes rd, Model model) {
	 * 
	 * if (session.getAttribute("email") != null) { List<Object> response =
	 * partnerService.selectBusinessType();
	 * 
	 * model.addAttribute("business_type", response); return "partners_home"; } else
	 * { return "redirect:/login"; } }
	 */

	/*
	 * @PostMapping(value = "Save-business-Details") public Map<String, Object>
	 * businessDetails(@RequestBody BusinessDetailsDTO businessDetailsDTO) { return
	 * partnerService.businessDetails(businessDetailsDTO);
	 * 
	 * }
	 */
	@GetMapping(value = "Get-PartnerSearchListWithFilter")
	public String GetPartnerSearchListWithFilter(Model model, HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> response = partnerService.GetPartnerSearchListWithFilter();
			model.addAttribute("partner_list", response);
			return "partner_search";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping(value = "View-Partner-details")
	public String viewPartnerDetails(@RequestParam("businessId") String businessId, Model model, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> response = partnerService.viewPartnerDetails(businessId);
			List<Object> response1 = partnerService.seebreezeTransaction(businessId);
			List<Object> response2 = partnerService.marketingDeals(businessId);
			model.addAttribute("particuler_partner_details", response);
			model.addAttribute("particuler_seebreeztransaction_details", response1);
			model.addAttribute("particuler_marketingDeals_details", response2);
			return "partner_details";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping(value = "Seebreeze-Transaction")
	public String seebreezeTransaction(@RequestParam("businessId") String businessId, Model model, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> response = partnerService.seebreezeTransaction(businessId);
			model.addAttribute("particuler_seebreeztransaction_details", response);
			return "seebreez_transaction_details";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "top-ten-data-in-current-month-for-customer-home")
	public String topTenCustomerTransaction( Model model, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> response1 = partnerService.topTenCustomerTransaction();
			model.addAttribute("Top_Ten_Customer_Transaction", response1);
			List<Object> response2 = partnerService.topTenUserRegister();
			model.addAttribute("Top_Ten_User_Register", response2);
			List<Object> response3 = partnerService.topTenWordSearch();
			model.addAttribute("Top_Ten_Word_Search", response3);
			return "customer_home";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "top-ten-data-in-current-month-for-partner-home")
	public String to(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date formDate,

			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate, Model model, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> response1 = partnerService.topTenUserRegister();
			model.addAttribute("Top_Ten_User_Register", response1);
			List<Object> response2 = partnerService.topTenPartnerLost();
			model.addAttribute("Top_Ten_User_Register", response2);
			List<Object> response3 = partnerService.topTenSellingItems();
			model.addAttribute("Top_Ten_User_Register", response3);

			List<Object> response4 = partnerService.topTenHotProduct();
			model.addAttribute("Top_Ten_Hot_Product", response4);
			List<Object> response5 = partnerService.topTenHighestcheckIn();
			model.addAttribute("Top_Ten_highest_Check_In", response5);

			return "customer_home";

		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "Marketing-Deals")
	public String marketingDeals(@RequestParam("businessId") String businessId, Model model, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> response = partnerService.marketingDeals(businessId);
			model.addAttribute("particuler_marketingDeals_details", response);
			return "marketing_deals_details";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "partner_block")
	public String ViewPartnerdetailsBlock(@RequestParam("businessId") String businessId, Model model,
			HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			String response = partnerService.ViewPartnerdetailsBlock(businessId);
			model.addAttribute("button_text", response);
			return "partner_search";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "partner_unblock")
	public String ViewPartnerdetailsUnBlock(@RequestParam("businessId") String businessId, Model model,
			HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			String response = partnerService.ViewPartnerdetailsUnBlock(businessId);
			model.addAttribute("button_text", response);
			return "partner_search";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "get-TotalUserPartnersWithFilter")
	public String getTotalUserPartnersWithFilter(
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date formDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate, Model model, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response1 = partnerService.totalPartnerLostForCurrentMonth();

			Map<String, Object> response3 = partnerService.hottestProductSearchForCurrentMonth();
			Map<String, Object> response4 = partnerService.bestSellingItemForCurrentMonth();
			Map<String, Object> response5 = partnerService.partnerWithHighestCheckinForCurrentMonth();

			model.addAttribute("partner_lost", response1);

			model.addAttribute("Hottest_Product", response3);
			model.addAttribute("best_item", response4);
			model.addAttribute("highest_checkin", response5);

			Map<String, Object> response = partnerService.getTotalUserPartnersWithFilter(formDate, toDate);
			List<Object> BusinessType = partnerService.selectBusinessType();

			model.addAttribute("business_type", BusinessType);
			model.addAttribute("total_user", response);
			return "partners_home";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "get-TotalUserPartnersLostWithFilter")
	public String getTotalUserPartnersLostWithFilter(
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate, Model model, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response = partnerService.getTotalUserPartnersLostWithFilter(fromDate, toDate);

			List<Object> response1 = partnerService.selectBusinessType();

			Map<String, Object> response2 = partnerService.totalCustomerForCurrentMonth();
			Map<String, Object> response3 = partnerService.hottestProductSearchForCurrentMonth();
			Map<String, Object> response4 = partnerService.bestSellingItemForCurrentMonth();
			Map<String, Object> response5 = partnerService.partnerWithHighestCheckinForCurrentMonth();

			model.addAttribute("total_user", response2);
			model.addAttribute("Hottest_Product", response3);
			model.addAttribute("best_item", response4);
			model.addAttribute("highest_checkin", response5);

			model.addAttribute("business_type", response1);
			model.addAttribute("partner_lost", response);
			return "partners_home";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "hottestProductService")
	public String hottestProductService(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate,
			@RequestParam String business_types, @RequestParam Boolean check_hot_loyalty, Model model,
			HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response = partnerService.hottestProductService(business_types, check_hot_loyalty,
					fromDate, toDate);

			Map<String, Object> response1 = partnerService.totalPartnerLostForCurrentMonth();
			Map<String, Object> response2 = partnerService.totalCustomerForCurrentMonth();

			Map<String, Object> response4 = partnerService.bestSellingItemForCurrentMonth();
			Map<String, Object> response5 = partnerService.partnerWithHighestCheckinForCurrentMonth();

			model.addAttribute("partner_lost", response1);
			model.addAttribute("total_user", response2);

			model.addAttribute("best_item", response4);
			model.addAttribute("highest_checkin", response5);

			List<Object> BusinessType = partnerService.selectBusinessType();
			model.addAttribute("business_type", BusinessType);
			if (response.get(0) != null) {

				model.addAttribute("Hottest_Product", response);
			} else {

				model.addAttribute("Hottest_Product", response);
			}

			return "partners_home";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping(value = "bestSellingItemsServices")
	public String bestSellingItemsServices(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate,
			@RequestParam String business_types, Model model, HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> response = partnerService.bestSellingItemsServices(business_types, fromDate, toDate);

			Map<String, Object> response1 = partnerService.totalPartnerLostForCurrentMonth();
			Map<String, Object> response2 = partnerService.totalCustomerForCurrentMonth();
			Map<String, Object> response3 = partnerService.hottestProductSearchForCurrentMonth();

			Map<String, Object> response5 = partnerService.partnerWithHighestCheckinForCurrentMonth();

			model.addAttribute("partner_lost", response1);
			model.addAttribute("total_user", response2);
			model.addAttribute("Hottest_Product", response3);

			model.addAttribute("highest_checkin", response5);

			model.addAttribute("best_item", response);
			List<Object> businessType = partnerService.selectBusinessType();
			model.addAttribute("business_type", businessType);
			return "partners_home";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "partners-WithHighestCheckIn")
	public String partnersWithHighestCheckIn(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate,
			@RequestParam String business_type, Model model, HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {

			Map<String, Object> response1 = partnerService.totalPartnerLostForCurrentMonth();
			Map<String, Object> response2 = partnerService.totalCustomerForCurrentMonth();
			Map<String, Object> response3 = partnerService.hottestProductSearchForCurrentMonth();
			Map<String, Object> response4 = partnerService.bestSellingItemForCurrentMonth();

			model.addAttribute("partner_lost", response1);
			model.addAttribute("total_user", response2);
			model.addAttribute("Hottest_Product", response3);
			model.addAttribute("best_item", response4);

			List<Object> response = partnerService.partnersWithHighestCheckIn(fromDate, toDate, business_type);
			model.addAttribute("highest_checkin", response);
			List<Object> BusinessType = partnerService.selectBusinessType();
			model.addAttribute("business_type", BusinessType);
			return "partners_home";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "All_Transaction_Details")
	public String transactionaDEtailsAll(Model model, HttpSession session, RedirectAttributes rd) {
		try {
			if (session.getAttribute("email") != null) {
				List<Object> response = partnerService.transactionaDEtailsAll();
				model.addAttribute("transaction_list", response);
				return "transaction_mgmt";
			} else {
				return "redirect:/login";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "partners_home";
		}
	}

	@GetMapping(value = "get-partner-catalog-details")
	public String getPartnerDetailsAll(Model model, HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> response = partnerService.getPartnerDetailsAll();
			model.addAttribute("all_catalog_list", response);
			return "partner_catalogue";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "partner_setup")
	public String selectBusinessTypeForBusinessDetails(HttpSession session, RedirectAttributes rd, Model model) {

		if (session.getAttribute("email") != null) {
			List<Object> response = partnerService.selectBusinessType();

			model.addAttribute("business_type", response);
			return "partner_setup";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping("customers_home")
	public String allCurrentdata(Model model, HttpSession session) {
		if (session.getAttribute("email") != null) {

			Map<String, Object> response1 = partnerService.totalCustomerTransectionForCurrentMonth();
			Map<String, Object> response2 = partnerService.totalCustomerForCurrentMonth();
			Map<String, Object> response3 = partnerService.topWordSearchForCurrentMonth();

			model.addAttribute("total_customer_transaction", response1);
			model.addAttribute("total_registered", response2);
			model.addAttribute("top_word_search", response3);

			return "customer_home";
		} else {
			return "redirect:/login";
		}

	}

	@PostMapping(value = "loyalty-Point-Structure")
	public Map<String, Object> loyaltyPointStructure(LoyaltyPointStructure loyaltyPointStructure) {
		return partnerService.loyaltyPointStructure(loyaltyPointStructure);

	}

	@PostMapping(value = "find-check-list")
	public Map<String, Object> findCheckList(FindCheckList findCheckList) {
		return partnerService.findCheckList(findCheckList);

	}

	@PostMapping(value = "Save-business-Details")
	public Map<String, Object> businessDetails(BusinessDetailsDTO businessDetailsDTO,
			@RequestBody StoreTimeDto storeTimeDto) throws SQLException {

		return partnerService.businessDetails(businessDetailsDTO, storeTimeDto);

	}

	@GetMapping("partners_home")
	public String allCurrentdataForPartnerHome(Model model, HttpSession session) {
		if (session.getAttribute("email") != null) {
			List<Object> response = partnerService.selectBusinessType();

			Map<String, Object> response1 = partnerService.totalPartnerLostForCurrentMonth();
			Map<String, Object> response2 = partnerService.totalCustomerForCurrentMonth();
			Map<String, Object> response3 = partnerService.hottestProductSearchForCurrentMonth();
			Map<String, Object> response4 = partnerService.bestSellingItemForCurrentMonth();
			Map<String, Object> response5 = partnerService.partnerWithHighestCheckinForCurrentMonth();

			model.addAttribute("partner_lost", response1);
			model.addAttribute("total_user", response2);
			model.addAttribute("Hottest_Product", response3);
			model.addAttribute("best_item", response4);
			model.addAttribute("highest_checkin", response5);
			model.addAttribute("business_type", response);
			return "partners_home";
		} else {
			return "redirect:/login";
		}

	}
}
