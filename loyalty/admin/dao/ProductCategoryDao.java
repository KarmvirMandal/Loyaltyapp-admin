package com.mobiloitte.loyalty.admin.dao;

import java.util.List;
import java.util.Map;

public interface ProductCategoryDao  {

int saveCategory(String productCategory);

List<Map<String, Object>> findByGetCategory();

}