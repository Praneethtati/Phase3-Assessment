package com.example.demo;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GymShoesController {
@Autowired
  GymShoesDAO dao;
Logger log=Logger.getAnonymousLogger();
@ResponseBody
@RequestMapping("GymInsert")
public void insert(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int gsid=Integer.parseInt(req.getParameter("gshoeid"));
	String gsname=req.getParameter("gshoename");
	String gssize=req.getParameter("gshoesize");
	String gsprice=req.getParameter("gshoeprice");
	log.info("recieved Gym shoeid,shoename shoesize and shoeprice from front end");
	
	GymShoesPOJO g=new  GymShoesPOJO();
	log.info("pojo object created");
	g.setGshoeid(gsid);
	log.info("Gym Shoe id is set to the pojo");
	g.setGshoename(gsname);
	log.info("Gym Shoe name is set to the pojo");
	g.setGshoesize(gssize);
	log.info("Gym shoe size is set to the pojo");
	g.setGshoeprice(gsprice);
	log.info("Gym shoe price is set to the pojo");
	GymShoesPOJO gy=dao.insert(g);
	log.info("insert method called successfully");
	if(gy!=null) {
		log.info("sucessful student insertion");
		res.sendRedirect("GymShoesDisplaybu.jsp");
	}
	
	
}

@RequestMapping("GymDisplay")
public ModelAndView getstudents(HttpServletRequest req,HttpServletResponse res) {
	log.info("in get all request");
	ModelAndView mv=new ModelAndView();
	log.info("created mv object");
	List<GymShoesPOJO> list=dao.getall();
	log.info("called getall method");
	mv.setViewName("GymShoesDisplay.jsp");
	log.info("went to jsp");
	mv.addObject("list", list);
	log.info("sent a list to the jsp");
	return mv;
}

@RequestMapping("GymUpdate")
public void update(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int gsid=Integer.parseInt(req.getParameter("gshoeid"));
	String gsname=req.getParameter("gshoename");
	String gssize=req.getParameter("gshoesize");
	String gsprice=req.getParameter("gshoeprice");
	log.info("recieved name and email from front end");
	
	GymShoesPOJO gy=new GymShoesPOJO();
	log.info("pojo object created");
	gy.setGshoeid(gsid);
	log.info("Gym Shoe ID is set to the pojo");
	gy.setGshoename(gsname);
	log.info("Gym Shoe Name is set to the pojo");
	gy.setGshoesize(gssize);
	log.info("Gym Shoe Size is set to the pojo");
	gy.setGshoeprice(gsprice);
	log.info("Gym Shoe price is set to the pojo");
	GymShoesPOJO gg=dao.update(gy);
	log.info("update method called successfully");
	if(gg!=null) {
		log.info("sucessful student updation");
		res.sendRedirect("GymShoesDisplaybu.jsp");
	}
	
	
}
	
@RequestMapping("GymDelete")
public void delete(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int gsid=Integer.parseInt(req.getParameter("gshoeid"));
	
	log.info("recieved Gym Shoe Id from front end");
	
	GymShoesPOJO gy=new GymShoesPOJO();
	log.info("pojo object created");
    gy.setGshoeid(gsid);
    log.info("Gym Shoe ID is set to the pojo");
    String sd=dao.deleteByid(gsid);
	log.info("delete method called successfully");
	if(sd!=null) {
		log.info("sucessful student deletion");
		res.sendRedirect("GymShoesDisplaybu.jsp");
	}
	
	
}
}
