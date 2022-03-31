package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import controleur.Consultation;
import controleur.Patient;
import dao.ConsultationDAO;
import dao.ConsultationModel;
import dao.Gestion_DB_gestionclinique;

public class ConsultationIhm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JLabel jLabelTitre1 = null;
	private JLabel jLabelLogin = null;
	private JLabel jLabelTitre2 = null;
	private JLabel jLabelImage = null;
	private JPanel jPanel1 = null;
	private JPanel jPanelConsultations = null;
	private JTable jTableConsultations = null;
	private JPanel jPanel3 = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField jTextFieldNumConsultation = null;
	private JLabel jLabel2 = null;
	private JTextField jTextFieldFraisConsultation = null;
	private JLabel jLabel3 = null;
	private JTextField jTextFieldDateActuel = null;
	private JLabel jLabel4 = null;
	private JTextField jTextFieldNumPatient = null;
	private JLabel jLabel5 = null;
	private JTextField jTextFieldNumMedecin = null;
	private JLabel jLabel6 = null;
	private JPanel jPanel4 = null;
	private JButton jButtonGestionRDV = null;
	private JButton jButtonModifier = null;
	private JButton jButtonSupprimer = null;
	private JButton jButtonVider = null;
	private JButton jButtonAccueil = null;
	private JLabel jLabel7 = null;
	private TextArea textAreaObservation = null;
	private Label label = null;
	private Label label1 = null;
	private Label label2 = null;
	private TextField jTextFieldDateRDV = null;
	private TextField jTextFieldDateConsultation = null;
	private String login;
	private JRadioButton jRadioButtonRechercheParNumPatient = null;
	private JRadioButton jRadioButtonRechercheParCin = null;
	private JLabel jLabel71 = null;
	private JLabel jLabel72 = null;
	private JTextField jTextFieldZoneRecherche = null;
	private ConsultationModel consultationModel;
	private JScrollPane jScrollPane;
	private JLabel jLabel73 = null;
	private JTextField jTextFieldTypeConsultation = null;
	private JTextField jTextFieldHoraireConsultation = null;
	private JLabel jLabel74 = null;
	/**
	 * This is the default constructor
	 */
	public ConsultationIhm(String login) {
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
		this.setSize(1109, 516);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setText("  Formulaire :");
			jLabel.setBounds(new Rectangle(0, 2, 79, 16));
			
			jLabelLogin = new JLabel();
			jLabelLogin.setBounds(new Rectangle(872, 0, 219, 22));
			jLabelLogin.setFont(new Font("Dialog", Font.BOLD, 18));
			Gestion_DB_gestionclinique gdb = new Gestion_DB_gestionclinique();
			jLabelLogin.setText(gdb.informationsUser(login));
			
			jLabelTitre1 = new JLabel();
			jLabelTitre1.setBounds(new Rectangle(2, 2, 216, 22));
			jLabelTitre1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabelTitre1.setText("Gestion Consultations");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.pink);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(jLabelTitre1, null);
			jContentPane.add(jLabelLogin, null);
			jContentPane.add(getJPanel1(), null);
			jContentPane.add(getJPanelConsultations(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabelImage = new JLabel();
			Image img=new ImageIcon(this.getClass().getResource("/img5.jpg")).getImage();
			jLabelImage.setIcon(new ImageIcon(img));
			jLabelImage.setBounds(new Rectangle(648, 4, 99, 69));
			jLabelImage.setText("");
			
			jLabelTitre2 = new JLabel();
			jLabelTitre2.setBounds(new Rectangle(457, 13, 116, 16));
			jLabelTitre2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabelTitre2.setText("Clinique KMED");
			
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(-1, 23, 1093, 73));
			jPanel.setBackground(Color.cyan);
			jPanel.add(jLabelTitre2, null);
			jPanel.add(jLabelImage, null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jLabel74 = new JLabel();
			jLabel74.setBounds(new Rectangle(503, 114, 68, 16));
			jLabel74.setText("Horaire :");
			label2 = new Label();
			label2.setBounds(new Rectangle(266, 108, 110, 23));
			label2.setFont(new Font("Dialog", Font.BOLD, 12));
			label2.setText("Date Consultation :");
			label1 = new Label();
			label1.setBounds(new Rectangle(9, 112, 66, 16));
			label1.setFont(new Font("Dialog", Font.BOLD, 12));
			label1.setText("Date RDV :");
			label = new Label();
			label.setBounds(new Rectangle(501, 78, 115, 16));
			label.setFont(new Font("Dialog", Font.BOLD, 12));
			label.setText("Frais Consultation  :");
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(668, 30, 157, 20));
			jLabel6.setText("Observation Consultation  :");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(6, 69, 90, 17));
			jLabel5.setText("Num Médecin :");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(493, 34, 86, 16));
			jLabel4.setText("Num Patient  :");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(268, 71, 49, 20));
			jLabel3.setText("Date :");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(268, 32, 110, 16));
			jLabel2.setText("Type Consultation :");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(5, 29, 115, 16));
			jLabel1.setText("Num Consultation  :");
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBounds(new Rectangle(29, 99, 1040, 219));
			jPanel1.setBackground(Color.lightGray);
			jPanel1.add(getJPanel3(), null);
			jPanel1.add(jLabel1, null);
			jPanel1.add(getJTextFieldNumConsultation(), null);
			jPanel1.add(jLabel2, null);
			jPanel1.add(getJTextFieldFraisConsultation(), null);
			jPanel1.add(jLabel3, null);
			jPanel1.add(getJTextFieldDateActuel(), null);
			jPanel1.add(jLabel4, null);
			jPanel1.add(getJTextFieldNumPatient(), null);
			jPanel1.add(jLabel5, null);
			jPanel1.add(getJTextFieldNumMedecin(), null);
			jPanel1.add(jLabel6, null);
			jPanel1.add(getJPanel4(), null);
			jPanel1.add(getTextAreaObservation(), null);
			jPanel1.add(label, null);
			jPanel1.add(label1, null);
			jPanel1.add(label2, null);
			jPanel1.add(getJTextFieldDateRDV(), null);
			jPanel1.add(getJTextFieldDateConsultation(), null);
			jPanel1.add(getJTextFieldTypeConsultation(), null);
			jPanel1.add(getJTextFieldHoraireConsultation(), null);
			jPanel1.add(jLabel74, null);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jPanelConsultations	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelConsultations() {
		if (jPanelConsultations == null) {
			jPanelConsultations = new JPanel();
			jPanelConsultations.setLayout(new BorderLayout());
			jPanelConsultations.setBounds(new Rectangle(3, 320, 1088, 154));
			jPanelConsultations.add(getJTableConsultations(), BorderLayout.CENTER);
		}
		return jPanelConsultations;
	}

	/**
	 * This method initializes jTableConsultations	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JScrollPane getJTableConsultations() {
		if (jTableConsultations == null) {
			consultationModel = new ConsultationModel();
			jTableConsultations = new JTable(consultationModel);
			jTableConsultations.setBounds(new Rectangle(303, 33, 375, 80));
			jScrollPane = new JScrollPane(jTableConsultations);
			
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jPanel3	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jPanel3 = new JPanel();
			jPanel3.setLayout(null);
			jPanel3.setBounds(new Rectangle(0, 0, 1089, 19));
			jPanel3.setBackground(new Color(0, 153, 255));
			jPanel3.add(jLabel, null);
		}
		return jPanel3;
	}

	/**
	 * This method initializes jTextFieldNumConsultation	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNumConsultation() {
		if (jTextFieldNumConsultation == null) {
			jTextFieldNumConsultation = new JTextField();
			jTextFieldNumConsultation.setBounds(new Rectangle(122, 28, 138, 20));
		}
		return jTextFieldNumConsultation;
	}

	/**
	 * This method initializes jTextFieldFraisConsultation	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFraisConsultation() {
		if (jTextFieldFraisConsultation == null) {
			jTextFieldFraisConsultation = new JTextField();
			jTextFieldFraisConsultation.setBounds(new Rectangle(618, 76, 155, 20));
		}
		return jTextFieldFraisConsultation;
	}

	/**
	 * This method initializes jTextFieldDateActuel	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldDateActuel() {
		if (jTextFieldDateActuel == null) {
			jTextFieldDateActuel = new JTextField();
			jTextFieldDateActuel.setBounds(new Rectangle(380, 71, 105, 24));
		}
		return jTextFieldDateActuel;
	}

	/**
	 * This method initializes jTextFieldNumPatient	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNumPatient() {
		if (jTextFieldNumPatient == null) {
			jTextFieldNumPatient = new JTextField();
			jTextFieldNumPatient.setBounds(new Rectangle(580, 31, 84, 20));
		}
		return jTextFieldNumPatient;
	}

	/**
	 * This method initializes jTextFieldNumMedecin	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNumMedecin() {
		if (jTextFieldNumMedecin == null) {
			jTextFieldNumMedecin = new JTextField();
			jTextFieldNumMedecin.setBounds(new Rectangle(121, 68, 69, 20));
		}
		return jTextFieldNumMedecin;
	}

	/**
	 * This method initializes jPanel4	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			jLabel73 = new JLabel();
			jLabel73.setBounds(new Rectangle(1, 17, 75, 16));
			jLabel73.setFont(new Font("Dialog", Font.BOLD, 12));
			jLabel73.setText("Rechercher :");
			jLabel72 = new JLabel();
			jLabel72.setBounds(new Rectangle(202, 44, 72, 16));
			jLabel72.setText("Par CIN");
			jLabel71 = new JLabel();
			jLabel71.setBounds(new Rectangle(201, 2, 100, 16));
			jLabel71.setText("Par Num Patient ");
			jPanel4 = new JPanel();
			jPanel4.setLayout(null);
			jPanel4.setBounds(new Rectangle(71, 138, 897, 64));
			jPanel4.setBackground(Color.gray);
			jPanel4.add(getJButtonGestionRDV(), null);
			jPanel4.add(getJButtonModifier(), null);
			jPanel4.add(getJButtonSupprimer(), null);
			jPanel4.add(getJButtonVider(), null);
			jPanel4.add(getJButtonAccueil(), null);
			jPanel4.add(getJRadioButtonRechercheParNumPatient(), null);
			jPanel4.add(getJRadioButtonRechercheParCin(), null);
			jPanel4.add(jLabel71, null);
			jPanel4.add(jLabel72, null);
			jPanel4.add(getJTextFieldZoneRecherche(), null);
			jPanel4.add(jLabel73, null);
		}
		return jPanel4;
	}

	/**
	 * This method initializes jButtonGestionRDV	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonGestionRDV() {
		if (jButtonGestionRDV == null) {
			jButtonGestionRDV = new JButton();
			jButtonGestionRDV.setText("Gestion RDV");
			jButtonGestionRDV.setActionCommand("");
			jButtonGestionRDV.setBounds(new Rectangle(295, 19, 107, 31));
			jButtonGestionRDV.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//Rtour au RDV
				
					
				}
			});
		}
		return jButtonGestionRDV;
	}

	/**
	 * This method initializes jButtonModifier	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonModifier() {
		if (jButtonModifier == null) {
			jButtonModifier = new JButton();
			jButtonModifier.setBounds(new Rectangle(418, 23, 107, 31));
			jButtonModifier.setText("Modifier");
		}
		return jButtonModifier;
	}

	/**
	 * This method initializes jButtonSupprimer	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSupprimer() {
		if (jButtonSupprimer == null) {
			jButtonSupprimer = new JButton();
			jButtonSupprimer.setBounds(new Rectangle(538, 21, 107, 31));
			jButtonSupprimer.setText("Supprimer");
		}
		return jButtonSupprimer;
	}

	/**
	 * This method initializes jButtonVider	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonVider() {
		if (jButtonVider == null) {
			jButtonVider = new JButton();
			jButtonVider.setBounds(new Rectangle(660, 19, 107, 31));
			jButtonVider.setActionCommand("");
			jButtonVider.setText("Vider");
			jButtonVider.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//vider champs
					viderChamps();
				}

				
			});
		}
		return jButtonVider;
	}

	/**
	 * This method initializes jButtonAccueil	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAccueil() {
		if (jButtonAccueil == null) {
			jButtonAccueil = new JButton();
			jButtonAccueil.setBounds(new Rectangle(781, 20, 107, 31));
			jButtonAccueil.setText("Accueil");
			jButtonAccueil.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//accueil
					Accueil accueil = new Accueil(login);
					accueil.setVisible(true);
					
				}
			});
		}
		return jButtonAccueil;
	}

	

	/**
	 * This method initializes textAreaObservation	
	 * 	
	 * @return java.awt.TextArea	
	 */
	private TextArea getTextAreaObservation() {
		if (textAreaObservation == null) {
			textAreaObservation = new TextArea();
			textAreaObservation.setBounds(new Rectangle(828, 28, 204, 103));
		}
		return textAreaObservation;
	}

	/**
	 * This method initializes jTextFieldDateRDV	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getJTextFieldDateRDV() {
		if (jTextFieldDateRDV == null) {
			jTextFieldDateRDV = new TextField();
			jTextFieldDateRDV.setBounds(new Rectangle(130, 106, 99, 23));
		}
		return jTextFieldDateRDV;
	}

	/**
	 * This method initializes jTextFieldDateConsultation	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getJTextFieldDateConsultation() {
		if (jTextFieldDateConsultation == null) {
			jTextFieldDateConsultation = new TextField();
			jTextFieldDateConsultation.setBounds(new Rectangle(383, 109, 95, 23));
		}
		return jTextFieldDateConsultation;
	}

	/**
	 * This method initializes jRadioButtonRechercheParNumPatient	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButtonRechercheParNumPatient() {
		if (jRadioButtonRechercheParNumPatient == null) {
			jRadioButtonRechercheParNumPatient = new JRadioButton();
			jRadioButtonRechercheParNumPatient.setBounds(new Rectangle(174, 0, 19, 21));
			jRadioButtonRechercheParNumPatient.setText("");
			jRadioButtonRechercheParNumPatient.addActionListener(new CritereChoix());
		}
		return jRadioButtonRechercheParNumPatient;
	}

	/**
	 * This method initializes jRadioButtonRechercheParCin	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButtonRechercheParCin() {
		if (jRadioButtonRechercheParCin == null) {
			jRadioButtonRechercheParCin = new JRadioButton();
			jRadioButtonRechercheParCin.setBounds(new Rectangle(174, 38, 19, 21));
			jRadioButtonRechercheParCin.addActionListener(new CritereChoix());
		}
		return jRadioButtonRechercheParCin;
	}

	/**
	 * This method initializes jTextFieldZoneRecherche	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldZoneRecherche() {
		if (jTextFieldZoneRecherche == null) {
			jTextFieldZoneRecherche = new JTextField();
			jTextFieldZoneRecherche.setBounds(new Rectangle(77, 14, 95, 24));
		}
		return jTextFieldZoneRecherche;
	}
	//programmation recherche consultations d'un patient par CIN et par NumPatient
	class CritereChoix implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			ConsultationDAO consultationdao = new ConsultationDAO();
			if((JRadioButton)e.getSource()==jRadioButtonRechercheParCin){
				String cin = jTextFieldZoneRecherche.getText();
				//affichage table
				ArrayList<Consultation> consultations = (ArrayList<Consultation>) consultationdao.rechercheAllConsCinPatient(cin);
				consultationModel.setData(consultations);
				//affichage champs
				ArrayList<Consultation> consultationfields = (ArrayList<Consultation>) consultationdao.rechercheAllConsCinPatient(cin);
				setDataFields(consultationfields);
				
			}
			else{
				int idpatient = Integer.parseInt(jTextFieldZoneRecherche.getText());
				//affichage table
                ArrayList<Consultation> consultations = (ArrayList<Consultation>) consultationdao.rechercheAllConsIdPatient(idpatient);
				consultationModel.setData(consultations);
				//affichage champs
                ArrayList<Consultation> consultationsfields = (ArrayList<Consultation>) consultationdao.rechercheAllConsIdPatient(idpatient);
                setDataFields(consultationsfields);
			}
			
		
			
		
			
		}

		private void setDataFields(ArrayList<Consultation> consultationfields) {
			for (Consultation consultation : consultationfields) {
				jTextFieldNumConsultation.setText(String.valueOf(consultation.getIdConsultation()));
				jTextFieldTypeConsultation.setText(consultation.getTypeConsultation());
				jTextFieldNumPatient.setText(String.valueOf(consultation.getPatient().getIdPatient()));
				textAreaObservation.setText(consultation.getObsReception());
				jTextFieldNumMedecin.setText(String.valueOf(consultation.getMedecin().getIdMedecin()));
				jTextFieldDateActuel.setText(String.valueOf(consultation.getDate()));
				jTextFieldFraisConsultation.setText(String.valueOf(consultation.getFraisConsultation()));
                jTextFieldHoraireConsultation.setText(consultation.getHoraire());
				jTextFieldDateRDV.setText(String.valueOf(consultation.getDateRDV()));
				jTextFieldDateConsultation.setText(String.valueOf(consultation.getDateConsultation()));
			}
			
		}
		
	}
	/**
	 * This method initializes jTextFieldTypeConsultation	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTypeConsultation() {
		if (jTextFieldTypeConsultation == null) {
			jTextFieldTypeConsultation = new JTextField();
			jTextFieldTypeConsultation.setBounds(new Rectangle(384, 34, 100, 20));
		}
		return jTextFieldTypeConsultation;
	}
	
	//méthode pour vider les champs
	private void viderChamps() {
		jTextFieldNumConsultation.setText("");
		jTextFieldTypeConsultation.setText("");
		jTextFieldNumPatient.setText("");
		textAreaObservation.setText("");
		jTextFieldNumMedecin.setText("");
		jTextFieldHoraireConsultation.setText("");
		jTextFieldDateActuel.setText("");
		jTextFieldFraisConsultation.setText("");
		jTextFieldDateRDV.setText("");
		jTextFieldDateConsultation.setText("");		
	}

	/**
	 * This method initializes jTextFieldHoraireConsultation	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldHoraireConsultation() {
		if (jTextFieldHoraireConsultation == null) {
			jTextFieldHoraireConsultation = new JTextField();
			jTextFieldHoraireConsultation.setBounds(new Rectangle(619, 114, 160, 20));
		}
		return jTextFieldHoraireConsultation;
	}

}  //  @jve:decl-index=0:visual-constraint="81,23"
