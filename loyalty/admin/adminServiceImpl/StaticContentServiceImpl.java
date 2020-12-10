package com.mobiloitte.loyalty.admin.adminServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobiloitte.loyalty.admin.adminService.StaticContentService;
import com.mobiloitte.loyalty.admin.bean.StaticContent;
import com.mobiloitte.loyalty.admin.dao.StaticContentDao;
import com.mobiloitte.loyalty.admin.dto.DeleteContentRequestDto;
import com.mobiloitte.loyalty.admin.dto.StaticContentDTO;
import com.mobiloitte.loyalty.admin.model.Constants;

/**
 * The Class StaticContentServiceImpl.
 * 
 * @author Ankush Mohapatra
 */
@Service
public class StaticContentServiceImpl extends Constants implements StaticContentService {

	/** The static content dao. */
	@Autowired
	private StaticContentDao staticContentDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mobiloitte.content.service.StaticContentService
	 * #addStaticContent(com.mobiloitte.content.dto.StaticContentDTO)
	 */
	@Override
	@Transactional
	public Map<String, Object> addStaticContent(StaticContentDTO staticContentDTO) {
		Map<String, Object> addData = new HashMap<>();
		if (!isPageExist(staticContentDTO.getPageKey())) {
			StaticContent saveStaticContentData = saveStaticContent(staticContentDTO);
			if (saveStaticContentData != null) {
				addData.put("successCode", 200);
				addData.put("successMessage", STATIC_CONTENT_SAVED_SUCCESSFULLY);
				return addData;
				// return new Response<>(SUCCESS_CODE, STATIC_CONTENT_SAVED_SUCCESSFULLY);

			} else {
				addData.put("failedCode", FAILURE_CODE);
				addData.put("failMessage", UPDATION_FAILED);
				return addData;
				// return new Response<>(FAILURE_CODE, UPDATION_FAILED);
			}
		} else {
			addData.put("failedCode", FAILURE_CODE);
			addData.put("failMessage", STATIC_CONTENT_ALREADY_EXIST);
			return addData;
			// return new Response<>(FAILURE_CODE, STATIC_CONTENT_ALREADY_EXIST);
		}
	}

	/**
	 * Checks if is page exist.
	 *
	 * @param pageKey the page key
	 * @return true, if is page exist
	 */
	private boolean isPageExist(String pageKey) {
		int isFound = staticContentDao.countByPageKey(pageKey);
		if (isFound > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Save static content.
	 *
	 * @param staticContentDTO the static content DTO
	 * @return the static content
	 */
	private StaticContent saveStaticContent(StaticContentDTO staticContentDTO) {
		try {
			StaticContent staticContent = new StaticContent();
			staticContent.setPageKey(staticContentDTO.getPageKey());
			staticContent.setPageData(staticContentDTO.getPageData());
			staticContent.setIsDeleted(false);
			staticContent = staticContentDao.save(staticContent);
			return staticContent;
		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mobiloitte.content.service.StaticContentService
	 * #updateStaticContent(com.mobiloitte.content.dto.UpdateContentRequestDto)
	 */
	@Override
	@Transactional
	public Map<String, Object> updateStaticContent(String pagaData, Long id) {
		Optional<StaticContent> getContentById = staticContentDao.findById(id);
		Map<String, Object> updateData = new HashMap<>();
		if (getContentById.isPresent()) {
			StaticContent updateStaticContentData = updateStaticContent(getContentById.get(), pagaData);
			if (updateStaticContentData != null) {
				updateData.put("successCode", 200);
				updateData.put("successCode", STATIC_CONTENT_UPDATED_SUCCESSFULLY);
				return updateData;
				// return new Response<>(SUCCESS_CODE, STATIC_CONTENT_UPDATED_SUCCESSFULLY);
			} else {
				updateData.put("failedCode", 205);
				updateData.put("failedMessage", UPDATION_FAILED);
				return updateData;
				// return new Response<>(FAILURE_CODE, UPDATION_FAILED);
			}
		} else {
			updateData.put("failedCode", 205);
			updateData.put("failedMessage", NO_SUCH_STATIC_CONTENT_FOUND);
			return updateData;
		}
	}

	/**
	 * Update static content.
	 *
	 * @param staticContent the static content
	 * @param pageData      the page data
	 * @return the static content
	 */
	private StaticContent updateStaticContent(StaticContent staticContent, String pageData) {
		try {
			staticContent.setPageData(pageData);
			staticContent = staticContentDao.save(staticContent);
			return staticContent;
		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mobiloitte.content.service.StaticContentService
	 * #deleteStaticContent(com.mobiloitte.content.dto.DeleteContentRequestDto)
	 */
	@Override
	@Transactional
	public Map<String, Object> deleteStaticContent(DeleteContentRequestDto deleteContentRequestDto) {
		Optional<StaticContent> getContentById = staticContentDao.findById(deleteContentRequestDto.getContentId());
		Map<String, Object> deleteData = new HashMap<>();
		if (getContentById.isPresent()) {
			StaticContent deleteStaticContentData = deleteStaticContent(getContentById.get());
			if (deleteStaticContentData != null) {
				deleteData.put("successCode", 200);
				deleteData.put("successMessage", STATIC_CONTENT_DELETED_SUCCESSFULLY);
				return deleteData;
			} else {
				deleteData.put("failedCode", 205);
				deleteData.put("failedMessgae", DELETION_FAILED);
				return deleteData;

			}
		} else {
			deleteData.put("failedCode", 205);
			deleteData.put("failedMessgae", NO_SUCH_STATIC_CONTENT_FOUND);
			return deleteData;

		}
	}

	/**
	 * Delete static content.
	 *
	 * @param staticContent the static content
	 * @return the static content
	 */
	private StaticContent deleteStaticContent(StaticContent staticContent) {
		try {
			staticContent.setIsDeleted(true);
			staticContent = staticContentDao.save(staticContent);
			return staticContent;
		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mobiloitte.content.service.StaticContentService
	 * #getAllStaticContent()
	 */
	@Override
	public List<StaticContent> getAllStaticContent() {
		List<StaticContent> getAllContents = staticContentDao.findByIsDeleted(false);
		//Map<String, Object> allcontents = new HashMap<>();
		if (getAllContents != null && !getAllContents.isEmpty()) {
			// allcontents.put("successCode", 200);
			// allcontents.put("successmessage", ALL_STATIC_CONTENT_FETCHED);
			// allcontents.put("data", getAllContents);
			return getAllContents;
		} else {
			// allcontents.put("successCode", 200);
			// allcontents.put("successmessage", NO_STATIC_CONTENT_FOUND);
			// allcontents.put("data", Collections.emptyList());
			return getAllContents;
			// return new Response<>(SUCCESS_CODE, NO_STATIC_CONTENT_FOUND,
			// Collections.emptyList());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mobiloitte.content.service.StaticContentService
	 * #getStaticContentByPageKey(java.lang.String)
	 */
	@Override
	public Map<String, Object> getStaticContentByPageKey(String pageKey) {
		Optional<StaticContent> getPageByPageKey = staticContentDao.findByPageKey(pageKey);
		Map<String, Object> dataByPagekey = new HashMap<>();
		if (getPageByPageKey.isPresent()) {
			dataByPagekey.put("successCode", SUCCESS_CODE);
			dataByPagekey.put("successMessage", STATIC_CONTENT_FOUND);
			dataByPagekey.put("data", getPageByPageKey.get());
			return dataByPagekey;

		} else {
			dataByPagekey.put("failedCode", 205);
			dataByPagekey.put("failedMessage", String.format(NO_CONTENT_FOUND_FOR_THE_KEY));
			dataByPagekey.put("data arg1", dataByPagekey);
			return dataByPagekey;
		}
	}
}
