package com.mobiloitte.loyalty.admin.adminServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobiloitte.loyalty.admin.adminService.BusinessService;
import com.mobiloitte.loyalty.admin.dao.AdminJdbcDao;
import com.mobiloitte.loyalty.admin.dao.BusinessDao;

@Service
public class BusinessServiceImpl implements BusinessService {
	@Autowired
	BusinessDao businessDao;
	@Autowired
	AdminJdbcDao adminJdbcDao;

	public List<Object> topWordSearchTotal(java.util.Date fromDate, java.util.Date toDate, Long busineesOrItem) {
		List<Object> response1 = new ArrayList<Object>();
		int str1 = 1;
		int str2 = 2;


		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("BUSINESS_NAME", "No Data Found");
		list.add(map);


		
		
		List<Map<String, Object>> bYbusinessName = adminJdbcDao.findByBusinessNameTimeBetween(fromDate, toDate,
				busineesOrItem);
		List<Map<String, Object>> bYitem = adminJdbcDao.findByItemTimeBetween(fromDate, toDate, busineesOrItem);

		if (!bYbusinessName.isEmpty() && busineesOrItem == str1) {
			for (Object order : bYbusinessName) {
				response1.add(order);
				return response1;
			}
		} else if (!bYitem.isEmpty() && busineesOrItem == str2) {
			for (Object order : bYitem) {
				response1.add(order);
				return response1;
			}
		} else {
			for (Object order : list) {
				response1.add(order);
				return response1;
			}
			
			
		}
		return response1;

	}
}
