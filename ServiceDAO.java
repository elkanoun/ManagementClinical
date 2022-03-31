package dao;

import java.sql.Connection;
import dao.SingletonConnection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controleur.Service;

public class ServiceDAO {
	//recherche num service
	public Service findService(String nomservice){
		Service service=null;
		try {
	    	Connection cnx=SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement
				          ("select *from service where nomService like ?");
			ps.setString(1, nomservice);
			ResultSet rs = ps.executeQuery();
		    while(rs.next()){
		    	service = new Service();
		    	service.setIdService(rs.getInt("idService"));
		    	service.setNomService(rs.getString("nomService"));
		    }

			} catch (Exception e) {
				e.printStackTrace();
			}
		return service;
			
		
	}
	
	//m�thode d'enregistrement d'un service 
	    public void save(Service  service ){
			try {
			Connection cnx=SingletonConnection.getConnexion();	
            PreparedStatement ps=cnx.prepareStatement
                                   ("insert into service values (?,?)");
            ps.setObject(1, null);
            ps.setString(2, service.getNomService());
            ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Le service est bien ajout�", "Messeage Confirmation", JOptionPane.INFORMATION_MESSAGE);
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Le service n'est pas ajout�", "Messeage Avertissement", JOptionPane.ERROR_MESSAGE);

		}
	
    }
    //m�thode de s�lection de tous les services
	  public List<Service> selectAllServices(){
		    	List<Service> services = new ArrayList<Service>();
		    	try {
		    	Connection cnx=SingletonConnection.getConnexion();
				PreparedStatement ps = cnx.prepareStatement
					          ("select * from service");
				ResultSet rs = ps.executeQuery();
			    while(rs.next()){
			    	Service s = new Service();
			    	s.setIdService(rs.getInt("idService"));
			    	s.setNomService(rs.getString("nomService"));
			    	services.add(s);
			    }
				} catch (Exception e) {
					e.printStackTrace();
				}
				return services;
				
			}
	
	
     
 	
    //recherche d'un service par num�ro
    public List<Service> findTable(int id){
    	List<Service> services = new ArrayList<Service>();
    	try {
    	Connection cnx=SingletonConnection.getConnexion();
		PreparedStatement ps = cnx.prepareStatement
			          ("select * from service  where idService like ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
	    while(rs.next()){
	    	Service s = new Service();
	    	s.setIdService(rs.getInt("idService"));
	    	s.setNomService(rs.getString("nomService"));
	    	services.add(s);
	    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return services;
		
	}
  //recherche d'un service par num�ro
    public Service findChamps(int id){
    	Service s = null;
    	try {
    	Connection cnx=SingletonConnection.getConnexion();
		PreparedStatement ps = cnx.prepareStatement
			          ("select * from service  where idService like ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
	    while(rs.next()){
	    	s = new Service();
	    	s.setIdService(rs.getInt("idService"));
	    	s.setNomService(rs.getString("nomService"));
	    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
		
	}
	public void modifier(Service service, int num) {
		try {
			Connection cnx = SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement
			              ("UPDATE service SET nomService = '"+service.getNomService()+"'"+ "WHERE idService = '"+num+"'");
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Le service est bien modifi�", "Messeage Confirmation", JOptionPane.INFORMATION_MESSAGE);
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Le service n'est pas modifi�", "Messeage Avertissement", JOptionPane.ERROR_MESSAGE);

		}
		
	}
    
    
   //suppression d'un service avec num�ro
	public void delete(int num){
		try {
			Connection cnx = SingletonConnection.getConnexion();
			PreparedStatement ps = cnx.prepareStatement
			              ("delete from service where idService = '"+num+"'");
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Le service est supprim�", "Messeage Confirmation", JOptionPane.INFORMATION_MESSAGE);
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Le service n'est pas supprim�", "Messeage Avertissement", JOptionPane.ERROR_MESSAGE);

		}
		
		
	}
    



}

