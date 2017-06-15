package fr.formation.PersonneVoitureJPA.service;

import java.util.List;

import fr.formation.PersonneVoitureJPA.metier.Personne;

public interface IGestionPersonne {

	// la signature de la méthode : int, (choix arbitraire) afin d'avoir un
	// retour, exemple 0 incorrect, 1 correct.
	public int ajouterPersonne(Personne p) throws Exception;

	public int supprimerPersonne(Personne p);

	public List<Personne> findall();

	public int updatePersonne(Personne p, String nom, String prenom, int age);

	public Personne getPersonne(int idPersonne);

}
