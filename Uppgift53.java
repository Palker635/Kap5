/*
Uppgift: Test
Skapat 2019-10-11
Dev: Isac Hansson
*/
import javax.swing.*;

public class Uppgift53	{
	public static void main (String[] args) {
		
		double cm; 
		double studsar = 0; 
		cm = Double.parseDouble (JOptionPane.showInputDialog("Från vilken höjd släpps bollen?(cm) "));
		
		while (cm > 1) {
			cm = (cm*0.7);
			studsar++;
		}
		JOptionPane.showMessageDialog(null, studsar);
	}
}