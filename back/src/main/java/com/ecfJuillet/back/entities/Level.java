package com.ecfJuillet.back.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "level")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int level_id;

    @Column(name = "difficultyNb")
    private int difficultyNb;

    @OneToMany(mappedBy = "level", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions;

}
