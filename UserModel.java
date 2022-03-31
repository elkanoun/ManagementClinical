package dao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import controleur.User;



public class UserModel extends AbstractTableModel {

	private String[] nomColonnes=new String[]{"ID", "NOM", "PRENOM", "TÄCHE", "LOGIN", "PASS"};
	private List<String[]> tableValues=new ArrayList<String[]>();

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return nomColonnes.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return tableValues.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return tableValues.get(rowIndex)[columnIndex];
	}
	
	public String getColumName(int column){
		// TODO Auto-generated method stub
        return nomColonnes[column];
	}
	
	public void setData(List<User> users){
		tableValues=new ArrayList<String[]>();
		for (User i : users) {
			tableValues.add(new String[]{
			    ""+i.getId(),
			    ""+i.getNom(),
			    ""+i.getPrenom(),
			    ""+i.getTache(),
			    ""+i.getLogin(),
			    ""+i.getPass()
			});
			
		}
		fireTableChanged(null);
	}

}

