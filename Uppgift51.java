/*
Uppgift: Test
Skapat 2019-10-11
Dev: Isac Hansson
*/
import javax.swing.*;

public class Uppgift51	{
	public static void main (String[] args) {
		
		double n;
		double a = 1; 
		double summa = 0; 
		n = Double.parseDouble (JOptionPane.showInputDialog("n?"));
		
		while (a <= n) {
			summa += (a*a);
			a++;
		}
		JOptionPane.showMessageDialog(null, summa);
	}
}