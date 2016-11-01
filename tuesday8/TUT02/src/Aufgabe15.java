import Prog1Tools.IOTools;

public class Aufgabe15 {
	
	public static void main(String[] args) {
		System.out.println("Willkommen beim Zahlenraten");
		System.out.println("Ich denke mir eine Zahl zwischen 0 und 100. Rate diese Zahl!");
		
		int geheimZahl = (int) (99 * Math.random() + 1);
		int userInput;
		int versuche = 0;
		do {
			versuche++;
			userInput = IOTools.readInt(versuche+". Versuch: ");
			if(userInput > geheimZahl) {
				System.out.println("Meine Zahl ist kleiner!");
			} else if (userInput < geheimZahl) {
				System.out.println("Meine Zahl ist größer!");
			}
		}while(userInput != geheimZahl);
		
		System.out.println("Du hast die Zahl beim " + versuche + ". Versuch erraten!");
		
	}

}
