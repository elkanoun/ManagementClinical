package dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import controleur.Bloc;

public class BlocModel extends AbstractTableModel {

	private String[] nomColonnes=new String[]{"ID", "NOM"};
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
	
	public void setData(List<Bloc> blocs){
		tableValues=new ArrayList<String[]>();
		for (Bloc s : blocs) {
			tableValues.add(new String[]{
			    ""+s.getIdBloc(),
				s.getTypeBloc()
			});
			
		}
		fireTableChanged(null);
	}

}
