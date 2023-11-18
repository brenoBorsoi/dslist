package com.dslistjavaspring.dslist.services;

import com.dslistjavaspring.dslist.dto.GameDTO;
import com.dslistjavaspring.dslist.dto.GameListDTO;
import com.dslistjavaspring.dslist.dto.GameMinDTO;
import com.dslistjavaspring.dslist.entities.Game;
import com.dslistjavaspring.dslist.entities.GameList;
import com.dslistjavaspring.dslist.repositories.GameListRepository;
import com.dslistjavaspring.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepository.findAll();
       return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
