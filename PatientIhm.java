package vue;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;

import controleur.Patient;

import dao.Gestion_DB_gestionclinique;
import dao.PatientDAO;
import dao.PatientModel;
import javax.swing.JEditorPane;

import com.mysql.jdbc.StringUtils;

public class PatientIhm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;//
	private JLabel jLabel = null;
	private JLabel jLabelLogin = null;
	private JPanel jPanelClinique = null;
	private JPanel jPanelFormulaire = null;
	private JPanel jPanelTable = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabelImage = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel15 = null;
	private JLabel jLabel16 = null;
	private JLabel jLabel17 = null;
	private JLabel jLabel18 = null;
	private JLabel jLabel19 = null;
	private JTable jTablePatients = null;
	private JScrollPane jScrollPane;
	private PatientModel patientModel;
	private JPanel jPanelTitreChercher = null;
	private JPanel jPanelTitreFormulaire = null;
	private JTextField jTextFieldNumPatient = null;
	private JTextField jTextFieldNomPatient = null;
	private JTextField jTextFieldPrenomPatient = null;
	private JComboBox jComboBoxSexePatient = null;
	private JTextField jTextFieldCinPatient = null;
	private JTextField jTextFieldNumFichePatient = null;
	private JTextField jTextFieldDateNaissancePatient = null;
	private JTextField jTextFieldProfessionPatient = null;
	private JTextField jTextFieldPoidsPatient = null;
	private JTextField jTextFieldEmailPatient = null;
	private JTextField jTextFieldTelPatient = null;
	private JTextField jTextFieldZoneRecherche = null;
	private JRadioButton jRadioButtonRechercheParNom = null;
	private JRadioButton jRadioButtonRechercheParCin = null;
	private JRadioButton jRadioButtonRechercheParNumFiche = null;
	private ButtonGroup bg;
    private JPanel jPanel = null;
	private JButton jButtonAjouterAccueil = null;
	private JButton jButtonAjouterPatient = null;
	private JButton jButtonModifierPatient = null;
	private JButton jButtonPrendreRDV = null;
	private JButton jButtonSupprimerPatient = null;
	private JButton jButtonExit = null;
	private JButton jButtonViderChamps = null;
	private String login;
	/**
	 * This is the default constructor
	 */
	public PatientIhm(String login) {
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
		this.setSize(1109, 520);
		this.setContentPane(getJContentPane());
		this.setTitle("KMED");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(3, 463, 99, 19));
			jLabel1.setText("Copyright c 2017");
			
			jLabelLogin = new JLabel();
			jLabelLogin.setBounds(new Rectangle(962, 2, 128, 22));
			//récupération nom et prénom
			Gestion_DB_gestionclinique inf=new Gestion_DB_gestionclinique();
			jLabelLogin.setText(inf.informationsUser(login));
			
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(1, 1, 163, 22));
			jLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
			jLabel.setText("Gestion Patients");
			
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.pink);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabelLogin, null);
			jContentPane.add(getJPanelClinique(), null);
			jContentPane.add(getJPanelFormulaire(), null);
			jContentPane.add(getJPanelTable(), null);
			jContentPane.add(jLabel1, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanelClinique	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelClinique() {
		if (jPanelClinique == null) {
			jLabelImage = new JLabel();
			Image img = new ImageIcon(getClass().getResource("/img5.jpg")).getImage();
			jLabelImage.setIcon(new ImageIcon(img));
			
			jLabelImage.setBounds(new Rectangle(535, 1, 100, 70));
			jLabelImage.setText("");
			
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(374, 19, 112, 16));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setText("Clinique KMED");
			
			jPanelClinique = new JPanel();
			jPanelClinique.setLayout(null);
			jPanelClinique.setBounds(new Rectangle(2, 24, 1089, 71));
			jPanelClinique.setBackground(Color.green);
			
			jPanelClinique.add(jLabel2, null);
			jPanelClinique.add(jLabelImage, null);
		}
		return jPanelClinique;
	}

	/**
	 * This method initializes jPanelFormulaire	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelFormulaire() {
		if (jPanelFormulaire == null) {
			
			jLabel19 = new JLabel();
			jLabel19.setBounds(new Rectangle(742, 178, 70, 16));
			jLabel19.setText("Tel Patient :");
			
			jLabel18 = new JLabel();
			jLabel18.setBounds(new Rectangle(26, 178, 82, 16));
			jLabel18.setText("Poids Patient :");
			
			jLabel17 = new JLabel();
			jLabel17.setBounds(new Rectangle(342, 180, 83, 16));
			jLabel17.setText("Email Patient :");
			
			jLabel16 = new JLabel();
			jLabel16.setBounds(new Rectangle(795, 140, 114, 16));
			jLabel16.setText("Profession Patient :");
			
			jLabel15 = new JLabel();
			jLabel15.setBounds(new Rectangle(561, 139, 53, 16));
			jLabel15.setText("Né(e) le :");
			
			jLabel14 = new JLabel();
			jLabel14.setBounds(new Rectangle(287, 140, 113, 16));
			jLabel14.setText("Num Fiche Patient :");
			
			jLabel13 = new JLabel();
			jLabel13.setBounds(new Rectangle(810, 89, 79, 16));
			jLabel13.setText("Sexe Patient :");
			
			jLabel12 = new JLabel();
			jLabel12.setBounds(new Rectangle(23, 138, 74, 16));
			jLabel12.setText("CIN Patient :");
			
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(561, 90, 94, 16));
			jLabel11.setText("Prenom Patient :");
			
			jLabel10 = new JLabel();
			jLabel10.setBounds(new Rectangle(284, 91, 79, 16));
			jLabel10.setText("Nom Patient :");
			
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(25, 87, 64, 16));
			jLabel9.setText("N° Patient :");
			
			jLabel8 = new JLabel();
			jLabel8.setText("Formulaire");
			jLabel8.setBounds(new Rectangle(2, 2, 68, 16));
			jLabel8.setBackground(new Color(49, 52, 245));
			
			jLabel7 = new JLabel();
			jLabel7.setText("Par Num Fiche");
			jLabel7.setBounds(new Rectangle(459, 31, 95, 16));
			jLabel6 = new JLabel();
			
			jLabel6.setText("Par Cin");
			jLabel6.setBounds(new Rectangle(375, 31, 49, 16));
			jLabel5 = new JLabel();
			
			jLabel5.setText("Par Nom");
			jLabel5.setBounds(new Rectangle(284, 31, 55, 16));
			jLabel4 = new JLabel();
			
			jLabel4.setText("chercher :");
			jLabel4.setBounds(new Rectangle(50, 30, 62, 11));
		
			jLabel3 = new JLabel();
			jLabel3.setText("Chercher");
			jLabel3.setBounds(new Rectangle(2, 0, 53, 16));
			
			jPanelFormulaire = new JPanel();
			jPanelFormulaire.setLayout(null);
			jPanelFormulaire.setBounds(new Rectangle(3, 95, 1086, 251));
			jPanelFormulaire.setBackground(Color.lightGray);
			jPanelFormulaire.setName("Ajouter");
			
			jPanelFormulaire.add(jLabel4, null);
			
			jPanelFormulaire.add(jLabel5, null);
			
			jPanelFormulaire.add(jLabel6, null);
			
			jPanelFormulaire.add(jLabel7, null);
			
			jPanelFormulaire.add(getJPanelTable(), null);
			
			jPanelFormulaire.add(jLabel9, null);
			
			jPanelFormulaire.add(jLabel10, null);
			
			jPanelFormulaire.add(jLabel11, null);
			
			jPanelFormulaire.add(jLabel12, null);
			
			jPanelFormulaire.add(jLabel13, null);
			
			jPanelFormulaire.add(jLabel14, null);
            
			jPanelFormulaire.add(jLabel15, null);
			
			jPanelFormulaire.add(jLabel16, null);
			
			jPanelFormulaire.add(jLabel17, null);
			
			jPanelFormulaire.add(jLabel18, null);
			
			jPanelFormulaire.add(jLabel19, null);
			jPanelFormulaire.add(getJPanelTitreChercher(), null);
			jPanelFormulaire.add(getJPanelTitreFormulaire(), null);
			
			jPanelFormulaire.add(getJTextFieldNumPatient(), null);
			jPanelFormulaire.add(getJTextFieldNomPatient(), null);
			jPanelFormulaire.add(getJTextFieldPrenomPatient(), null);
			jPanelFormulaire.add(getJComboBoxSexePatient(), null);
			jPanelFormulaire.add(getJTextFieldCinPatient(), null);
			jPanelFormulaire.add(getJTextFieldNumFichePatient(), null);
			jPanelFormulaire.add(getJTextFieldDateNaissancePatient(), null);
			jPanelFormulaire.add(getJTextFieldProfessionPatient(), null);
			jPanelFormulaire.add(getJTextFieldPoidsPatient(), null);
			jPanelFormulaire.add(getJTextFieldEmailPatient(), null);
			jPanelFormulaire.add(getJTextFieldTelPatient(), null);
			jPanelFormulaire.add(getJTextFieldZoneRecherche(), null);
			jPanelFormulaire.add(getJRadioButtonRechercheParNom(), null);
			jPanelFormulaire.add(getJRadioButtonRechercheParCin(), null);
			jPanelFormulaire.add(getJRadioButtonRechercheParNumFiche(), null);
			jPanelFormulaire.add(getJPanel(), null);
			
			
		}
		return jPanelFormulaire;
	}

	

	/**
	 * This method initializes jPanelTable	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelTable() {
		if (jPanelTable == null) {
			jPanelTable = new JPanel();
			jPanelTable.setLayout(new BorderLayout());
			jPanelTable.setBounds(new Rectangle(2, 345, 1088, 117));
			jPanelTable.setBackground(new Color(238, 238, 238));
			jPanelTable.add(getJTablePatients(), BorderLayout.CENTER);
		}
		return jPanelTable;
	}

	/**
	 * This method initializes jPanelTitreChercher	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelTitreChercher() {
		if (jPanelTitreChercher == null) {
			jPanelTitreChercher = new JPanel();
			jPanelTitreChercher.setLayout(null);
			jPanelTitreChercher.setBounds(new Rectangle(2, 1, 1082, 18));
			jPanelTitreChercher.setBackground(new Color(51, 51, 255));
			jPanelTitreChercher.add(jLabel3, null);
		}
		return jPanelTitreChercher;
	}

	/**
	 * This method initializes jPanelTitreFormulaire	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelTitreFormulaire() {
		if (jPanelTitreFormulaire == null) {
			jPanelTitreFormulaire = new JPanel();
			jPanelTitreFormulaire.setLayout(null);
			jPanelTitreFormulaire.setBounds(new Rectangle(1, 54, 1085, 18));
			jPanelTitreFormulaire.setBackground(new Color(51, 51, 255));
			jPanelTitreFormulaire.add(jLabel8, null);
		}
		return jPanelTitreFormulaire;
	}

	/**
	 * This method initializes jTextFieldNumPatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNumPatient() {
		if (jTextFieldNumPatient == null) {
			jTextFieldNumPatient = new JTextField();
			jTextFieldNumPatient.setBounds(new Rectangle(101, 85, 154, 20));
			
		}
		return jTextFieldNumPatient;
	}

	/**
	 * This method initializes jTextFieldNomPatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNomPatient() {
		if (jTextFieldNomPatient == null) {
			jTextFieldNomPatient = new JTextField();
			jTextFieldNomPatient.setBounds(new Rectangle(365, 90, 166, 20));
		}
		return jTextFieldNomPatient;
	}

	/**
	 * This method initializes jTextFieldPrenomPatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPrenomPatient() {
		if (jTextFieldPrenomPatient == null) {
			jTextFieldPrenomPatient = new JTextField();
			jTextFieldPrenomPatient.setBounds(new Rectangle(665, 87, 141, 20));
		}
		return jTextFieldPrenomPatient;
	}

	/**
	 * This method initializes jComboBoxSexePatient	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxSexePatient() {
		String selectedSexe;
		if (jComboBoxSexePatient == null) {
			String[] valeurs ={"M", "F"};
			jComboBoxSexePatient = new JComboBox(valeurs);
				jComboBoxSexePatient.setBounds(new Rectangle(900, 88, 60, 19));
			//programmation valeurs sexe
			jComboBoxSexePatient.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
				}
			});
			jComboBoxSexePatient.setSelectedIndex(0);

			
		}
		return jComboBoxSexePatient;
	}

	/**
	 * This method initializes jTextFieldCinPatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCinPatient() {
		if (jTextFieldCinPatient == null) {
	        jTextFieldCinPatient = new JTextField();
			jTextFieldCinPatient.setBounds(new Rectangle(103, 139, 153, 20));
		}
		return jTextFieldCinPatient;
	}

	/**
	 * This method initializes jTextFieldNumFichePatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNumFichePatient() {
		if (jTextFieldNumFichePatient == null) {
			jTextFieldNumFichePatient = new JTextField();
			jTextFieldNumFichePatient.setBounds(new Rectangle(399, 139, 132, 20));
		}
		return jTextFieldNumFichePatient;
	}

	/**
	 * This method initializes jTextFieldDateNaissancePatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldDateNaissancePatient() {
		if (jTextFieldDateNaissancePatient == null) {
			jTextFieldDateNaissancePatient = new JTextField();
			jTextFieldDateNaissancePatient.setBounds(new Rectangle(654, 140, 126, 20));
		}
		return jTextFieldDateNaissancePatient;
	}

	/**
	 * This method initializes jTextFieldProfessionPatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldProfessionPatient() {
		if (jTextFieldProfessionPatient == null) {
			jTextFieldProfessionPatient = new JTextField();
			jTextFieldProfessionPatient.setBounds(new Rectangle(913, 138, 153, 20));
		}
		return jTextFieldProfessionPatient;
	}

	/**
	 * This method initializes jTextFieldPoidsPatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPoidsPatient() {
		if (jTextFieldPoidsPatient == null) {
			jTextFieldPoidsPatient = new JTextField();
			jTextFieldPoidsPatient.setBounds(new Rectangle(115, 175, 154, 20));
		}
		return jTextFieldPoidsPatient;
	}

	/**
	 * This method initializes jTextFieldEmailPatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldEmailPatient() {
		if (jTextFieldEmailPatient == null) {
			jTextFieldEmailPatient = new JTextField();
			jTextFieldEmailPatient.setBounds(new Rectangle(429, 179, 183, 20));
		}
		return jTextFieldEmailPatient;
	}

	/**
	 * This method initializes jTextFieldTelPatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelPatient() {
		if (jTextFieldTelPatient == null) {
			jTextFieldTelPatient = new JTextField();
			jTextFieldTelPatient.setBounds(new Rectangle(822, 179, 202, 20));
		}
		return jTextFieldTelPatient;
	}

	/**
	 * This method initializes jTextFieldZoneRecherche	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldZoneRecherche() {
		if (jTextFieldZoneRecherche == null) {
			jTextFieldZoneRecherche = new JTextField();
			jTextFieldZoneRecherche.setBounds(new Rectangle(122, 28, 130, 20));
		}
		return jTextFieldZoneRecherche;
	}

	/**
	 * This method initializes jRadioButtonRechercheParNom	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButtonRechercheParNom() {
		if (jRadioButtonRechercheParNom == null) {
			jRadioButtonRechercheParNom = new JRadioButton();
			jRadioButtonRechercheParNom.setBounds(new Rectangle(261, 27, 21, 21));
			jRadioButtonRechercheParNom.addActionListener(new StateListener()); 

		}
		return jRadioButtonRechercheParNom;
	}

	/**
	 * This method initializes jRadioButtonRechercheParCin	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButtonRechercheParCin() {
		if (jRadioButtonRechercheParCin == null) {
			jRadioButtonRechercheParCin = new JRadioButton();
			jRadioButtonRechercheParCin.setBounds(new Rectangle(351, 27, 21, 21));
			jRadioButtonRechercheParCin.addActionListener(new StateListener()); 
			
		}
		return jRadioButtonRechercheParCin;
	}

	/**
	 * This method initializes jRadioButtonRechercheParNumFiche	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButtonRechercheParNumFiche() {
		if (jRadioButtonRechercheParNumFiche == null) {
			jRadioButtonRechercheParNumFiche = new JRadioButton();
			jRadioButtonRechercheParNumFiche.setBounds(new Rectangle(435, 26, 21, 21));
			jRadioButtonRechercheParNumFiche.addActionListener(new StateListener());
	        
		}
		return jRadioButtonRechercheParNumFiche;
	}
	

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(45, 204, 1020, 47));
			jPanel.setBackground(Color.blue);
			jPanel.setName("Ajouter");
			jPanel.add(getJButtonAjouterAccueil(), null);
			jPanel.add(getJButtonAjouterPatient(), null);
			jPanel.add(getJButtonModifierPatient(), null);
			jPanel.add(getJButtonPrendreRDV(), null);
			jPanel.add(getJButtonSupprimerPatient(), null);
			jPanel.add(getJButtonExit(), null);
			jPanel.add(getJButtonViderChamps(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jButtonAjouterAccueil	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAjouterAccueil() {
		if (jButtonAjouterAccueil == null) {
			jButtonAjouterAccueil = new JButton();
			jButtonAjouterAccueil.setBounds(new Rectangle(150, 12, 107, 31));
			jButtonAjouterAccueil.setText("Accueil");
			jButtonAjouterAccueil.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//programmation Accueil
					Authentification a = new Authentification();
					a.setVisible(true);
				}
			});
		}
		return jButtonAjouterAccueil;
	}

	/**
	 * This method initializes jButtonAjouterPatient	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAjouterPatient() {
		if (jButtonAjouterPatient == null) {
			jButtonAjouterPatient = new JButton();
			jButtonAjouterPatient.setBounds(new Rectangle(283, 12, 107, 31));
			jButtonAjouterPatient.setActionCommand("Ajouter");
			jButtonAjouterPatient.setText("Ajouter");
			jButtonAjouterPatient.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//programmation Ajouter
					String nom = jTextFieldNomPatient.getText();
					String prenom = jTextFieldPrenomPatient.getText();
					String sexe = (String) jComboBoxSexePatient.getSelectedItem();
					String cin = jTextFieldCinPatient.getText();
					String numFiche = jTextFieldNumFichePatient.getText();
				    String date = jTextFieldDateNaissancePatient.getText();
					String profession = jTextFieldProfessionPatient.getText();
					Float poids = Float.parseFloat(jTextFieldPoidsPatient.getText());
					String email = jTextFieldEmailPatient.getText();
					String tel = jTextFieldTelPatient.getText();
					
					PatientDAO patientdao = new PatientDAO();
					patientdao.save(new Patient(cin, nom, prenom, date, tel, sexe, email, poids, profession, numFiche));
				    		


					
				}
			});
		}
		return jButtonAjouterPatient;
	}

	/**
	 * This method initializes jButtonModifierPatient	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonModifierPatient() {
		if (jButtonModifierPatient == null) {
			jButtonModifierPatient = new JButton();
			jButtonModifierPatient.setBounds(new Rectangle(416, 12, 107, 31));
			jButtonModifierPatient.setText("Modifier");
			jButtonModifierPatient.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//programmation modification d'un patient
					int id = Integer.parseInt(jTextFieldNumPatient.getText());
					String nom = jTextFieldNomPatient.getText();
					String prenom = jTextFieldPrenomPatient.getText();
					String sexe = (String) jComboBoxSexePatient.getSelectedItem();
					String cin = jTextFieldCinPatient.getText();
					String numFiche = jTextFieldNumFichePatient.getText();
				    String date = jTextFieldDateNaissancePatient.getText();
					String profession = jTextFieldProfessionPatient.getText();
					Float poids = Float.parseFloat(jTextFieldPoidsPatient.getText());
					String email = jTextFieldEmailPatient.getText();
					String tel = jTextFieldTelPatient.getText();
					PatientDAO patientdao = new PatientDAO();
					patientdao.updatePatient(new Patient(cin, nom, prenom, date, tel, sexe, email, poids, profession, numFiche), id);
				}
			});
		}
		return jButtonModifierPatient;
	}

	/**
	 * This method initializes jButtonPrendreRDV	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonPrendreRDV() {
		if (jButtonPrendreRDV == null) {
			jButtonPrendreRDV = new JButton();
			jButtonPrendreRDV.setBounds(new Rectangle(682, 12, 107, 31));
			jButtonPrendreRDV.setActionCommand("");
			jButtonPrendreRDV.setText("Prendre RDV");
			jButtonPrendreRDV.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//programmation prendre RDV
					int idpatient = Integer.parseInt(jTextFieldNumPatient.getText());
					if(idpatient==0){
						RdvIhm rdv = new RdvIhm(login);
						rdv.setVisible(true);
					}else
					{
						RdvIhm rdv = new RdvIhm(login, idpatient);
						rdv.setVisible(true);


					}
					
				}
			});
			
		}
		return jButtonPrendreRDV;
	}

	/**
	 * This method initializes jButtonSupprimerPatient	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSupprimerPatient() {
		if (jButtonSupprimerPatient == null) {
			jButtonSupprimerPatient = new JButton();
			jButtonSupprimerPatient.setBounds(new Rectangle(549, 12, 107, 31));
			jButtonSupprimerPatient.setActionCommand("");
			jButtonSupprimerPatient.setText("Supprimer");
			jButtonSupprimerPatient.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//suppression d'un patient
					int id = Integer.parseInt(jTextFieldNumPatient.getText());
					PatientDAO pd = new PatientDAO();
					pd.deletePatient(id);
					
				}
			});
		}
		return jButtonSupprimerPatient;
	}

	/**
	 * This method initializes jButtonExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonExit() {
		if (jButtonExit == null) {
			jButtonExit = new JButton();
			jButtonExit.setBounds(new Rectangle(815, 12, 107, 31));
			jButtonExit.setActionCommand("");
			jButtonExit.setText("Exit");
		}
		return jButtonExit;
	}
	
	/**
	 * This method initializes jTablePatients	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JScrollPane getJTablePatients() {
		if (jTablePatients == null) {
			patientModel=new PatientModel();
			jTablePatients = new JTable(patientModel);
			jTablePatients.setBounds(new Rectangle(414, 19, 375, 80));
			jScrollPane = new JScrollPane(jTablePatients); 

		}
		return jScrollPane;
	}
	//programmation de recherche par num + cin + num fiche
	class StateListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			PatientDAO patientdao = new PatientDAO();
               if((JRadioButton)e.getSource()==jRadioButtonRechercheParCin){
				String cin = jTextFieldZoneRecherche.getText();
				//affichage table
				ArrayList<Patient> patient = (ArrayList<Patient>) patientdao.findCin(cin);
				patientModel.setData(patient);
				//affichage champs
				ArrayList<Patient> patientfields = (ArrayList<Patient>) patientdao.findCin(cin);
				setDataFields(patientfields);
				
			}
			else if((JRadioButton)e.getSource()==jRadioButtonRechercheParNom){
				String nom = jTextFieldZoneRecherche.getText();
				//affichage table
                ArrayList<Patient> patient = (ArrayList<Patient>) patientdao.findNom(nom);
				patientModel.setData(patient);
				//affichage champs
                ArrayList<Patient> patientfields = (ArrayList<Patient>) patientdao.findNom(nom);
                setDataFields(patientfields);
			}
			else{
				String numFiche = jTextFieldZoneRecherche.getText();
				//affichage table
				ArrayList<Patient> patient = (ArrayList<Patient>) patientdao.findNumFiche(numFiche);
				patientModel.setData(patient);
				//affichage champs
                ArrayList<Patient> patientfields = (ArrayList<Patient>) patientdao.findNumFiche(numFiche);
                setDataFields(patientfields);
				
			}
		
			
		}
			
		}
	

	/**
	 * This method initializes jButtonViderChamps	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonViderChamps() {
		if (jButtonViderChamps == null) {
			jButtonViderChamps = new JButton();
			jButtonViderChamps.setBounds(new Rectangle(17, 11, 107, 31));
			jButtonViderChamps.setText("Vider");
			jButtonViderChamps.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//programmation Vider
					viderChamps();
				}

				
			});
		}
		return jButtonViderChamps;
	}
	/*
	 * méthode de récupération des données dans les champs
	 */
	public void setDataFields(ArrayList<Patient> patientfields){
		for (Patient patientfield : patientfields) {
			jTextFieldNumPatient.setText(String.valueOf(patientfield.getIdPatient()));
			jTextFieldNomPatient.setText(patientfield.getNom());
			jTextFieldPrenomPatient.setText(patientfield.getPrenom());
			jComboBoxSexePatient.setToolTipText(patientfield.getSexe());
			jTextFieldCinPatient.setText(patientfield.getCin());
			jTextFieldDateNaissancePatient.setText(String.valueOf(patientfield.getDateNaissance()));
			jTextFieldProfessionPatient.setText(patientfield.getProfessionPatient());
			jTextFieldPoidsPatient.setText(String.valueOf(patientfield.getPoidsPatient()));
			jTextFieldNumFichePatient.setText(patientfield.getNumFiche());
			jTextFieldEmailPatient.setText(patientfield.getEmail());
			jTextFieldTelPatient.setText(patientfield.getnTel());

		}
		}
	
	//vider les champs
	private void viderChamps() {
		jTextFieldNumPatient.setText("");
		jTextFieldNomPatient.setText("");
		jTextFieldPrenomPatient.setText("");
		jComboBoxSexePatient.setToolTipText("");
		jTextFieldCinPatient.setText("");
		jTextFieldDateNaissancePatient.setText("");
		jTextFieldProfessionPatient.setText("");
		jTextFieldPoidsPatient.setText("");
		jTextFieldNumFichePatient.setText("");
		jTextFieldEmailPatient.setText("");
		jTextFieldTelPatient.setText("");

		
	}
	

}  //  @jve:decl-index=0:visual-constraint="18,9"
