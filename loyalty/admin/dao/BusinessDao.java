package com.mobiloitte.loyalty.admin.dao;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiloitte.loyalty.admin.model.Order;

public interface BusinessDao extends JpaRepository<Order, String> {



	List<Order> findByorderTimeBetween(Date fromDate, Date toDate);

	List<Order> findByorderTimeBetween(java.util.Date fromDate, java.util.Date toDate); 


}
