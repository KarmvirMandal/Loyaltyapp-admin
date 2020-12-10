package com.mobiloitte.loyalty.admin.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface AdminJdbcDao  {

	List<Map<String, Object>> finndByGetCustomeList();

	List<Map<String, Object>> findByBusinessNameTimeBetween(Date fromDate, Date toDate, Long businessOrItem);

	List<Map<String, Object>> findByItemTimeBetween(Date fromDate, Date toDate, Long businessOrItem);


	List<Map<String, Object>> getTransactionDeatilsAll();

	List<Map<String, Object>> getShoppingProfileLimit2(String userId);

	List<Map<String, Object>> getShoppingProfileAll();

	List<Map<String, Object>> getTransactionDeatils(String userId);

}
