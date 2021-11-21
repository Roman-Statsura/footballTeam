package com.example.footballTeam.repository;

import com.example.footballTeam.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>, JpaSpecificationExecutor<Player> {
}
