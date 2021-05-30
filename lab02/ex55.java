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
public class ex55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
//        int n;
        Scanner scanner = new Scanner(System.in);
        String m;
        int y;
        int d=0;
        while(true)
        {
        System.out.println("Mời bạn nhập tháng: ");
        m = scanner.nextLine();
        System.out.println("Mời bạn nhập năm: ");
        y = scanner.nextInt();    
        if(y<0){
            System.out.println("Bạn nhập sai cú pháp năm");
            System.out.println("Xin mời nhập lại:");
        }
        else{
            if(m.equals("January") || m.equals("Jan.") || m.equals("Jan") || m.equals("1"))
                d=31;
            else if(m.equals("February") || m.equals("Feb.") || m.equals("Feb") || m.equals("2"))
            {
                if(y%400==0 || (y%4==0 && y%100!=0))
                    d=29;
                else
                    d=28;
            }
            else if(m.equals("March") || m.equals("Mar.") || m.equals("Mar") || m.equals("3"))
                d=31;
            else if(m.equals("April") || m.equals("Apr.") || m.equals("Apr") || m.equals("4"))
                d=30;
            else if(m.equals("May") ||  m.equals("5"))
                d=31;
            else if(m.equals("June") || m.equals("Jun") || m.equals("6"))
                d=30;
            else if(m.equals("July") ||  m.equals("Jul") || m.equals("7"))
                d=31;
            else if(m.equals("August") ||  m.equals("Aug.") || m.equals("Aug") || m.equals("8"))
                d=31;
            else if(m.equals("September") ||  m.equals("Sep.") || m.equals("Sep") || m.equals("9"))
                d=30;
            else if(m.equals("October") ||  m.equals("Oct.") || m.equals("Oct") || m.equals("10"))
                d=31;
            else if(m.equals("November") ||  m.equals("Nov.") || m.equals("Nov") || m.equals("11"))
                d=30;
            else if(m.equals("December") ||  m.equals("Dec.") || m.equals("Dec") || m.equals("12"))
                d=31; 
            else 
            {
                System.out.println("Ban nhập sai cú pháp tháng");
            }
            System.out.println("Tháng " + m + " năm " + y + " có: " + d + "ngày");
            break;
        }
        }
    }
}