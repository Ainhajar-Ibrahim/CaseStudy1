package element;

public class Fichier extends Element {
int taille;
public Fichier(String nom, String path, int taille) {
	super(nom,path);
	this.taille=taille;
}
public void afficher() {
	System.out.println(this.Nom+" est un fichier situé dans l'emplacement "+this.path+" et de taille "+this.taille+".");
}
public int getTaille() {
	return taille;
}
}
