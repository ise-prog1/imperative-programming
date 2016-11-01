import Prog1Tools.IOTools;

/**
	Aufgabe 9 mit der klassischen While Schleife
*/
public class Aufgabe9While {

	public static void main(String[] args) {
		int n = IOTools.readInt("Bitte n eingeben (While): ");
		int i = 3;
		
		// Geschweifte Klammern eines Codeblocks sind auch hier wie bei if-Statements optional,
		// jedoch wärmstens empfohlen!
		while(i < 2*n)
			System.out.println(3.14/(2*(++i) -1));

	}

}
