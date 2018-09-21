package com.metacube.training.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		
		return "employee/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("username") String username, 
			@RequestParam("password") String password){
		return new ModelAndView("employee/dashboard", "email", username);
	}
	
	@RequestMapping(value = "/editProfile", method = RequestMethod.GET)
	public ModelAndView editEmployee(@RequestParam String email){
		return new ModelAndView("employee/editProfile");
	}
	
	@RequestMapping(value = "/editProfile", method = RequestMethod.POST)
	public ModelAndView editEmployee(@RequestParam("employeeCode") String employeeCode, @RequestParam("firstName") 
			String firstName, @RequestParam("middleName") String middleName, @RequestParam("lastName") String lastName, 
			@RequestParam("email") String email, @RequestParam("dob") String dob, @RequestParam("gender") char gender, 
			@RequestParam("primaryContact") String primaryContact, @RequestParam("secondaryContact") String secondaryContact,
			@RequestParam("skypeId") String skypeId, @RequestParam("skills") String[] skills,@RequestParam("oldPassword") 
			String oldPassword, @RequestParam("password") String password, @RequestParam("confirmPassword") 
			String confirmPassword, @RequestParam("enabled") boolean enabled) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date dateOfBirth = format.parse(dob);
		
		return new ModelAndView("employee/dashboard", "email", email);
	}
	
	@RequestMapping(value = "/searchEmployee", method = RequestMethod.GET)
	public ModelAndView searchEmployee(){
		
		return new ModelAndView("employee/searchEmployee");
	}
	
	@RequestMapping(value = "/searchEmployee", method = RequestMethod.POST)
	public ModelAndView searchEmployee(@RequestParam("criteria") String criteria, @RequestParam("keyword") String keyword){
		return new ModelAndView("employee/searchResults");
	}
	
	@RequestMapping(value = "/viewEmployee", method = RequestMethod.GET)
	public ModelAndView viewEmployee(@RequestParam String employeeCode){
		return new ModelAndView("viewEmployee");
	}
}
