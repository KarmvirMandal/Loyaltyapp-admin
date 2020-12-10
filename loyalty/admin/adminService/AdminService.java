package com.mobiloitte.loyalty.admin.adminService;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;

import com.mobiloitte.loyalty.admin.dto.AllDetailsDto;
import com.mobiloitte.loyalty.admin.dto.ForgetPasswordDto;
import com.mobiloitte.loyalty.admin.dto.LoginDto;
import com.mobiloitte.loyalty.admin.dto.PasswordDto;

public interface AdminService {

	Map<String, Object> loginService(LoginDto loginDto);

	Map<String, Object> forgetPassword(ForgetPasswordDto forgetPasswordDto) throws MessagingException;

	Map<String, Object> resetPasswordSave(PasswordDto passwordDto);

	List<Object> downloadAll(HttpServletResponse response, Date fromDate, Date toDate) throws IOException;

	/* List<AllDetailsDto> gettotalcustomerlist(); */

	List<AllDetailsDto> viewParticularCustomer(String userId);

	Map<String, Object> particularCustomerRemove(String userId);

	Map<String, Object> usersStatusBlock(String userId);

	Map<String, Object> usersStatusUnBlock(String userId);

	Map<String, Object> searchByCustomer(String search);

	Map<String, Object> addFilterInTheGetTotalCustomerList(String search);

	Map<String, Object> totalCustomerTransection(Date fromDate, Date toDate) throws IOException;

	Map<String, Object> totalRegistered(Date fromDate, Date toDate) throws IOException;

	Map<String, Object> getShoppingProfileAll();

	List<Object> getShoppingProfileLimit2(@RequestParam String userId);

	List<Object> getTransactionDeatilsAll();

	List<Object> getTransactionDeatils(@RequestParam String userId);

	List<Object> getTotalcustomerlist();

}
