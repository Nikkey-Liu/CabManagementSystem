package com.web.controller;



import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.web.pojo.Driver;
import com.web.service.User_DriverService;

import com.web.util.Page;

@Controller
public class DriverManagementController {
@Autowired
User_DriverService user_DriverService;
@RequestMapping(value = "/viewDriverManage.action")

public String list(@RequestParam(defaultValue="1")Integer page,
		@RequestParam(defaultValue="10")Integer rows, 
		 Model model,HttpSession session) {
	
	 
	 
	Page <Driver> driverList= user_DriverService.viewList(null,page,rows);
	
	model.addAttribute("page", driverList);
	return "DriverManagement";
	
}
@RequestMapping("/updateDriver.action")

public String update(Driver driver, HttpSession session) {
	
	int rows = user_DriverService.editDriver(driver);
	if(rows > 0){
		  return "redirect:viewDriverManage.action";
	    }else{
	       return "error";
	    }
  
	
}
@RequestMapping("/checkDriver.action")
@ResponseBody
public Driver checkMoreIN(int id, HttpSession session) {
	Driver driver=user_DriverService.findBydriverId(id);
	System.out.println("---------------------------------------------------------------"+driver.getDrivername());
	return driver;
  
	
}
@RequestMapping("/addDriver.action")

public String addDriver(Driver driver, HttpSession session) {
	
	driver.setLoginattempts(0);
	Timestamp lastlogin = new Timestamp(System.currentTimeMillis()); 
	driver.setLastlogin(lastlogin);

	int rows = user_DriverService.addDriver(driver);
	if(rows > 0){
		  return "redirect:viewDriverManage.action";
	    }
	else{
	       return "error";
	    }
}
/**
 * 删除subject
 */
@RequestMapping("/deleteDriver.action")
@ResponseBody
public String delete(Integer id) {
	
    int rows = user_DriverService.deleteDriver(id);
    System.out.println("---------------------------------------------------------------"+rows);
    if(rows > 0){			
        return "OK";
    }else{
       return "FAIL";			
   }
}
}
