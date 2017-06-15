package fr.formation.PersonneVoitureJPA.metier;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nom;

	private String prenom;

	private int age;

	@OneToMany(mappedBy = "personne")
	private List<Voiture> mesVoitures;

	// Création d'un constructeur par défaut : clic droit -> Source-> Generate
	// Constructor using fields -> deselect all
	// super() va chercher le constructeur de la classe parent (ici classe mère
	// Object)
	public Personne() {
		super();
	}

	// Création d'un constructeur : clic droit -> Source-> Generate Constructor
	// using fields -> select all
	public Personne(int id, String nom, String prenom, int age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	// Generate Getters and Setters
	/**
	 * @return the mesVoitures
	 */
	public List<Voiture> getMesVoitures() {
		return mesVoitures;
	}

	/**
	 * @param mesVoitures
	 *            the mesVoitures to set
	 */
	public void setMesVoitures(List<Voiture> mesVoitures) {
		this.mesVoitures = mesVoitures;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}