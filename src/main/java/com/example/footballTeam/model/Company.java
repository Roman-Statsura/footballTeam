package com.example.footballTeam.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "company")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

//    @ManyToMany(mappedBy = "sponsors", fetch = FetchType.EAGER)
//    private Set<Team> teams;
}
