package com.mobiloitte.loyalty.admin.adminService;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.mobiloitte.loyalty.admin.bean.StaticContent;
import com.mobiloitte.loyalty.admin.dto.DeleteContentRequestDto;
import com.mobiloitte.loyalty.admin.dto.StaticContentDTO;

public interface StaticContentService {

	Map<String, Object> addStaticContent(@Valid StaticContentDTO staticContentDTO);

	//Map<String, Object> updateStaticContent(@Valid UpdateContentRequestDto updateContentRequestDto);

	Map<String, Object> deleteStaticContent(@Valid DeleteContentRequestDto deleteContentRequestDto);

	List<StaticContent> getAllStaticContent();

	Map<String, Object> getStaticContentByPageKey(String pageKey);

	Map<String, Object> updateStaticContent(@Valid String pagaData, Long id);

}
