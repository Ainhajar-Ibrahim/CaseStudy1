package element;
import java.util.Vector;
public class Dossier extends Element {
private Vector<Element> listElement;
Dossier(String nom, String path){
	super(nom,path);
}
public void afficher() {
	System.out.println(this.Nom+" est un dossier situ� dans l'emplacement "+this.path+" et de taille "+this.getTaille()+" constitu� des �lements:");
	for(Element e: this.listElement) {
		System.out.println("\n");
		e.afficher();
	}
}
public int getTaille() {
	int taille=0;
	for (Element e:this.listElement) {
		taille+=e.getTaille();
	}
	return taille;
}
}
