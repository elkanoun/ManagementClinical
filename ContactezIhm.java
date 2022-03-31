package vue;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;

public class ContactezIhm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextArea jTextArea = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JTextArea jTextArea1 = null;

	/**
	 * This is the default constructor
	 */
	public ContactezIhm() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(345, 427);
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
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(41, 261, 102, 16));
			jLabel3.setText("Contactez Nous:");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(164, 215, 47, 16));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setText("2 0 1 7");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(34, 97, 92, 16));
			jLabel1.setText("Développed by :");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(61, 26, 224, 23));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel.setText("Gestion Clinique KMED");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(255, 204, 255));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getJTextArea(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getJTextArea1(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setBounds(new Rectangle(125, 115, 164, 59));
			jTextArea.setBackground(Color.green);
			jTextArea.setFont(new Font("Dialog", Font.ITALIC, 14));
			jTextArea.setText("-El-kanoun mohamed \n-Aboudi mohamed \n-Aboudi rachid");
					           
					          
		}
		return jTextArea;
	}

	/**
	 * This method initializes jTextArea1	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea1() {
		if (jTextArea1 == null) {
			jTextArea1 = new JTextArea();
			jTextArea1.setBounds(new Rectangle(117, 278, 195, 52));
			jTextArea1.setBackground(Color.green);
			jTextArea1.setText("un.jour.de.printemps1@gmail.com");
		}
		return jTextArea1;
	}

}  //  @jve:decl-index=0:visual-constraint="311,4"
