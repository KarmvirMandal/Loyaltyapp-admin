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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mobiloitte.loyalty.admin.adminService.StaticContentService;
import com.mobiloitte.loyalty.admin.bean.StaticContent;
import com.mobiloitte.loyalty.admin.dto.DeleteContentRequestDto;
import com.mobiloitte.loyalty.admin.dto.StaticContentDTO;
import com.mobiloitte.loyalty.admin.model.Constants;

@Controller
public class StaticContentController extends Constants {

	/** The static content service. */
	@Autowired
	private StaticContentService staticContentService;

	/**
	 * Request add static content.
	 *
	 * @param staticContentDTO the static content DTO
	 * @return the response
	 */

	@GetMapping(value = "add-new-static-content")
	public Map<String, Object> requestAddStaticContent(@Valid @RequestBody StaticContentDTO staticContentDTO,
			Model model) {
// Map<String, Object> addData = new HashMap();

		return staticContentService.addStaticContent(staticContentDTO);

	}

	/**
	 * Request update static content.
	 *
	 * @param updateContentRequestDto the update content request dto
	 * @return the response
	 */

	@GetMapping(value = "Edit-static-content")
	public String requestUpdateStaticContent(@RequestParam("id") Long id, @RequestParam("page_data") String pagaData,
			Model modal, RedirectAttributes redirectAttributes, HttpSession session) {
		if (session.getAttribute("email") != null) {
			Map<String, Object> response = staticContentService.updateStaticContent(pagaData, id);
			modal.addAttribute("editData", response);
			return "static_content_mgmt";
		} else {
			return "redirect:/login";
		}
	}

	/**
	 * Request delete static content.
	 *
	 * @param deleteContentRequestDto the delete content request dto /** Request
	 *                                delete static content.
	 *
	 * @param deleteContentRequestDto the delete content request dto
	 * @return the response
	 */

	@PostMapping(value = "delete-static-content")
	public Map<String, Object> requestDeleteStaticContent(
			@Valid @RequestBody DeleteContentRequestDto deleteContentRequestDto) {

		return staticContentService.deleteStaticContent(deleteContentRequestDto);
	}

	/**
	 * Request get all static contents.
	 *
	 * @return the response
	 */

	@GetMapping(value = "get-all-static-content(AboutUs,T&C,PRivcyPolcy)", produces = MediaType.APPLICATION_JSON_VALUE)
	public String requestgetAllStaticContents(RedirectAttributes redirectAttributes, Model model, HttpSession session) {
		if (session.getAttribute("email") != null) {
			List<StaticContent> response = staticContentService.getAllStaticContent();
			model.addAttribute("static_content_list", response);
			/*
			 * String message = ""; List<StaticContent> data=response.get("data"); if
			 * (response.keySet().toArray()[0].toString() == "error") { message =
			 * response.get("error").toString(); } else { message =
			 * response.get("message").toString(); data =
			 * response.get("message").toString();
			 * 
			 * }
			 * 
			 * String message type = response.keySet().toArray()[0].toString();
			 */
			return "static_content_mgmt";
		} else {
			return "redirect:/login";
		}

		/*
		 * if (response.containsValue(200)) { return "redirect:/static_content_mgmt?" +
		 * message type + "=" + message; } else { return
		 * "redirect:/static_content_?error"; }
		 */

	}

	/**
	 * Requestget static content by key.
	 *
	 * @param pageKey the page key
	 * @return the response
	 */
	@GetMapping(value = "View-static-content")
	public Map<String, Object> requestgetStaticContentByKey(
			@RequestParam(required = true, value = "pageKey") String pageKey, Model modal) {
		return staticContentService.getStaticContentByPageKey(pageKey);
	}
}