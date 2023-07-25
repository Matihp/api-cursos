package com.example.crunchi.implement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crunchi.entity.Anime;
import com.example.crunchi.repository.AnimeRepository;
import com.example.crunchi.service.AnimeService;

@Service
public class AnimeServiceImpl implements AnimeService {
	
	@Autowired
	private AnimeRepository animeRepository;

	@Override
	public List<Anime> listarAnimes() {
		// TODO Auto-generated method stub
		List<Anime> animeDataSource = StreamSupport.stream(this.animeRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return animeDataSource;
	}

}
