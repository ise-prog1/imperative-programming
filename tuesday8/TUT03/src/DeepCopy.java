import java.util.Arrays;

public class DeepCopy {

	public static void main(String... args) {
		String[] original = { "1", "dfdf", "dfdfdf", "dfdf" };
		String[] copy = createCopy(original);
		// Works due to the parameter being declared as a varargs
		// createCopy("34", "3434", "343434");
		printArrays(original, copy);
		System.out.println("Modifying copy...");
		copy[0] = "Modified!";
		printArrays(original, copy);
		System.out.println("----------------");
		
		int[] array = {23, 3434, 9999, 100000, 42};
		System.out.println("Biggest Value (should be 100 000)" + getBiggestInteger(array));
		int[] intCopy = removeValue(array, getBiggestInteger(array));
		System.out.println("No 100 000: " + getBiggestInteger(intCopy));
		int[] moooore = addValues(intCopy, 1,2,3,45,8,7,4,5,6,6,5);
		System.out.print("Many values: ");
		for (int i : moooore) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
	}
	
	/**
	 * Creates a deep copy of the given String array
	 * @param toBeCopied - The String array that is to be copied
	 * @return a copy of the given String array
	 */
	public static String[] createCopy(String... toBeCopied) {
		String[] result = new String[toBeCopied.length];
		
		for (int i = 0; i < toBeCopied.length; i++) {
			result[i] = toBeCopied[i];
		}
		return result;
	}
	
	/**
	 * Finds the biggest integer inside the given int array.
	 * @param target - the target array that is to be searched
	 * @return the biggest int inside the target array
	 */
	public static int getBiggestInteger(int[] target) {
		// Arrays are a reference type, so they can be null!
		if (target == null) {
			// return early if null
			return Integer.MIN_VALUE;
		}
		//Start with the smallest value
		int biggestValue = Integer.MIN_VALUE;
		for (int i : target) {
			if (i > biggestValue) {
				biggestValue = i;
			}
		}
		return biggestValue;
	}
	
	/**
	 * Removes a given target value from the given origin array
	 * by creating a copy of the original array without the target value
	 * @param origin - the original array
	 * @param target - the target value to be removed
	 * @return a copy of the original array without the target value
	 */
	public static int[] removeValue(int[] origin, int target) {
		int[] result = new int[origin.length -1];
		int j = 0;
		for (int i = 0; i < origin.length; i++) {
			if (origin[i] == target) {
				continue; // skip target value 
			} 
			result[j] = origin[i];
			// j only gets increased if there was a new value added 
			// to the result array
			j++;
		}
		return result;
	}
	
	/**
	 * Merges two given arrays and returns a new array
	 * by appending the second array to the first array
	 * @param origin - the first array
	 * @param values - the values that are to be appended to the array
	 * @return a copy of the original array with the additional values
	 */
	public static int[] addValues(int[] origin, int... values) {
		int[] result = new int[origin.length + values.length];
		for (int i = 0; i < origin.length; i++) {
			result[i] = origin[i];
		}
		// offset initial value by amount of already added values
		for (int i = origin.length; i < result.length; i++) {
			// Remember result.length = origin.length + values.length
			// result.length - origin.length = values.length (!)
			/* Remove offset for values array as there are only values.length values*/
			result[i] = values[i - origin.length];
		}
		return result;
	}
	
	/**
	 * Makes the main method cleaner;
	 * prints both arrays to console with an individual pre-message
	 * @param original - pre-message: Original
	 * @param copy - pre-message: Copy
	 */
	public static void printArrays(String[] original, String[] copy) {
		System.out.println("Original: ");
		for (String s : original) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.print("Copy: ");
		for (String s : copy) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
 