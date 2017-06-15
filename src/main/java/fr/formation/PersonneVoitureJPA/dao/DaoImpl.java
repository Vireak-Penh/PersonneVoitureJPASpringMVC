package fr.formation.PersonneVoitureJPA.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.formation.PersonneVoitureJPA.metier.Personne;
import fr.formation.PersonneVoitureJPA.metier.Voiture;

public class DaoImpl implements IDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public int ajouterPersonne(Personne p) throws Exception {
		em.persist(p);
		return p.getId();
	}

	@Override
	public int supprimerPersonne(Personne p) {
		em.remove(p);
		return p.getId();
	}

	@Override
	public List<Personne> findAll() {
		Query req = em.createQuery("SELECT p FROM Personne p");
		return req.getResultList();
	}

	@Override
	public int updatePersonne(Personne p, String nom, String prenom, int age) {
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAge(age);
		em.merge(p);
		return p.getId();
	}

	@Override
	public int ajouterVoiture(Voiture v, Personne p) {
		v.setPersonne(p);
		em.persist(v);
		return v.getIdVoiture();
	}

	@Override
	public int changerProprioVoiture(Voiture v, Personne p) {
		v.setPersonne(p);
		em.merge(v);
		return v.getIdVoiture();
	}

	@Override
	public int detruireVoiture(Voiture v) {
		em.remove(v);
		return v.getIdVoiture();
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		return em.find(Personne.class, idPersonne);
	}

	@Override
	public Voiture getVoiture(int idVoiture) {
		return em.find(Voiture.class, idVoiture);
	}

	@Override
	public List<Voiture> afficherMesVoitures(Personne p) {
		// Query req = em.createQuery("SELECT v FROM Voiture v where
		// v.personne.id=p.id");
		Query req = em.createQuery("SELECT v FROM Voiture v where v.personne.id=?");
		req.setParameter(1, p.getId());
		return req.getResultList();
	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub
		em.merge(p);
	}

	@Override
	public void supprimerPersonne(Integer idPers) {
		// TODO Auto-generated method stub
		em.remove(em.find(Personne.class, idPers));
	}

}
