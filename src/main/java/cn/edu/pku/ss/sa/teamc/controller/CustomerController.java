package cn.edu.pku.ss.sa.teamc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.edu.pku.ss.sa.teamc.dao.model.TCustomer;
import cn.edu.pku.ss.sa.teamc.service.TCustomerService;

/**
 * 
 * @author xuyuanming
 *
 * 2016年4月25日下午6:24:17
 */
@Controller
@RequestMapping("/customer")
@SessionAttributes("customer") //将Model中属性名为user的属性
public class CustomerController {
	
	@Resource
	TCustomerService dao;
	
	@RequestMapping(value = "/add") //  method = RequestMethod.POST
	public String login(String name, String phone, String address, Model model){
		
		
		try {
			TCustomer t = dao.addCustomer(name, phone, address);
			model.addAttribute("customer", t);
			return "customer/addok";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("e",e);
			return "exception";
		}
	}
	
}
