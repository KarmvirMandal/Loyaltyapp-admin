package com.mobiloitte.loyalty.admin.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mobiloitte.loyalty.admin.adminService.ShoppingProfileService;
import com.mobiloitte.loyalty.admin.dto.ShoppingProfileDto;

@Controller
public class ShoppingProfileController {
	@Autowired
	ShoppingProfileService shoppingProfileService;

	@GetMapping(value = "get-ShoppingProfile" , produces = MediaType.APPLICATION_JSON_VALUE)
	public String getShoppingProfile(Model model, @Valid ShoppingProfileDto shoppingProfileDto,HttpSession session,RedirectAttributes rd) {
	if(session.getAttribute("email")!=null) {
		List<ShoppingProfileDto> response = shoppingProfileService.getShoppingProfile();
		model.addAttribute("shopping_profile_list", response);
		return "shopping_details";}
		else {
			return "redirect:/login";
		}

	}

	@PostMapping(value = "/Add-filterInGetShoppingProfile")
	public Map<String, Object> addfilterInGetShoppingProfile(@RequestParam String search) {
		return shoppingProfileService.addfilterInGetShoppingProfile(search);
	}
}
