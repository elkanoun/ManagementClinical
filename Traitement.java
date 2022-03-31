package controleur;

import java.sql.Date;

public class Traitement {

	  private Integer idTraitement;

	  private String obsTraitement;

	  private Date dateDebutTrait;

	  private Date dateFinTrait;

	  private String etatFinPatient;
	  
	  private Patient patient;
	  
	  private Maladie maladie;
	  
	  //génèration de getters et setters
    public Integer getIdTraitement() {
		return idTraitement;
	}

	public void setIdTraitement(Integer idTraitement) {
		this.idTraitement = idTraitement;
	}

	public String getObsTraitement() {
		return obsTraitement;
	}

	public void setObsTraitement(String obsTraitement) {
		this.obsTraitement = obsTraitement;
	}

	public Date getDateDebutTrait() {
		return dateDebutTrait;
	}

	public void setDateDebutTrait(Date dateDebutTrait) {
		this.dateDebutTrait = dateDebutTrait;
	}

	public Date getDateFinTrait() {
		return dateFinTrait;
	}

	public void setDateFinTrait(Date dateFinTrait) {
		this.dateFinTrait = dateFinTrait;
	}

	public String getEtatFinPatient() {
		return etatFinPatient;
	}

	public void setEtatFinPatient(String etatFinPatient) {
		this.etatFinPatient = etatFinPatient;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Maladie getMaladie() {
		return maladie;
	}

	public void setMaladie(Maladie maladie) {
		this.maladie = maladie;
	}
	  
	  


	}