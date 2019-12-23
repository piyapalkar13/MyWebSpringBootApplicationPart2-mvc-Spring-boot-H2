package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@RestController
public class AlienControlletr {

	//inject or create obj of AlienRepo
	@Autowired
	AlienRepo repo;
	
	//1.To get home.jsp page
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	//2.To save or insert data into h2 db
	@RequestMapping("/addAlien")
	@PostMapping
	public Alien addAlien(Alien alien)
	{
		repo.save(alien);
		
		return alien;
	}
	
	
	//3.get all aliens
	@RequestMapping(path="/aliens")
	@GetMapping
	public List<Alien> getAliens()
	{
		return repo.findAll();
	}
	
	//4.get particular record on the basis of id
	@RequestMapping("/alien/{aid}")
	@GetMapping
	public Optional<Alien> getAlien(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
	}

	//5. delete particular record on the basis of id
	@DeleteMapping
	@RequestMapping("/alien/delete/{id}")
	public String deleteAlien(@PathVariable int id)
	{
		Alien a=repo.getOne(id);
		
		repo.delete(a);
	    return "deleted";
	}
	
	//6.update record
	@PutMapping(path="/aliens" ,consumes= {"application/json"})
	public Alien updateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	/* 	 	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView();

		Alien alien=repo.findById(aid).orElse(new Alien());
		mv.setViewName("showAlien.jsp");
		mv.addObject(alien);

		
		return mv;
		
	}*/
}
