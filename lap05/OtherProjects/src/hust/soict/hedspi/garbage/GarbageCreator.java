/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.garbage;

/**
 *
 * @author MyPC
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class GarbageCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws IOException {
        // TODO code application logic here
      FileInputStream fin = null;
      fin=new FileInputStream("C:\\Users\\MyPC\\Documents\\NetBeansProjects\\OtherProjects\\src\\hust\\soict\\hedspi\\garbage\\data.txt");
      Scanner sc = new Scanner(fin);
      String str = new String();
      try{
          while(sc.hasNextLine())
              str += sc.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
            fin.close();
        }
        System.out.println(str);
      }
   }