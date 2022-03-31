package controleur;

import java.sql.Date;
import java.util.Vector;

public class Medecin extends Personne {
  private static int numM=1;
  
  private int idMedecin;

  private String gradeMedecin;

  private String specialiteMedecin;

  private Service service;
//Contr. par défault     
  public Medecin() {
	  super();
	  this.idMedecin=numM++;
}
  
//Contr. avec paramétres    
  public Medecin(String cin, String nom, String prenom, String dateNaissance, String nTel, String sexe, String email,
		  String gradeMedecin, String specialiteMedecin, Service service  ) {
	  super(cin, nom, prenom, dateNaissance, nTel, sexe, email);
	  this.idMedecin=numM++;
	  this.gradeMedecin=gradeMedecin;
	  this.specialiteMedecin=specialiteMedecin;
	  this.service=service;


}

//génèration de getters et setters


public int getIdMedecin() {
	return idMedecin;
}

public void setIdMedecin(int idMedecin) {
	this.idMedecin = idMedecin;
}

public String getGradeMedecin() {
	return gradeMedecin;
}

public void setGradeMedecin(String gradeMedecin) {
	this.gradeMedecin = gradeMedecin;
}

public String getSpecialiteMedecin() {
	return specialiteMedecin;
}

public void setSpecialiteMedecin(String specialiteMedecin) {
	this.specialiteMedecin = specialiteMedecin;
}

public Service getService() {
	return service;
}

public void setService(Service service) {
	this.service = service;
}
  


   
    
    
} 