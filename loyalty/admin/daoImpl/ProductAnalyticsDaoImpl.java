package com.mobiloitte.loyalty.admin.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mobiloitte.loyalty.admin.dao.ProductCategoryDao;

@Repository
public class ProductAnalyticsDaoImpl implements ProductCategoryDao {
@Autowired
private JdbcTemplate jdbcTemplate;

@Override
public int saveCategory(String productCategory) {
String query = "INSERT INTO product_category(PRODUCT_CATEGORY_NAME) VALUES (?)";
return jdbcTemplate.update(query, productCategory);

}

@Override
public List<Map<String, Object>> findByGetCategory() {
String query = "select PRODUCT_CATEGORY_NAME from product_category";
return jdbcTemplate.queryForList(query);

}

}