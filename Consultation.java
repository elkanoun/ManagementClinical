package controleur;
import java.sql.Date;
public class Consultation {
	  private int numC=3;

	  private int idConsultation;

	  private String typeConsultation;

	  private String obsReception;

	  private Float fraisConsultation;

	  private Date dateConsultation;

	  private Date date;

	  private Date dateRDV;

	  public Medecin medecin;
	  
	  public Patient patient;
	  
	  private String horaire;
	  //constructeur par défault
	  public Consultation() {
		  idConsultation = numC++;
	}
	//constructeur avec paramétres
	  public Consultation(String typeConsultation, String obsReception, Float fraisConsultation, Date date, Date dateRDV,
			  Medecin medecin, Patient patient, String horaire) {
		  idConsultation = numC++;
		  this.typeConsultation = typeConsultation;
		  this.obsReception = obsReception;
		  this.fraisConsultation = fraisConsultation;
		  this.date = date;
		  this.dateRDV =dateRDV;
		  this.medecin = medecin;
		  this.patient = patient;
		  this.horaire = horaire;
	}
	  
	//génèration de getters et setters
	public int getIdConsultation() {
			return idConsultation;
	}
	public void setIdConsultation(int idConsultation) {
		this.idConsultation = idConsultation;
	}
	public String getTypeConsultation() {
		return typeConsultation;
	}
	public void setTypeConsultation(String typeConsultation) {
		this.typeConsultation = typeConsultation;
	}
	public String getHoraire() {
		return horaire;
	}
	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}
	public String getObsReception() {
		return obsReception;
	}
	public void setObsReception(String obsReception) {
		this.obsReception = obsReception;
	}
	public Float getFraisConsultation() {
		return fraisConsultation;
	}
	public void setFraisConsultation(Float fraisConsultation) {
		this.fraisConsultation = fraisConsultation;
	}
	public Date getDateConsultation() {
		return dateConsultation;
	}
	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDateRDV() {
		return dateRDV;
	}
	public void setDateRDV(Date dateRDV) {
		this.dateRDV = dateRDV;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public void passerConsultation() {
	  }
	//méthodes fonctionnelles
	public void donnezRendezVous() {
	  }

	  
	

	}
