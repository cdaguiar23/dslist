package com.cdaguiar.dslist.repositories;

import com.cdaguiar.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
