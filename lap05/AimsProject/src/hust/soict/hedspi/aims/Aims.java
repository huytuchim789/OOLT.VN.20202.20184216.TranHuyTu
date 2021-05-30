/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

/**
 *
 * @author MyPC
 */

public class Aims {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Order Order1= new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(1f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
//        anOrder.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(2f);
        dvd2.setDirector("Geogre Lucas");
        dvd2.setLength(124);
//        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(3f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        DigitalVideoDisc dvdlist[] = new DigitalVideoDisc[4];
        dvdlist[0]=dvd1;
        dvdlist[1]=dvd2;
        dvdlist[2]=dvd3;
        dvdlist[3]=dvd2;
        Order1.addDigitalVideoDisc(dvdlist);
        Order1.addDigitalVideoDisc(dvd2,dvd3);
//        Order1.addDigitalVideoDisc(dvd2,dvd3);
        Order1.addDigitalVideoDisc(dvd2,dvd3);
        Order1.addDigitalVideoDisc(dvd2,dvd3);
        Order1.print();
        Order Order2=new Order();
        Order2.addDigitalVideoDisc(dvdlist);       
        Order2.addDigitalVideoDisc(dvd3,dvd1);
        System.out.println(Order2.qtyOrdered());
        Order2.print();
        Order Order3=new Order();
        Order3.addDigitalVideoDisc(dvd3,dvd2);
        Order3.addDigitalVideoDisc(dvdlist);
        Order3.addDigitalVideoDisc(dvd3,dvd1);
        Order3.print();
        Order Order4=new Order();
        Order4.addDigitalVideoDisc(dvd3,dvd2);
        Order4.addDigitalVideoDisc(dvdlist);
        Order4.addDigitalVideoDisc(dvd3,dvd1);
        Order4.print();
        Order Order5=new Order();
        Order5.addDigitalVideoDisc(dvd3,dvd2);
        Order5.addDigitalVideoDisc(dvdlist);
        Order5.addDigitalVideoDisc(dvd3,dvd1);
        Order5.print();
        Order Order6=new Order();
        Order6.addDigitalVideoDisc(dvdlist);
        Order6.print();
    }
}
