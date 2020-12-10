package com.mobiloitte.loyalty.admin.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiloitte.loyalty.admin.bean.StoreWeb;

public interface ShoppingProfileDao extends JpaRepository<StoreWeb, Long> {

	List<StoreWeb> findByisStatus(boolean b);

	List<StoreWeb> findBycreationTimeBetween(Date fromDate, Date toDate);

	List<StoreWeb> findByisStatusBetween(Date fromDate, Date toDate);

}
