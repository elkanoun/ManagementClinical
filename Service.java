package controleur;

import java.util.Vector;

  public class Service {
  private static int numS=7;
  
  private int idService;

  private String nomService;
  
  //constructeur par défault
  public Service() {
	  idService=numS++;
  }
  
  //constructeur avec paramétres
  public Service(String nomService) {
	  idService=numS++;
      this.nomService=nomService;
  }
  
//génèration de getters et setters
  public int getIdService() {
		return idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

	public String getNomService() {
		return nomService;
	}

	public void setNomService(String nomService) {
		this.nomService = nomService;
	}


//méthode d'affichage
public String toString(){
	StringBuffer sb=new StringBuffer();
	sb.append("Le numéro du service est: "+this.idService+"\n");
	sb.append("Le nom du service est: "+this.nomService+"\n");
	return sb.toString();
}




    

    

}
