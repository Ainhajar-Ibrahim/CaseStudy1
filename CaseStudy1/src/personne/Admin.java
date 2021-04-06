package personne;

public class Admin extends Personne {
	public Admin(String username, String password) {
		super(username, password);
		
	}
	public void créerUtilisateur(String username, String password) {
		if (this.sauthentifier(this.username,this.getPassword())) {
		Utilisateur A=new Utilisateur(username,password);}
		else
			System.out.println("il faut s'authentifier d'abord.");	
	}
}
