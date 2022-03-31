package controleur;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Vector;

public class Operation {

  public Integer idOperation;

  public String typeOperation;

  public String obsOperation;
  
  private Date dateOperation;

  private Bloc bloc;
  
  private ArrayList<Medecin> medecins=new ArrayList<Medecin>();
  
  
  //génèration de getters et setters
public Integer getIdOperation() {
	return idOperation;
}



public void setIdOperation(Integer idOperation) {
	this.idOperation = idOperation;
}



public String getTypeOperation() {
	return typeOperation;
}



public void setTypeOperation(String typeOperation) {
	this.typeOperation = typeOperation;
}



public String getObsOperation() {
	return obsOperation;
}



public void setObsOperation(String obsOperation) {
	this.obsOperation = obsOperation;
}



public Date getDateOperation() {
	return dateOperation;
}



public void setDateOperation(Date dateOperation) {
	this.dateOperation = dateOperation;
}



public Bloc getBloc() {
	return bloc;
}



public void setBloc(Bloc bloc) {
	this.bloc = bloc;
}


public ArrayList<Medecin> getMedecins() {
	return medecins;
}



public void setMedecins(ArrayList<Medecin> medecins) {
	this.medecins = medecins;
}



public void redigerFacture( ) { //param:Operaion
  }

}
