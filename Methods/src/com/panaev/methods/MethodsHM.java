package com.panaev.methods;

import java.util.Scanner;

public class MethodsHM {

	public static void methods() {
		int a;
		int sum = 0;

		System.out
				.println("������� ������ ���������, ������� Enter ����� �������: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			if (!sc.hasNextInt()) {
				System.out.println("�� ����� �� ����� �����! "
						+ "��� ����� ����� ����� �������� ����"
						+ " ���������� ������� ���������� ��������");
				sc.next();
				a = 0;
			} else {
				a = sc.nextInt();
				sum += a;
			}
		}
		System.out.println("����� ������� ��������� =" + " " + sum);

	}

	public static void main(String[] args) {
		
		MethodsHM.methods();
		
	}
}
