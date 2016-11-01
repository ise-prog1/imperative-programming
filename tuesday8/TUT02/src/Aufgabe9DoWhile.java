import Prog1Tools.IOTools;

/**
	Aufgabe 9 mit einer do-While Schleife.
*/
public class Aufgabe9DoWhile {

	public static void main(String[] args) {

		int n = IOTools.readInt("Bitte n eingeben (DoWhile):");
		int i = 3;
		do {
			i++;
			System.out.println(3.14/((2*i)-1));
		}while(i < 2*n);
	}

}
