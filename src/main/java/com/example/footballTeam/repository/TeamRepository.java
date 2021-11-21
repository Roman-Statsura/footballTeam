package com.example.footballTeam.repository;

import com.example.footballTeam.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team,Integer>, JpaSpecificationExecutor<Team> {
}
