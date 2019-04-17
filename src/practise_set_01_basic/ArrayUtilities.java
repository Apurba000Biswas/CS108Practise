package practise_set_01_basic;

import java.util.Arrays;
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
