package com.cdaguiar.dslist.repositories;

import com.cdaguiar.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
