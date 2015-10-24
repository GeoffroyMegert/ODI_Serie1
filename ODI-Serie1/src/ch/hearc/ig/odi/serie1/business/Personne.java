package ch.hearc.ig.odi.serie1.business;

/**
* Cette classe permet la création de personne.
* 
* @author Geoffroy Megert (geoffroy.megert@he-arc.ch)
*/
public class Personne {
	private String nom;
	private String prenom;
	
	/**
	* Constructeur sans paramètre.
	*/
	public Personne() {}

	/**
	* Constructeur paramètré.
	* @param nom = le nom de la personne.
	* @param prenom = le prenom de la personne.
	*/
	public Personne(final String nom, final String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/**
	* Retourne le nom de la personne.
	* @return le nom de la personne.
	*/
	public String getNom() {
		return this.nom;
	}

	/**
	* Permet de modifier le nom de la personne.
	* @param nom = le nom de la personne.
	*/
	public void setNom(final String nom) {
		this.nom = nom;
	}

	/**
	* Retourne le prenom de la personne.
	* @return le prenom de la personne.
	*/
	public String getPrenom() {
		return this.prenom;
	}

	/**
	* Permet de modifier le prenom de la personne.
	* @param prenom = le prenom de la personne.
	*/
	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	/**
	* Affiche l'identité (nom et prenom) de la personne.
	*/
	public void sePresenter() {
		System.out.println("Bonjour, je suis " + this.prenom + " " + this.nom);
	}
}