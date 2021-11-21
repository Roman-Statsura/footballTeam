package com.example.footballTeam.model;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "teams")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "budget", nullable = false)
    private Integer budget;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "company",
//            joinColumns = @JoinColumn(name = "company_id"),
//            inverseJoinColumns = @JoinColumn(name = "team_id"))
//    private Set<Company> sponsors;

    @OneToMany(mappedBy = "team")
    private List<Player> players;
}
