package com.java.logical.coding.Array;

import java.util.Scanner;

public class MasterArrayProgramUsingFunction {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array");
			int size = sc.nextInt();
			System.out.println("Enter the element in array");
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			traverseArray(arr);
			reverseArray(arr);
			secondLargestInArray(arr);
			secondSmallestInArray(arr);
			maxElementInArray(arr);
			minElementInArray(arr);
			findDuplicateElement(arr);
		}

		public static void reverseArray(int[] arr) {
			System.out.println("Reverse of the array is: ");
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.println(arr[i]);
			}
		}

		public static void traverseArray(int[] arr) {
			System.out.println("You have entered element is: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}

		public static void secondLargestInArray(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("sorted array is: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("Second Largest number in array is: ");
			System.out.println(arr[4]);

		}

		public static void secondSmallestInArray(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}

			System.out.println("Sorted array is: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("Second smallest element in array is: ");
			System.out.println(arr[3]);
		}

		public static void maxElementInArray(int[] arr) {
			int max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			System.out.println("Max element in array is: ");
			System.out.println(max);
		}

		public static void minElementInArray(int[] arr) {
			int min = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}
			}
			System.out.println("Min element in array is: ");
			System.out.println(min);
		}

		public static void findDuplicateElement(int[] arr) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						System.out.println("Duplicate element is: " + arr[i]);
					}
				}
			}

			System.out.println("total number of count: " + count);
		}

	}

