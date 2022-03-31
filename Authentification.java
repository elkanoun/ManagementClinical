package vue;

import java.awt.Frame;
import java.awt.Dimension;
import java.awt.Image;



import org.omg.CORBA.PRIVATE_MEMBER;

import controleur.Marqee;
import dao.Gestion_DB_gestionclinique;


import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Rectangle;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.GridBagConstraints;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.io.Closeable;

public class Authentification extends Frame {
	private static final long serialVersionUID = 1L;
	private int i=2;
	private JLabel JLabel = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private Panel panel = null;
	private Label label = null;
	private Label label1 = null;
	private JTextField jTextFieldLogin = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JPasswordField jPasswordField = null;
	/**
	 * This is the default constructor
	 */
	public Authentification() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		jLabel1 = new JLabel();
		Image img=new ImageIcon(this.getClass().getResource("/img1.jpg")).getImage();
		jLabel1.setIcon(new ImageIcon(img));
		jLabel1.setBounds(new Rectangle(477, 73, 156, 105));
		jLabel1.setText("");
		
		jLabel = new JLabel();
		jLabel.setText("Clinique  KMED");
		jLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		jLabel.setForeground(Color.green);
		jLabel.setBounds(new Rectangle(233, 108, 118, 24));
		
		JLabel = new JLabel();
		JLabel.setText("L O G I N");
		JLabel.setBounds(new Rectangle(354, 37, 63, 28));
		this.setLayout(null);
		this.setSize(800, 456);
		this.setTitle("Clinique KMED");
		this.add(jLabel, null);
		this.add(JLabel, null);
		this.add(jLabel1, null);
		this.add(getPanel(), null);
		

	}

	/**
	 * This method initializes panel	
	 * 	
	 * @return java.awt.Panel	
	 */
	private Panel getPanel() {
		if (panel == null) {
			label1 = new Label();
			label1.setBounds(new Rectangle(29, 82, 63, 17));
			label1.setText("Password:");
			label = new Label();
			label.setBounds(new Rectangle(28, 53, 39, 17));
			label.setText("Login:");
			panel = new Panel();
			panel.setLayout(null);
			panel.setBounds(new Rectangle(218, 201, 360, 178));
			panel.add(label, null);
			panel.add(label1, null);
			panel.add(getJTextField(), null);
			panel.add(getJButton(), null);
			panel.add(getJButton1(), null);
			panel.add(getJPasswordField(), null);
		}
		return panel;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextFieldLogin == null) {
			jTextFieldLogin = new JTextField();
			jTextFieldLogin.setBounds(new Rectangle(146, 49, 161, 20));
		}
		return jTextFieldLogin;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(82, 127, 122, 22));
			jButton.setForeground(Color.black);
			jButton.setBackground(Color.gray);
			jButton.setText("Se Connecter");
			
			//programmation bouton Se Connecter
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Gestion_DB_gestionclinique clinique = new Gestion_DB_gestionclinique();
					String login = null;
					login=jTextFieldLogin.getText();
					char[] passChar=jPasswordField.getPassword();
					String pass=new String(passChar);
					if((!login.equals(""))&&(!pass.equals(""))){
						if(clinique.verifier(login, pass)==true){
							Accueil accueil=new Accueil(login);
							accueil.setVisible(true);
							
						}
						else
							JOptionPane.showMessageDialog(null, "login ou mot de passe incorrect", "Alert Message", JOptionPane.ERROR_MESSAGE);
					}
					else
						JOptionPane.showMessageDialog(null, "login ou mot de passe vide", "Alert Message", JOptionPane.ERROR_MESSAGE);
					
					
				}
			});
			
		}
    		return jButton;
	}
	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBounds(new Rectangle(208, 128, 109, 22));
			jButton1.setForeground(Color.white);
			jButton1.setBackground(Color.black);
            jButton1.setText("Annuler");
		}
		return jButton1;
	}

	/**
	 * This method initializes jPasswordField	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getJPasswordField() {
		if (jPasswordField == null) {
			jPasswordField = new JPasswordField();
			jPasswordField.setBounds(new Rectangle(148, 83, 158, 20));
		}
		return jPasswordField;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	
}  //  @jve:decl-index=0:visual-constraint="65,27"
