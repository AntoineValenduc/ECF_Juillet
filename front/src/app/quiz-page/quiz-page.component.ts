import { Component } from '@angular/core';

@Component({
  selector: 'app-quiz-page',
  templateUrl: './quiz-page.component.html',
  styleUrl: './quiz-page.component.scss'
})
export class QuizPageComponent {

  constructor() {
    this.loadQuestionsForLevel();
  }

  loadQuestionsForLevel() {
    this.questions = this.levels[this.currentLevel];
    this.currentQuestionIndex = 0;
    this.score = 0;
  }

  selectAnswer(answer: string) {
    if (this.selectedAnswer === null) {
      this.selectedAnswer = answer;
      const correctAnswer = this.questions[this.currentQuestionIndex].correctAnswer;
      if (answer === correctAnswer) {
        this.score++;
      } else {
        this.score--;
      }
    }
  }

  nextQuestion() {
    if (this.selectedAnswer !== null) {
      this.selectedAnswer = null;
      this.currentQuestionIndex++;
      if (this.currentQuestionIndex >= this.questions.length) {
        this.checkLevelProgress();
      }
    }
  }

  checkLevelProgress() {
    if (this.score >= 8) {
      if (this.currentLevel < this.levels.length - 1) {
        this.currentLevel++;
        alert('Félicitations ! Vous passez au niveau suivant.');
      } else {
        alert('Félicitations ! Vous avez terminé tous les niveaux.');
      }
    } else {
      if (this.currentLevel > 0) {
        this.currentLevel--;
        alert('Désolé, vous passez au niveau précédent.');
      } else {
        alert('Vous êtes déjà au niveau 0.');
      }
    }
    this.loadQuestionsForLevel();
  }

}
