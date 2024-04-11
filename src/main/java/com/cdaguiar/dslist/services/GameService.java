package com.cdaguiar.dslist.services;

import com.cdaguiar.dslist.dto.GameMinDTO;
import com.cdaguiar.dslist.entities.Game;
import com.cdaguiar.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
