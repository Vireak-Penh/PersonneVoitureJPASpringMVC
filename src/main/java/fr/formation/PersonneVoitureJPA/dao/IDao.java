package fr.formation.PersonneVoitureJPA.dao;

import java.util.List;

import fr.formation.PersonneVoitureJPA.metier.Personne;
import fr.formation.PersonneVoitureJPA.metier.Voiture;

public interface IDao {
	public int ajouterPersonne(Personne p) throws Exception;

	public int supprimerPersonne(Personne p);

	public List<Personne> findAll();

	public int updatePersonne(Personne p, String nom, String prenom, int age);

	public int ajouterVoiture(Voiture v, Personne p);

	public int changerProprioVoiture(Voiture v, Personne p);

	public int detruireVoiture(Voiture v);

	// Méthodes annexes

	public Personne getPersonne(int idPersonne);

	public Voiture getVoiture(int idVoiture);

	public List<Voiture> afficherMesVoitures(Personne P);

	public void supprimerPersonne(Integer idPers);

	public void updatePersonne(Personne p);

}
