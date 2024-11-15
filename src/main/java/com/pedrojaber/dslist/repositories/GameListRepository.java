package com.pedrojaber.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrojaber.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
