package com.example.crunchi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.crunchi.entity.Anime;

public interface AnimeRepository extends CrudRepository<Anime, Long> {

}
