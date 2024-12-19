/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alessandro Stefanucci
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestInput {
    
    
    public static void usingBufferedReader(){
        
     int numero = 0;
     
     BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        
        try { 
            numero = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(TestInput.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(TestInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void usingScanner(){
    
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        
        
    }
}
