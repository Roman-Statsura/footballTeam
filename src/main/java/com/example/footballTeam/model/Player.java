package com.example.footballTeam.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "players")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "number", nullable = false)
    private Integer number;

    @ManyToOne()
    @JoinColumn(name = "team_id")
    private Team team;
}
