package com.mobiloitte.loyalty.admin.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiloitte.loyalty.admin.bean.StaticContent;

public interface StaticContentDao extends JpaRepository<StaticContent, Long> {

	/**
	 * Count by page key.
	 *
	 * @param pageKey the page key
	 * @return the integer
	 */
	Integer countByPageKey(String pageKey);

	/**
	 * Find by is deleted.
	 *
	 * @param isDeleted the is deleted
	 * @return the list
	 */
	List<StaticContent> findByIsDeleted(Boolean isDeleted);

	/**
	 * Find by page key.
	 *
	 * @param pageKey the page key
	 * @return the optional
	 */
	Optional<StaticContent> findByPageKey(String pageKey);
}
