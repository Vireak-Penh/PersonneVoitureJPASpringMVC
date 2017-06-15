package fr.formation.PersonneVoitureJPA.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import fr.formation.PersonneVoitureJPA.dao.IDao;
import fr.formation.PersonneVoitureJPA.metier.Personne;
import fr.formation.PersonneVoitureJPA.metier.Voiture;

@Transactional
public class ServiceImpl implements IGestionPersonne, IGestionVoiture {

	private IDao dao;

	/**
	 * @return the dao
	 */
	public IDao getDao() {
		return dao;
	}

	/**
	 * @param dao
	 *            the dao to set
	 */
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public int ajouterVoiture(Voiture v, Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterVoiture(v, p);
	}

	@Override
	public int changerProprioVoiture(Voiture v, Personne p) {
		// TODO Auto-generated method stub
		return dao.changerProprioVoiture(v, p);
	}

	@Override
	public int detruireVoiture(Voiture v) {
		// TODO Auto-generated method stub
		return dao.detruireVoiture(v);
	}

	@Override
	public int ajouterPersonne(Personne p) throws Exception {
		// TODO Auto-generated method stub
		return dao.ajouterPersonne(p);
	}

	@Override
	public int supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.supprimerPersonne(p);
	}

	@Override
	public List<Personne> findall() {
		// TODO Auto-generated method stub
		return dao.findall();
	}

	@Override
	public int updatePersonne(Personne p, String nom, String prenom, int age) {
		// TODO Auto-generated method stub
		return dao.updatePersonne(p, nom, prenom, age);
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return dao.getPersonne(idPersonne);
	}

	@Override
	public Voiture getVoiture(int idVoiture) {
		// TODO Auto-generated method stub
		return dao.getVoiture(idVoiture);
	}

	@Override
	public List<Voiture> afficherMesVoitures(Personne p) {
		// TODO Auto-generated method stub
		return dao.afficherMesVoitures(p);
	}

}
