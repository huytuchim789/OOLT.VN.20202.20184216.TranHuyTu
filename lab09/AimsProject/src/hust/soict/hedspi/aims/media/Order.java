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
import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import java.util.Random;
import java.util.ArrayList;
public class Order {
    private ArrayList <CompactDisc> listordCD = new ArrayList<CompactDisc>();
    private ArrayList <DigitalVideoDisc> listordDVD = new ArrayList<DigitalVideoDisc>();    
    private ArrayList <Book> listordBook = new ArrayList<Book>();    
    
    public int id = 0;
    public static final int MAX_LIMITED_ORDER = 5;
    private static int nbOrders = 0;
    public Order(){
        nbOrders++;
    }
    public Order(int i)
    {
        this.id = i;
    }
    public int numberOrd(){
        return nbOrders;
    }

    public boolean addCD(CompactDisc a)
    {
        if(this.listordCD.add(a))
        {
            if(a!=null)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public boolean addDVD(DigitalVideoDisc a)
    {
        if(this.listordDVD.add(a))
        {
            if(a!=null)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public void addBook(Book a)
    {
        this.listordBook.add(a);
    }
    
    public void removeCD(CompactDisc a)
    {
        this.listordCD.remove(a);
    }
    public void removeDVD(DigitalVideoDisc a)
    {
        this.listordDVD.remove(a);
    }
    public void removeMedia(int i)
    {
        this.listordBook.remove(this.getBookfromorder(i));
        this.listordDVD.remove(this.getDVDfromorder(i));
        this.listordCD.remove(this.getCdfromorder(i));
//        if(!this.listordBook.isEmpty()){
//        for(Book a: this.listordBook)
//        {
//            if(a.getId() == i)
//                this.listordBook.remove(a);
//        }
//        }
//        if(!this.listordDVD.isEmpty()){
//        for(DigitalVideoDisc a: this.listordDVD)
//        {
//            if(a.getId() == i)
//                this.listordDVD.remove(a);
//        }
//        }
//        if(!this.listordCD.isEmpty()){
//        for(CompactDisc a: this.listordCD)
//        {
//            if(a.getId() == i)
//                this.listordCD.remove(a);
//        }
//        }
    }
//    public ArrayList<Book> bookord()
//    {
//        return this.listordBook;
//    }
//    public ArrayList<DigitalVideoDisc> dvdord()
//    {
//        return this.listordDVD;
//    }
//    public ArrayList<CompactDisc> cdord()
//    {
//        return this.listordCD;
//    }
    public Book getBookfromorder(int i)
    {
        for(Book t: listordBook)
        {
            if(t!=null){
                if(t.getId() == i)
                return t;
            }
        }
        return null;
    }
    public DigitalVideoDisc getDVDfromorder(int i)
    {
        for(DigitalVideoDisc t: listordDVD)
        {
            if(t!=null){
                if(t.getId() == i)
                return t;
            }
        }
        return null;
    }
    public CompactDisc getCdfromorder(int i)
    {
        for(CompactDisc t: listordCD)
        {
            if(t!=null){
                if(t.getId() == i)
                return t;
            }
        }
        return null;
    }
    public void printOrder()
    {
        if(!this.listordBook.isEmpty()){
            System.out.println("Book: ");
            for(Book b: this.listordBook)
            {
                if(b!=null)
                    System.out.println(b.getId() + "-"+b.getTitle()+"-"+b.getCost()+"-"+b.getCategory()+"-"+b.getAuthor());
            }
        }
        if(!this.listordCD.isEmpty()){
            System.out.println("CD: ");
            for(CompactDisc c: this.listordCD)
            {
                if(c!=null)
                    System.out.println(c.getId()+"-"+c.getTitle()+"-"+c.getCost()+"-"+c.getCategory()+"-"+c.getDirector()+"-"+c.getArtist());
            }
        }

        if(!this.listordDVD.isEmpty()){
            System.out.println("DVD: ");
        for(DigitalVideoDisc d: this.listordDVD)
        {
            if(d!=null)
                System.out.println(d.getId() + "-"+d.getTitle()+"-"+d.getCost()+"-"+d.getCategory());
        }
        }
        System.out.println("Total cost: "+this.totalCost()+"$");

    }
    public int totalCost()
    {
        int sum = 0;
        for(Media m: listordBook)
        {
            if(m!=null)
                sum+=m.getCost();
        }
        for(Media m: listordDVD)
        {
            if(m!=null)
                sum+=m.getCost();
        }
        for(Media m: listordCD)
        {
            if(m!=null)
                sum+=m.getCost();
        }
        return sum;
    }
}
