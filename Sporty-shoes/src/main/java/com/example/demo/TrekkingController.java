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
public class TrekkingController {
@Autowired
  TrekkingDAO dao;
Logger log=Logger.getAnonymousLogger();
@ResponseBody
@RequestMapping("TrekkingInsert")
public void insert(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int tsid=Integer.parseInt(req.getParameter("tshoeid"));
	String tsname=req.getParameter("tshoename");
	String tssize=req.getParameter("tsize");
	String tsprice=req.getParameter("tshoeprice");
	log.info("recieved trekking shoeid,shoename shoesize and shoeprice from front end");
	
	Trekking t=new Trekking();
	log.info("pojo object created");
	t.setTshoeid(tsid);
	log.info("Trekking Shoe id is set to the pojo");
	t.setTshoename(tsname);
	log.info("Trekking Shoe name is set to the pojo");
	t.setTshoesize(tssize);
	log.info("Trekking shoe size is set to the pojo");
	t.setTshoeprice(tsprice);
	log.info("Trekking shoe price is set to the pojo");
	Trekking tr=dao.insert(t);
	log.info("insert method called successfully");
	if(tr!=null) {
		log.info("sucessful student insertion");
		res.sendRedirect("TrekkingDisplaybu.jsp");
	}
	
	
}

@RequestMapping("TrekkingDisplay")
public ModelAndView getstudents(HttpServletRequest req,HttpServletResponse res) {
	log.info("in get all request");
	ModelAndView mv=new ModelAndView();
	log.info("created mv object");
	List<Trekking> list=dao.display();
	log.info("called getall method");
	mv.setViewName("TrekkingDisplay.jsp");
	log.info("went to jsp");
	mv.addObject("list", list);
	log.info("sent a list to the jsp");
	return mv;
}

@RequestMapping("TrekkingUpdate")
public void update(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int tsid=Integer.parseInt(req.getParameter("tshoeid"));
	String tsname=req.getParameter("tshoename");
	String tssize=req.getParameter("tsize");
	String tsprice=req.getParameter("tshoeprice");
	log.info("recieved trekking shoeid,shoename shoesize and shoeprice from front end");
	
	Trekking t=new Trekking();
	log.info("pojo object created");
	t.setTshoeid(tsid);
	log.info("Trekking Shoe id is set to the pojo");
	t.setTshoename(tsname);
	log.info("Trekking Shoe name is set to the pojo");
	t.setTshoesize(tssize);
	log.info("Trekking shoe size is set to the pojo");
	t.setTshoeprice(tsprice);
	log.info("Trekking shoe price is set to the pojo");
	Trekking tr=dao.update(t);
	log.info("update method called successfully");
	if(tr!=null) {
		log.info("sucessful student updatiom");
		res.sendRedirect("TrekkingDisplaybu.jsp");
	}

	
	
}

@RequestMapping("TrekkingDelete")
public void delete(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int tsid=Integer.parseInt(req.getParameter("tshoeid"));
	
	log.info("recieved trekking Shoe Id from front end");
	
	Trekking t=new Trekking();
	log.info("pojo object created");
    t.setTshoeid(tsid);
    log.info("Trekking Shoe ID is set to the pojo");
    String tt=dao.deleteByid(tsid);
	log.info("delete method called successfully");
	if(tt!=null) {
		log.info("sucessful trekking shoe deletion");
		res.sendRedirect("TrekkingDisplaybu.jsp");
	}
	
	
}
}