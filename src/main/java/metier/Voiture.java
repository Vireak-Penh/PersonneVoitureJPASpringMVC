package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVoiture;

	private String marque;

	private String constructeur;

	// Mono Directionnel : depuis voiture, accès à l'attribut personne.
	@ManyToOne
	private Personne personne;

	public Voiture() {
		super();
	}

	public Voiture(int idVoiture, String marque, String constructeur) {
		super();
		this.idVoiture = idVoiture;
		this.marque = marque;
		this.constructeur = constructeur;
	}

	/**
	 * @return the idVoiture
	 */
	public int getIdVoiture() {
		return idVoiture;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @return the constructeur
	 */
	public String getConstructeur() {
		return constructeur;
	}

	/**
	 * @return the personne
	 */
	public Personne getPersonne() {
		return personne;
	}

	/**
	 * @param idVoiture
	 *            the idVoiture to set
	 */
	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	/**
	 * @param marque
	 *            the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @param constructeur
	 *            the constructeur to set
	 */
	public void setConstructeur(String constructeur) {
		this.constructeur = constructeur;
	}

	/**
	 * @param personne
	 *            the personne to set
	 */
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", marque=" + marque + ", constructeur=" + constructeur
				+ ", personne=" + personne + "]";
	}

}
