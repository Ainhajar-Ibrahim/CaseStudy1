package personne;

import element.Dossier;
import element.Element;
import element.Fichier;

public abstract class Personne {
String username;
private String password;
public Personne(String username, String password) {
	this.username=username;
	this.setPassword(password);
}
public boolean sauthentifier(String una, String mdp) {
	if ((this.username==una)&&(this.getPassword()==mdp)){
		return true;
	}
	return false;
}
// créer fichier dans un dossier D
public void créerFichier(String Nom,Dossier D) {
	if (this.sauthentifier(this.username,this.getPassword()))
{String path1=D.path+"\\"+D.Nom;
Fichier A=new Fichier(Nom,path1,0);}
	else
		System.out.println("il faut s'authentifier d'abord.");
}
public void rennomerElement(Element A,String nom) {
	if (this.sauthentifier(this.username,this.getPassword())) {
	A.setNom(nom);}
	else
		System.out.println("il faut s'authentifier d'abord.");	
}
public void déplacerElement(Element A, String path) {
	if (this.sauthentifier(this.username,this.getPassword())) {
	A.setPath(path);}
	else
		System.out.println("il faut s'authentifier d'abord.");	
}
public void supprimerElement(Element A) {
	if (this.sauthentifier(this.username,this.getPassword())) {
	A=null;}
	else
		System.out.println("il faut s'authentifier d'abord.");
}
public void calculerTaille(Element e) {
	System.out.println("la taille est: "+e.getTaille());
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
