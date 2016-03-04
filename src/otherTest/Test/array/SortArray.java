package otherTest.Test.array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		// int[] array1 = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
		Arrays.sort(array);
		printArrayA("数组排序结果为", array);
	}

	private static void printArray(String message, int array[]) {
		System.out.println(message + ":[ length: " + array.length + "]");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(",");
			} 
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
	//foreach
	private static void printArrayA(String message, int array[]) {
		System.out.println(message + ":[ length: " + array.length + "]");
		for (int element : array) {
			System.out.print(",");
			System.out.print(element);
		}
		System.out.println();
	}
}
