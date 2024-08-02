package com.ecfJuillet.back.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "progression")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Progression {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int progression_id;

    @Column(name = "score")
    private String firstname;

    @Column(name = "current_level")
    private String currentLevel;

}
