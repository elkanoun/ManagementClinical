package util;

import javax.swing.JOptionPane;

public class GestionCliniqueException extends Exception {
	//probl�me dans la suppression d'un patient
	public void problemeSuppPatient(){
		JOptionPane.showMessageDialog(null, "Le patient n'est pas supprim�, veuillez r�ssayer", "Message Avertissement", JOptionPane.ERROR_MESSAGE);
	}

}
