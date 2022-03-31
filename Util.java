package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JOptionPane;

public class Util {
	   public static final String CONSULTATION = "Consultation";
	   public static final String CONTROLE = "Contrôle";
	   
     //ecriture dates
		public static String formatDateTime(Date date){
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.FRANCE);
			TimeZone tz=TimeZone.getTimeZone("GMT+00");
			sdf.setTimeZone(tz);
			
			return sdf.format(date);
		}
		//ecriture dates
		public static SimpleDateFormat formatDateBDD(Date date){
			SimpleDateFormat sdfbdd = new SimpleDateFormat("yyyy-MM-dd");
			return sdfbdd;
		}
		/*
		 * 
		 * //Déclaration du SimpleDateFormat
SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
//Conversion en java.util.Date
java.util.Date date = sdf.parse(jTextField.getText());
//Si tu as besoin d'un sql date
java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		 */
	 
	//écritude numéro Fiche Patient
		/*public static String formatNumeroFiche(){
			
			
			
		}*/
		
		
		//ecritures argent
		public static String formatMonetaire(double montant){
			DecimalFormat df = new DecimalFormat("#,##0.00 DH");
			return df.format(montant);
		}

}
