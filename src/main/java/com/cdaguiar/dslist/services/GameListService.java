package com.cdaguiar.dslist.services;

import com.cdaguiar.dslist.dto.GameListDTO;
import com.cdaguiar.dslist.dto.GameMinDTO;
import com.cdaguiar.dslist.entities.GameList;
import com.cdaguiar.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
