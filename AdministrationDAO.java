package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controleur.User;

public class AdministrationDAO {
	//ajout d'un utilisateur
	public void save(User  user ){
		try {
		Connection cnx=SingletonConnection.getConnexion();	
        PreparedStatement ps=cnx.prepareStatement
                               ("insert into user values (?,?,?,?,?,?)");
        ps.setObject(1, null);
        ps.setString(2, user.getNom());
        ps.setString(3, user.getPrenom());
        ps.setString(4, user.getTache());
        ps.setString(5, user.getLogin());
        ps.setString(6, user.getPass());

        ps.executeUpdate();
		JOptionPane.showMessageDialog(null, "L'Utilisateur est bien ajouté","Message d’Information", JOptionPane.INFORMATION_MESSAGE);
		ps.close();
	} catch (Exception e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "L'Utilisateur n'est pas ajouté!, Réssayer","Message d’Avertissement", JOptionPane.ERROR_MESSAGE);

	}

}
	//recherche d'un utilisateur
	public List<User> rechercherLoginTable(String login){
		ArrayList<User> users = new ArrayList<User>();
		try {
			Connection cnx = SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement("select * from user where loginUser like ?");
			ps.setString(1, login);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				User u =new User();
				u.setId(rs.getInt("idUser"));
				u.setNom(rs.getString("nomUser"));
				u.setPrenom(rs.getString("prenomUser"));
				u.setTache(rs.getString("tacheUser"));
				u.setLogin(rs.getString("loginUser"));
				u.setPass(rs.getString("passUser"));
				users.add(u);

				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	//recherche d'un utilisateur
	public User rechercherLoginChamps(String login){
		User usr = null;
		try {
			Connection cnx = SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement("select * from user where loginUser like ?");
			ps.setString(1, login);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				usr =new User();
				usr.setId(rs.getInt("idUser"));
				usr.setNom(rs.getString("nomUser"));
				usr.setPrenom(rs.getString("prenomUser"));
				usr.setTache(rs.getString("tacheUser"));
				usr.setLogin(rs.getString("loginUser"));
				usr.setPass(rs.getString("passUser"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usr;
	}
	public void modifier(User user, int num) {
		try {
			Connection cnx = SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement
            ("UPDATE user SET nomUser = ?, prenomUser = ?, tacheUser = ?, loginUser = ?, passUser = ?  WHERE idUser = '"+num+"'");
			ps.setString(1, user.getNom());
			ps.setString(2, user.getPrenom());
			ps.setString(3, user.getTache());
			ps.setString(4, user.getLogin());
			ps.setString(5, user.getPass());
            ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "L'utilisateur est bien modifié", "Messeage Confirmation", JOptionPane.INFORMATION_MESSAGE);
			ps.close();
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "L4utilisateur n'est pas modifié", "Messeage Avertissement", JOptionPane.ERROR_MESSAGE);
				}
			}
		//suppression d'un utilisateur avec numéro
		public void delete(int num){
			try {
				Connection cnx = SingletonConnection.getConnexion();
				PreparedStatement ps = cnx.prepareStatement
				              ("delete from user where idUser = '"+num+"'");
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Le service est supprimé", "Messeage Confirmation", JOptionPane.INFORMATION_MESSAGE);
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Le service n'est pas supprimé", "Messeage Avertissement", JOptionPane.ERROR_MESSAGE);

			}
			
			
		}
	    
	}
