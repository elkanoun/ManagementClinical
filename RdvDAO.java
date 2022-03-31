package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import controleur.Medecin;
import controleur.Service;

public class RdvDAO {
	//séléction de tous les spécialitées
	//recherche d'un Medecin avec nom
	  public ArrayList<Medecin> findMedecinSpecialite(String specialite){
		 ArrayList<Medecin> medecins = new ArrayList<Medecin>();
	    try {
	   	 Connection cnx = SingletonConnection.getConnexion();
	   	 PreparedStatement ps = cnx.prepareStatement
			                ("select *from medecin where specialiteMedecin like ?");
	   	 ps.setString(1, specialite);
	   	 ResultSet rs= ps.executeQuery();
	   	 while(rs.next()){
	   		 Medecin m = new Medecin();
	   		 m.setIdMedecin(rs.getInt("idMedecin"));
	   		 m.setCin(rs.getString("cin"));
	   		 m.setNom(rs.getString("nom"));
	   		 m.setPrenom(rs.getString("prenom"));
	   		 m.setDateNaissance(rs.getString("dateNaissance"));
	   		 m.setnTel(rs.getString("nTel"));
	   		 m.setSexe(rs.getString("sexe"));
	   		 m.setEmail(rs.getString("email"));
	   		 m.setGradeMedecin(rs.getString("gradeMedecin"));
	   		 m.setSpecialiteMedecin(rs.getString("specialiteMedecin"));
	   		 m.setService((Service) rs.getObject("idService"));
	   		 medecins.add(m);
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return medecins;
		
	}

}
