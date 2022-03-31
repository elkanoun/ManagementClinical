package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Gestion_DB_gestionclinique {
	public static void main(String[] args) {
		
	}
   //vérification de l'utulisateur connecté
	public boolean verifier(String login,String password){
		boolean test=false;
		String log = null,pass=null;
		try{
			Connection cnx=SingletonConnection.getConnexion();
			PreparedStatement ps=cnx.prepareStatement
			("SELECT loginUser,passUser FROM user");
			ResultSet rs=ps.executeQuery();
			while(rs.next()|| (test==true)){
				log=rs.getString("loginUser");
				pass=rs.getString("passUser");
				if(log.equals(login) && pass.equals(password))
					test=true;		
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return test;

	}
	
	//récupération nom et prénom user connecté
	public String informationsUser(String login){
				String nom = null,prenom=null;
		try{
			Connection cnx=SingletonConnection.getConnexion();
			PreparedStatement ps=cnx.prepareStatement
			("SELECT nomUser,prenomUser FROM user where loginUser like ?");
			ps.setObject(1, login);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				nom=rs.getString("nomUser");
				prenom=rs.getString("prenomUser");
					
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return nom+" "+prenom;
	}
}
