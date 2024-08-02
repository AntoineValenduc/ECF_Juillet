import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../environments/environment'; // Assurez-vous d'avoir un fichier d'environnement

// Interface Level correspondant à l'entité Level du backend
export interface Level {
  level_id: number;
  difficultyNb: number;
  questions: Question[];
}

export interface Question {
  // Définissez les propriétés de Question en fonction de votre entité Question
  id: number;
  questionText: string;
  options: string[];
  correctAnswer: string;
}

@Injectable({
  providedIn: 'root'
})
export class LevelService {
  private apiUrl = `${environment.apiBaseUrl}/api/levels`; // Assurez-vous que l'URL de l'API est correcte

  constructor(private http: HttpClient) { }

  // Méthode pour obtenir tous les niveaux
  getAllLevels(): Observable<Level[]> {
    return this.http.get<Level[]>(this.apiUrl);
  }

  // Méthode pour obtenir un niveau par ID
  getLevelById(id: number): Observable<Level> {
    return this.http.get<Level>(`${this.apiUrl}/${id}`);
  }

  // Méthode pour ajouter ou mettre à jour un niveau
  saveLevel(level: Level): Observable<Level> {
    return this.http.post<Level>(this.apiUrl, level, this.getHttpOptions());
  }

  // Méthode pour supprimer un niveau par ID
  deleteLevel(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }

  // Méthode pour obtenir les questions d'un niveau spécifique
  getQuestionsByLevelId(levelId: number): Observable<Question[]> {
    return this.http.get<Question[]>(`${this.apiUrl}/${levelId}/questions`);
  }

  // Optionnel : vous pouvez définir les options HTTP par défaut ici
  private getHttpOptions() {
    return {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
  }
}
