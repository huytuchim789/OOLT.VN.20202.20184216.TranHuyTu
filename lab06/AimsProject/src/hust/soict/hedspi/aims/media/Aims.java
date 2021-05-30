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
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(6,"Con co be be","Am nhac","Xuan Mai",80,1f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(7,"Star War","Phim le","Micheal Kelvin",120,2f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(8,"Aladdin","Hoat Hinh","Buster Lin",100,3f);
        Book book1 = new Book(1,"Doraemon","Anime",3f,"Fuji F Fuko");
        Book book2 = new Book(2,"Dragon Ball","Anime",3f,"Akio");
        Book book3 = new Book(3,"SGK Tieng Viet 5","Sach Giao Khoa",2f,"NXB Giao duc");
        Book book4 = new Book(4,"10 van cau hoi vi sao","Xa Hoi",2f,"Nguyen Tri Phuong");
        Book book5 = new Book(5,"5centimet/s","Van Hoc",4f,"Naki Hara");
        ArrayList <Book> book = new ArrayList<Book>();
        ArrayList <DigitalVideoDisc> dvd = new ArrayList<DigitalVideoDisc>();
        book.add(book1);book.add(book2);book.add(book3);book.add(book4);book.add(book5);
        dvd.add(dvd1);dvd.add(dvd2);dvd.add(dvd3);
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
                    System.out.println("Book list: ");
                    for(Book b: book)
                    {
                        System.out.println(b.getId() +" - "+ b.getTitle()+" - " + b.getCategory()+ " - " + b.getCost() + " - "+ b.getAuthor());
                    }
                    System.out.println("Choose the id of item you want: ");
                    int k = sc.nextInt();
                    if(k>=1 && k<=5)
                        order[i-1].addMedia(book.get(k-1));
                    else
                    {
                        System.out.println("Error: no book have id you choose!");
                        break;
                    }
                    System.out.println("DVD list");
                    for(DigitalVideoDisc d: dvd)
                    {
                        System.out.println(d.getId() +" - " + d.getTitle()+" - " + d.getCategory()+ " - " + d.getCost() + " - " +d.getDirector());
                    }
                    int l = sc.nextInt();
                    if(l>=6 && l<=8)
                    {
                        order[i-1].addMedia(dvd.get(l-book.size()-1));
                    }                   
                    else
                    {
                        System.out.println("Error: no dvd have id you choose!");
                        break;
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
                    System.out.println("list items you have ordered: ");
                    for(Media ord: order[i-1].getItemsOrdered())
                    {
                        System.out.println(ord.getId() + " - " + ord.getTitle() + " - "+ord.getCategory());
                    }
                    System.out.println("Choose the id of item you want to remove:");
                    int r=sc.nextInt();
                    order[i-1].removeMedia(order[i-1].getItemsOrdered().get(r-1));
                }
                break;
            }
            case 4:
            {
                System.out.println("list ordered: ");
                for(Media ord: order[i-1].getItemsOrdered())
                    {
                        System.out.println(ord.getId() + " - " + ord.getTitle() + " - "+ord.getCategory());
                    }
                Order.totalcost();
            }
            case 0:
                break;
                
            }
        }
                
        
    }
}
