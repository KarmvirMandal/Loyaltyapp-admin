package com.mobiloitte.loyalty.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiloitte.loyalty.admin.bean.BusinessBean;

public interface BusinessBeanDao  extends JpaRepository<BusinessBean, Long>{

	//Optional<BusinessBean> findBybusinessId(Long businessId);


	
	
	//@Query(value = " SELECT u.FK_BUSINESS_TYPE_ID FK_BUSINESS_TYPE_ID as FK_BUSINESS_TYPE_ID ,d.BUSINESS_TYPE_NAME  from business u left join business_type d on(u.PK_BUSINESS_ID=d.PK_BUSINESS_TYPE_ID))", nativeQuery = true)

	//List<BusinessBean> findBybusinessId(); 

}
