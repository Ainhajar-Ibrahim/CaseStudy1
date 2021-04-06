package element;

public class Raccourcis extends Element {
	Element e;
	public Raccourcis(Element e, String path) {
		super(e.Nom,path);
		this.e=e;}
	public void afficher() {
		System.out.println(e.Nom+" est un fichier situé dans l'emplacement "+e.path+" et de taille "+e.getTaille()+".");
	}
	public int getTaille() {
		return 1;
	}
}
