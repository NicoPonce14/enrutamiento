package com.nicolas.enrutamiento.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/{dojo}")
	public String dojo(@PathVariable("dojo") String dojo) {
		return "El "+dojo+ " es increible!";
	}
	
	@RequestMapping("{dojo}/{burbank}/{city}")
	public String sanjose(@PathVariable("dojo") String dojo,@PathVariable("burbank") String burbank,@PathVariable("city") String city) {
		return "El "+dojo+ " "+burbank +" está localizado al sur de "+city;
	}
	@RequestMapping("/{dojo}/{sanjose}")
	public String burbank(@PathVariable("dojo") String dojo,@PathVariable("sanjose") String sj) {
		return "El "+dojo+ " "+sj+" es el cuartel general";
	}
	
	
}
