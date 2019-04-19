package practise_set_01_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayUtilities {

	public static void main(String[] args) {
		ArrayUtilities obj = new ArrayUtilities();
		obj.run();
	}
	
	public void run() {
		int[] array = buildArray();
		System.out.print("Array : ");
		printArray(array);
		
		// Array Sorting
		System.out.print("Sorted Array : ");
		Arrays.sort(array);
		printArray(array);
		
		// Array Coping
		//System.arraycopy(source-array, source-index, dest-array, dest-index, length-to-copy);
		int[] copyArray = new int[10]; 
		System.arraycopy(array, 4, copyArray, 4, 3);
		System.out.print("Copy Array : ");
		printArray(copyArray);
		
		System.arraycopy(copyArray, 4, copyArray, 0, 2);
		System.out.print("Again Copy Array : ");
		printArray(copyArray);
		
		// Array Comparison
		System.arraycopy(array, 0, copyArray, 0, array.length);
		System.out.print("New Copy : ");
		printArray(copyArray);
		System.out.println("Is Equal?:  " + Arrays.equals(array, copyArray));
		// Note : To compare multidimensional Array Use Arrays.equals(a, b)
		
		
		// Building List From Array
		String[] wordsAr = new String[] {"Red", "Green", "Blue", "White"};
		List<String> wordlistTemp = Arrays.asList(wordsAr);
		System.out.print("List is : ");
		printList(wordlistTemp);
		//wordlistTemp.add("BLACK"); // This Wont Run because its not actually a List
		List<String> wordlist2 = new ArrayList<String>(wordlistTemp);
		wordlist2.add("BLACK");
		System.out.print("Again List is : ");
		printList(wordlist2);
	}
	
	
	private void printList(List<String> list) {
		for(String str: list) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
	private void printArray(int[] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	private int[] buildArray() {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i=0; i<array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		return array;
	}

}
