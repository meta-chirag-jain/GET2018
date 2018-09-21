package com.metacube.training.controller;

import java.io.IOException;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.metacube.training.dto.Skill;
import com.metacube.training.service.SkillService;
import com.metacube.training.service.SkillServiceImpl;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "admin/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		return new ModelAndView("admin/dashboard", "username", username);
	}
	
	@RequestMapping(value = "/project", method = RequestMethod.GET)
	public String addProject() {
		return "/admin/project";
	}
	
	@RequestMapping(value = "/project", method = RequestMethod.POST)
	public ModelAndView project(@RequestParam("description") String description,
			@RequestParam("startDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,
			@RequestParam("endDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate,
			@RequestParam("logo") MultipartFile logo) {
		return new ModelAndView("admin/dashboard");
	}
	
	@RequestMapping(value = "/skills", method = RequestMethod.GET)
	public String addSkill(){
		return "admin/skills";
	}
	
	@RequestMapping(value = "/skills", method = RequestMethod.POST)
	public ModelAndView addSkill(@RequestParam("skillName") String skillName) throws ClassNotFoundException, IOException{
		Skill skill = new Skill();
	    skill.setName(skillName);
	    
	    SkillService skillService = SkillServiceImpl.getInstance();
	    skillService.addSkill(skill);
	    
		return new ModelAndView("admin/dashboard");
	}
	
	@RequestMapping(value = "/jobTitle", method = RequestMethod.GET)
	public String addJobTitle() {
		return "admin/jobTitle";
	}
	
	@RequestMapping(value = "/jobTitle", method = RequestMethod.POST)
	public ModelAndView jobTitle(@RequestParam("jobTitle") String jobTitle) {
		return new ModelAndView("admin/dashboard");
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public String addEmployee() {
		return "admin/addEmployee";
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ModelAndView addEmployee(@RequestParam("fname") String firstName, @RequestParam("mname") String middleName,
			@RequestParam("lname") String lastName, @RequestParam("email") String email, @RequestParam("dob") 
			@DateTimeFormat(pattern = "yyyy-MM-dd") Date dob, @RequestParam("gender") String gender,
			@RequestParam("doj") @DateTimeFormat(pattern = "yyyy-MM-dd") Date doj, @RequestParam("reportingManager") 
			String reportingManager, @RequestParam("teamLead") String teamLead, @RequestParam("projectId") int projectId) {
		return new ModelAndView("admin/dashboard");
	}
	
	@RequestMapping(value = "/searchEmployee", method = RequestMethod.GET)
	public String searchEmployee(){
		return "admin/searchEmployee";
	}
	
	@RequestMapping(value = "/searchEmployee", method = RequestMethod.POST)
	public ModelAndView searchEmployee(@RequestParam("employeeName") String employeeName){
		return new ModelAndView("admin/dashboard");
	}
}
