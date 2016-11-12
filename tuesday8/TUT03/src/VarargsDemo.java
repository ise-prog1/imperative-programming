
public class VarargsDemo {

	public static void main(String[] args) {
		// Array not necessary for calling
		test("222","333", "333");
		test(new String[3]);
		
		
	}
	
	// String... strings, int i not possible!
	// varargs has to be the last parameter!
	public static void test(String... strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	

}
