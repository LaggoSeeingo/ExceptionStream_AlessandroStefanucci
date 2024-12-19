/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alessandro Stefanucci
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

    
    public static void testNumberFormatException() {
        
	Scanner in = new Scanner(System.in);
		System.out.println("Digita un intero:");
		
		try {
			int intValue = in.nextInt();
			System.out.println("Valore: " + intValue);
		} catch (InputMismatchException e) {
			System.out.println("Exception message: " + e.getMessage());
		} finally {
			System.out.println("SONO IN FINALLY!!!");
			in.close();
		}
    }
    
    
}
