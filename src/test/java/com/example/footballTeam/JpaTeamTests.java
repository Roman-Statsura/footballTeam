package com.example.footballTeam;

import static org.junit.jupiter.api.Assertions.*;
import com.example.footballTeam.model.Team;
import com.example.footballTeam.repository.specification.TeamSpecification;
import com.example.footballTeam.service.TeamService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@SpringBootTest
public class JpaTeamTests extends TestEnvironmentInit{

    @Autowired
    private TeamService teamService;

    @Test
    public void findAllTeamsTest(){
        var team = teamService.findById(2);
        assertEquals(team.getName(),"LIV");
    }
    @Test
    public void findAllTeamsWithBudget(){
        Specification<Team> spec = TeamSpecification.all()
                .and(TeamSpecification.withBudgetGreaterThen(200))
                .and(TeamSpecification.withName("TEST"));

        List<Team> teams = teamService.findAll(spec);
        assertEquals(teams.size(),2);
    }
}
