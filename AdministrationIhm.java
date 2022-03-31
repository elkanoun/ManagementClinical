package vue;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.omg.CORBA.PRIVATE_MEMBER;

import controleur.User;

import dao.AdministrationDAO;
import dao.UserModel;

import util.Util;

import java.awt.Point;
import java.util.ArrayList;

public class AdministrationIhm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JLabel jLabelTitre1 = null;
	private JLabel jLabelLogin = null;
	private JLabel jLabelTitre2 = null;
	private JLabel jLabelImage = null;
	private JPanel jPanel1 = null;
	private JPanel jPanel2 = null;
	private JTable jTableUsers = null;
	private JPanel jPanel3 = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField jTextFieldNumUser = null;
	private JLabel jLabel2 = null;
	private JTextField jTextFieldNom = null;
	private JLabel jLabel3 = null;
	private JTextField jTextFieldPrenom = null;
	private JLabel jLabel4 = null;
	private JTextField jTextFieldTache = null;
	private JLabel jLabel5 = null;
	private JTextField jTextFieldLogin = null;
	private JLabel jLabel6 = null;
	private JTextField jTextFieldPass = null;
	private JPanel jPanel4 = null;
	private JButton jButtonAjouter = null;
	private JButton jButtonRechercher = null;
	private JButton jButtonModifier = null;
	private JButton jButtonSupprimer = null;
	private JButton jButtonExit = null;
	private JButton jButtonAccueil = null;
	private UserModel userModel;
	private JScrollPane jScrollPane;

	/**
	 * This is the default constructor
	 */
	public AdministrationIhm() {
		super();
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
			jLabelLogin.setText("");
			
			jLabelTitre1 = new JLabel();
			jLabelTitre1.setBounds(new Rectangle(2, 2, 133, 22));
			jLabelTitre1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabelTitre1.setText("Gestion Users");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(204, 255, 255));
			jContentPane.add(getJPanel(), null);
			jContentPane.add(jLabelTitre1, null);
			jContentPane.add(jLabelLogin, null);
			jContentPane.add(getJPanel1(), null);
			jContentPane.add(getJPanel2(), null);
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
			jLabelImage.setBounds(new Rectangle(648, 1, 99, 72));
			jLabelImage.setText("");
			
			jLabelTitre2 = new JLabel();
			jLabelTitre2.setBounds(new Rectangle(457, 13, 116, 16));
			jLabelTitre2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabelTitre2.setText("Clinique KMED");
			
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(-1, 23, 1093, 73));
			jPanel.setBackground(new Color(255, 153, 255));
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
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(771, 77, 63, 16));
			jLabel6.setText("Pass :");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(402, 83, 52, 16));
			jLabel5.setText("Login :");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(96, 84, 66, 16));
			jLabel4.setText("Tâche :");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(770, 32, 64, 16));
			jLabel3.setText("Prenom :");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(399, 31, 58, 16));
			jLabel2.setText("Nom :");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(100, 32, 67, 16));
			jLabel1.setText("Num user :");
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBounds(new Rectangle(29, 99, 1040, 219));
			jPanel1.setBackground(Color.lightGray);
			jPanel1.add(getJPanel3(), null);
			jPanel1.add(jLabel1, null);
			jPanel1.add(getJTextFieldNumUser(), null);
			jPanel1.add(jLabel2, null);
			jPanel1.add(getJTextFieldNom(), null);
			jPanel1.add(jLabel3, null);
			jPanel1.add(getJTextFieldPrenom(), null);
			jPanel1.add(jLabel4, null);
			jPanel1.add(getJTextFieldTache(), null);
			jPanel1.add(jLabel5, null);
			jPanel1.add(getJTextFieldLogin(), null);
			jPanel1.add(jLabel6, null);
			jPanel1.add(getJTextFieldPass(), null);
			jPanel1.add(getJPanel4(), null);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			
			jPanel2 = new JPanel();
			jPanel2.setLayout(new BorderLayout());
			jPanel2.setBounds(new Rectangle(3, 320, 1088, 154));
			
			jPanel2.add(getJTableUsers(), BorderLayout.CENTER);
		}
		return jPanel2;
	}

	/**
	 * This method initializes jTableUsers	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JScrollPane getJTableUsers() {
		if (jTableUsers == null) {
		    userModel = new UserModel();
			jTableUsers = new JTable(userModel);
			jTableUsers.setBounds(new Rectangle(303, 33, 375, 80));
            jScrollPane = new JScrollPane(jTableUsers);
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
			jPanel3.setBounds(new Rectangle(0, 0, 1040, 19));
			jPanel3.setBackground(new Color(0, 153, 255));
			jPanel3.add(jLabel, null);
		}
		return jPanel3;
	}

	/**
	 * This method initializes jTextFieldNumUser	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNumUser() {
		if (jTextFieldNumUser == null) {
			jTextFieldNumUser = new JTextField();
			jTextFieldNumUser.setBounds(new Rectangle(177, 31, 138, 20));
		}
		return jTextFieldNumUser;
	}

	/**
	 * This method initializes jTextFieldNom	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNom() {
		if (jTextFieldNom == null) {
			jTextFieldNom = new JTextField();
			jTextFieldNom.setBounds(new Rectangle(462, 30, 172, 20));
		}
		return jTextFieldNom;
	}

	/**
	 * This method initializes jTextFieldPrenom	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPrenom() {
		if (jTextFieldPrenom == null) {
			jTextFieldPrenom = new JTextField();
			jTextFieldPrenom.setBounds(new Rectangle(844, 32, 161, 20));
		}
		return jTextFieldPrenom;
	}

	/**
	 * This method initializes jTextFieldTache	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTache() {
		if (jTextFieldTache == null) {
			jTextFieldTache = new JTextField();
			jTextFieldTache.setBounds(new Rectangle(181, 82, 135, 20));
		}
		return jTextFieldTache;
	}

	/**
	 * This method initializes jTextFieldLogin	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldLogin() {
		if (jTextFieldLogin == null) {
			jTextFieldLogin = new JTextField();
			jTextFieldLogin.setBounds(new Rectangle(464, 81, 171, 20));
		}
		return jTextFieldLogin;
	}

	/**
	 * This method initializes jTextFieldPass	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPass() {
		if (jTextFieldPass == null) {
			jTextFieldPass = new JTextField();
			jTextFieldPass.setBounds(new Rectangle(846, 75, 160, 20));
		}
		return jTextFieldPass;
	}

	/**
	 * This method initializes jPanel4	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			jPanel4 = new JPanel();
			jPanel4.setLayout(null);
			jPanel4.setBounds(new Rectangle(122, 138, 859, 64));
			jPanel4.setBackground(Color.gray);
			jPanel4.add(getJButtonAjouter(), null);
			jPanel4.add(getJButtonRechercher(), null);
			jPanel4.add(getJButtonModifier(), null);
			jPanel4.add(getJButtonSupprimer(), null);
			jPanel4.add(getJButtonExit(), null);
			jPanel4.add(getJButtonAccueil(), null);
		}
		return jPanel4;
	}

	/**
	 * This method initializes jButtonAjouter	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAjouter() {
		if (jButtonAjouter == null) {
			jButtonAjouter = new JButton();
			jButtonAjouter.setBounds(new Rectangle(17, 17, 107, 31));
			jButtonAjouter.setText("Ajouter");
			jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//programmation d'Ajout d'un utilisateur
					 AdministrationDAO adm = new AdministrationDAO();
					 adm.save(new User(jTextFieldNom.getText(), jTextFieldPrenom.getText(), jTextFieldTache.getText(),
							 jTextFieldLogin.getText(), jTextFieldPass.getText()));
				}
			});
		}
		return jButtonAjouter;
	}

	/**
	 * This method initializes jButtonRechercher	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonRechercher() {
		if (jButtonRechercher == null) {
			jButtonRechercher = new JButton();
			jButtonRechercher.setText("Rechercher");
			jButtonRechercher.setBounds(new Rectangle(150, 17, 107, 31));
			jButtonRechercher.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				//Programmation recherche user
					String login = jTextFieldLogin.getText();
					AdministrationDAO adm = new AdministrationDAO();
					ArrayList<User> usr = (ArrayList<User>) adm.rechercherLoginTable(login);
					userModel.setData(usr);
					
			    //---récupération recherche dans champs
					User u = adm.rechercherLoginChamps(login);
					jTextFieldNumUser.setText(String.valueOf(u.getId()));
					jTextFieldNom.setText(u.getNom());
					jTextFieldPrenom.setText(u.getPrenom());
					jTextFieldTache.setText(u.getTache());
					jTextFieldLogin.setText(u.getLogin());
					jTextFieldPass.setText(u.getPass());
					



				}
			});
		}
		return jButtonRechercher;
	}

	/**
	 * This method initializes jButtonModifier	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonModifier() {
		if (jButtonModifier == null) {
			jButtonModifier = new JButton();
			jButtonModifier.setBounds(new Rectangle(283, 17, 107, 31));
			jButtonModifier.setText("Modifier");
			jButtonModifier.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//programmation modifier
					int num = Integer.parseInt(jTextFieldNumUser.getText());
					String nom = jTextFieldNom.getText();
					String prenom = jTextFieldPrenom.getText();
					String tache = jTextFieldTache.getText();
					String login = jTextFieldLogin.getText();
					String pass = jTextFieldPass.getText();
					AdministrationDAO ad = new AdministrationDAO();
					ad.modifier(new User(nom, prenom, tache, login, pass), num);
					
				}
			});
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
			jButtonSupprimer.setBounds(new Rectangle(416, 17, 107, 31));
			jButtonSupprimer.setText("Supprimer");
			jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//programmation suppression
					int num = Integer.parseInt(jTextFieldNumUser.getText());
					AdministrationDAO adm =new AdministrationDAO();
					adm.delete(num);

				}
			});
		}
		return jButtonSupprimer;
	}

	/**
	 * This method initializes jButtonExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonExit() {
		if (jButtonExit == null) {
			jButtonExit = new JButton();
			jButtonExit.setBounds(new Rectangle(549, 17, 107, 31));
			jButtonExit.setText("Exit");
		}
		return jButtonExit;
	}

	/**
	 * This method initializes jButtonAccueil	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAccueil() {
		if (jButtonAccueil == null) {
			jButtonAccueil = new JButton();
			jButtonAccueil.setBounds(new Rectangle(682, 17, 107, 31));
			jButtonAccueil.setText("Accueil");
			jButtonAccueil.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//programmation accueil
					Authentification auth = new Authentification();
					auth.setVisible(true);
				}
			});
		}
		return jButtonAccueil;
	}

}  //  @jve:decl-index=0:visual-constraint="-20,0"
