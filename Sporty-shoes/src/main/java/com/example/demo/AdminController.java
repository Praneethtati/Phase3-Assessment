package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AdminController {
	@Autowired
	AdminDAO dao;
	
	Logger log=Logger.getAnonymousLogger();
	
	@RequestMapping("AdRegister")
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
		
		log.info("In to the admin register mapping");
	    int aid=Integer.parseInt(req.getParameter("adid"));
	    String aname=req.getParameter("adname");
	    String apassword=req.getParameter("adpassword");
	    log.info("recieved adminid,adminname and adminpassword from front end");
	    ModelAndView mv=new ModelAndView();
	    log.info("ModelAndView object created");
	    Admin ad=new Admin();
	    log.info("Admin object created");
	    ad.setAdmid(aid);
	    log.info("Admin id is set to the pojo");
	    ad.setAdmname(aname);
	    log.info("Admin name is set to the pojo");
	    ad.setAdmpassword(apassword);
	    log.info("Admin password is set to the pojo");
	    
	    Admin aa=dao.insert(ad);
	    log.info("DAO Insert method is called successfully");
	    if(aa!=null)
	    {
	    	log.info("sucessful Admin insertion");
		    mv.setViewName("AdDisplaybu.jsp");
	    }
	    return mv;
	}
	
	
	@RequestMapping("AdUpdate")
	public ModelAndView update(HttpServletRequest req,HttpServletResponse res) {
		
		log.info("In to the admin update mapping");
	    int aid=Integer.parseInt(req.getParameter("adid"));
	    String aname=req.getParameter("adname");
	    String apassword=req.getParameter("adpassword");
	    log.info("recieved adminid,adminname and adminpassword from front end");
	    ModelAndView mv=new ModelAndView();
	    log.info("ModelAndView object created");
	    Admin ad=new Admin();
	    log.info("Admin object created");
	    ad.setAdmid(aid);
	    log.info("Admin id is set to the pojo");
	    ad.setAdmname(aname);
	    log.info("Admin name is set to the pojo");
	    ad.setAdmpassword(apassword);
	    log.info("Admin password is set to the pojo");
	    
	    Admin aa=dao.update(ad);
	    log.info("DAO update method is called successfully");
	    if(aa!=null)
	    {
	    	log.info("sucessful Admin updation");
		    mv.setViewName("AdDisplaybu.jsp");
	    }
	    return mv;
	}
	
	
	@RequestMapping("AdDelete")
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse res) {
		
		log.info("In to the admin delete mapping");
	    int aid=Integer.parseInt(req.getParameter("adid"));

	    log.info("recieved adminid from front end");
	    ModelAndView mv=new ModelAndView();
	    log.info("ModelAndView object created");
	    Admin ad=new Admin();
	    log.info("Admin object created");
	    ad.setAdmid(aid);
	    log.info("Admin id is set to the pojo");
	   
	    
	    String aa=dao.deletebyid(aid);
	    log.info("DAO delete method is called successfully");
	    if(aa!=null)
	    {
	    	log.info("sucessful Admin deletion");
		    mv.setViewName("AdDisplaybu.jsp");
	    }
	    return mv;
	}
	
	@RequestMapping("AdDisplay")
	public ModelAndView getRshoes(HttpServletRequest req,HttpServletResponse res) {
		log.info("in admin display request");
		ModelAndView mv=new ModelAndView();
		log.info("ModelAndView object created");
		List<Admin> list=dao.retrieve();
		log.info("called Display method");
		mv.setViewName("AdDisplay.jsp");
		log.info("went to jsp");
		mv.addObject("list", list);
		log.info("sent a list to the jsp");
		return mv;
		
	}
	
	

}
