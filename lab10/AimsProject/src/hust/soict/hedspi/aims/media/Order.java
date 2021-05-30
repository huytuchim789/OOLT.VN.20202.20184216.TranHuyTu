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
import javax.naming.LimitExceededException;
import java.lang.Exception;
public class Order {
    private ArrayList <CompactDisc> listordCD = new ArrayList<CompactDisc>();
    private ArrayList <DigitalVideoDisc> listordDVD = new ArrayList<DigitalVideoDisc>();    
    private ArrayList <Book> listordBook = new ArrayList<Book>();    
    private static float xs = 0.5f;
    public int id = 0;
    public static final int MAX_LIMITED_ORDER = 5;
    private static int nbOrders = 0;
//    public Order(){
//        nbOrders++;
//    }
//    public Order(int i)
//    {
//        this.id = i;
//    }
    public Order(int i) throws LimitExceededException{
        if (Order.nbOrders < MAX_LIMITED_ORDER)
        {
             nbOrders++;
             this.id=i;
        }
        else {
            throw new LimitExceededException("ERROR: The number of orders has reached its limit!");
        }
    }
    public int numberOrd(){
        return nbOrders;
    }
    private float total_cost;
    public boolean addCD(CompactDisc a)
    {
        if(this.listordCD.add(a))
        {
            if(a!=null)
            {
                this.total_cost=a.getCost();
                return true;
            }                
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
            {
                this.total_cost+=a.getCost();
                return true;
            }
                
            else
                return false;
        }
        else
            return false;
    }
    public void addBook(Book a)
    {
        this.listordBook.add(a);
        this.total_cost+=a.getCost();
    }
    
    public void removeCD(CompactDisc a)
    {
        this.listordCD.remove(a);
        this.total_cost-=a.getCost();
    }
    public void removeDVD(DigitalVideoDisc a)
    {
        this.listordDVD.remove(a);
        this.total_cost-=a.getCost();
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
        System.out.println("Total cost: "+this.total_cost+"$");

    }
//    public float totalCost()
//    {
//        float sum = 0f;
//        for(Media m: listordBook)
//        {
//            if(m!=null)
//                sum+=m.getCost();
//        }
//        for(Media m: listordDVD)
//        {
//            if(m!=null)
//                sum+=m.getCost();
//        }
//        for(Media m: listordCD)
//        {
//            if(m!=null)
//                sum+=m.getCost();
//        }
//        return sum;
//    }
    public int sosp()
    {
        return this.listordBook.size()+this.listordDVD.size()+this.listordCD.size();
    }
    public void Luckyitem()
    {
        Random r = new Random();
        float a = r.nextFloat();
        System.out.println("Để nhận được Lucky Item, bạn cần có tổng tiền mua hàng lớn hơn 10 và mua trên 5 sản phẩm");
        if(this.total_cost > 10 && this.sosp()>5 )
        {
            if(a < this.xs)
            {
                Random rd = new Random();
                int luckyid = rd.nextInt(10)+1;
                boolean check = true;
                while(check)
                {
                    if(this.getBookfromorder(luckyid)!=null)
                    {
                        if(this.getBookfromorder(luckyid).getCost() < this.total_cost*20/100)
                        {
                            System.out.println("Chúc mừng bạn đã có Lucky Item là Book: "+this.getBookfromorder(luckyid).getTitle());
                            check = false;
                            this.total_cost-=getBookfromorder(luckyid).getCost();
                        }                            
                    }
                    if(this.getCdfromorder(luckyid)!=null)
                    {
                        if(this.getCdfromorder(luckyid).getCost() < this.total_cost*20/100)
                        {
                            System.out.println("Chúc mừng bạn đã có Lucky Item là CD: "+this.getCdfromorder(luckyid).getTitle());
                            check = false;
                            this.total_cost-=getCdfromorder(luckyid).getCost();
                        }                            
                    }
                    if(this.getDVDfromorder(luckyid)!=null)
                    {
                        if(this.getDVDfromorder(luckyid).getCost() < this.total_cost*20/100)
                        {
                            System.out.println("Chúc mừng bạn đã có Lucky Item là DVD: "+this.getDVDfromorder(luckyid).getTitle());
                            check = false;
                            this.total_cost-=getDVDfromorder(luckyid).getCost();
                        }                            
                    }
                }           
            }    
            else {
            System.out.println("Chúc bạn may mắn lần sau!");
            }
        }
        else
        {
            System.out.println("Bạn chưa đủ điều kiện để nhận Lucky Item");
        }
        
    }
}
