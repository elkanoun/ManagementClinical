package dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import controleur.Patient;
import controleur.Service;

public class PatientModel extends AbstractTableModel {

	private String[] nomColonnes=new String[]{"ID", "CIN", "NOM", "PRENOM", "DATE NAISS", "TEL", "SEXE", "EMAIL", "POIDS", "PROFESSION", "N°FICHE"};
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
	
	public void setData(List<Patient> patients){
		tableValues=new ArrayList<String[]>();
		for (Patient p : patients) {
			tableValues.add(new String[]{
			    ""+p.getIdPatient(),
				""+p.getCin(),
				""+p.getNom(), 
				""+p.getPrenom(),
				""+p.getDateNaissance(),
				""+p.getnTel(),
				""+p.getSexe(),
				""+p.getEmail(),
				""+p.getPoidsPatient(),
				""+p.getProfessionPatient(),
				""+p.getNumFiche()
			});
			
		}
		fireTableChanged(null);
	}

}
