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
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc(String title,String category,float cost,int length, String director)
    {
        super(title,category,cost,director);
        this.setLength(length);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public static DigitalVideoDisc getdvd(int i,ArrayList<DigitalVideoDisc> dvd)
    {
        for(DigitalVideoDisc d: dvd)
        {
            if(d.getId() == i)
                return d;
        }
        System.out.println("id ban nhap ko hop le!");
        return null;       
    }
    public void play() throws PlayerException{
        if(this!=null)
        {
            if(this.getLength() > 0)
            {
                System.out.println(this.getTitle()+ " DVD is playing...");
                System.out.println("Length: "+this.getLength());
            }
            else 
            {
                throw new PlayerException("ERROR: DVD length is non-positive!");
            }
        }
}

//    @Override
//    public int compareTo(DigitalVideoDisc o) {
//        if(this.getCost() > o.getCost())
//            return 1;
//        else if(this.getCost() < o.getCost())
//            return -1;
//        else 
//        {
//            int i=this.getLength() - o.getLength();
//            if(i!=0)
//                return i;
//            else
//            {
//                return this.getTitle().compareTo(o.getTitle());                  
//            }
//        }
//    }
}



