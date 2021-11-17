package com.bridgelabz.algorithm;

public class BubbleSort {
	public void Sorting() {
		
		int[] arr = { 12,3,8,2,10,20 };
		
		for (int i = 0; i < arr.length; i++) {
			//
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
//		to print
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		obj.Sorting();
	}
}
