package controleur;

import java.sql.Date;

import java.util.Vector;

public class Hospitalisation {

  private Integer idHospitalisation;

  private Date dateArrivee;

  private Date dateSortie;

  private String obsHospitalisation;
  
  private Boolean avecCompagnant;
  
  public Chambre chambre;
    

  public Integer getIdHospitalisation() {
	return idHospitalisation;
}


public void setIdHospitalisation(Integer idHospitalisation) {
	this.idHospitalisation = idHospitalisation;
}


public Date getDateArrivee() {
	return dateArrivee;
}


public void setDateArrivee(Date dateArrivee) {
	this.dateArrivee = dateArrivee;
}


public Date getDateSortie() {
	return dateSortie;
}


public void setDateSortie(Date dateSortie) {
	this.dateSortie = dateSortie;
}


public String getObsHospitalisation() {
	return obsHospitalisation;
}


public void setObsHospitalisation(String obsHospitalisation) {
	this.obsHospitalisation = obsHospitalisation;
}


public Boolean getAvecCompagnant() {
	return avecCompagnant;
}


public void setAvecCompagnant(Boolean avecCompagnant) {
	this.avecCompagnant = avecCompagnant;
}


public Chambre getChambre() {
	return chambre;
}


public void setChambre(Chambre chambre) {
	this.chambre = chambre;
}


public void redigerFacture( ) { //Hospitalisation
  }

}