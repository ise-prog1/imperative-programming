
public class Aufgabe1 {

	/**
	* Beispiel zu ganzzahliger Division:
		5 : 2 = 2 Rest 1
		Java:
		5 / 2 = 2
		5 % 2 = 1
	*/
	public static void main(String[] args) {
		int zehn = 10;
		int drei = 3;

		// Division zweier ganzer Zahlen ergibt wieder eine ganze Zahl.
		int ergebnis = 10 / 3;
		// Wenn einer der Zahlen eine Kommazahl sit, wird normale Division
		// durchgeführt und das Ergebnis ist wieder eine Kommazahl.
		double res = (10 / 3.0);
		int resCast = (int) (10 / 3.0);
		// '%' (Modulo) gibt den Rest von einer ganzzahligen Division zurück.
		int resModulo = 10 % 3;
		System.out.println(ergebnis);
		System.out.println(res);
		System.out.println(resModulo);
	}

}