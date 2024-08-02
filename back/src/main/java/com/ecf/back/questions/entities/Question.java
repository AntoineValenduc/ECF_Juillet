package com.ecf.back.questions.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "question")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Question {
}
