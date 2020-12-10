package com.mobiloitte.loyalty.admin.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletResponse;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mobiloitte.loyalty.admin.adminService.AdminService;
import com.mobiloitte.loyalty.admin.adminService.PartnerService;
import com.mobiloitte.loyalty.admin.dto.AllDetailsDto;
import com.mobiloitte.loyalty.admin.dto.ForgetPasswordDto;
import com.mobiloitte.loyalty.admin.dto.LoginDto;
import com.mobiloitte.loyalty.admin.dto.PasswordDto;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private PartnerService partnerService;

	/*
	 * 
	 * This Controller--> for login authentication
	 * 
	 * 
	 * 
	 */
	@PostMapping(value = "/authenticateLogin")
	public String login(@ModelAttribute(name = "loginDto") @Valid LoginDto loginDto,
			RedirectAttributes redirectAttributes, HttpSession session, RedirectAttributes rd) {
		// try {
		Map<String, Object> response = adminService.loginService(loginDto);
		session.setAttribute("email", loginDto.getEmail());
		String message = "";
		if (response.keySet().toArray()[0].toString() == "error") {
			message = response.get("error").toString();
		} else {
			message = response.get("message").toString();
		}

		String messagetype = response.keySet().toArray()[0].toString();

		if (response.containsValue(200)) {
			return "redirect:/dashboard?" + messagetype + "=" + message;
		} else if (response.containsValue(201)) {
			return "redirect:/login?" + messagetype + "=" + message;
		} else if (response.containsValue(205)) {
			return "redirect:/login?" + messagetype + "=" + message;
		} else {
			return "redirect:/login?error";
		}
		// } catch (Exception e) {
		// return "redirect:/login";
		// }

	}

	/*
	 * 
	 * This Controller--> for forget Password
	 * 
	 * 
	 * 
	 */
	@PostMapping("/forgetPassword")
	public String forgetpassword(@ModelAttribute("forgetPasswordDto") @Valid ForgetPasswordDto forgetPasswordDto,
			RedirectAttributes redirectAttributes) throws MessagingException {
		Map<String, Object> response = adminService.forgetPassword(forgetPasswordDto);

		String message = "";
		if (response.keySet().toArray()[0].toString() == "error") {
			message = response.get("error").toString();
		} else {
			message = response.get("message").toString();
		}
		String messagetype = response.keySet().toArray()[0].toString();

		if (response.containsValue(200)) {
			return "redirect:/login?" + messagetype + "=" + message;
		} else if (response.containsValue(201)) {
			return "redirect:/login?" + messagetype + "=" + message;
		} else if (response.containsValue(205)) {
			return "redirect:/forgot-password?" + messagetype + "=" + message;
		} else {
			return "redirect:/forgot-password?error";
		}
	}

	/*
	 * 
	 * This Controller--> for when we want to reset password
	 * 
	 * 
	 * 
	 */
	@PostMapping("/reset-passwordSave")
	public String resetPasswordSave(@ModelAttribute("passwordDto") @Valid PasswordDto passwordDto,
			@RequestParam("email") String email, HttpSession session, RedirectAttributes rd)
			throws MalformedURLException {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response = adminService.resetPasswordSave(passwordDto);
			String message = "";
			if (response.keySet().toArray()[0].toString() == "error") {
				message = response.get("error").toString();
			} else {
				message = response.get("message").toString();
			}
			String messagetype = response.keySet().toArray()[0].toString();

			if (response.containsValue(200)) {
				return "redirect:/login?" + messagetype + "=" + message;
			} else if (response.containsValue(201)) {
				return "redirect:/login?" + messagetype + "=" + message;
			} else if (response.containsValue(205)) {
				return "redirect:/forget-password?" + messagetype + "=" + message;
			} else {
				return "redirect:/reset-password?error";
			}
		} else {
			return "redirect:/login";
		}
	}

	/*
	 * 
	 * This Controller--> for list view of all customer details
	 * 
	 * 
	 * 
	 */
	/*
	 * @GetMapping(value = "/customer_search", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public String gettotalcustomerlist(Model
	 * model, @Valid AllDetailsDto allDetailsDto, HttpSession session,
	 * RedirectAttributes rd) { if (session.getAttribute("email") != null) {
	 * List<AllDetailsDto> response = adminService.gettotalcustomerlist(); //
	 * System.out.println(response); model.addAttribute("customers", response);
	 * return "/customer_search"; } else { return "redirect:/login"; } }
	 */

	@GetMapping(value = "customer_search")
	public String gettotalcustomerlist(Model model, @Valid AllDetailsDto allDetailsDto, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> response = adminService.getTotalcustomerlist();

			model.addAttribute("all_customer_details", response);
			return "/customer_search";
		} else {
			return "redirect:/login";
		}
	}

	/*
	 * 
	 * This Controller--> for list view of Particular customer details
	 * 
	 * 
	 * 
	 */

	/*
	 * 
	 * This Controller--> for remove particular customer using @param UserId
	 * 
	 * 
	 * 
	 */
	@GetMapping("particulerCustomer_remove")
	public String particularCustomerRemove(@RequestParam("UserId") String UserId, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response = adminService.particularCustomerRemove(UserId);

			if (response.containsValue(200)) {
				return "redirect:/customer_search";
			} else {
				return "redirect:/customer_search?error";
			}
		} else {
			return "redirect:/login";
		}

	}

	/*
	 * 
	 * This Controller--> for block particular Customer
	 * 
	 * 
	 * 
	 */
	@GetMapping("user-block")
	public String usersStatusBlock(@RequestParam("UserId") String UserId, HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response = adminService.usersStatusBlock(UserId);
			String message = "";
			if (response.keySet().toArray()[0].toString() == "error") {
				message = response.get("error").toString();
			} else {
				message = response.get("message").toString();
			}
			String messagetype = response.keySet().toArray()[0].toString();

			if (response.containsValue(200)) {
				return "redirect:/customer_search?" + messagetype + "=" + message;
			} else {
				return "redirect:/customer_search?error";
			}
		} else {
			return "redirect:/login";
		}
	}
	/*
	 * 
	 * This Controller--> for Unblock particular Customer
	 * 
	 * 
	 * 
	 */

	@GetMapping(value = "user-unBlock")
	public String usersStatusUnBlock(@RequestParam("UserId") String UserId, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response = adminService.usersStatusUnBlock(UserId);
			String message = "";
			if (response.keySet().toArray()[0].toString() == "error") {
				message = response.get("error").toString();
			} else {
				message = response.get("message").toString();
			}
			String messagetype = response.keySet().toArray()[0].toString();

			if (response.containsValue(200)) {
				return "redirect:/customer_search?" + messagetype + "=" + message;
			} else {
				return "redirect:/customer_search?error";
			}
		} else {
			return "redirect:/login";
		}
	}

	/*
	 * 
	 * This Controller--> for total count number Transactions of Customer
	 * 
	 * 
	 * 
	 */
	@GetMapping(value = "total-CustomerTransection")
	public String totalCustomerTransection(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate, Model model, HttpSession session,
			RedirectAttributes rd) throws IOException {
		if (session.getAttribute("email") != null) {

			Map<String, Object> response2 = partnerService.totalCustomerForCurrentMonth();
			Map<String, Object> response3 = partnerService.topWordSearchForCurrentMonth();

			model.addAttribute("total_registered", response2);
			model.addAttribute("top_word_search", response3);

			Map<String, Object> response = adminService.totalCustomerTransection(fromDate, toDate);
			model.addAttribute("total_customer_transaction", response);
			return "customer_home";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping(value = "total-registered")
	public String totalRegistered(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate, Model model, HttpSession session,
			RedirectAttributes rd) throws IOException {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response1 = partnerService.totalCustomerTransectionForCurrentMonth();

			Map<String, Object> response3 = partnerService.topWordSearchForCurrentMonth();

			model.addAttribute("total_customer_transaction", response1);

			model.addAttribute("top_word_search", response3);

			Map<String, Object> response = adminService.totalRegistered(fromDate, toDate);
			model.addAttribute("total_registered", response);
			return "customer_home";
		} else {
			return "redirect:/login";
		}
	}

	@PostMapping(value = "/searchByCustomer")
	public Map<String, Object> searchByCustomer(@RequestParam String search, HttpSession session,
			RedirectAttributes rd) {

		return adminService.searchByCustomer(search);
	}

	@PostMapping(value = "/add-FilterInTheGet-TotalCustomerList")
	public Map<String, Object> addFilterInTheGetTotalCustomerList(@RequestParam String search) {

		return adminService.addFilterInTheGetTotalCustomerList(search);
	}

	@PostMapping("/download/customers.csv")
	public List<Object> downloadCSV(HttpServletResponse response,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate) throws IOException {
		return adminService.downloadAll(response, fromDate, toDate);

	}

	@GetMapping(value = "view-ParticularCustomer", produces = MediaType.APPLICATION_JSON_VALUE)
	public String viewParticularCustomer(@RequestParam("UserId") String UserId, Model model,
			@Valid AllDetailsDto allDetailsDto, HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<AllDetailsDto> response = adminService.viewParticularCustomer(UserId);
			List<Object> response1 = adminService.getShoppingProfileLimit2(UserId);
			List<Object> response2 = adminService.getTransactionDeatils(UserId);
			model.addAttribute("customerslist", response);
			model.addAttribute("ShoppingDetails", response1);
			model.addAttribute("transactionDetails", response2);
			return "/customer_details";
		} else {
			return "redirect:/login";
		}
	}

	/*
	 * @GetMapping(value = "/custome-get-Transaction-Deatils-limit2") public
	 * List<Object> getTransactionDeatils(String UserId) { return
	 * adminService.getTransactionDeatils(UserId); }
	 */

	// custome-get-Transaction-Deatils-All

	@GetMapping(value = "transaction_details")
	public String getTransactionDeatilsAll(Model model, HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> data = adminService.getTransactionDeatilsAll();
			model.addAttribute("transactiondetails", data);
			return "transaction_details";
		}
		return "redirect:/login";
	}

	/*
	 * @GetMapping(value = "/customer-shoping-profile-limit2") public List<Object>
	 * getShoppingProfileLimit2(String UserId) {
	 * 
	 * return adminService.getShoppingProfileLimit2(UserId); }
	 */
	@GetMapping(value = "/customer-shoping-profile-All")
	public Map<String, Object> getShoppingProfileAll() {

		return adminService.getShoppingProfileAll();
	}

}
