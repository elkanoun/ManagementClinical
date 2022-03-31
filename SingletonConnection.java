package dao;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class SingletonConnection {
	private static Connection connexion;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionclinique","root","");
			JOptionPane.showMessageDialog(null, "Connexion effective","Message Informaion", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Montez BDD et essayez","Message d’avertissement", JOptionPane.ERROR_MESSAGE);
		}
	}
	//Déconnexion
	public static void discconnect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connexion.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Déconnexion impossible","Message d’avertissement", JOptionPane.ERROR_MESSAGE);
		}
    }

	public static Connection getConnexion() {
		return connexion;
	}
	
	

}
