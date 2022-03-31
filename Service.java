package controleur;

import java.util.Vector;

  public class Service {
  private static int numS=7;
  
  private int idService;

  private String nomService;
  
  //constructeur par d�fault
  public Service() {
	  idService=numS++;
  }
  
  //constructeur avec param�tres
  public Service(String nomService) {
	  idService=numS++;
      this.nomService=nomService;
  }
  
//g�n�ration de getters et setters
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


//m�thode d'affichage
public String toString(){
	StringBuffer sb=new StringBuffer();
	sb.append("Le num�ro du service est: "+this.idService+"\n");
	sb.append("Le nom du service est: "+this.nomService+"\n");
	return sb.toString();
}




    

    

}
