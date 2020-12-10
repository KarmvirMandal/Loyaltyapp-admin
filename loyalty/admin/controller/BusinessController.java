package com.mobiloitte.loyalty.admin.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mobiloitte.loyalty.admin.adminService.BusinessService;
import com.mobiloitte.loyalty.admin.adminService.PartnerService;

@Controller

public class BusinessController {

	@Autowired
	BusinessService businessService;
	@Autowired
	PartnerService partnerService;

	@GetMapping(value = "topWord-search-totalRegistered")
	public String topWordSearch(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,

			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate, Model model, Long busineesOrItem,
			HttpSession session, RedirectAttributes rd) throws IOException {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response1 = partnerService.totalCustomerTransectionForCurrentMonth();
			Map<String, Object> response2 = partnerService.totalCustomerForCurrentMonth();

			model.addAttribute("total_customer_transaction", response1);
			model.addAttribute("total_registered", response2);

			List<Object> response = businessService.topWordSearchTotal(fromDate, toDate, busineesOrItem);

			model.addAttribute("top_word_search", response);
			return "customer_home";
		} else {
			return "redirect:/login";
		}
	}
}
