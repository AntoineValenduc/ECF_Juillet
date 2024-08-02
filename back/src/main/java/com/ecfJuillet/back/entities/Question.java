package com.ecfJuillet.back.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "question")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int question_id;

    @Column(name = "entitled")
    private String entitled;

    @Column(name = "answer")
    private String answer;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
}
