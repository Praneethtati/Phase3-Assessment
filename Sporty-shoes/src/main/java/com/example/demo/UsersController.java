package com.example.demo;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UsersController {

	@Autowired
	UsersDAO dao;
	
	Logger log=Logger.getAnonymousLogger();
	@ResponseBody
	@RequestMapping("/Login")
	public void login(HttpServletRequest req,HttpServletResponse res,@RequestParam("username") String username,@RequestParam("password") String password) throws IOException
	{
		log.info("Inside the request mapping of Login");
		log.info("object from user"+dao.findbyuser(username));
		log.info("object from password"+dao.findbypassword(password));
		
		if(dao.findbyuser(username).equals(dao.findbypassword(password))){
			
			res.sendRedirect("Home.jsp");
			//return "Login Successful";
		}
		else {
			log.info("failed");
			res.sendRedirect("LoginFail.jsp");
			
		//return "login failed ! check the credentials or register first";
		}
				
	}
	
	@ResponseBody
	@RequestMapping("Register")
	public void register(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		log.info("In to the register mapping");
	    int userid=Integer.parseInt(req.getParameter("userid"));
	    String username=req.getParameter("username");
	    String password=req.getParameter("password");
	    log.info("data set");
	    Users users=new Users();
		users.setUserid(userid);
		users.setUsername(username);
		users.setPassword(password);
		log.info("Values set");
		log.info(users.getUserid()+"  "+users.getUsername()+"  "+users.getPassword());
	    Users uu1=dao.insert(users);
	   
		if(uu1!=null)
		{
			res.sendRedirect("RegisterSuccess.jsp");
		}
		//return "Registration is successful";
		else {
			res.sendRedirect("RegisterFail.jsp");
		}
		
	}
	
	
	@RequestMapping("UserUpdate")
	public ModelAndView update(HttpServletRequest req,HttpServletResponse res)
	{
		int userid=Integer.parseInt(req.getParameter("userid"));
	    String username=req.getParameter("username");
	    String password=req.getParameter("password");
		log.info("recieved Userid, Username, Password from front end");
	    ModelAndView mv=new ModelAndView();
	    log.info("Model and View object created");
	    Users u1=new Users();
	    log.info("Users object created");
	    u1.setUserid(userid);
	    log.info("User Id is set to the Users object");
	    u1.setUsername(username);
	    log.info("User Name is set to the Users object");
	    u1.setPassword(password);
	    log.info("Password is set to the Users object");
	    Users uu=dao.update(u1);
	    log.info("update method called successfully");
	    if(uu!=null)
	    {
	    	mv.setViewName("UsersDisplaybu.jsp");
	    }
	    return mv;
	}

	
	@RequestMapping("UserDelete")
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse res) {
		int userid=Integer.parseInt(req.getParameter("userid"));
		log.info("recieved Userid from front end");
		ModelAndView mv=new ModelAndView();
		log.info("Model and View object created");
		Users u1=new Users();
		log.info("Users object created");
		u1.setUserid(userid);
		log.info("User Id is set to the Users object");
		String uu=dao.deletebyid(userid);
		
		if(uu!=null)
		{
			mv.setViewName("UsersDisplaybu.jsp");
		}
		return mv;
	}
	
	@RequestMapping("getall")
	public ModelAndView getstudents(HttpServletRequest req,HttpServletResponse res) {
		log.info("in get all request");
		ModelAndView mv=new ModelAndView();
		log.info("created mv object");
		List<Users> list=dao.getall();
		log.info("called getall method");
		mv.setViewName("UsersDisplay.jsp");
		log.info("went to jsp");
		mv.addObject("list",list);

		log.info("sent a list to the jsp");
		return mv;
	}
	
	@RequestMapping("logout")
	public void logout(HttpServletRequest req,HttpServletResponse res) throws IOException {
		HttpSession session=req.getSession();
		if(session !=null) {
			session.invalidate();
		}
		res.sendRedirect("LogoutSuccess.jsp");
	}
}
