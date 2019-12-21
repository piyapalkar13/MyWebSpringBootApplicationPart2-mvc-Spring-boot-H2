package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;


@Controller
public class AlienControlletr {

	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String saveAlien(Alien alien)
	{
		repo.save(alien);
		
		return "home.jsp";
	}
	
}
