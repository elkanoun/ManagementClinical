package dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import controleur.Consultation;
import controleur.Patient;

public class ConsultationModel extends AbstractTableModel{

	private String[] nomColonnes=new String[]{"ID", "TYPE", "OBS RECEPTION", "ID PATIENT", "ID MEDECIN", "DATE", "HORAIRE", "DATE RDV", "DATE CONS", "FRAIS CONS"};
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
	
	public void setData(List<Consultation> consultations){
		tableValues=new ArrayList<String[]>();
		for (Consultation p : consultations) {
			tableValues.add(new String[]{
			    ""+p.getIdConsultation(),
				""+p.getTypeConsultation(), 
				""+p.getObsReception(),
				""+p.getPatient().getIdPatient(),
				""+p.getMedecin().getIdMedecin(),
				""+p.getDate(),
				""+p.getHoraire(),
				""+p.getDateRDV(),
				""+p.getDateConsultation(),
				""+p.getFraisConsultation(),
			});
			
		}
		fireTableChanged(null);
	}



}
