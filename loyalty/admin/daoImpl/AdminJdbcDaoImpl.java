package com.mobiloitte.loyalty.admin.daoImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mobiloitte.loyalty.admin.dao.AdminJdbcDao;

@Repository
public class AdminJdbcDaoImpl implements AdminJdbcDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> finndByGetCustomeList() {
		String query ="select a.pk_user_id as userId,SUBSTRING(a.first_name, 1, 10)as first_name,SUBSTRING(a.last_name, 1, 10)as last_name,a.user_status as userStatus,b.fk_user_id,a.CREATION_DATE,b.PAYMENT_TRANSACTION_ID,b.payment_time from user a join order_details b on(a.pk_user_id=b.pk_order_id) where is_status!=b'1'";
		return jdbcTemplate.queryForList(query);
	}

	@Override
	public List<Map<String, Object>> findByBusinessNameTimeBetween(Date fromDate, Date toDate, Long businessOrItem) {
		String query ="select BUSINESS_NAME  from business where CREATION_DATE between ?and?";
		
		return jdbcTemplate.queryForList(query,fromDate,toDate);
	}

	@Override
	public List<Map<String, Object>> findByItemTimeBetween(Date fromDate, Date toDate, Long businessOrItem) {
		String query ="select b.product_name as BUSINESS_NAME from order_items a join store_product_service b on(a.PK_ORDER_ITEM_ID=b.PK_STORE_PRODUCT_SERVICE_ID) where a.ORDER_TIME between ?and?";
		return jdbcTemplate.queryForList(query,fromDate,toDate);
	}
	@Override
	public List<Map<String, Object>> getTransactionDeatils(String UserId) {
		String query = "select a.PK_ORDER_ID, a.payment_transaction_id,a.payment_time,a.total,SUBSTRING(b.STORE_NAME, 1, 10)as STORE_NAME ,u.PK_USER_ID from order_details a join store b on(a.pk_order_id=b.pk_store_id) join user u on(a.pk_order_id= u.PK_USER_ID) where PK_USER_ID=? limit 2";
		return jdbcTemplate.queryForList(query, UserId);
	}

	@Override
	public List<Map<String, Object>> getTransactionDeatilsAll() {
		String query = "select a.PK_ORDER_ID, a.payment_transaction_id,a.payment_time,a.total,SUBSTRING(b.STORE_NAME, 1, 10)as STORE_NAME from order_details a join store b on(a.pk_order_id=b.pk_store_id)";
		return jdbcTemplate.queryForList(query);
	}

	@Override
	public List<Map<String, Object>> getShoppingProfileLimit2(String UserId) {
		String query = "select a.store_name,b.three_star_points,c.TOTAL,u.PK_USER_ID from store a join business b on(a.pk_store_id=b.PK_BUSINESS_ID) join order_details c on(b.PK_BUSINESS_ID=c.PK_ORDER_ID) join user u on(c.PK_ORDER_ID= u.PK_USER_ID) where PK_USER_ID=? limit 2";
		return jdbcTemplate.queryForList(query,UserId);
	}

	@Override
	public List<Map<String, Object>> getShoppingProfileAll() {
		String query = "select a.store_name,b.three_star_points,c.TOTAL from store a join business b on(a.pk_store_id=b.PK_BUSINESS_ID) join order_details c on(b.PK_BUSINESS_ID=c.PK_ORDER_ID) ";
		return jdbcTemplate.queryForList(query);
	}

}
