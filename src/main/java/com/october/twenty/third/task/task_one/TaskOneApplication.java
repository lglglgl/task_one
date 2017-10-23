package com.october.twenty.third.task.task_one;

import com.october.twenty.third.task.entity.UserBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
//@RequestMapping("/")
public class TaskOneApplication {
	static List<UserBean> list =new ArrayList<UserBean>();
	public static void main(String[] args) {
		SpringApplication.run(TaskOneApplication.class, args);
	}

	@RequestMapping("enter")
	public ModelAndView login(ModelAndView modelandview){
		String failure="laogao";
		modelandview.addObject("failure",failure);
		modelandview.setViewName("login");
		return modelandview;
	}
	@RequestMapping("login")
	@ResponseBody
	public ModelAndView echo(String useraccount,String password,ModelAndView modelandview){


		if(useraccount.equals("")||password.equals("")){

			System.out.println(useraccount+"  "+password);
			if(list.size()==0){
				modelandview.setViewName("login");
				String failure="failure";
				modelandview.addObject("failure",failure);
				return modelandview;
			}
			modelandview.addObject("list",list);
			modelandview.setViewName("echotwo");
			return modelandview;
		}
		for (int i = 0; i <list.size() ; i++) {
			if(useraccount.equals(list.get(i).getAccount())&&password.equals(list.get(0).getPassword())){
				modelandview.addObject("user",list.get(i));
				modelandview.setViewName("echoone");
				return modelandview;
			}
		}
		modelandview.setViewName("login");
		String failure="failure";
		modelandview.addObject("failure",failure);
		return modelandview;
	}

	@RequestMapping("register")
	@ResponseBody
	public ModelAndView register(ModelAndView modelandview){
		modelandview.setViewName("register");
		return modelandview;
	}
	@RequestMapping("userregister")
	@ResponseBody
	public ModelAndView userregister(UserBean ub,ModelAndView modelandview){
		System.out.println(ub);
		list.add(ub);
		String failure="laogao";
		modelandview.addObject("failure",failure);
		modelandview.setViewName("login");
		return modelandview;
	}


}
