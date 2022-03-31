package controleur;

import java.util.Vector;

public class Bloc {
  private static int idB=3;

  private int idBloc;

  private String typeBloc;
  //constr. par défault
  public Bloc() {
	  idBloc=idB++;
}
  //constr. avec paramétres
  public Bloc(String typeBloc) {
	  idBloc=idB++;
	  this.typeBloc = typeBloc;
}
  //génèration de getters et setters

public int getIdBloc() {
	return idBloc;
}
public void setIdBloc(int idBloc) {
	this.idBloc = idBloc;
}
public String getTypeBloc() {
	return typeBloc;
}
public void setTypeBloc(String typeBloc) {
	this.typeBloc = typeBloc;
}



   
}
