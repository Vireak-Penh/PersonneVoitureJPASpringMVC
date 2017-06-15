package fr.formation.PersonneVoitureJPA.service;

import java.util.List;

import fr.formation.PersonneVoitureJPA.metier.Personne;
import fr.formation.PersonneVoitureJPA.metier.Voiture;

public interface IGestionVoiture {

	// la signature de la méthode : int, (choix arbitraire) afin d'avoir un
	// retour, exemple 0 incorrect, 1 correct.
	public int ajouterVoiture(Voiture v, Personne p);

	public int changerProprioVoiture(Voiture v, Personne p);

	public int detruireVoiture(Voiture v);

	public Voiture getVoiture(int idVoiture);

	public List<Voiture> afficherMesVoitures(Personne p);

}
