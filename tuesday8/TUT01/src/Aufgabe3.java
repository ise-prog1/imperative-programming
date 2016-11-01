import Prog1Tools.IOTools;

public class Aufgabe3 {

	public static void main(String[] args) {
		
		String name = IOTools.readString("Bitte deinen Namen eingeben: ");
		int age =  IOTools.readInt("Hallo " + name + "! Wie alt bist du? ");
		System.out.println(name + ", du bist " + age + " Jahre alt!");
		double demo = IOTools.readDouble("PI bitte");
		System.out.println(demo);

	} 

}
