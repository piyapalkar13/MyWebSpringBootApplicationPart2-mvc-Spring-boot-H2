package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;


@Controller
public class AlienControlletr {

	//inject or create obj of AlienRepo
	@Autowired
	AlienRepo repo;
	
	//To get home.jsp page
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	//To save or insert data into h2 db
	@RequestMapping("/addAlien")
	public String saveAlien(Alien alien)
	{
		repo.save(alien);
		
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView();

		Alien alien=repo.findById(aid).orElse(new Alien());
		mv.setViewName("showAlien.jsp");
		mv.addObject(alien);

		System.out.println(repo.findByTech("java"));
		System.out.println(repo.findByAidGreaterThan(102));
		System.out.println(repo.findByTechSorted("java"));
		return mv;
		
		
	}
	
}
