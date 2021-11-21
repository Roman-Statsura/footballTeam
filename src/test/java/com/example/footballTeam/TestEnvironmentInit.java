package com.example.footballTeam;

import com.example.footballTeam.model.Player;
import com.example.footballTeam.model.Team;
import com.example.footballTeam.repository.CompanyRepository;
import com.example.footballTeam.repository.PlayerRepository;
import com.example.footballTeam.repository.TeamRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

abstract class TestEnvironmentInit {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    PlayerRepository playerRepository;

    @BeforeAll
    static void beforeAll(@Autowired TeamRepository teamRepository,
                          @Autowired PlayerRepository playerRepository,
                          @Autowired CompanyRepository companyRepository){

        Player player1 =playerRepository.save(Player.builder().id(1).fullName("Ronaldo").number(7).build());
        Player player2 =playerRepository.save(Player.builder().id(1).fullName("Messi").number(10).build());
        Player player3 =playerRepository.save(Player.builder().id(1).fullName("Oleg").number(90).build());
        Player player4 =playerRepository.save(Player.builder().id(1).fullName("Ivan").number(60).build());

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        Team team1 = teamRepository.save(new Team(1,"MU",300,players));

        Team team2 = teamRepository.save(new Team(2,"LIV",50,players));

        Team team3 = teamRepository.save(new Team(3,"MC",700,players));

        Team team4 = teamRepository.save(new Team(4,"TEST",800,players));

        Team team5 = teamRepository.save(new Team(5,"TEST",1000,players));


        printTitle("Data - Generated");
    }
    @AfterAll
    public static void afterAll(@Autowired TeamRepository teamRepository,
                                @Autowired PlayerRepository playerRepository,
                                @Autowired CompanyRepository companyRepository){
        teamRepository.deleteAll();
    }

    public static void printTitle(String s) {
        System.out.println("\n==========================");
        System.out.println(s);
        System.out.println("==========================");
    }
}
