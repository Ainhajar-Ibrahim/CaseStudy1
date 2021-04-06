package element;

public abstract class Element {
public String Nom;
public String path;
Element(String nom, String path){
	this.Nom=nom;
	this.path=path;
}
public abstract void afficher();
public abstract int getTaille();
public String setNom(String nom) {
	this.Nom=nom;
}
public String setPath(String path) {
	this.path=path;
}
}
