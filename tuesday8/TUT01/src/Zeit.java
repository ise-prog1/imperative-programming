import java.util.concurrent.TimeUnit;

public class Zeit {

	/**
	* Eine mögliche Lösung für Aufgabe 4
	*/
	public static void main(String[] args) {

		int sec = 158036521;
		System.out.println(sec + " Sekunden entsprechen:");

		int jahre = sec / (60 * 60 * 24 * 365);
		sec = sec % (60 * 60 * 24 * 365); 

		int tage = sec / (60 * 60 * 24);
		sec = sec % (60 * 60 * 24);

		int stunden = sec / (60 * 60);
		sec = sec % (60 * 60);

		int minuten = sec / (60);
		int sekunden = sec % (60);
		
		System.out.println(jahre + " Jahren,");
		System.out.println(tage + " Tagen,");
		System.out.println(stunden + " Stunden, ");
		System.out.println(minuten + " Minuten und");
		System.out.println(sekunden + " Sekunden.");
		
	}

}
