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
		
		System.out.print("Sorted Array : ");
		Arrays.sort(array);
		printArray(array);
		
		//System.arraycopy(source-array, source-index, dest-array, dest-index, length-to-copy);
		int[] copyArray = new int[10]; 
		System.arraycopy(array, 4, copyArray, 4, 3);
		System.out.print("Copy Array : ");
		printArray(copyArray);
		
		System.arraycopy(copyArray, 4, copyArray, 0, 2);
		System.out.print("Copy Array : ");
		printArray(copyArray);
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
