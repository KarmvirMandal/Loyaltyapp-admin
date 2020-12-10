package com.mobiloitte.loyalty.admin.controller;

import java.net.MalformedURLException;

import javax.servlet.http.HttpSession;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mobiloitte.loyalty.admin.adminService.PartnerService;

@Controller
public class MainController {
	
	@Autowired
	PartnerService partnerService;

	@GetMapping("/")
	public String root() {
		return "login";
	}

	@GetMapping("dashboard")
	public String indexPage(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			return "/index";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping("login")
	public String login(Model model, HttpSession session, RedirectAttributes rd) {
	
			return "login";
	
	}

	@PostMapping("login-reset")
	public String login1(Model model, HttpSession session, RedirectAttributes rd) {
		return "login";
	}

	@GetMapping("index")
	public String userIndex(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null)
			return "index";
		else
			return "redirect:/login";

	}

	

	/*
	 * 
	 * This Controller belongs to send reset password link on email
	 *
	 */
	@GetMapping("reset-passwordCheck")
	public String resetPasswordLink(@RequestParam("millis") Long millis, @RequestParam("email") String email,
			Model model, HttpSession session, RedirectAttributes rd) throws MalformedURLException {
		// System.out.println((DateTime.now().minus(millis).getMillis()/ 60000));
		if ((DateTime.now().minus(millis).getMillis() / 60000) <= 10) {
			model.addAttribute("email", email);
			return "reset-password";
		} else {
			return "redirect:login?error=Link Has Been Expired !";
		}
	}

	/*
	 * @GetMapping("/partner_setup") public String showPartnerSetupPage(HttpSession
	 * session, RedirectAttributes rd) { if (session.getAttribute("email") != null)
	 * return "partner_setup"; else return "redirect:/login";
	 * 
	 * }
	 */

	@GetMapping("partner_search")
	public String showPartnerSearchPage(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null)
			return "partner_search";
		else
			return "redirect:/login";

	}

	@GetMapping("partner_details")
	public String showPartnerDetailsPage(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null)
			return "partner_details";
		else
			return "redirect:/login";

	}

	@GetMapping("static_content_mgmt")
	public String staticContentPage(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null)
			return "static_content_mgmt";
		else
			return "redirect:/login";

	}

	@GetMapping("marketing_deals_details")
	public String showMarketingDealsDetailsPage(HttpSession session, RedirectAttributes rd) {
		return "marketing_deals_details";
	}

	@GetMapping("seebreez_transaction_details")
	public String showSeebreezTransactionDetailsPage(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null)
			return "seebreez_transaction_details";
		else
			return "redirect:/login";

	}

	@GetMapping("transaction_mgmt")
	public String showtransationManagementPage(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null)
			return "transaction_mgmt";
		else
			return "redirect:/login";

	}

	

	/*
	 * @GetMapping(value = "/customer_search") public String
	 * staticContentCustomerSearchPage(Model model) { return "customer_search";
	 * 
	 * }
	 */
	/*
	 * @GetMapping("/edit1") public String staticContentEditPage1() { return
	 * "edit_t&c"; }
	 * 
	 * @GetMapping("/edit2") public String staticContentEditPage2() { return
	 * "edit_privacy_policy"; }
	 */

	/*
	 * @GetMapping("/edit3") public String staticContentEditPage3(HttpSession
	 * session, RedirectAttributes rd) { if (session.getAttribute("email") != null)
	 * return "edit_about_us"; else return "redirect:/login";
	 * 
	 * }
	 */

	@GetMapping("customer_details")
	public String customerDetailsPage(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null)
			return "redirect : /customer_details";
		else
			return "redirect:/login";

	}

	/*
	 * @GetMapping("/transaction_details") public String
	 * TranscationDetailsPage(HttpSession session, RedirectAttributes rd) { if
	 * (session.getAttribute("email") != null) return "transaction_details"; else
	 * return "redirect:/login";
	 * 
	 * }
	 */

	@GetMapping("shopping_details")
	public String ShoppingDetailsPage(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null)
			return "shopping_details";
		else
			return "redirect:/login";

	}

	@GetMapping("refund_details")
	public String ShowRefundDetailsPage(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null)
			return "refund_details";
		else
			return "redirect:/login";

	}

//	@GetMapping("/partners_home")
//	public String partnerHomePage(HttpSession session, RedirectAttributes rd,Model model) {
//		if (session.getAttribute("email") != null) {
//			Map<String, Object> response = partnerService.selectBusinessType();
//			model.addAttribute("business_type_list", response);
//			return "partners_home";
//		}
//		else {
//			return "redirect:/login";
//		}

	//}

	/*
	 * @GetMapping("customers_home") public String customerHomePage(HttpSession
	 * session, RedirectAttributes rd) { if (session.getAttribute("email") != null)
	 * return "customer_home"; else return "redirect:/login";
	 * 
	 * }
	 */

	@GetMapping("forgot-password")
	public String showForgetPassword(HttpSession session, RedirectAttributes rd) {

		return "forgot-password";
	}

	@GetMapping("partner_catalogue")
	public String partnerCataloguePage(HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null)
			return "partner_catalogue";
		else
			return "redirect:/login";

	}

	/*
	 * @GetMapping("/category_creation") public String
	 * showcategory_creation(HttpSession session, RedirectAttributes rd) { if
	 * (session.getAttribute("email") != null) return "category_creation"; else
	 * return "redirect:/login"; }
	 */
@GetMapping("logout")
public String logout(HttpSession session, RedirectAttributes rd) {
	if(session.getAttribute("email")!=null) {
		session.invalidate();
		return "login";
	}
	else
		return "redirect:/login";
	
}
}
