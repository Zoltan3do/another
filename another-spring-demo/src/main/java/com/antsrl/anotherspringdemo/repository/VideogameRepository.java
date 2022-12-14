package com.antsrl.anotherspringdemo.repository;

import com.antsrl.anotherspringdemo.model.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {
}
