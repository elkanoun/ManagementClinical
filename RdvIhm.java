package vue;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controleur.Medecin;
import controleur.Service;

import dao.RdvDAO;
import dao.RdvModel;
import dao.ServiceDAO;

public class RdvIhm extends JFrame {

private static final long serialVersionUID = 1L;
	
	private JPanel jContentPane = null;
	private JPanel jPanelNomClinique = null;
	private JPanel jPanelInformations = null;
	private JPanel jPanelCalendrier = null;
	private JPanel jPanelValidationRDV = null;
	private JPanel jPanelBoutonRDV = null;
	private JLabel jLabelTitre1 = null;
	private JLabel jLabelLogin = null;
	private JLabel jLabelTitre2 = null;
	private JLabel jLabelImage = null;

	private JLabel jLabel = null;

	private JLabel jLabelSpecialite = null;

	private JLabel jLabel1 = null;

	private JLabel jLabelMedecin = null;

	private JLabel jLabel2 = null;

	private JButton jButtonPrevious = null;

	private JLabel jLabel3 = null;

	private JLabel jLabelDateDebutSemaine = null;

	private JLabel jLabel4 = null;

	private JLabel jLabelDateFinSemaine = null;

	private JButton jButtonNext = null;

	private JLabel jLabelDateAujourdhui = null;

	private JLabel jLabel5 = null;

	private JScrollPane jScrollPane = null;

	private JLabel jLabel6 = null;

	private JLabel jLabel7 = null;

	private JComboBox jComboBoxSpecialitee = null;

	private JLabel jLabel8 = null;

	private JTextField jTextFieldNumPatient = null;

	private JButton jButtonGestionPatient = null;

	private JLabel jLabel9 = null;

	private JTextField jTextFieldTypeConsultationAutomatique = null;

	private JLabel jLabel10 = null;

	private JComboBox jComboBoxMedecin = null;

	private JLabel jLabel11 = null;

	private JTextField jTextFieldJourneeRDV = null;

	private JLabel jLabel12 = null;

	private JTextField jTextFieldHoraireRDV = null;

	private JButton jButtonValidationRDV = null;

	private JButton jButtonAnnulationRDV = null;

	private JButton jButtonAccueil = null;

	private JButton jButtonPayement = null;
	
	private String login;

	private JTable jTableCalendrierHoraires = null;
	
	private RdvModel rdvModel;
	
	private int idpatient;
	
	private String specialite;

	/**
	 * This is the default constructor with: login + idpatient
	 */
	public RdvIhm(String login, int idpatient) {
		super();
		this.login = login;
		this.idpatient = idpatient;
		initialize();
	}
	/**
	 * This is the default constructor with: login
	 */
	public RdvIhm(String login) {
		super();
		this.login = login;
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1109, 700);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		jLabel6 = new JLabel();
		jLabel6.setBounds(new Rectangle(93, 411, 85, 15));
		jLabel6.setText("Ajouter RDV :");
		jLabelLogin = new JLabel();
		jLabelLogin.setBounds(new Rectangle(872, 0, 219, 22));
		jLabelLogin.setFont(new Font("Dialog", Font.BOLD, 18));
		jLabelLogin.setText("");
		
		jLabelTitre1 = new JLabel();
		jLabelTitre1.setBounds(new Rectangle(2, 2, 216, 22));
		jLabelTitre1.setFont(new Font("Dialog", Font.BOLD, 18));
		jLabelTitre1.setText("Gestion Consultations");
		
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelTitre1, null);
			jContentPane.add(jLabelLogin, null);
			jContentPane.add(getJPanelNomClinique(), null);
			jContentPane.add(getJPanelInformations(), null);
			jContentPane.add(getJPanelCalendrier(), null);
			jContentPane.add(getJPanelValidationRDV(), null);
			jContentPane.add(jLabel6, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanelNomClinique	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelNomClinique() {
		if (jPanelNomClinique == null) {
			
			jLabelImage = new JLabel();
			Image img=new ImageIcon(this.getClass().getResource("/img5.jpg")).getImage();
			jLabelImage.setIcon(new ImageIcon(img));
			jLabelImage.setBounds(new Rectangle(649, 1, 99, 75));
			jLabelImage.setText("");
			
			jLabelTitre2 = new JLabel();
			jLabelTitre2.setBounds(new Rectangle(457, 13, 116, 16));
			jLabelTitre2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabelTitre2.setText("Clinique KMED");
			jPanelNomClinique = new JPanel();
			jPanelNomClinique.setLayout(null);
			jPanelNomClinique.add(jLabelTitre2, null);
			jPanelNomClinique.add(jLabelImage, null);
			jPanelNomClinique.setBounds(new Rectangle(2, 21, 1089, 76));
		}
		return jPanelNomClinique;
	}

	/**
	 * This method initializes jPanelInformations	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelInformations() {
		if (jPanelInformations == null) {
			
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(910, 58, 77, 16));
			jLabel5.setText("Aujourd'hui");
			
			jLabelDateAujourdhui = new JLabel();
			jLabelDateAujourdhui.setBounds(new Rectangle(868, 36, 163, 21));
			jLabelDateAujourdhui.setText("");
			
			jLabelDateFinSemaine = new JLabel();
			jLabelDateFinSemaine.setBounds(new Rectangle(571, 57, 105, 16));
			jLabelDateFinSemaine.setText("");
			
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(539, 59, 18, 16));
			jLabel4.setText("Au");
			
			jLabelDateDebutSemaine = new JLabel();
			jLabelDateDebutSemaine.setBounds(new Rectangle(423, 57, 100, 16));
			jLabelDateDebutSemaine.setText("");
			
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(393, 62, 18, 16));
			jLabel3.setText("Du");
			
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(176, 58, 80, 16));
			jLabel2.setText("Médecin :");
			
			jLabelMedecin = new JLabel();
			jLabelMedecin.setBounds(new Rectangle(167, 41, 94, 16));
			jLabelMedecin.setText("");
			
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(49, 59, 83, 16));
			jLabel1.setText("Spécialitée :");
			
			jLabelSpecialite = new JLabel();
			jLabelSpecialite.setBounds(new Rectangle(35, 42, 102, 16));
			jLabelSpecialite.setText("");
			
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(509, 23, 64, 16));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel.setText("Semaine");
			jPanelInformations = new JPanel();
			jPanelInformations.setLayout(null);
			jPanelInformations.setBounds(new Rectangle(2, 96, 1090, 76));
			jPanelInformations.add(jLabel, null);
			jPanelInformations.add(jLabelSpecialite, null);
			jPanelInformations.add(jLabel1, null);
			jPanelInformations.add(jLabelMedecin, null);
			jPanelInformations.add(jLabel2, null);
			jPanelInformations.add(getJButtonPrevious(), null);
			jPanelInformations.add(jLabel3, null);
			jPanelInformations.add(jLabelDateDebutSemaine, null);
			jPanelInformations.add(jLabel4, null);
			jPanelInformations.add(jLabelDateFinSemaine, null);
			jPanelInformations.add(getJButtonNext(), null);
			jPanelInformations.add(jLabelDateAujourdhui, null);
			jPanelInformations.add(jLabel5, null);
		}
		return jPanelInformations;
	}

	/**
	 * This method initializes jPanelCalendrier	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelCalendrier() {
		if (jPanelCalendrier == null) {
			jPanelCalendrier = new JPanel();
			jPanelCalendrier.setLayout(new BorderLayout());
			jPanelCalendrier.setBounds(new Rectangle(4, 174, 1088, 234));
			jPanelCalendrier.add(getJTableCalendrierHoraires(), BorderLayout.CENTER);
		}
		return jPanelCalendrier;
	}

	/**
	 * This method initializes jPanelValidationRDV	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelValidationRDV() {
		if (jPanelValidationRDV == null) {
			jLabel12 = new JLabel();
			jLabel12.setBounds(new Rectangle(607, 117, 106, 16));
			jLabel12.setText("Horaire :");
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(365, 119, 68, 16));
			jLabel11.setText("Journée :");
			jLabel10 = new JLabel();
			jLabel10.setBounds(new Rectangle(367, 75, 67, 16));
			jLabel10.setText("Médecin :");
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(608, 32, 109, 16));
			jLabel9.setText("Type-Consultation:");
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(66, 31, 53, 16));
			jLabel8.setText("Patient :");
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(366, 30, 73, 16));
			jLabel7.setText("Spécialitée :");
			jPanelValidationRDV = new JPanel();
			jPanelValidationRDV.setLayout(null);
			jPanelValidationRDV.setBounds(new Rectangle(91, 428, 896, 206));
			jPanelValidationRDV.add(getJPanelBoutonRDV(), null);
			jPanelValidationRDV.add(jLabel7, null);
			jPanelValidationRDV.add(getJComboBoxSpecialitee(), null);
			jPanelValidationRDV.add(jLabel8, null);
			jPanelValidationRDV.add(getJTextFieldNumPatient(), null);
			jPanelValidationRDV.add(getJButtonGestionPatient(), null);
			jPanelValidationRDV.add(jLabel9, null);
			jPanelValidationRDV.add(getJTextFieldTypeConsultationAutomatique(), null);
			jPanelValidationRDV.add(jLabel10, null);
			jPanelValidationRDV.add(getJComboBoxMedecin(), null);
			jPanelValidationRDV.add(jLabel11, null);
			jPanelValidationRDV.add(getJTextFieldJourneeRDV(), null);
			jPanelValidationRDV.add(jLabel12, null);
			jPanelValidationRDV.add(getJTextFieldHoraireRDV(), null);
		}
		return jPanelValidationRDV;
	}

	/**
	 * This method initializes jPanelBoutonRDV	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelBoutonRDV() {
		if (jPanelBoutonRDV == null) {
			jPanelBoutonRDV = new JPanel();
			jPanelBoutonRDV.setLayout(null);
			jPanelBoutonRDV.setBounds(new Rectangle(58, 168, 769, 38));
			jPanelBoutonRDV.add(getJButtonValidationRDV(), null);
			jPanelBoutonRDV.add(getJButtonAnnulationRDV(), null);
			jPanelBoutonRDV.add(getJButtonAccueil(), null);
			jPanelBoutonRDV.add(getJButtonPayement(), null);
		}
		return jPanelBoutonRDV;
	}

	/**
	 * This method initializes jButtonPrevious	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonPrevious() {
		if (jButtonPrevious == null) {
			jButtonPrevious = new JButton();
			jButtonPrevious.setBounds(new Rectangle(312, 56, 57, 18));
			jButtonPrevious.setText("<<");
		}
		return jButtonPrevious;
	}

	/**
	 * This method initializes jButtonNext	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonNext() {
		if (jButtonNext == null) {
			jButtonNext = new JButton();
			jButtonNext.setBounds(new Rectangle(708, 58, 57, 19));
			jButtonNext.setText(">>");
		}
		return jButtonNext;
	}

	//calendrier des horaires des médecins
	/*
			Object[][] data = {{"Lundi"},{"Mardi"},{"Mercredi"},{"Jeudi"},{"Vendredi"},{"Samedi"}};
			String title[] = {"Journée", "9:00-09:30","9:30-10:00", "10:00-10:30","10:30-11:00","11:00-11:30","11:30-12:00","12:00-12:30",
							"12:30-13:00","13:30-13:30","13:30-14:00","14:00-14:30","14:30-15:00","15:00-15:30","15:30-16:00","16:00-16:30","16:30-17:00","17:30-18:00"};
			jTableCalendrier = new JTable(data, title);*/
			
			
		

	/**
	 * This method initializes jComboBoxSpecialitee	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxSpecialitee() {
		List<Service> services = new ArrayList<Service>();
		if (jComboBoxSpecialitee == null) {
			jComboBoxSpecialitee = new JComboBox();
			jComboBoxSpecialitee.setBounds(new Rectangle(440, 30, 121, 16));
				ServiceDAO servicedao = new ServiceDAO();
	            services = servicedao.selectAllServices();
	            for (Service service : services) {
					jComboBoxSpecialitee.addItem(service.getNomService());
				}
	            specialite = (String) jComboBoxSpecialitee.getSelectedItem();
	            setValuesJComboBoxMedecin(specialite);
			
		}
		return jComboBoxSpecialitee;
	}
			

	
	/**
	 * This method initializes jTextFieldNumPatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNumPatient() {
		if (jTextFieldNumPatient == null) {
			jTextFieldNumPatient = new JTextField();
			jTextFieldNumPatient.setBounds(new Rectangle(119, 31, 103, 15));
			//récupération du patient
			jTextFieldNumPatient.setText(String.valueOf(idpatient));
			
		}
		return jTextFieldNumPatient;
	}

	/**
	 * This method initializes jButtonGestionPatient	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonGestionPatient() {
		if (jButtonGestionPatient == null) {
			jButtonGestionPatient = new JButton();
			jButtonGestionPatient.setBounds(new Rectangle(221, 31, 63, 15));
			jButtonGestionPatient.setFont(new Font("Dialog", Font.BOLD, 8));
			jButtonGestionPatient.setText("Patient");
		}
		return jButtonGestionPatient;
	}

	/**
	 * This method initializes jTextFieldTypeConsultationAutomatique	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTypeConsultationAutomatique() {
		if (jTextFieldTypeConsultationAutomatique == null) {
			jTextFieldTypeConsultationAutomatique = new JTextField();
			jTextFieldTypeConsultationAutomatique.setBounds(new Rectangle(718, 32, 107, 17));
		}
		return jTextFieldTypeConsultationAutomatique;
	}

	/**
	 * This method initializes jComboBoxMedecin	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxMedecin() {
		specialite = (String) jComboBoxSpecialitee.getSelectedItem();
        if (jComboBoxMedecin == null) {
			jComboBoxMedecin = new JComboBox();
			jComboBoxMedecin.setBounds(new Rectangle(436, 76, 123, 16));
			
		}
		return jComboBoxMedecin;
	}

	/**
	 * This method initializes jTextFieldJourneeRDV	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldJourneeRDV() {
		if (jTextFieldJourneeRDV == null) {
			jTextFieldJourneeRDV = new JTextField();
			jTextFieldJourneeRDV.setBounds(new Rectangle(437, 120, 124, 16));
		}
		return jTextFieldJourneeRDV;
	}

	/**
	 * This method initializes jTextFieldHoraireRDV	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldHoraireRDV() {
		if (jTextFieldHoraireRDV == null) {
			jTextFieldHoraireRDV = new JTextField();
			jTextFieldHoraireRDV.setBounds(new Rectangle(716, 115, 106, 18));
		}
		return jTextFieldHoraireRDV;
	}

	/**
	 * This method initializes jButtonValidationRDV	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonValidationRDV() {
		if (jButtonValidationRDV == null) {
			jButtonValidationRDV = new JButton();
			jButtonValidationRDV.setBounds(new Rectangle(335, 11, 56, 18));
			jButtonValidationRDV.setText("OK");
		}
		return jButtonValidationRDV;
	}

	/**
	 * This method initializes jButtonAnnulationRDV	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAnnulationRDV() {
		if (jButtonAnnulationRDV == null) {
			jButtonAnnulationRDV = new JButton();
			jButtonAnnulationRDV.setBounds(new Rectangle(403, 12, 93, 18));
			jButtonAnnulationRDV.setText("Annuler");
		}
		return jButtonAnnulationRDV;
	}

	/**
	 * This method initializes jButtonAccueil	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAccueil() {
		if (jButtonAccueil == null) {
			jButtonAccueil = new JButton();
			jButtonAccueil.setBounds(new Rectangle(73, 7, 77, 24));
			jButtonAccueil.setText("Accueil");
		}
		return jButtonAccueil;
	}

	/**
	 * This method initializes jButtonPayement	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonPayement() {
		if (jButtonPayement == null) {
			jButtonPayement = new JButton();
			jButtonPayement.setBounds(new Rectangle(624, 6, 74, 24));
			jButtonPayement.setText("Payer");
		}
		return jButtonPayement;
	}

	/**
	 * This method initializes jTableCalendrierHoraires	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JScrollPane getJTableCalendrierHoraires() {
		if (jTableCalendrierHoraires == null) {
			rdvModel = new RdvModel();
			jTableCalendrierHoraires = new JTable(rdvModel);
			jTableCalendrierHoraires.setBounds(new Rectangle(386, 88, 375, 80));
			jScrollPane = new JScrollPane(jTableCalendrierHoraires);
		}
		return jScrollPane;
	}
	private void setValuesJComboBoxMedecin(String specialite) {
		List<Medecin> medecins = new ArrayList<Medecin>();
		RdvDAO rdvdao = new RdvDAO();
		medecins = rdvdao.findMedecinSpecialite(specialite);
		for (Medecin medecin : medecins) {
			jComboBoxMedecin.addItem(medecin.getNom());
		}

		
	}

}  //  @jve:decl-index=0:visual-constraint="63,2"
