import Prog1Tools.IOTools;

/**
	Aufgabe 9 mit einer For schleife
*/
public class Aufgabe9For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = IOTools.readInt("n für For:");
		// For Schleife startet ab 4 da die Initialisierung erst nach dem ersten 
		// Durchlauf erfolgt, was sich mit der Aufgabenstellung wiederspricht. 
		// Deswegen starten wir mit i = 4.
		for(int i = 4; i < 2 * n; i++){
			System.out.println(3.14/(2*i -1));
		}
	}

}
