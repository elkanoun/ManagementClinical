package dao;

import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controleur.Medecin;
import controleur.Patient;
import controleur.Service;

public class MedecinDAO{
//recherche d'un Medecin avec nom
  public ArrayList<Medecin> findNom(String nom){
	 ArrayList<Medecin> medecins = new ArrayList<Medecin>();
    try {
   	 Connection cnx = SingletonConnection.getConnexion();
   	 PreparedStatement ps = cnx.prepareStatement
		                ("select * from medecin where nom like ?");
   	 ps.setString(1, nom);
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
  

	//méthode de recherche d'un Medecin avec CIN
  public ArrayList<Medecin> findCin(String cin){
		 ArrayList<Medecin> medecins = new ArrayList<Medecin>();
	    try {
	   	 Connection cnx = SingletonConnection.getConnexion();
	   	 PreparedStatement ps = cnx.prepareStatement
			                ("select * from medecin where nom like ?");
	   	 ps.setString(1, cin);
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
	//méthode d'enregistrement d'un Medecin 
  public boolean save(Medecin medecin){
		try {
			Connection cnx = SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement
			           ("insert into medecin values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setObject(1, null);
			ps.setString(2, medecin.getCin());
			ps.setString(3, medecin.getNom());
			ps.setString(4, medecin.getPrenom());
			ps.setString(5, medecin.getDateNaissance());
			ps.setString(6, medecin.getnTel());
			ps.setString(7, medecin.getSexe());
			ps.setString(8, medecin.getEmail());
			ps.setString(9, medecin.getGradeMedecin());
			ps.setString(10, medecin.getSpecialiteMedecin());
			ps.setInt(11, medecin.getService().getIdService());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Le medecin est bien ajouté", "Messeage Confirmation", JOptionPane.INFORMATION_MESSAGE);
			ps.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Le medecin n'est pas ajouté", "Messeage Avertissement", JOptionPane.ERROR_MESSAGE);
          return false;
		}

	}
	//méthode de modification d'un medecin 
  public void updateMedecin(Medecin medecin, int num){
	  try {
 		 Connection cnx = SingletonConnection.getConnexion();
     	 PreparedStatement ps = cnx.prepareStatement
    ("UPDATE medecin SET cin = ?, nom = ?, prenom = ?, dateNaissance = ?, nTel = ?, sexe = ?, email = ?, gradeMedecin = ?, specialiteMedecin = ?, idServicet = ? where idMedecin = ?");
     	 ps.setString(1, medecin.getCin());
     	 ps.setString(2, medecin.getNom());
     	 ps.setString(3, medecin.getPrenom());
     	 ps.setString(4, medecin.getDateNaissance());
     	 ps.setString(5, medecin.getnTel());
     	 ps.setString(6, medecin.getSexe());
     	 ps.setString(7, medecin.getEmail());
     	 ps.setString(8, medecin.getGradeMedecin());
     	 ps.setString(9, medecin.getSpecialiteMedecin());
     	 ps.setInt(10, medecin.getService().getIdService());
     	 ps.setInt(11, num);
     	 ps.executeUpdate();
     	 JOptionPane.showConfirmDialog(null, "Le médecin est bien modifié");
     	 ps.close();			
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showConfirmDialog(null, "Le médecin n'est pas modifié!!!");

		}
	  
  }


}


