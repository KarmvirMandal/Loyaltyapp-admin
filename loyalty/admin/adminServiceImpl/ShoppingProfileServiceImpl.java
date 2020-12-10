package com.mobiloitte.loyalty.admin.adminServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobiloitte.loyalty.admin.adminService.ShoppingProfileService;
import com.mobiloitte.loyalty.admin.bean.StoreWeb;
import com.mobiloitte.loyalty.admin.dao.ShoppingProfileDao;
import com.mobiloitte.loyalty.admin.dto.ShoppingProfileDto;

@Service
public class ShoppingProfileServiceImpl implements ShoppingProfileService {
	@Autowired
	ShoppingProfileDao shoppingProfileDao;
	@Autowired
	EntityManager em;

	@Override
	public List<ShoppingProfileDto> getShoppingProfile() {
		List<StoreWeb> findall = shoppingProfileDao.findAll();
		List<ShoppingProfileDto> response = new LinkedList<>();
		if (!findall.isEmpty()) {
			for (StoreWeb storeWeb : findall) {
				ShoppingProfileDto shoppingDto = new ShoppingProfileDto();
				shoppingDto.setStoreId(storeWeb.getStoreId());
				shoppingDto.setStoreName(storeWeb.getStoreName());
				shoppingDto.setContactName(storeWeb.getStoreName());
				shoppingDto.setAddress(storeWeb.getAddress());
				shoppingDto.setContactNo(storeWeb.getContactNo());
				response.add(shoppingDto);
			}
			return response;
		}
		return response;
	}

	@Override
	public Map<String, Object> addfilterInGetShoppingProfile(String search) {
		Map<String, Object> responce = new HashMap<String, Object>();
		StringBuilder query = new StringBuilder("Select storeName,contactName,contactNo from StoreWeb");
		List<String> conditions = new ArrayList<>();
		if (search != null) {
			conditions.add("(storeName like :search) or ( contactName like :search) or (contactNo like :search)");
		}
		if (!conditions.isEmpty()) {
			query.append(" where ");
			query.append(String.join(" ", conditions.toArray(new String[0])));
		}
		query.append(" order by storeId desc ");
		Query createQuery = em.createQuery(query.toString());
		if (search != null)
			createQuery.setParameter("search", '%' + search + '%');
		@SuppressWarnings("unchecked")
		List<Object[]> list = createQuery.getResultList();
		List<ShoppingProfileDto> response = list.parallelStream().map(o -> {
			ShoppingProfileDto shoppingProfileDto = new ShoppingProfileDto();
			// shoppingProfileDto.setStoreId((Long) o[0]);
			shoppingProfileDto.setStoreName((String) o[1]);
			shoppingProfileDto.setContactName((String) o[2]);
			return shoppingProfileDto;
		}).collect(Collectors.toList());
		if (!response.isEmpty()) {
			responce.put("SuccessCode", 200);
			responce.put("message", response);
			return responce;
		}

		responce.put("SuccessCode", 205);
		responce.put("message", "Somthing went wrong");
		return responce;
	}
}
