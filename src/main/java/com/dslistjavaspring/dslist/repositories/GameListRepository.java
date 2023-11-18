package com.dslistjavaspring.dslist.repositories;

import com.dslistjavaspring.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
