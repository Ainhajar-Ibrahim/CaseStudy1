package element;

public class Raccourcis extends Element {
	Element e;
	public Raccourcis(Element e, String path) {
		super(e.Nom,path);
		this.e=e;}
	public void afficher() {
		System.out.println("Ce fichier est le raccourcis de l'element "e.Nom+" situé dans l'emplacement "+e.path+" ".");
	}
	public int getTaille() {
		return 1;
	}
}
