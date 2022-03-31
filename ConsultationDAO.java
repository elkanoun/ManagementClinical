package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import controleur.Consultation;
import controleur.Medecin;
import controleur.Patient;

public class ConsultationDAO {
    //recherche consultations d'un patient avec IDpATIENT
	public List<Consultation>rechercheAllConsIdPatient(int idpatient) {
		ArrayList<Consultation> consultations = new ArrayList<Consultation>();
		try {
			Connection cnx = SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement
			("select *from consultation where idPatient like ?");
			ps.setInt(1, idpatient);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Consultation consultation = new Consultation();
				consultation.setIdConsultation(rs.getInt("idConsultation"));
				consultation.setTypeConsultation(rs.getString("typeConsultation"));
				consultation.setObsReception(rs.getString("obsReception"));
				consultation.setFraisConsultation(rs.getFloat("fraisConsultation"));
				consultation.setDate(rs.getDate("date"));
				consultation.setDateRDV(rs.getDate("dateConsultation"));
				consultation.setDateConsultation(rs.getDate("dateRdv"));
				consultation.setHoraire(rs.getString("horaire"));

				//PATIENT
				Patient patient = new Patient();
				patient.setIdPatient(rs.getInt("idPatient"));
				consultation.setPatient(patient);
				//MEDECIN
				Medecin medecin = new Medecin();
				medecin.setIdMedecin(rs.getInt("idMedecin"));
				consultation.setMedecin(medecin);
				consultations.add(consultation);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return consultations;
		
	}
	 //recherche consultations d'un patient avec Cin
	public List<Consultation>rechercheAllConsCinPatient(String cin) {
		ArrayList<Consultation> consultations = new ArrayList<Consultation>();
		try {
			Connection cnx = SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement
			("select *from consultation, patient where consultation.idPatient = patient.idPatient and cin like ?");
			ps.setString(1, cin);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Consultation consultation = new Consultation();
				consultation.setIdConsultation(rs.getInt("idConsultation"));
				consultation.setTypeConsultation(rs.getString("typeConsultation"));
				consultation.setObsReception(rs.getString("obsReception"));
				consultation.setFraisConsultation(rs.getFloat("fraisConsultation"));
				consultation.setDate(rs.getDate("date"));
				consultation.setDateRDV(rs.getDate("dateConsultation"));
				consultation.setDateConsultation(rs.getDate("dateRdv"));
				consultation.setHoraire(rs.getString("horaire"));

				//PATIENT
				Patient patient = new Patient();
				patient.setIdPatient(rs.getInt("idPatient"));
				consultation.setPatient(patient);
				//MEDECIN
				Medecin medecin = new Medecin();
				medecin.setIdMedecin(rs.getInt("idMedecin"));
				consultation.setMedecin(medecin);
				consultations.add(consultation);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return consultations;
		
	}

}
