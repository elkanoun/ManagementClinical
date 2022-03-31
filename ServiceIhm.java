package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controleur.Service;
import dao.Gestion_DB_gestionclinique;
import dao.ServiceDAO;
import dao.ServiceModel;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
public class ServiceIhm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JTextField jTextFieldNumService = null;
	private JLabel jLabel3 = null;
	private JTextField jTextFieldNomService = null;
	private JPanel jPanel1 = null;
	private JButton jButtonAjouter = null;
	private JButton jButtonModifier = null;
	private JButton jButtonSupprimer = null;
	private JButton jButtonAccueil = null;
	private JButton jButtonRechercher = null;
	private JPanel jPanelTable = null;
	private JLabel jLabel4 = null;
	private JTable jTableServices = null;
	private ServiceModel serviceModel;
	JScrollPane jScrollPane;
	private JLabel jLabelLogin = null;
	/**
	 * This is the default constructor
	 */
	public ServiceIhm() {
		super();
        initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(775, 419);
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
			
			jLabelLogin = new JLabel();
			jLabelLogin.setBounds(new Rectangle(614, 2, 141, 16));
			jLabelLogin.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabelLogin.setText("");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(2, 364, 116, 16));
			jLabel4.setText("Copyright ©  2017");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(204, 4, 249, 29));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 30));
			jLabel.setText("Gestion Services");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(153, 153, 255));
			jContentPane.add(jLabel, null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getJPanelTable(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabelLogin, null);
			
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
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(376, 30, 92, 16));
			jLabel3.setText("Nom Service :");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(26, 29, 80, 16));
			jLabel2.setText("Num Service :");
			
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(0, 1, 744, 16));
			jLabel1.setBackground(new Color(51, 102, 0));
			jLabel1.setText("Formulaire");
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(6, 61, 745, 179));
			jPanel.setBackground(new Color(153, 153, 255));
			
			jPanel.add(jLabel1, null);
			jPanel.add(jLabel2, null);
			jPanel.add(getjTextFieldNumService(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getJTextFieldNomService(), null);
			jPanel.add(getJPanel1(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getjTextFieldNumService() {
		if (jTextFieldNumService == null) {
			jTextFieldNumService = new JTextField();
			jTextFieldNumService.setBounds(new Rectangle(120, 25, 217, 25));
		}
		return jTextFieldNumService;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNomService() {
		if (jTextFieldNomService == null) {
			jTextFieldNomService = new JTextField();
			jTextFieldNomService.setBounds(new Rectangle(480, 24, 243, 27));
		}
		return jTextFieldNomService;
	}

	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBounds(new Rectangle(24, 75, 700, 86));
			jPanel1.setBackground(new Color(153, 153, 255));
			jPanel1.add(getJButtonAjouter(), null);
			jPanel1.add(getJButtonModifier(), null);
			jPanel1.add(getJButtonSupprimer(), null);
			jPanel1.add(getJButtonAccueil(), null);
			jPanel1.add(getJButtonRechercher(), null);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	
	private JButton getJButtonAjouter() {
		if (jButtonAjouter == null) {
			jButtonAjouter = new JButton("Ajouter");
			jButtonAjouter.setBounds(new Rectangle(15, 20, 124, 36));
			
			//programmation du boutton: Ajouter
			jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ServiceDAO servicedao=new ServiceDAO(); 
					servicedao.save(new Service(jTextFieldNomService.getText()));
					
				}

			
		});
		}
		return jButtonAjouter;
	}

	/**
	 * This method initializes button1	
	 * 	
	 * @return java.awt.Button	
	 */
	private JButton getJButtonModifier() {
		if (jButtonModifier == null) {
			jButtonModifier = new JButton("Modifier");
			jButtonModifier.setBounds(new Rectangle(150, 20, 124, 36));
			//programmation du jBoutton Modifier
			jButtonModifier.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(jTextFieldNumService.getText());
					String nom = jTextFieldNomService.getText();
					ServiceDAO servicedao = new ServiceDAO();
					servicedao.modifier(new Service(nom), num);
					
				}
			});

		}
		return jButtonModifier;
	}

	/**
	 * This method initializes button2	
	 * 	
	 * @return java.awt.Button	
	 */
	private JButton getJButtonSupprimer() {
		if (jButtonSupprimer == null) {
			jButtonSupprimer = new JButton("Supprimer");
			jButtonSupprimer.setBounds(new Rectangle(287, 20, 124, 36));
			jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//programmation du jBoutton Supprimer
					int num = Integer.parseInt(jTextFieldNumService.getText());
					ServiceDAO srv = new ServiceDAO();
					srv.delete(num);

				}
			});
			
		}
		return jButtonSupprimer;
	}

	/**
	 * This method initializes button3	
	 * 	
	 * @return java.awt.Button	
	 */
	private JButton getJButtonAccueil() {
		if (jButtonAccueil == null) {
			jButtonAccueil = new JButton("Accueil");
			jButtonAccueil.setBounds(new Rectangle(561, 21, 124, 36));  
			//programmation du jBoutton Accueil
			Authentification aut = new Authentification();
			aut.setVisible(true);

		}
		return jButtonAccueil;
	}

	/**
	 * This method initializes button4	
	 * 	
	 * @return java.awt.Button	
	 */
	private JButton getJButtonRechercher() {
		if (jButtonRechercher == null) {
			jButtonRechercher = new JButton("Rechercher");
			jButtonRechercher.setBounds(new Rectangle(425, 21, 124, 36)); 
			
			//programmation du jBoutton Rechercher
			jButtonRechercher.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				int id=Integer.parseInt(jTextFieldNumService.getText());
				ServiceDAO service=new ServiceDAO();
				//---pour table
				List<Service> serv=(List<Service>) service.findTable(id);
				serviceModel.setData(serv);
				
				//---pour champs
				Service s = service.findChamps(id);
				jTextFieldNumService.setText(String.valueOf(s.getIdService()));
				jTextFieldNomService.setText(s.getNomService());

				}
				
				
				
			});
		}
		return jButtonRechercher;
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
			jPanelTable.setBounds(new Rectangle(3, 242, 747, 121));
			jPanelTable.add(getJTableServices(), BorderLayout.CENTER);
		}
		return jPanelTable;
	}

	/**
	 * This method initializes jTableServices	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JScrollPane getJTableServices() {
		if (jTableServices == null) {
			serviceModel = new ServiceModel();
			jTableServices = new JTable(serviceModel);
			jTableServices.setBounds(new Rectangle(233, 16, 375, 80));
            jScrollPane = new JScrollPane(jTableServices);
			
		}
		return jScrollPane;
	}

}  //  @jve:decl-index=0:visual-constraint="7,12"
