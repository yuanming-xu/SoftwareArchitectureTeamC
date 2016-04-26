package cn.edu.pku.ss.sa.teamc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.edu.pku.ss.sa.teamc.dao.model.TUser;
import cn.edu.pku.ss.sa.teamc.service.TUserService;

/**
 * 
 * @author xuyuanming
 *
 * 2016年4月25日下午6:24:17
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user") //将Model中属性名为user的属性
public class UserController {
	
	@Resource
	TUserService dao;
	
	@RequestMapping(value = "/login") //  method = RequestMethod.POST
	public String login(String username, String password, Model model){
		
		try {
			TUser t = dao.getUserByNameAndPassword(username, password);
			if(null != t){
				model.addAttribute("user", t);
				return "user/loginok";
			}else{
				
				return "user/loginerr";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("e",e);
			return "exception";
		}
	}
	
}
