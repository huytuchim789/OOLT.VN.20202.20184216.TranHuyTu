/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

/**
 *
 * @author MyPC
 */
import java.util.Scanner;
public class DiskTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Order ord = new Order();
        Scanner sc = new Scanner(System.in);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(1f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(2f);
        dvd2.setDirector("Geogre Lucas");
        dvd2.setLength(124);
       
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(3f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Doraemon");
        dvd4.setCategory("Animation");
        dvd4.setCost(4f);
        dvd4.setDirector("Ffuji");
        dvd4.setLength(80);
        
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Dragon Ball");
        dvd5.setCategory("Action");
        dvd5.setCost(5f);
        dvd5.setDirector("Nakia zamuda");
        dvd5.setLength(100);
        
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Fast and Furious");
        dvd6.setCategory("Action");
        dvd6.setCost(6f);
        dvd6.setDirector("Justin Lin");
        dvd6.setLength(150);
        
        DigitalVideoDisc av[] = new DigitalVideoDisc[6];
        av[0]=dvd1;
        av[1]=dvd2;
        av[2]=dvd3;
        av[3]=dvd4;
        av[4]=dvd5;
        av[5]=dvd6;
        String str;
        System.out.print("Nhap ten dvd ban can tim: ");
        str = sc.nextLine();
        for(int i=0;i<av.length;i++)
        {
            if(av[i].search(str) == true)
                System.out.println("Da tim thay dvd!");
        }

        ord.addDigitalVideoDisc(av);
        ord.print();
        DigitalVideoDisc lucky = ord.getALuckyItem();
        
        System.out.println("The lucky item is: "+lucky.getTitle());
        System.out.println("Ban phai thanh toan: "+(ord.totalCost()-lucky.getCost())+"$");
    }
}
