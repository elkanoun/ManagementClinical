package dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class RdvModel extends AbstractTableModel {
	private String[] title= {"Journée", "9:00-09:30","9:30-10:00", "10:00-10:30","10:30-11:00","11:00-11:30","11:30-12:00","12:00-12:30",
			"12:30-13:00","13:00-13:30","13:30-14:00","14:00-14:30","14:30-15:00","15:00-15:30","15:30-16:00","16:00-16:30","16:30-17:00","17:00-17:30",
			"17:30-18:00"};
    private List<String [][]> values = new ArrayList<String[][]>();
    
    

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return title.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return values.size();
	}

	@Override
	public Object getValueAt(int ligne, int colonne) {
		// TODO Auto-generated method stub
		return values.get(ligne)[colonne];
	}
	
	public String getColumName(int colonne){
		// TODO Auto-generated method stub
        return title[colonne];
	}

}
