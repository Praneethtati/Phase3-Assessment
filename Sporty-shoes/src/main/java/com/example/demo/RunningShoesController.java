package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RunningShoesController {
@Autowired
	RunningShoesDAO dao;
Logger log=Logger.getAnonymousLogger();

@RequestMapping("RunInsert")
public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
	int shoeid=Integer.parseInt(req.getParameter("shoeid"));
	String shoename=req.getParameter("shoename");
	String shoesize=req.getParameter("shoesize");
	String shoeprice=req.getParameter("shoeprice");
	log.info("recieved shoeid,shoename,shoesize and shoeprice from front end");
	ModelAndView mv=new ModelAndView();
	log.info("ModelAndView object created");
	RunningShoesPOJO ru=new RunningShoesPOJO();
	log.info("pojo object created");
	ru.setShoeid(shoeid);
	log.info("Shoe id is set to the pojo");
	ru.setShoename(shoename);
	log.info("Shoe name is set to the pojo");
	ru.setShoesize(shoesize);
	log.info("Shoe size is set to the pojo");
	ru.setShoeprice(shoeprice);
	log.info("Shoe price is set to the pojo");
	RunningShoesPOJO rr=dao.insert(ru);
	log.info("insert method called successfully");
	if(rr!=null) {
		log.info("sucessful running shoe insertion");
	    mv.setViewName("RunningShoesDisplaybu.jsp");
	}
	return mv;
	
	}

@RequestMapping("RunDisplay")
public ModelAndView getRshoes(HttpServletRequest req,HttpServletResponse res) {
	log.info("in get all request");
	ModelAndView mv=new ModelAndView();
	log.info("ModelAndView object created");
	List<RunningShoesPOJO> list=dao.display();
	log.info("called Display method");
	mv.setViewName("RunningShoesDisplay.jsp");
	log.info("went to jsp");
	mv.addObject("list", list);
	log.info("sent a list to the jsp");
	return mv;
	
}

@RequestMapping("RunUpdate")
public ModelAndView update(HttpServletRequest req,HttpServletResponse res) {
	int shoeid=Integer.parseInt(req.getParameter("shoeid"));
	String shoename=req.getParameter("shoename");
	String shoesize=req.getParameter("shoesize");
	String shoeprice=req.getParameter("shoeprice");
	log.info("recieved new shoename,shoesize and shoeprice from front end");
	ModelAndView mv=new ModelAndView();
	log.info("ModelAndView object created");
	RunningShoesPOJO ru=new RunningShoesPOJO();
	log.info("pojo object created");
	ru.setShoeid(shoeid);
	log.info("Shoe id is set to the pojo");
	ru.setShoename(shoename);
	log.info("Shoe name is set to the pojo");
	ru.setShoesize(shoesize);
	log.info("Shoe size is set to the pojo");
	ru.setShoeprice(shoeprice);
	log.info("Shoe price is set to the pojo");
	RunningShoesPOJO rr=dao.update(ru);
	log.info("update method called successfully");
	if(rr!=null) {
		log.info("sucessful running shoe updation");
		mv.setViewName("RunningShoesDisplaybu.jsp");
	}
	return mv;
	
}
	
@RequestMapping("RunDelete")
public ModelAndView delete(HttpServletRequest req,HttpServletResponse res) {
	int shoeid=Integer.parseInt(req.getParameter("shoeid"));
	
	log.info("recieved shoeid from front end");
	ModelAndView mv=new ModelAndView();
	
	log.info("ModelAndView object created");
	RunningShoesPOJO ru=new RunningShoesPOJO();
	log.info("pojo object created");
    ru.setShoeid(shoeid);
    log.info("Shoe id is set to the pojo");
    String rr=dao.deleteById(shoeid);
	log.info("delete method called successfully");
	if(rr!=null) {
		log.info("sucessful running shoe deletion");
		 mv.setViewName("RunningShoesDisplaybu.jsp");
	}
	return mv;
}
	
     @RequestMapping("adtocart")
      public ModelAndView adtoCart(HttpServletRequest req,HttpServletResponse res)
      {
    int shoeid=Integer.parseInt(req.getParameter("shoeid"));
	ModelAndView mv = new ModelAndView();
	int cartId = Integer.valueOf(shoeid);
	RunningShoesPOJO runningShoes = dao.findbyid(cartId);
	HttpSession session = req.getSession();
	session.setAttribute("runningShoes", runningShoes);
	mv.addObject(runningShoes);
	mv.setViewName("acart.jsp");
	
	return mv;
}
}

