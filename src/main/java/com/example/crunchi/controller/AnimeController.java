package com.example.crunchi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.crunchi.entity.Anime;
import com.example.crunchi.service.AnimeService;

@RestController
@RequestMapping("/animes")
public class AnimeController {
	@Autowired
	private AnimeService animeServiceI;
	
	@GetMapping 
	@RequestMapping(value="listarAnimes",method = RequestMethod.GET)
	public ResponseEntity<?> listarAnimes(){
		List<Anime>animesListados=this.animeServiceI.listarAnimes();
		return ResponseEntity.ok(animesListados);
	}

}
