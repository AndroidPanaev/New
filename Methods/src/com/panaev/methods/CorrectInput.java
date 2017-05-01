package com.panaev.methods;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CorrectInput {

	public static void sysout() {
		System.out.println("Ввeдите целое число: ");
	}

	public static void input() {
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		sysout();
		sc.hasNextInt();
		a = sc.nextInt();
		
		sysout();
		sc.hasNextInt();
		b = sc.nextInt();
		
		sysout();
		sc.hasNextInt();
		c = sc.nextInt();
		System.out.println("Вы ввели:" + "\na=" + a + "\nb=" + b + "\nc ="
				+ c);
	}

	public static void iFinputCorrect() {

		try {
			input();

		} catch (Exception NumberFormatException) {
			System.out.println("Вы ввели НЕ целое числo, теперь прийдется вводить снова 3 числа, "
					+ "потому что наша програма пока не умеет возращаться на место ошибки ввода)");
			input();

		}

	}

}
