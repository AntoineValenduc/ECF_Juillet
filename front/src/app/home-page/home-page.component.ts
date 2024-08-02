import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrl: './home-page.component.scss'
})
export class HomePageComponent {
  /**
   * Affichage du formulaire de création (True)
   * ou du formulaire de création de profil (False)
   */
  isCreatingProfile = false;

  constructor() {}

  /**
   * Formulaire connexion de profil (recherche user existant bdd)
   * @param form
   */
  onSubmit(form: NgForm) {
    if (form.valid) {
      const firstName = form.value.firstName;
      const lastName = form.value.lastName;
      console.log(`Connexion avec Prénom: ${firstName}, Nom: ${lastName}`);
    } else {
      console.log('Formulaire de connexion invalide');
    }
  }

  /**
   * Formulaire création de profil (création nouveau user bdd)
   * @param form
   */
  onCreateProfile(form: NgForm) {
    if (form.valid) {
      const newFirstName = form.value.newFirstName;
      const newLastName = form.value.newLastName;
      console.log(`Création de profil avec Prénom: ${newFirstName}, Nom: ${newLastName}`);
      this.toggleCreateProfile(); // Fermer le formulaire après création
    } else {
      console.log('Formulaire de création de profil invalide');
    }
  }

  toggleCreateProfile() {
    this.isCreatingProfile = !this.isCreatingProfile;
  }
}
