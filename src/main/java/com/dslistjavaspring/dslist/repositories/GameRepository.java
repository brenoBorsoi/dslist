package com.dslistjavaspring.dslist.repositories;

import com.dslistjavaspring.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
