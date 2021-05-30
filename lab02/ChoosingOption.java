/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author MyPC
 */
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change the first class ticket?");
        JOptionPane.showConfirmDialog(null, "you've choosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
