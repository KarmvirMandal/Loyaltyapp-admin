package com.mobiloitte.loyalty.admin.adminServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.mobiloitte.loyalty.admin.adminService.AdminService;
import com.mobiloitte.loyalty.admin.dao.AdminDao;
import com.mobiloitte.loyalty.admin.dao.AdminJdbcDao;
import com.mobiloitte.loyalty.admin.dto.AllDetailsDto;
import com.mobiloitte.loyalty.admin.dto.ForgetPasswordDto;
import com.mobiloitte.loyalty.admin.dto.LoginDto;
import com.mobiloitte.loyalty.admin.dto.PasswordDto;
import com.mobiloitte.loyalty.admin.enums.UserStatus;
import com.mobiloitte.loyalty.admin.model.User;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao adminDao;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	JavaMailSender sender;
	@Autowired
	EntityManager em;
	@Autowired
	AdminJdbcDao adminJdbcDao;

	@Override
	public Map<String, Object> loginService(LoginDto loginDto) {
		Map<String, Object> response = new HashMap<>();
		Optional<User> login = adminDao.findByEmail(loginDto.getEmail());
		if (login.isPresent() && login.get().getRole().equalsIgnoreCase("Admin")) {
			if (bCryptPasswordEncoder.matches(loginDto.getPassword(), login.get().getPassword())) {
				response.put("status", 200);
				response.put("message", "login Successfully");
				return response;

			} else {
				response.put("status", 201);
				response.put("error", "Login Unsuccessfully");
				return response;
			}
		} else {
			response.put("status", 205);
			response.put("error", "Email or Password are wrong");
			return response;
		}

	}

	@Override
	public Map<String, Object> forgetPassword(@Valid ForgetPasswordDto forgetPasswordDto) throws MessagingException {
		Map<String, Object> response = new HashMap<>();
		Optional<User> forgetPassword = adminDao.findByEmail(forgetPasswordDto.getEmail());
		MimeMessage asscii = sender.createMimeMessage();
		MimeMessageHelper mmhelper = new MimeMessageHelper(asscii);
		Long curentTime = System.currentTimeMillis();
		if (forgetPassword.isPresent() && forgetPassword.get().getRole().equalsIgnoreCase("Admin")) {
			try {
				mmhelper.setTo(forgetPasswordDto.getEmail());
				mmhelper.setText(" Click on this link for reset http://172.16.1.129:9345/reset-passwordCheck?email="
						+ forgetPassword.get().getEmail() + "&millis=" + curentTime);
				mmhelper.setSubject("Send  mail From Mobiloitte Technologies India pvt. ltd.");

			} catch (MessagingException e) {
				response.put("status", 201);
				response.put("error", "Error While Sending Mail");
				return response;
			}
			sender.send(asscii);
			response.put("status", 200);
			response.put("message", "Reset Link Successfully Send On Your Mail");
			return response;
		} else {
			response.put("status", 205);
			response.put("error", " Kindly Check Your Email ! ");
			return response;
		}

	}

	@Override
	public Map<String, Object> resetPasswordSave(@Valid PasswordDto passwordDto) {
		try {
			Map<String, Object> response = new HashMap<>();
			Optional<User> restSave = adminDao.findByEmail(passwordDto.getEmail());
			if (restSave.isPresent()) {

				if (!passwordDto.getPassword().isEmpty()) {
					User user = restSave.get();
					user.setPassword(bCryptPasswordEncoder.encode(passwordDto.getPassword()));
					adminDao.save(user);
					response.put("status", 200);
					response.put("message", "Password Reset Successfully");
					return response;
				}
			} else {
				response.put("status", 201);
				response.put("error", "Password Not Reset Successfully");
				return response;

			}
		} catch (Exception e) {
		}
		Map<String, Object> response = new HashMap<>();
		response.put("status", 205);
		response.put("error", "password or null");
		return response;
	}

	@Override
	public Map<String, Object> totalCustomerTransection(Date fromDate, Date toDate) throws IOException {
		Map<String, Object> response = new HashMap<String, Object>();
		List<User> findBetweenDate = adminDao.findBycreateDateBetween(fromDate, toDate);
		if (!findBetweenDate.isEmpty()) {
			Object count = findBetweenDate.size();

			response.put("status", 200);
			response.put("message", count);
			return response;
		}
		response.put("status", 205);
		response.put("error", "No Data Found");
		return response;
	}

	@Override
	public List<Object> downloadAll(HttpServletResponse response, Date fromDate, Date toDate) throws IOException {
		List<Object> response1 = new ArrayList<Object>();
		response.setContentType("text/csv");
		response.setHeader("Content-Disposition", "attachment; file=customers.csv");
		List<User> findall = adminDao.findBycreateDateBetween(fromDate, toDate);
		List<AllDetailsDto> responce = new LinkedList<>();
		if (!findall.isEmpty()) {
			for (User user : findall) {
				AllDetailsDto allDetailsDto = new AllDetailsDto();
				allDetailsDto.setUserId(user.getUserId());
				allDetailsDto.setFirstName(user.getFirstName());
				allDetailsDto.setLastName(user.getLastName());
				allDetailsDto.setEmail(user.getEmail());
				allDetailsDto.setPhone(user.getPhone());
				responce.add(allDetailsDto);
			}
			response1.add(responce);
			return response1;
		}
		response1.add(fromDate + " " + "To" + " " + toDate + " " + "Date are Not Exit");
		return response1;
	}

	@Override
	public List<Object> getTotalcustomerlist() {

		List<Map<String, Object>> customerGetList = adminJdbcDao.finndByGetCustomeList();
		List<Object> response1 = new ArrayList<Object>();
		if (!customerGetList.isEmpty()) {
			for (Map<String, Object> user : customerGetList) {
				response1.add(user);

			}
			return response1;
		}

		return response1;
	}

	@Override
	public Map<String, Object> particularCustomerRemove(String userId) {
		Map<String, Object> response = new HashMap<>();
		try {
			Optional<User> check = adminDao.findById(userId);
			if (check.isPresent()) {
				User user = check.get();
				user.setStatus(true);
				adminDao.save(user);
				response.put("status", 200);
				response.put("message", "Customer Successfully Removed");
				return response;
			}
		} catch (Exception e) {

		}
		response.put("status", 205);
		response.put("error", "Somthing Wrong");
		return response;
	}

	@Override
	public Map<String, Object> usersStatusBlock(String userId) {
		Map<String, Object> response = new HashMap<>();
		try {
			Optional<User> userDetails = adminDao.findByUserId(userId);
			if (userDetails.isPresent()) {
				User user = userDetails.get();
				user.setUserStatus(UserStatus.BLOCK);
				adminDao.save(user);
			}
			response.put("status", 200);
			response.put("message", "Customer is Unblocked");
			return response;

		} catch (Exception e) {

		}
		response.put("status", 205);
		response.put("error", "Something went wrong");
		return response;
	}

	@Override
	public Map<String, Object> usersStatusUnBlock(String userId) {
		Map<String, Object> response = new HashMap<>();
		try {
			Optional<User> userDetails = adminDao.findByUserId(userId);
			if (userDetails.isPresent()) {
				User user = userDetails.get();
				user.setUserStatus(UserStatus.ACTIVE);
				adminDao.save(user);
			}
			response.put("status", 200);
			response.put("message", "Customer is Blocked");
			return response;

		} catch (Exception e) {
		}
		response.put("status", 205);
		response.put("error", "Something went wrong");
		return response;
	}

	@Override
	public List<AllDetailsDto> viewParticularCustomer(@RequestParam String userId) {

		List<User> customerData = adminDao.findByuserId(userId);
		List<AllDetailsDto> response = new LinkedList<>();
		if (!customerData.isEmpty()) {
			for (User user : customerData) {
				AllDetailsDto allDetailsDto = new AllDetailsDto();
				allDetailsDto.setUserId(user.getUserId());
				allDetailsDto.setFirstName(user.getFirstName());
				allDetailsDto.setLastName(user.getLastName());
				allDetailsDto.setEmail(user.getEmail());
				allDetailsDto.setPhone(user.getPhone());
				allDetailsDto.setUserStatus(user.getUserStatus());
				response.add(allDetailsDto);
			}
			return response;
		}
		return response;

	}

	@Override
	public Map<String, Object> searchByCustomer(String search) {
		Map<String, Object> responce2 = new HashMap<>();
		List<User> findall = adminDao.findByisStatus(false);
		List<AllDetailsDto> responce1 = new LinkedList<>();
		if (!findall.isEmpty()) {
			for (User user : findall) {
				if (user.getFirstName().equals(search) || user.getLastName().equals(search)
						|| user.getUserId().equals(search)) {
					AllDetailsDto allDetailsDto = new AllDetailsDto();
					allDetailsDto.setUserId(user.getUserId());
					allDetailsDto.setFirstName(user.getFirstName());
					allDetailsDto.setLastName(user.getLastName());
					allDetailsDto.setEmail(user.getEmail());
					allDetailsDto.setPhone(user.getPhone());
					responce1.add(allDetailsDto);
					responce2.put("SuccessCode", 200);
					responce2.put("message", responce1);
					return responce2;
				}
			}
		}
		responce2.put("SuccessCode", 205);
		responce2.put("message", "Something went wrong");
		return responce2;
	}

	@Override
	public Map<String, Object> addFilterInTheGetTotalCustomerList(String search) {
		Map<String, Object> responce = new HashMap<>();
		StringBuilder query = new StringBuilder("select userId, firstName,lastName,email,phone from User");
		List<String> conditions = new ArrayList<>();
		if (search != null) {
			conditions.add(
					"(userId like :search) or(firstName like :search) or (lastName like :search) or (email like :search)or (phone like :search)");
		}
		if (!conditions.isEmpty()) {
			query.append(" where ");
			query.append(String.join(" ", conditions.toArray(new String[0])));
		}
		query.append(" order by userId desc ");
		Query createQuery = em.createQuery(query.toString());

		if (search != null)
			createQuery.setParameter("search", '%' + search + '%');
		@SuppressWarnings("unchecked")
		List<Object[]> list = createQuery.getResultList();
		List<AllDetailsDto> response = list.parallelStream().map(o -> {
			AllDetailsDto allDetailsDto = new AllDetailsDto();
			allDetailsDto.setUserId((String) o[0]);
			allDetailsDto.setFirstName((String) o[1]);
			allDetailsDto.setLastName((String) o[2]);
			allDetailsDto.setEmail((String) o[3]);
			allDetailsDto.setPhone((String) o[4]);
			return allDetailsDto;
		}).collect(Collectors.toList());
		if (!response.isEmpty()) {
			responce.put("SuccessCode", 200);
			responce.put("message", response);
			return responce;
		}

		responce.put("SuccessCode", 205);
		responce.put("message", "Something went wrong");
		return responce;
	}

	@Override
	public Map<String, Object> totalRegistered(Date fromDate, Date toDate) throws IOException {
		Map<String, Object> response = new HashMap<String, Object>();
		List<User> findBetweenDate = adminDao.findBycreateDateBetween(fromDate, toDate);
		if (!findBetweenDate.isEmpty()) {
			Object count = findBetweenDate.size();

			response.put("status", 200);
			response.put("message", count);
			return response;
		}
		response.put("status", 205);
		response.put("error", "No Data Found");
		return response;
	}

	@Override
	public List<Object> getTransactionDeatils(@RequestParam String userId) {

		List<Map<String, Object>> customerGetList = adminJdbcDao.getTransactionDeatils(userId);
		List<Object> response1 = new ArrayList<Object>();
		if (!customerGetList.isEmpty()) {
			for (Object user : customerGetList) {
				response1.add(user);

			}
			return response1;
		}

		return response1;
	}

	@Override
	public List<Object> getTransactionDeatilsAll() {

		List<Map<String, Object>> customerGetList = adminJdbcDao.getTransactionDeatilsAll();
		List<Object> response1 = new ArrayList<Object>();
		if (!customerGetList.isEmpty()) {
			for (Object user : customerGetList) {
				response1.add(user);

			}
			return response1;
		}
		return response1;
	}

	@Override
	public List<Object> getShoppingProfileLimit2(@RequestParam String userId) {

		List<Map<String, Object>> customerGetList = adminJdbcDao.getShoppingProfileLimit2(userId);
		List<Object> response1 = new ArrayList<Object>();
		if (!customerGetList.isEmpty()) {
			for (Object user : customerGetList) {
				response1.add(user);

			}
			return response1;
		}

		return response1;
	}

	@Override
	public Map<String, Object> getShoppingProfileAll() {
		Map<String, Object> responce = new HashMap<>();
		List<Map<String, Object>> customerGetList = adminJdbcDao.getShoppingProfileAll();
		List<Object> response1 = new ArrayList<Object>();
		if (!customerGetList.isEmpty()) {
			for (Map<String, Object> user : customerGetList) {
				response1.add(user);
				responce.put("SuccessCode", 200);
				responce.put("message", response1);
				return responce;
			}
		}
		responce.put("SuccessCode", 200);
		responce.put("message", "Something Went Wrong");
		return responce;
	}
}
