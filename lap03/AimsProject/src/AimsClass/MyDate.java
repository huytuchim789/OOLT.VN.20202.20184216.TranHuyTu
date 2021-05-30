/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AimsClass;

/**
 *
 * @author MyPC
 */
import java.time.LocalDate;
import java.util.Scanner;        
public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean tof;
    LocalDate localDate = LocalDate.now();
    public boolean setMonth(int month)
    {
        this.month = month;
        if(month <= 12)
            return true;
        else 
            System.out.println("Sai cu phap thang");
            return false;
    }
    public boolean setYear(int year)
    {
        this.year = year;
        if(year > 0 && String.valueOf(year).length() == 4)
            return true;
        else
            System.out.println("Sai cu phap nam");
            return false;
    }
    public boolean setDay(int day)
    {
        this.day = day;
        switch(getMonth())
        {
            case 1,3,5,7,8,10,12 ->{
                if(day <= 31)
                    return true;}
            case 2->{
                if(namnhuan() == 1)
                {
                    if(day <= 29)
                        return true;
                }
                else
                {
                    if(day <= 28)
                        return true;
                }
            }
            case 4,6,9,11->{               
                    if(day <= 30)
                        return true;
            }        
        }
        boolean i = setMonth(month);
        if (i == false)
            System.out.println("");
        else
            System.out.println("sai cu phap ngay");
        return false;
    }

    public void accept()
    {
        System.out.println("Moi ban nhap ngay thang nam theo dinh dang dd/mm/yyyy: ");
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();
        String[] str = date.split("/", 3);
        boolean y=setYear(Integer.parseInt(str[2]));
        boolean m=setMonth(Integer.parseInt(str[1]));
        boolean d=setDay(Integer.parseInt(str[0]));
        tof = d && m && y;
    }
    public int namnhuan()
    {
        if(getYear()%400==0 || (getYear()%4==0 && getYear()%100!=0))
            return 1;
        else
            return 0;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
    public void print()
    {
        if(tof == true)
        {
            System.out.println("date: " + getDay() + "/" + getMonth() + "/" + getYear());
        }
        else
        {
            System.out.println("ban nhap sai dinh dang date");
            System.out.print("Today: ");
            System.out.println(localDate);
        }
    }
}
