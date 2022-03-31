package dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import controleur.Medecin;

public class MedecinModel extends AbstractTableModel {

	private String[] nomColonnes=new String[]{"ID", "CIN", "NOM", "PRENOM", "DATE NAISS", "TEL", "SEXE", "EMAIL", "GRADE", "SPECIALITEE", "ID SERVICE"};
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
	
	public void setData(List<Medecin> medecins){
		tableValues=new ArrayList<String[]>();
		for (Medecin p : medecins) {
			tableValues.add(new String[]{
			    ""+p.getIdMedecin(),
				""+p.getCin(),
				""+p.getNom(),
				""+p.getPrenom(),
				""+p.getDateNaissance(),
				""+p.getnTel(),
				""+p.getSexe(),
				""+p.getEmail(),
				""+p.getGradeMedecin(),
				""+p.getSpecialiteMedecin(),
				""+p.getService().getIdService()
			});
			
		}
		fireTableChanged(null);
	}

}
