package com.mobiloitte.loyalty.admin.daoImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mobiloitte.loyalty.admin.dao.PartnerDao;
import com.mobiloitte.loyalty.admin.dto.BusinessDetailsDTO;
import com.mobiloitte.loyalty.admin.dto.StoreTimeDto;

@Repository
public class PartnerDaoImpl implements PartnerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<Map<String, Object>> findByBusinessTypeNameHot(String business_types, Boolean check_hot_OR_loyalty,
			Date fromDate, Date toDate) {
		String query = "Select  MAX(b.PRODUCT_NAME) as product_name FROM deals a join store_product_service b on(a.PK_DEAL_ID=b.pk_store_product_service_id) where a.CREATION_DATE BETWEEN ? and ? and a.fk_business_id= ? and  a.is_hot=? ";
		return jdbcTemplate.queryForList(query, fromDate, toDate, business_types, check_hot_OR_loyalty);
	}

	@Override
	public List<Map<String, Object>> findByBusinessTypeNameLoyal(String business_types, Boolean check_hot_OR_loyalty,
			Date fromDate, Date toDate) {
		String query = "Select   MAX(b.PRODUCT_NAME) as product_name FROM deals a join store_product_service b on(a.PK_DEAL_ID=b.pk_store_product_service_id) where a.CREATION_DATE BETWEEN ? and ? and a.fk_business_id=? and  a.is_loyalty=? ";
		return jdbcTemplate.queryForList(query, fromDate, toDate, business_types, check_hot_OR_loyalty);
	}

	@Override
	public List<Map<String, Object>> getPartnerSearchListWithFilter() {
		String query = "select a.pk_business_id,a.is_status,a.business_name,b.TOTAL,b.total,b.fk_user_id from business a join order_details b on(a.PK_BUSINESS_ID=b.PK_ORDER_ID)";
		return jdbcTemplate.queryForList(query);
	}

	@Override
	public List<Map<String, Object>> viewPartnerDetails(String businessId) {
		String query = "select a.PK_STORE_ID,a.store_name,a.address,a.CONTACT_NO,b.business_tell,b.email from store a join business b on(a.PK_STORE_ID=b.FK_BUSINESS_TYPE_ID) where a.pk_store_id=?";
		return jdbcTemplate.queryForList(query, businessId);
	}

	@Override
	public List<Map<String, Object>> seebreezeTransaction(String businessId) {
		String query = "select a.PAYMENT_TRANSACTION_ID,a.payment_time,b.FK_BUSINESS_ID,b.PRICE, a.PAYMENT_MODE,TOTAL from order_details a join store_product_service b on(a.PK_ORDER_ID=b.PK_STORE_PRODUCT_SERVICE_ID) where b.FK_BUSINESS_ID=?";
		return jdbcTemplate.queryForList(query, businessId);
	}

	@Override
	public List<Map<String, Object>> marketingDeals(String businessId) {
		String query = "select deal_desc,fk_business_id,START_DATE,expiry_date from deals where FK_BUSINESS_ID=?";
		return jdbcTemplate.queryForList(query, businessId);
	}

	@Override
	public Object findBybusinessIdforBlock(String businessId) {
		String query = "Update business SET is_status =b'1' where PK_BUSINESS_ID =?";
		return jdbcTemplate.update(query, businessId);
	}

	@Override
	public Object findBybusinessIdforUnBlock(String businessId) {
		String query = "Update business SET is_status =b'0' where PK_BUSINESS_ID =?";
		return jdbcTemplate.update(query, businessId);
	}

	@Override
	public List<Map<String, Object>> findAllRefundsDetails() {
		String str = "select o.REFUND_DATE,o.REFUNDED_PRICE,u.PK_USER_ID,u.USER_NAME, s.STORE_NAME,ps.PRICE,t.PAYMENT_TRANSACTION_ID from store_product_service ps  join store s on(s.PK_STORE_ID=ps.FK_STORE_ID) inner join order_details t on(t.FK_STORE_ID=s.PK_STORE_ID)inner join order_items o on(o.FK_STORE_PRODUCT_SERVICE_ID=s.PK_STORE_ID) inner join user u on(u.STORE_ID=s.PK_STORE_ID) where  IS_REFUNDED=True";
		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> findAllRefundsActionDetails() {
		String str = "select o.REFUND_DATE,o.REFUNDED_PRICE,u.PK_USER_ID,u.USER_NAME, s.STORE_NAME,ps.PRICE,t.PAYMENT_TRANSACTION_ID from store_product_service ps  join store s on(s.PK_STORE_ID=ps.FK_STORE_ID) inner join order_details t on(t.FK_STORE_ID=s.PK_STORE_ID)inner join order_items o on(o.FK_STORE_PRODUCT_SERVICE_ID=s.PK_STORE_ID) inner join user u on(u.STORE_ID=s.PK_STORE_ID) where  IS_REFUNDED=False LIMIT 1000";
		return jdbcTemplate.queryForList(str);
	}

	/*
	 * @Override public List<Map<String, Object>>
	 * findByBestSellingServiceorProduct(String business_types, Date fromDate, Date
	 * toDate) { String query =
	 * "select a.pk_order_item_id,a.fk_order_id,MAX(a.ITEM_COUNT),c.product_name from order_items a join order_details b on(a.PK_ORDER_ITEM_ID=b.PK_ORDER_ID)join store_product_service c on(a.PK_ORDER_ITEM_ID=c.PK_STORE_PRODUCT_SERVICE_ID) where c.creation_date between ? and? and b.fk_business_id=?"
	 * ; return jdbcTemplate.queryForList(query, fromDate, toDate, business_types);
	 * }
	 */
	@Override
	public List<Map<String, Object>> findByBestSellingServiceorProduct(String business_types, Date fromDate,
			Date toDate) {
		String query = "select a.pk_order_item_id,a.fk_order_id,MAX(a.ITEM_COUNT),c.product_name from order_items a join order_details b on(a.PK_ORDER_ITEM_ID=b.PK_ORDER_ID)join store_product_service c on(a.PK_ORDER_ITEM_ID=c.PK_STORE_PRODUCT_SERVICE_ID) where c.creation_date between ? and? and b.fk_business_id=?";
		return jdbcTemplate.queryForList(query, fromDate, toDate, business_types);
	}

	@Override
	public List<Map<String, Object>> findByPartnersWithHighestCheckIn(String business_types, Date fromDate,
			Date toDate) {
		String query = "select b.FK_USER_ID,count(b.fk_user_id) from store a join user_store_checked_in b on(a.FK_BUSINESS_ID=b.pk_user_checked_in) where b.CHECKED_IN_TIME between ? and ? and a.fk_business_id=?";
		return jdbcTemplate.queryForList(query, fromDate, toDate, business_types);
	}

	@Override
	public List<Map<String, Object>> findAllTransactionsDetails() {
		String str = "Select t.PAYMENT_TRANSACTION_ID,t.payment_amount,t.ORDER_COMPLETE_TIME,u.PK_USER_ID,u.USER_NAME,b.BUSINESS_NAME,t.payment_mode,t.business_id,bt.BUSINESS_TYPE_NAME from user u  join order_details t on(u.PK_USER_ID=t.FK_USER_ID)  join business b on(b.PK_BUSINESS_ID=t.FK_BUSINESS_ID) inner join business_type bt on(bt.PK_BUSINESS_TYPE_ID=b.FK_BUSINESS_TYPE_ID)";

		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> findAll() {
		String str = "select sps.PRODUCT_NAME,pc.PRODUCT_CATEGORY_NAME,sps.ITEM_TYPE,sps.STOCK,sps.PRICE,od.ORDER_COMPLETE_TIME from store_product_service sps join product_category pc on(sps.FK_PRODUCT_CATEGORY_ID=pc.PK_PRODUCT_CATEGORY_ID)join  order_details od on(od.PK_ORDER_ID=pc.PK_PRODUCT_CATEGORY_ID);";

		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> findBycreateDateBetweenCurrentMonth() {
		String str = "select count(PAYMENT_TRANSACTION_ID)as total_transactions FROM order_details WHERE   MONTH(PAYMENT_TIME) = MONTH(current_date()) AND YEAR(PAYMENT_TIME) = YEAR(CURRENT_DATE())";
		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> findCustomerCountDateBetweenCurrentMonth() {

		String str = "select count(PK_USER_ID) total_registered_customer FROM user WHERE   MONTH(CREATION_DATE) = MONTH(current_date()) AND YEAR(CREATION_DATE) = YEAR(CURRENT_DATE())";
		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> findTopWordSearchUsingBusinessNameAndDateBetweenCurrentMonth() {
		String str = "select BUSINESS_NAME from business order by CREATION_DATE desc limit 1";

		return jdbcTemplate.queryForList(str);
	}

	@Override
	public void SaveOfTime(StoreTimeDto storeTimeDto) {
		String query = "insert into store_time(day,start_time,close_time) values (:day,:start_time,:close_time)";
		namedParameterJdbcTemplate.update(query,
				new MapSqlParameterSource().addValue("day", storeTimeDto.getDay())
						.addValue("start_time", storeTimeDto.getStart_time())
						.addValue("close_time", storeTimeDto.getClose_time()));

	}

	@Override
	public int SaveOfBusinessDetails(BusinessDetailsDTO businessDetailsDTO) {
		String query = "insert into business(BUSINESS_NAME,business_Address,business_tell,email,business_Image,select_number_of_store,select_number_of_beacons,is_status) values (?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(query, businessDetailsDTO.getBusiness_name(),
				businessDetailsDTO.getBusiness_Address(), businessDetailsDTO.getBusiness_tell(),
				businessDetailsDTO.getEmail(), businessDetailsDTO.getBusiness_images(),
				businessDetailsDTO.getSelect_Number_Of_Store(), businessDetailsDTO.getSelect_number_of_beacons(),
				businessDetailsDTO.isIs_status());
	}

	@Override
	public List<Map<String, Object>> totalPartnerLosttDateBetweenCurrentMonth() {

		String str = "select count(a.status) as partner_lost from store a where STATUS=false and   MONTH(CREATION_DATE) = MONTH(current_date()) AND YEAR(CREATION_DATE) = YEAR(CURRENT_DATE())";
		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> hottestProductSearchBetweenCurrentMonth() {
		String str = "select MAX(oi.ITEM_COUNT), SPS.PRODUCT_NAME as Hotest_Product_services FROM order_items oi JOIN store_product_service SPS ON(oi.FK_STORE_PRODUCT_SERVICE_ID=SPS.PK_STORE_PRODUCT_SERVICE_ID)group by SPS.PK_STORE_PRODUCT_SERVICE_ID LIMIT 1";

		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> partnersWithHighestCheckinBetweenCurrentMonth() {
		String str = "SELECT count(b.fk_user_id) FROM store a join user_store_checked_in b on(a.FK_BUSINESS_ID=b.pk_user_checked_in) where MONTH(b.CHECKED_IN_TIME) = MONTH(current_date()) AND YEAR(b.CHECKED_IN_TIME) = YEAR(CURRENT_DATE()) group by b.FK_USER_ID";

		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> bestSellingItemForCurrentMonth() {
		String str = "select  SPS.PRODUCT_NAME as best_item  FROM order_items oi JOIN store_product_service SPS ON(oi.FK_STORE_PRODUCT_SERVICE_ID=SPS.PK_STORE_PRODUCT_SERVICE_ID)group by SPS.PK_STORE_PRODUCT_SERVICE_ID LIMIT 1";

		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> topTenCustomerTransaction() {
		String str = "select a.PAYMENT_TRANSACTION_ID,a.payment_time,b.FK_BUSINESS_ID,b.PRICE, a.PAYMENT_MODE,TOTAL from order_details a join store_product_service b on(a.PK_ORDER_ID=b.PK_STORE_PRODUCT_SERVICE_ID) where  MONTH(PAYMENT_TIME) = MONTH(current_date()) AND YEAR(PAYMENT_TIME) = YEAR(CURRENT_DATE())";
		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> topTenUserRegister() {
		String str = "select  PK_USER_ID,email,PHONE,CREATION_DATE,role from user where  MONTH(CREATION_DATE) = MONTH(current_date()) AND YEAR(CREATION_DATE) = YEAR(CURRENT_DATE()) limit 10";
		return jdbcTemplate.queryForList(str);

	}

	@Override
	public List<Map<String, Object>> findTopTenTopWordSearch() {
		String str = "select BUSINESS_NAME from business where  MONTH(CREATION_DATE) = MONTH(current_date()) AND YEAR(CREATION_DATE) = YEAR(CURRENT_DATE()) limit 1";
		return jdbcTemplate.queryForList(str);

	}

	@Override
	public List<Map<String, Object>> findTopTenPartnerLost() {
		String str = "SELECT a.status ,u.Email,u.PK_USER_ID ,u.FIRST_NAME  from store a join user u on(u.STORE_ID=a.PK_STORE_ID) where a.STATUS=false limit 10; and  MONTH(CREATION_DATE) = MONTH(current_date()) AND YEAR(CREATION_DATE) = YEAR(CURRENT_DATE())";
		return jdbcTemplate.queryForList(str);

	}

	@Override
	public List<Map<String, Object>> findTopTenSellingItems() {
		String str = "select a.pk_order_item_id,a.fk_order_id,a.ITEM_COUNT,c.product_name from order_items a join order_details b on(a.PK_ORDER_ITEM_ID=b.PK_ORDER_ID)join store_product_service c on(a.PK_ORDER_ITEM_ID=c.PK_STORE_PRODUCT_SERVICE_ID)  where  MONTH(b.ORDER_TIME) = MONTH(current_date()) AND YEAR(b.ORDER_TIME) = YEAR(CURRENT_DATE()) limit 10 ";
		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> findTopTenHotProduct() {
		String str = "select oi.ITEM_COUNT, SPS.PRODUCT_NAME as Hotest_Product_services FROM order_items oi JOIN store_product_service SPS ON(oi.FK_STORE_PRODUCT_SERVICE_ID=SPS.PK_STORE_PRODUCT_SERVICE_ID) where MONTH(SPS.CREATION_DATE) = MONTH(current_date()) AND YEAR(SPS.CREATION_DATE) = YEAR(CURRENT_DATE()) LIMIT 10";
		return jdbcTemplate.queryForList(str);
	}

	@Override
	public List<Map<String, Object>> findTopTenHighestCheckIn() {
		String str = "SELECT b.fk_user_id,u.EMAIL FROM store a join user_store_checked_in b on(a.FK_BUSINESS_ID=b.pk_user_checked_in) join user u on(u.STORE_ID=a.PK_STORE_ID) where MONTH(u.CREATION_DATE) = MONTH(current_date()) AND YEAR(u.CREATION_DATE) = YEAR(CURRENT_DATE())";

		return jdbcTemplate.queryForList(str);
	}

}
