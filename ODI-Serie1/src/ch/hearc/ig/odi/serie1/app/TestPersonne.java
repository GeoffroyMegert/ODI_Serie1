package ch.hearc.ig.odi.serie1.app;

import ch.hearc.ig.odi.serie1.business.Personne;

public class TestPersonne {
	private TestPersonne() {}

	private void run() {
		Personne personne1 = new Personne("Megert", "Geoffroy");
		Personne personne2 = new Personne("Toto", "Titi");
		Personne personne3 = new Personne("Megert", "Geoffroy");

		personne1.sePresenter();
		personne2.sePresenter();
		personne3.sePresenter();

		personne3.setPrenom("Loïc");
		System.out.println(personne3.getPrenom());
		System.out.println(personne3.getNom());
		personne3.sePresenter();

		Personne[] personnes = new Personne[100];
		for(int i = 0; i < 100; i++) {
			personnes[i] = new Personne("Nom " + i, "Prenom " + i);
			personnes[i].sePresenter();
		}
	}

	public static void main(String[] args) {
		new TestPersonne().run();
	}
}