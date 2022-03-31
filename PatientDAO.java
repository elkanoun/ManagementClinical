package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import util.GestionCliniqueException;

import controleur.Patient;


public class PatientDAO{
	/*requette sélectio de tous les patients
	public ResultSet selectAll(){
		try {
			Statement st=(Statement) util.Util.createStatement();
			ResultSet rs=st.executeQuery("select * from patient;");
			return rs;
			} catch (SQLException e) {
			System.out.println("erreur requette");
			return null;

		}
		
	}*/
	
	//méthode d'enregistrement d'un patient
     public boolean save(Patient patient){
		try {
			Connection cnx = SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement
			           ("insert into patient values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setObject(1, null);
			ps.setString(2, patient.getCin());
			ps.setString(3, patient.getNom());
			ps.setString(4, patient.getPrenom());
			ps.setString(5, patient.getDateNaissance());
			ps.setString(6, patient.getnTel());
			ps.setString(7, patient.getSexe());
			ps.setString(8, patient.getEmail());
			ps.setFloat(9, patient.getPoidsPatient());
			ps.setString(10, patient.getProfessionPatient());
			ps.setString(11, patient.getNumFiche());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Le patient est bien ajouté", "Messeage Confirmation", JOptionPane.INFORMATION_MESSAGE);
			ps.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Le patient n'est pas ajouté", "Messeage Avertissement", JOptionPane.ERROR_MESSAGE);
            return false;
		}

	}
     
 	//méthode de creation d'un patieny
    /* public boolean update(Patient patient, String cin){
       try {
    	   st.executeUpdate("insert into patient values"+"(null, "+patient.getIdPatient()+" ',' "+patient.getCin()+" ',' " +patient.getNom()+" ',' " + patient.getPrenom()+" ',' "+
					patient.getDateNaissance()+" ',' "+patient.getnTel()+" ',' "+patient.getSexe()+" ',' "+patient.getEmail()+" ',' "+patient.getPoidsPatient()+" ',' "+
					patient.getProfessionPatient()+" ',' "+patient.getNumFiche());
			return true;
 		} catch (SQLException e) {
 			e.printStackTrace();
 			return false;
 		}
 	}*/
   //recherche d'un patient avec nom
     public List<Patient> findNom(String nom){
    	 ArrayList<Patient> patients = new ArrayList<Patient>();
         try {
        	 Connection cnx = SingletonConnection.getConnexion();
        	 PreparedStatement ps = cnx.prepareStatement
 			                ("select * from patient where nom like ?");
        	 ps.setString(1, nom);
        	 ResultSet rs= ps.executeQuery();
        	 while(rs.next()){
        		 Patient p = new Patient();
        		 p.setIdPatient(rs.getInt("idPatient"));
        		 p.setCin(rs.getString("cin"));
        		 p.setNom(rs.getString("nom"));
        		 p.setPrenom(rs.getString("prenom"));
        		 p.setDateNaissance(rs.getString("dateNaissance"));
        		 p.setnTel(rs.getString("nTel"));
        		 p.setSexe(rs.getString("sexe"));
        		 p.setEmail(rs.getString("email"));
        		 p.setPoidsPatient(rs.getFloat("poidsPatient"));
        		 p.setProfessionPatient(rs.getString("professionPatient"));
        		 p.setNumFiche(rs.getString("numFiche"));
        		 patients.add(p);
 			 }
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return patients;
 		
 	}
  	//méthode de recherche d'un patient avec CIN
     public List<Patient> findCin(String cin){
    	 ArrayList<Patient> patients = new ArrayList<Patient>();
         try {
        	 Connection cnx = SingletonConnection.getConnexion();
        	 PreparedStatement ps = cnx.prepareStatement
 			                ("select * from patient where cin like ?");
        	 ps.setString(1, cin);
        	 ResultSet rs= ps.executeQuery();
        	 while(rs.next()){
        		 Patient p = new Patient();
        		 p.setIdPatient(rs.getInt("idPatient"));
        		 p.setCin(rs.getString("cin"));
        		 p.setNom(rs.getString("nom"));
        		 p.setPrenom(rs.getString("prenom"));
        		 p.setDateNaissance(rs.getString("dateNaissance"));
        		 p.setnTel(rs.getString("nTel"));
        		 p.setSexe(rs.getString("sexe"));
        		 p.setEmail(rs.getString("email"));
        		 p.setPoidsPatient(rs.getFloat("poidsPatient"));
        		 p.setProfessionPatient(rs.getString("professionPatient"));
        		 p.setNumFiche(rs.getString("numFiche"));
        		 patients.add(p);
 			 }
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return patients;
 		
 	}
     public List<Patient> findNumFiche(String numfiche){
    	 ArrayList<Patient> patients = new ArrayList<Patient>();
         try {
        	 Connection cnx = SingletonConnection.getConnexion();
        	 PreparedStatement ps = cnx.prepareStatement
 			                ("select * from patient where numFiche like ?");
        	 ps.setString(1, numfiche);
        	 ResultSet rs= ps.executeQuery();
        	 while(rs.next()){
        		 Patient p = new Patient();
        		 p.setIdPatient(rs.getInt("idPatient"));
        		 p.setCin(rs.getString("cin"));
        		 p.setNom(rs.getString("nom"));
        		 p.setPrenom(rs.getString("prenom"));
        		 p.setDateNaissance(rs.getString("dateNaissance"));
        		 p.setnTel(rs.getString("nTel"));
        		 p.setSexe(rs.getString("sexe"));
        		 p.setEmail(rs.getString("email"));
        		 p.setPoidsPatient(rs.getFloat("poidsPatient"));
        		 p.setProfessionPatient(rs.getString("professionPatient"));
        		 p.setNumFiche(rs.getString("numFiche"));
        		 patients.add(p);
 			 }
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return patients;
 		
 	}
     //modification d'un patient
     public void updatePatient(Patient patient, int id){
    	 try {
    		 Connection cnx = SingletonConnection.getConnexion();
        	 PreparedStatement ps = cnx.prepareStatement
       ("UPDATE patient SET cin = ?, nom = ?, prenom = ?, dateNaissance = ?, nTel = ?, sexe = ?, email = ?, poidsPatient = ?, professionPatient = ?, numFiche = ? where idPatient = ?");
        	 ps.setString(1, patient.getCin());
        	 ps.setString(2, patient.getNom());
        	 ps.setString(3, patient.getPrenom());
        	 ps.setString(4, patient.getDateNaissance());
        	 ps.setString(5, patient.getnTel());
        	 ps.setString(6, patient.getSexe());
        	 ps.setString(7, patient.getEmail());
        	 ps.setFloat(8, patient.getPoidsPatient());
        	 ps.setString(9, patient.getProfessionPatient());
        	 ps.setString(10, patient.getNumFiche());
        	 ps.setInt(11, id);
        	 ps.executeUpdate();
        	 JOptionPane.showConfirmDialog(null, "Le patient est bien modifié");
        	 ps.close();			
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showConfirmDialog(null, "Le patient n'est pas modifié!!!");

		}
    	   }
    //suppression d'un patient
	public void deletePatient(int id) {
		
		try {
			Connection cnx = SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement
				("delete from patient where idPatient like ?");
				ps.setInt(1, id);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Le patient est bien supprimé", "Messeage Information", JOptionPane.INFORMATION_MESSAGE);
	            ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Le patient n'est pas supprimé", "Messeage Information", JOptionPane.ERROR_MESSAGE);

		}
		
	
	
	}	
}
