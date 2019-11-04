package com.sasi.spring.moviecatlog.controller;

import java.util.List;
import java.util.Collections;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.spring.moviecatlog.catlogItem.CatlogItem;

@RestController
@RequestMapping("/Catlog")
public class MovieCatlogController {
	
	@RequestMapping("/{userid}")
	public List<CatlogItem> getCatlog(@PathVariable("userid") String userid){
		
		return Collections.singletonList(new CatlogItem("roja", "Love", 5 ) );
	}

}
