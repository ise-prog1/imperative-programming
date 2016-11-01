import java.util.Arrays;

public class Aufgabe16 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };

		/** Alternativer Weg ein Array einer bestimmten Größe zu initialisieren.
		*   Alle Werte erhalten den jeweiligen Default-Wert des Types!
		*   0 für alle Zahlen
		*   false für boolean
		*   null für Objekte wie String usw. 
		*/
		int[] c = new int[3];
		int[] d = { 0, 0, 0 };

		System.out.println(a == b); // false
		System.out.println(c == d); // false
		System.out.println(vergleiche(a, b)); // true
		System.out.println(vergleiche(c, d)); // true
		System.out.println(vergleiche(a, c)); // false
		
		System.out.println(Arrays.equals(a, b)); // true; Methode der Java Standard Library

	}

	/**
	* Diese Methode vergleicht zwei int-Arrays miteinander auf identischen Inhalt und Länge.
	* @param first - Das erste Array
	* @param second - Das zweite Array
	* @return boolean - if first and second have the same length and the same content
	*/
	public static boolean vergleiche(int[] first, int[] second) {
		if (first.length != second.length) {
			return false;
		}
		
		for (int i = 0; i < first.length; i++) {
			if (first[i] != second[i]) {
				return false;
			}
		}
		
		return true;

	}

}
