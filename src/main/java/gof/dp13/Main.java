package gof.dp13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Enter integer amount: ");
			int amount = new Scanner(System.in).nextInt();
			Request r = new Request(amount);
			Responsibility representative = new Manager();
			representative.handleRequest(r);
		} catch (InputMismatchException e) {
			System.out.println("Invalid amount");
		}
	}
}