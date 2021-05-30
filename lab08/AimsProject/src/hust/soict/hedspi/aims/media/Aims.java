/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

/**
 *
 * @author MyPC
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Aims {
    public static void showMenu()
    {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Con co be be","Am nhac",1f,80,"Xuan Mai");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War","Phim le",2f,120,"Micheal Kelvin");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Hoat Hinh",3f,100,"Buster Lin");
        Book book1 = new Book("Doraemon","Anime",3f,"Fuji F Fuko");
        Book book2 = new Book("Dragon Ball","Anime",3f,"Akio");
        Book book3 = new Book("SGK Tieng Viet 5","Sach Giao Khoa",2f,"NXB Giao duc");
        Book book4 = new Book("10 van cau hoi vi sao","Xa Hoi",2f,"Nguyen Tri Phuong");
        Book book5 = new Book("5centimet/s","Van Hoc",4f,"Naki Hara");
        Track track1 = new Track("Sugar",3);
        Track track2 = new Track("SelfLove",4);
        Track track3 = new Track("Dont waste my time",3);
        Track track4 = new Track("Cold Dern",4);
        Track track5 = new Track("Buong Hang",3);        
        CompactDisc cd1 = new CompactDisc("Love","hiphop",10f,"NVM","RPT",track1);
        cd1.addTrack(track4);
        cd1.addTrack(track2);
        CompactDisc cd2 = new CompactDisc("Life","Indie",12f,"95G","16 Typh",track3);
        cd2.addTrack(track5);
        ArrayList <Book> book = new ArrayList<Book>();
        ArrayList <DigitalVideoDisc> dvd = new ArrayList<DigitalVideoDisc>();
        ArrayList <CompactDisc> cd = new ArrayList<CompactDisc>();
        book.add(book1);book.add(book2);book.add(book3);book.add(book4);book.add(book5);
        dvd.add(dvd1);dvd.add(dvd2);dvd.add(dvd3);
        cd.add(cd1);cd.add(cd2);
        Order[] order = new Order[Order.MAX_LIMITED_ORDER];
        int i=0;
        int n=5;
        Scanner sc = new Scanner(System.in);
        while(n!=0)
        {
            showMenu();
            n = sc.nextInt();
            switch(n)
            {
            case 1:
                if(i<Order.MAX_LIMITED_ORDER)
                {
                    Order a = new Order(i);
                    order[i] = a;
                    i++;
                    System.out.println("created a new order!");
                }
                else{
                    System.out.println("Error: Order limit exceeded");
                }
                break;
            case 2: 
            {
                if(i==0)
                {
                    System.out.println("No orders have been created yet! Please press 1.");
                    break;
                }
                else if(i==Order.MAX_LIMITED_ORDER)
                {
                    System.out.println("Error: Order limit exceeded");
                }
                else if(i>0&&i<Order.MAX_LIMITED_ORDER)
                {
                    System.out.println("1.DVD");
                    System.out.println("2.Book");
                    System.out.println("3.CD");
                    int choose = sc.nextInt();
                    switch(choose)
                    {
                        case 1:
                        {
                            System.out.println("DVD list");
                            for(DigitalVideoDisc d: dvd)
                            {
                                System.out.println(d.getId() +" - " + d.getTitle()+" - " + d.getCategory()+ " - " + d.getCost() + " - " +d.getDirector());
                            }
                            System.out.print("choose the id dvd you want to order:");
                            int k=sc.nextInt();        
                            if(order[i-1].addDVD(DigitalVideoDisc.getdvd(k, dvd))==true)
                            {
                                System.out.println("would you want to play this DVD? ");
                                System.out.println("Yes: press 1         No: press 2");
                                int m=sc.nextInt();
                                if(m==1)
                                    DigitalVideoDisc.getdvd(k, dvd).play();
                               
                            }
                            else
                                System.out.println("");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Book list");
                            for(Book b: book)
                            {
                                System.out.println(b.getId()+" - "+b.getTitle()+" - "+b.getCategory()+" - "+b.getCost()+" - "+b.getAuthor());
                            }
                            System.out.print("choose the id book you want to order: ");
                            int k=sc.nextInt();
                            order[i-1].addBook(Book.getbook(k, book));
                            break;
                        }
                        case 3:
                        {
                            System.out.println("CD list");
                            for(CompactDisc c: cd)
                            {
                                System.out.println(c.getId()+" - "+c.getTitle()+" - "+c.getCategory()+" - "+c.getCost()+" - "+c.getDirector()+" - "+c.getArtist());
                         
                            }
                            System.out.print("choose the id cd you want to order: ");
                            int k=sc.nextInt();
                            
                            if(order[i-1].addCD(CompactDisc.getcd(k, cd))==true)
                            {
                                System.out.println("would you like to play this CD");
                                System.out.println("Yes: press 1         No: press 2");
                                int m=sc.nextInt();
                                if(m==1)
                                    CompactDisc.getcd(k, cd).play();
                            }
                            else
                                System.out.println("");
                            break;
                        }
                    }
                        
                }
                break;
            }
            case 3: 
            {
                if(i==0)
                {
                    System.out.println("No orders have been created yet! Please press 1.");
                    break;
                }
                else 
                {
                    order[i-1].printOrder();
                    System.out.print("choose the id of the media you want to delete from this order: ");
                    int k = sc.nextInt();
                    order[i-1].removeMedia(k);
                }
                break;
            }
            case 4:
            {
                System.out.println("The ordered list: ");
                order[i-1].printOrder();
//                System.out.println("list ordered: ");
//                for(Media ord: order[i-1].getItemsOrdered())
//                    {
//                        System.out.println(ord.getId() + " - " + ord.getTitle() + " - "+ord.getCategory());
//                    }
//                Order.totalcost();
            }
            case 0:
                break;
            }
        }
                
        
    }
}
