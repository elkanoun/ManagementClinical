package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import controleur.Bloc;
import controleur.Service;

public class BlocDAO {
	//enregistrement d'un bloc
	public void save(Bloc  bloc ){
		try {
		Connection cnx=SingletonConnection.getConnexion();	
        PreparedStatement ps=cnx.prepareStatement
                               ("insert into bloc values (?,?)");
        ps.setObject(1, null);
        ps.setString(2, bloc.getTypeBloc());
        ps.executeUpdate();
        System.out.println("L'enregistrement est bien ajouté");
		ps.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

}
	//recherche d'un bloc par ID
	//recherche d'un service par numéro
    public List<Bloc> find(int id){
    	List<Bloc> blocs = new ArrayList<Bloc>();
    	try {
    	Connection cnx=SingletonConnection.getConnexion();
		PreparedStatement ps = cnx.prepareStatement
			          ("select * from bloc  where idBloc like ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
	    while(rs.next()){
	    	Bloc s = new Bloc();
	    	s.setIdBloc(rs.getInt("idBloc"));
	    	s.setTypeBloc(rs.getString("typeBloc"));
	    	blocs.add(s);
	    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return blocs;
		
	}

}
