/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.test.utils;

import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aims.utils.DateUtils;

/**
 *
 * @author MyPC
 */
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        MyDate date = new MyDate();
        MyDate test1 = new MyDate("second","july","one thousand and five");
        MyDate test2 = new MyDate("nineteenth","april","nineteen seventy five");
        MyDate test3 = new MyDate("fifteenth","september","four thousand and five");
        MyDate test4 = new MyDate("third","december","twenty one seventy two");
        MyDate o1 = new MyDate(10,4,2000);
        MyDate o2 = new MyDate(14,2,1999);
        MyDate o3 = new MyDate(24,2,1699);
        MyDate o4 = new MyDate(14,1,1299);
        MyDate[] OS = new MyDate[4];
        OS[0] =o1;
        OS[1]=o2;
        OS[2]=o3;
        OS[3]=o4;
        DateUtils a = new DateUtils();

        for(int i=0;i<OS.length+1;i++)
        {
            for(int j=i+1;j<OS.length;j++)
            {
                if(a.compare(OS[i], OS[j])==1)
                    swapdate(OS[i],OS[j]);
            }
        }
        System.out.println("Cac date da sap xep thu tu tang dan:");
        for(int i=0;i<OS.length;i++)
        {
            System.out.println(OS[i].getDay()+"-"+OS[i].getMonth()+"-"+OS[i].getYear());
        }
//        MyDate test2 = new MyDate("thirteenth","april","");
        test1.print();
        test2.print();
        test3.print();
        test4.print();
        date.printdate();
        
//        test2.print();
    }
public static void swapdate(MyDate m1,MyDate m2)
    {
        MyDate n1=m1;
        MyDate n2=m2;
        int tmpday;
        int tmpmonth;
        int tmpyear;
        if(n1 != null && n2!=null)
        {
            tmpday=n1.getDay();
            tmpmonth=n1.getMonth();
            tmpyear=n1.getYear();
            n1.setDay(n2.getDay());
            n1.setMonth(n2.getMonth());
            n1.setYear(n2.getYear());
            n2.setDay(tmpday);
            n2.setMonth(tmpmonth);
            n2.setYear(tmpyear);
        }
            
    }
}
