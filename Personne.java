package controleur;

import java.sql.Date;

public class Personne {
	protected String cin;

	  protected String nom;
         
	  protected String prenom;

	  protected String dateNaissance;

	  protected String nTel;

	  protected String sexe;

	  protected String email;
	  
	  //Constructeur par défault:
	  public Personne() {}
	  
	  //Constructeur avec paramétres:
	  public Personne(String cin, String nom, String prenom, String dateNaissance, String nTel, String sexe, String email) {
		  this.cin=cin;
		  this.nom=nom;
		  this.prenom=prenom;
          this.dateNaissance=dateNaissance;
		  this.nTel=nTel;
		  this.sexe=sexe;
		  this.email=email;

		}

	//génèration de getters et setters
    public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
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

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getnTel() {
		return nTel;
	}

	public void setnTel(String nTel) {
		this.nTel = nTel;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//Méthode d'affichage
	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append("Le CIN est: "+this.cin+"\n");
		sb.append("Le sexe est: "+this.sexe+"\n");
        sb.append("Le nom est: "+this.nom+"\n");
		sb.append("Le prenom est: "+this.prenom+"\n");
		sb.append("La date de naissance est: "+this.dateNaissance+"\n");
		sb.append("Le numéro de télèphone est: "+this.nTel+"\n");
		sb.append("L'Email est: "+this.email+"\n");

		
		return sb.toString();
	}
	  

}
