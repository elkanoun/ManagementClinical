package controleur;

import java.util.Vector;

public class Bloc {
  private static int idB=3;

  private int idBloc;

  private String typeBloc;
  //constr. par d�fault
  public Bloc() {
	  idBloc=idB++;
}
  //constr. avec param�tres
  public Bloc(String typeBloc) {
	  idBloc=idB++;
	  this.typeBloc = typeBloc;
}
  //g�n�ration de getters et setters

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
