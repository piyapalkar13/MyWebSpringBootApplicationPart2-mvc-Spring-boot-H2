package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> 
{
	/*
	 * List<Alien> findByTech(String tech); List<Alien> findByAidGreaterThan(int
	 * aid);
	 * 
	 * @Query("from Alien where tech=?1 order by aname") List<Alien>
	 * findByTechSorted(String tech);
	 */
}
