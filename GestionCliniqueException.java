package util;

import javax.swing.JOptionPane;

public class GestionCliniqueException extends Exception {
	//probléme dans la suppression d'un patient
	public void problemeSuppPatient(){
		JOptionPane.showMessageDialog(null, "Le patient n'est pas supprimé, veuillez réssayer", "Message Avertissement", JOptionPane.ERROR_MESSAGE);
	}

}
