package com.pedrojaber.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrojaber.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
