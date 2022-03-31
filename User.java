package controleur;

public class User {
	private static int idU=4;
	
	private int id;
	
	private String nom;
	
	private String prenom;
	
	private String tache;
	
	private String login;
	
	private String pass;
	
	//constructeur par défault
     public User() {
		this.id=idU++;
	}
	//constructeur avec paramétres
	public User(String nom, String prenom, String tache, String login, String pass) {
		this.id=idU++;
		this.nom = nom;
		this.prenom = prenom;
		this.tache = tache; 
		this.login = login;
		this.pass = pass;

	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTache() {
		return tache;
	}
	public void setTache(String tache) {
		this.tache = tache;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	

}
