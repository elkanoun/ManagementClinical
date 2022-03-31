package dao;

import javax.swing.table.AbstractTableModel;

import controleur.Service;

import java.util.ArrayList;
import java.util.List;
import vue.ServiceIhm;

public class ServiceModel extends AbstractTableModel {
	private String[] nomColonnes=new String[]{"idService", "nomService"};
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
	
	public void setData(List<Service> services){
		tableValues=new ArrayList<String[]>();
		for (Service s : services) {
			tableValues.add(new String[]{
			    ""+s.getIdService(),
				s.getNomService()
			});
			
		}
		fireTableChanged(null);
	}
	
	

}
