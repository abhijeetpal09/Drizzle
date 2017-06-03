/**
 * 
 */
package com.drizzle.test;

import java.util.Scanner;

/**
 * @author Varun
 *
 */
public class EntryPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		f1: while (true) {

			System.out.println("Enter the option");
			System.out.println("1. Get Employee Name");
			System.out.println("2. Get Employee Name and Address");
			System.out.println("0. Exit");

			int choice = sc.nextInt();

			if (choice == 0) {
				break f1;
			} else {
				Implementation i = new Implementation(1, "Varun Shanbhag",
						"Mumbai");
				switch (choice) {
				case 1:
					System.out.println("Employee name: " + i.getNameOfEmp());
					break;
				case 2:
					System.out.println("Employee Name is: " + i.getNameOfEmp()
							+ " Address is: " + i.getAddressOfEmp());
					break;
				default:
					System.out.println("Wrong Choice please reenter !");
					break;

				}
			}

		}
		System.out.println("System Exited !!!!!!!!");
		sc.close();
	}

}
