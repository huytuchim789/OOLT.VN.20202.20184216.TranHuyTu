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
    private static ArrayList <Media> itemsOrdered = new ArrayList<Media>();
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
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void addMedia(Media a)
    {
        Media tmp = new Media(a.getId(),a.getTitle(),a.getCategory(),a.getCost());
        this.itemsOrdered.add(tmp);
    }
    public void removeMedia(Media media)
    {
        this.itemsOrdered.remove(media);
    }
    public void printOrd()
    {
        for(Media media: itemsOrdered)
        {
            System.out.println(media.getId()+"-"+media.getTitle()+"-"+media.getCategory()+"-"+media.getCost());
        }
    }
    public static void totalcost()
    {
        int sum=0;
        for(Media ord: itemsOrdered)
        {
            sum +=ord.getCost();
        }
        System.out.println("Total cost: "+ sum +"$");
    }
    
}
