package com.web.controller;

import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.pojo.Vehicle;
import com.web.service.VehicleService;
import com.web.util.Page;

@Controller
public class VehicleManagementController {
	@Autowired
	VehicleService vehicleService;
	@RequestMapping(value = "/viewVehicleManage.action")

	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="10")Integer rows, 
			 Model model,HttpSession session) {
		
		 
		 
		Page <Vehicle> vehicleList= vehicleService.viewList(page,rows,null);
		
		model.addAttribute("page", vehicleList);
		return "VehicleManagement";
		
	}
	@RequestMapping("/updateVehicle.action")

	public String update(Vehicle record, HttpSession session) {
		
		int rows = vehicleService.editVehicle(record);
		if(rows > 0){
			  return "redirect:viewVehicleManage.action";
		    }else{
		       return "error";
		    }
	  
		
	}
	@RequestMapping("/checkVehiclebyVehicleid.action")
	@ResponseBody
	public Vehicle checkVehiclebyVehicleid(int id, HttpSession session) {
		Vehicle vehicle=vehicleService.findByVehicleId(id);
		return vehicle;
	  
		
	}
	@RequestMapping("/checkVehiclebyDriverid.action")
	@ResponseBody
	public Vehicle checkVehiclebyDriverid(int id, HttpSession session) {
		Vehicle vehicle=vehicleService.findByDriverId(id);
		return vehicle;
		
	}
	@RequestMapping("/addVehicle.action")

	public String addDriver(Vehicle record, HttpSession session) {
		System.out.println(record.getVehicletype());
		
		int rows = vehicleService.addVehicle(record);
		if(rows > 0){
			  return "redirect:viewVehicleManage.action";
		    }
		else{
		       return "error";
		    }
	}
	/**
	 * 删除Vehicle
	 */
	@RequestMapping("/deleteVehicle.action")
	@ResponseBody
	public String delete(Integer id) {
		
	    int rows = vehicleService.deleteVehicle(id);
	  
	    if(rows > 0){			
	        return "OK";
	    }else{
	       return "FAIL";			
	   }
	}
}
