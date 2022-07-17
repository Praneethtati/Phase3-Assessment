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
public class MountaineeringController {
@Autowired
  MountaineeringDAO dao;
Logger log=Logger.getAnonymousLogger();
@ResponseBody
@RequestMapping("MountaineeringInsert")
public void insert(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int msid=Integer.parseInt(req.getParameter("mshoeid"));
	String msname=req.getParameter("mshoename");
	String mssize=req.getParameter("mshoesize");
	String msprice=req.getParameter("mshoeprice");
	log.info("recieved Mountaineering shoeid,shoename shoesize and shoeprice from front end");
	
	Mountaineering m=new Mountaineering();
	log.info("pojo object created");
	m.setMshoeid(msid);
	log.info("Mountaineering Shoe id is set to the pojo");
	m.setMshoename(msname);
	log.info("Mountaineering Shoe name is set to the pojo");
	m.setMshoesize(mssize);
	log.info("Mountaineering shoe size is set to the pojo");
	m.setMshoeprice(msprice);
	log.info("Mountaineering shoe price is set to the pojo");
	Mountaineering mm=dao.insert(m);
	log.info("insert method called successfully");
	if(mm!=null) {
		log.info("sucessful Mountaineering Insertion");
		res.sendRedirect("MountaineeringDisplaybu.jsp");
	}
	
	
}

@RequestMapping("MountaineeringDisplay")
public ModelAndView getshoes(HttpServletRequest req,HttpServletResponse res) {
	log.info("in get all request");
	ModelAndView mv=new ModelAndView();
	log.info("created mv object");
	List<Mountaineering> list=dao.display();
	log.info("called Display method");
	mv.setViewName("MountaineeringDisplay.jsp");
	log.info("went to jsp");
	mv.addObject("list", list);
	log.info("sent a list to the jsp");
	return mv;
}

@RequestMapping("MountaineeringUpdate")
public void update(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int msid=Integer.parseInt(req.getParameter("mshoeid"));
	String msname=req.getParameter("mshoename");
	String mssize=req.getParameter("mshoesize");
	String msprice=req.getParameter("mshoeprice");
	log.info("recieved Mountaineering shoeid,shoename shoesize and shoeprice from front end");
	
	Mountaineering m=new Mountaineering();
	log.info("pojo object created");
	m.setMshoeid(msid);
	log.info("Mountaineering Shoe id is set to the pojo");
	m.setMshoename(msname);
	log.info("Mountaineering Shoe name is set to the pojo");
	m.setMshoesize(mssize);
	log.info("Mountaineering shoe size is set to the pojo");
	m.setMshoeprice(msprice);
	log.info("Mountaineering shoe price is set to the pojo");
	Mountaineering mm=dao.update(m);
	log.info("Update method called successfully");
	if(mm!=null) {
		log.info("sucessful Mountaineering updation");
		res.sendRedirect("MountaineeringDisplaybu.jsp");
	}
	
	
}
	
@RequestMapping("MountaineeringDelete")
public void delete(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int msid=Integer.parseInt(req.getParameter("mshoeid"));
	
	log.info("recieved Mountaineering Shoe Id from front end");
	
	Mountaineering m=new Mountaineering();
	log.info("pojo object created");
	m.setMshoeid(msid);
	log.info("Mountaineering Shoe id is set to the pojo");
    String sd=dao.deletebyId(msid);
	log.info("delete method called successfully");
	if(sd!=null) {
		log.info("sucessful Mountaineering deletion");
		res.sendRedirect("MountaineeringDisplaybu.jsp");
	}
	

}
}

