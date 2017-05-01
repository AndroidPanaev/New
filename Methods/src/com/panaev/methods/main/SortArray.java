package com.panaev.methods.main;

public class SortArray {

	static int[] mas = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public static void sortArray(int[] mas) {
		int minValueIndex = 0;

		for (int i = 0; i < mas.length; i++) {
			minValueIndex = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[j] < mas[minValueIndex]) {
					minValueIndex = j;
				}
			}
			int temp = mas[i];
			mas[i] = mas[minValueIndex];
			mas[minValueIndex] = temp;
			System.out.println(mas[minValueIndex]);
		}
	}
	public static void main(String[] args) {
		sortArray(mas);
	}
}
