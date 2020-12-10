package com.mobiloitte.loyalty.admin.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiloitte.loyalty.admin.model.User;

public interface AdminDao extends JpaRepository<User, String> {

	Optional<User> findByEmail(String email);

	Optional<User> findByUserId(String userId); 

	List<User> findBycreateDateBetween(Date fromDate, Date toDate);

	List<User> findByuserId(String userId);
 
	Optional<User> findByisStatus(String userId);

	void save(boolean user);

	List<User> findByisStatus(boolean b);

	List<User> findByisStatusFalse();








	
	


}