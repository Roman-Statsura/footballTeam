package com.example.footballTeam.service;

import com.example.footballTeam.model.Team;
import com.example.footballTeam.repository.TeamRepository;
import com.example.footballTeam.repository.specification.TeamSpecification;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
    public Team findById(Integer id){
        return teamRepository
                .findById(id).orElseThrow(()-> new IllegalArgumentException("Cannot find team by ID - " + id));
    }
    public List<Team> findAllWithName(String name){
        return teamRepository
                .findAll(TeamSpecification.withName(name));
    }
    public List<Team> findAll(Specification<Team> spec){
        return teamRepository
                .findAll(spec);
    }
}
