package com.mobiloitte.loyalty.admin.adminServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobiloitte.loyalty.admin.adminService.ProductCotegoryService;
import com.mobiloitte.loyalty.admin.dao.ProductCategoryDao;

@Service
public class ProductCotegoryServiceImpl implements ProductCotegoryService {
	@Autowired
	EntityManager em;

	@Autowired
	ProductCategoryDao productAnalyticsDao;

	@Override
	public int saveCategory(String productCategory) {
		int category = productAnalyticsDao.saveCategory(productCategory);
		String i = String.valueOf(category);
		if (i.isEmpty()) {
			return 200;
		} else {
			return 205;
		}

	}

	public Map<String, Object> getCategory() {
		Map<String, Object> response1 = new HashMap<>();
		List<Map<String, Object>> response = productAnalyticsDao.findByGetCategory();
		if (response != null) {
			response1.put("message", 200);
			response1.put("message", response);

		}
		response1.put("message", 200);
		response1.put("message", "SomrThing Went Wrong");
		return response1;

	}

	@Override
	public List<Object> findByGetCategory() {
		List<Map<String, Object>> response = productAnalyticsDao.findByGetCategory();
		List<Object> catagory_list = new  ArrayList<Object>();
		for (Object catagory_creation_list : response) {
			catagory_list.add(catagory_creation_list);
		}
		return catagory_list;
		
		
		/*if (response != null) {
			response1.put("message", 200);
			response1.put("message", response);
		} else {
			response1.put("message", 205);
			response1.put("message", "List is empty");
			return response1;
		}
		return response1;*/

	}
}