package com.ptpl.bankingpdf;

import java.util.Scanner;

public class AcType2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the account type (savings or current): ");
        String acType = scanner.nextLine();

        if (acType.equalsIgnoreCase("savings") || acType.equalsIgnoreCase("current")) {
            System.out.println("Valid account type.");
        } else {
            System.out.println("Invalid account type.");
        }

        scanner.close();
    }

   // public static boolean isValidAcType(String accountType) {
       // return accountType.equalsIgnoreCase("savings") || accountType.equalsIgnoreCase("current");
    }








	


