/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class inputfromKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("What 's your name?");
        String name = Keyboard.nextLine();
        System.out.println("How old are you?");
        int age = Keyboard.nextInt();
        System.out.println("How tall are you(m)?");
        double tall = Keyboard.nextDouble();
        System.out.println("Mr/Mrs. " + name + "," + age + " years old." + " Your height is " + tall + ".");
        
        
    }
}
