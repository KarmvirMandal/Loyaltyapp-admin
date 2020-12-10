package com.mobiloitte.loyalty.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mobiloitte.loyalty.admin.adminService.ProductCotegoryService;

@Controller
public class ProductCategoryController {
	@Autowired
	ProductCotegoryService productCotegoryService;

	/*
	 * @GetMapping("/create-product-category") public String controler() { return
	 * "/category_creation"; }
	 */

	@GetMapping("create-product-category")
	public String saveCategory(@RequestParam("category_name") String productCategory, Model model, HttpSession session,
			RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			if (!productCategory.isEmpty()) {
				int response = productCotegoryService.saveCategory(productCategory);
				List<Object> list = productCotegoryService.findByGetCategory();
				if (response == 200) {
					model.addAttribute("category_list", list);
					return "redirect:/category_creation";
				} else {
					model.addAttribute("category_list", "Not Saved");
					return "redirect:/category_creation";
				}
			} else {
				model.addAttribute("errorMessage", "Please enter category");
				return "redirect:/category_creation";
			}
		} else {
			return "redirect:/login";
		}
	}

	/*
	 * @GetMapping("/get-category") public String getCategory() { return
	 * productCotegoryService.findByGetCategory(); }
	 */

	@GetMapping("category_creation")
	public String categoryCreation(Model model, HttpSession session, RedirectAttributes rd) {
		if (session.getAttribute("email") != null) {
			List<Object> list = productCotegoryService.findByGetCategory();
			model.addAttribute("catagory_List", list);

			return "category_creation";

		} else

		{
			return "redirect:/login";
		}
	}
}
