package com.mobiloitte.loyalty.admin.adminService;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ProductCotegoryService {

int saveCategory(String productCategory);

List<Object> findByGetCategory();




}