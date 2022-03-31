package controleur;

import java.util.Vector;

public class Chambre {

  private Integer idCambre;

  private String nomChambre;
  
  private String typeChambre;

  private double prixChambre;

//génèration de getters et setters
public Integer getIdCambre() {
	return idCambre;
}

public void setIdCambre(Integer idCambre) {
	this.idCambre = idCambre;
}

public String getNomChambre() {
	return nomChambre;
}

public void setNomChambre(String nomChambre) {
	this.nomChambre = nomChambre;
}

public String getTypeChambre() {
	return typeChambre;
}

public void setTypeChambre(String typeChambre) {
	this.typeChambre = typeChambre;
}

public double getPrixChambre() {
	return prixChambre;
}

public void setPrixChambre(double prixChambre) {
	this.prixChambre = prixChambre;
}

  

  

}
