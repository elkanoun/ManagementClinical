package controleur;
import java.sql.Date;
import java.util.Vector;

public class Patient extends Personne {
  private static int numP=1;

  private int idPatient;

  private Float poidsPatient;

  private String professionPatient;

  private String numFiche; // A.I=1 /year              =1/2017          3087554/2017     //1/1/2018 :initialisation 1/2018
   //Contr. par défault     
  public Patient() {
	  super();
	  this.idPatient=numP++;
}
  
//Contr. avec paramétres    
  public Patient(String cin, String nom, String prenom, String date, String nTel, String sexe, String email, Float poidsPatient, String professionPatient, String numFiche) {
	  super(cin, nom, prenom, date, nTel, sexe, email);
	  this.idPatient=numP++;
	  this.poidsPatient = poidsPatient;
	  this.professionPatient = professionPatient;
	  this.numFiche = numFiche;
}



  
  
  //génèration de getters et setters
  
public int getIdPatient() {
	return idPatient;
}

public void setIdPatient(int idPatient) {
	this.idPatient = idPatient;
}

public Float getPoidsPatient() {
	return poidsPatient;
}

public void setPoidsPatient(Float poidsPatient) {
	this.poidsPatient = poidsPatient;
}

public String getProfessionPatient() {
	return professionPatient;
}

public void setProfessionPatient(String professionPatient) {
	this.professionPatient = professionPatient;
}

public String getNumFiche() {
	return numFiche;
}

public void setNumFiche(String numFiche) {
	this.numFiche = numFiche;
}

public void imprimerFiche( ) { //param:Reception
  }

  public void imprimerFiche2(  ) { //param:Hospitalisation
}



}