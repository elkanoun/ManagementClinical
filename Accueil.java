package vue;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.Font;
import javax.swing.JButton;

import dao.Gestion_DB_gestionclinique;
import dao.SingletonConnection;

import java.awt.Color;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Accueil extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabelLogin = null;
	private JPanel jPanelImage = null;
	private JLabel jLabel1 = null;
	private JLabel jLabelImg = null;
	private JLabel jLabelImg2 = null;
	private JLabel jLabel2 = null;
	private JPanel jPanelMenu = null;
	private JButton jButtonPatient = null;
	private JButton jButtonMedecins = null;
	private JButton jButtonConsultation = null;
	private JButton jButtonTraitement = null;
	private JButton jButtonOperation = null;
	private JButton jButtonMaladie = null;
	private JButton jButtonService = null;
	private JButton jButtonChambre = null;
	private JButton jButtonBloc = null;
	private JButton jButtonHospitalisation = null;
	private JButton jButtonRDV = null;
	private JButton jButtonPayement = null;
	private JButton jButtonFacturation = null;
	private JButton jButtonRapport = null;
	private JButton jButtonAdministration = null;
	private JButton jButtonContacter = null;
	private String login;

	/**
	 * This is the default constructor
	 */
	public Accueil(String login) {
		super();
		this.login=login;
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1022, 500);
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
			jLabel2 = new JLabel();
			jLabel2.setText("Copyright c 2017");
			jLabel2.setBounds(new Rectangle(2, 444, 103, 16));
			jLabelImg2 = new JLabel();
			Image img =new ImageIcon(this.getClass().getResource("/img7.png")).getImage();
			jLabelImg2.setIcon(new ImageIcon(img));
			jLabelImg2.setBounds(new Rectangle(667, 120, 338, 341));
			jLabelImg2.setText("");
			
			jLabelLogin = new JLabel();
			jLabelLogin.setFont(new Font("Dialog", Font.BOLD, 12));
			jLabelLogin.setBounds(new Rectangle(809, 1, 195, 20));
			//récupération nom et prénom
			Gestion_DB_gestionclinique inf=new Gestion_DB_gestionclinique();
			jLabelLogin.setText(inf.informationsUser(login));
			jLabel = new JLabel();
			jLabel.setName("");
			jLabel.setBounds(new Rectangle(1, 1, 49, 20));
			jLabel.setText("Accueil");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(102, 102, 255));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabelLogin, null);
			jContentPane.add(getJPanelImage(), null);
			jContentPane.add(jLabelImg2, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getJPanelMenu(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanelImage	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelImage() {
		if (jPanelImage == null) {
			jLabelImg = new JLabel();
			Image img=new ImageIcon(this.getClass().getResource("/img5.jpg")).getImage();
			jLabelImg.setIcon(new ImageIcon(img));
			jLabelImg.setBounds(new Rectangle(457, 2, 106, 74));
			jLabelImg.setText("");
			
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(353, 20, 94, 16));
			jLabel1.setText("Clinique KMED");
			
			jPanelImage = new JPanel();
			jPanelImage.setLayout(null);
			jPanelImage.setBounds(new Rectangle(2, 21, 1001, 77));
			jPanelImage.setBackground(new Color(0, 153, 255));
			jPanelImage.add(jLabel1, null);
			jPanelImage.add(jLabelImg, null);
		}
		return jPanelImage;
	}

	/**
	 * This method initializes jPanelMenu	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelMenu() {
		if (jPanelMenu == null) {
			jPanelMenu = new JPanel();
			jPanelMenu.setLayout(null);
			jPanelMenu.setBounds(new Rectangle(4, 100, 661, 345));
			jPanelMenu.setBackground(SystemColor.controlHighlight);
			jPanelMenu.add(getJButtonPatient(), null);
			jPanelMenu.add(getJButtonMedecins(), null);
			jPanelMenu.add(getJButtonConsultation(), null);
			jPanelMenu.add(getJButtonTraitement(), null);
			jPanelMenu.add(getJButtonOperation(), null);
			jPanelMenu.add(getJButtonMaladie(), null);
			jPanelMenu.add(getJButtonService(), null);
			jPanelMenu.add(getJButtonChambre(), null);
			jPanelMenu.add(getJButtonBloc(), null);
			jPanelMenu.add(getJButtonHospitalisation(), null);
			jPanelMenu.add(getJButtonRDV(), null);
			jPanelMenu.add(getJButtonPayement(), null);
			jPanelMenu.add(getJButtonFacturation(), null);
			jPanelMenu.add(getJButtonRapport(), null);
			jPanelMenu.add(getJButtonAdministration(), null);
			jPanelMenu.add(getJButtonContacter(), null);
		}
		return jPanelMenu;
	}

	/**
	 * This method initializes jButtonPatient	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonPatient() {
		if (jButtonPatient == null) {
			jButtonPatient = new JButton();
			jButtonPatient.setBounds(new Rectangle(17, 60, 148, 51));
			jButtonPatient.setBackground(Color.green);
			jButtonPatient.setText("Gestion Patients");
			jButtonPatient.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					PatientIhm patient=new PatientIhm(login);
					//Accueil.this.setVisible(false);
					patient.setVisible(true);
					
				}
			});
		}
		return jButtonPatient;
	}

	/**
	 * This method initializes jButtonMedecins	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonMedecins() {
		if (jButtonMedecins == null) {
			jButtonMedecins = new JButton();
			jButtonMedecins.setBounds(new Rectangle(17, 117, 148, 51));
			jButtonMedecins.setBackground(Color.orange);
			jButtonMedecins.setText("Gestion Médecins");
			jButtonMedecins.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
				}
			});
		}
		return jButtonMedecins;
	}

	/**
	 * This method initializes jButtonConsultation	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonConsultation() {
		if (jButtonConsultation == null) {
			jButtonConsultation = new JButton();
			jButtonConsultation.setBounds(new Rectangle(17, 174, 148, 51));
			jButtonConsultation.setBackground(new Color(204, 204, 0));
			jButtonConsultation.setText("Gestion Consultations");
			jButtonConsultation.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ConsultationIhm consultation = new ConsultationIhm(login);
					consultation.setVisible(true);
				}
			});
		}
		return jButtonConsultation;
	}

	/**
	 * This method initializes jButtonTraitement	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonTraitement() {
		if (jButtonTraitement == null) {
			jButtonTraitement = new JButton();
			jButtonTraitement.setBounds(new Rectangle(17, 231, 148, 51));
			jButtonTraitement.setBackground(Color.magenta);
			jButtonTraitement.setText("Gestion Traitements");
			jButtonTraitement.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					
				}
			});
		}
		return jButtonTraitement;
	}

	/**
	 * This method initializes jButtonOperation	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonOperation() {
		if (jButtonOperation == null) {
			jButtonOperation = new JButton();
			jButtonOperation.setBounds(new Rectangle(170, 60, 148, 51));
			jButtonOperation.setBackground(Color.blue);
			jButtonOperation.setText("Gestion Operations");
			jButtonOperation.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
				}
			});
		}
		return jButtonOperation;
	}

	/**
	 * This method initializes jButtonMaladie	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonMaladie() {
		if (jButtonMaladie == null) {
			jButtonMaladie = new JButton();
			jButtonMaladie.setBounds(new Rectangle(170, 174, 148, 51));
			jButtonMaladie.setBackground(new Color(153, 0, 153));
			jButtonMaladie.setText("Maladies");
			jButtonMaladie.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					
				}
			});
		}
		return jButtonMaladie;
	}

	/**
	 * This method initializes jButtonService	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonService() {
		if (jButtonService == null) {
			jButtonService = new JButton();
			jButtonService.setBounds(new Rectangle(170, 231, 148, 51));
			jButtonService.setBackground(new Color(255, 255, 51));
			jButtonService.setText("Services");
			jButtonService.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ServiceIhm service = new ServiceIhm();
					service.setVisible(true);
				}
			});
		}
		return jButtonService;
	}

	/**
	 * This method initializes jButtonChambre	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonChambre() {
		if (jButtonChambre == null) {
			jButtonChambre = new JButton();
			jButtonChambre.setBounds(new Rectangle(322, 60, 148, 51));
			jButtonChambre.setBackground(Color.cyan);
			jButtonChambre.setText("Chambres");
			jButtonChambre.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
				}
			});
		}
		return jButtonChambre;
	}

	/**
	 * This method initializes jButtonBloc	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBloc() {
		if (jButtonBloc == null) {
			jButtonBloc = new JButton();
			jButtonBloc.setBounds(new Rectangle(322, 117, 148, 51));
			jButtonBloc.setBackground(new Color(102, 102, 255));
			jButtonBloc.setText("Blocs");
			jButtonBloc.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					BlocIhm bloc = new BlocIhm();
					bloc.setVisible(true);
				}
			});
		}
		return jButtonBloc;
	}

	/**
	 * This method initializes jButtonHospitalisation	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonHospitalisation() {
		if (jButtonHospitalisation == null) {
			jButtonHospitalisation = new JButton();
			jButtonHospitalisation.setBounds(new Rectangle(170, 117, 148, 51));
			jButtonHospitalisation.setFont(new Font("Dialog", Font.ITALIC, 10));
			jButtonHospitalisation.setBackground(Color.gray);
			jButtonHospitalisation.setText("Gestion Hospitalisations");
			jButtonHospitalisation.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
				}
			});
		}
		return jButtonHospitalisation;
	}

	/**
	 * This method initializes jButtonRDV	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonRDV() {
		if (jButtonRDV == null) {
			jButtonRDV = new JButton();
			jButtonRDV.setBounds(new Rectangle(322, 174, 148, 51));
			jButtonRDV.setBackground(new Color(102, 255, 102));
			jButtonRDV.setText("Gestion Rendez-Vous");
			jButtonRDV.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					RdvIhm rdv = new RdvIhm(login);
					rdv.setVisible(true);
				}
			});
		}
		return jButtonRDV;
	}

	/**
	 * This method initializes jButtonPayement	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonPayement() {
		if (jButtonPayement == null) {
			jButtonPayement = new JButton();
			jButtonPayement.setBounds(new Rectangle(503, 60, 148, 51));
			jButtonPayement.setBackground(new Color(255, 204, 204));
			jButtonPayement.setText("Payements");
			jButtonPayement.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
				}
			});
		}
		return jButtonPayement;
	}

	/**
	 * This method initializes jButtonFacturation	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonFacturation() {
		if (jButtonFacturation == null) {
			jButtonFacturation = new JButton();
			jButtonFacturation.setBounds(new Rectangle(503, 117, 148, 51));
			jButtonFacturation.setBackground(new Color(255, 255, 153));
			jButtonFacturation.setText("Facturation");
			jButtonFacturation.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
				}
			});
		}
		return jButtonFacturation;
	}

	/**
	 * This method initializes jButtonRapport	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonRapport() {
		if (jButtonRapport == null) {
			jButtonRapport = new JButton();
			jButtonRapport.setBounds(new Rectangle(503, 174, 148, 51));
			jButtonRapport.setBackground(Color.red);
			jButtonRapport.setText("Rapports");
			jButtonRapport.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				}
			});
		}
		return jButtonRapport;
	}

	/**
	 * This method initializes jButtonAdministration	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAdministration() {
		if (jButtonAdministration == null) {
			jButtonAdministration = new JButton();
			jButtonAdministration.setBounds(new Rectangle(322, 231, 148, 51));
			jButtonAdministration.setBackground(new Color(255, 153, 255));
			jButtonAdministration.setText("Administration");
			jButtonAdministration.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AdministrationIhm administration = new AdministrationIhm();
					administration.setVisible(true);
				}
			});
		}
		return jButtonAdministration;
	}

	/**
	 * This method initializes jButtonContacter	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonContacter() {
		if (jButtonContacter == null) {
			jButtonContacter = new JButton();
			jButtonContacter.setBounds(new Rectangle(503, 231, 148, 51));
			jButtonContacter.setBackground(new Color(204, 204, 255));
			jButtonContacter.setText("Nous Contactez");
			jButtonContacter.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ContactezIhm contact = new ContactezIhm();
					contact.setVisible(true);
					
				}
			});
		}
		return jButtonContacter;
	}

}  //  @jve:decl-index=0:visual-constraint="28,-56"
