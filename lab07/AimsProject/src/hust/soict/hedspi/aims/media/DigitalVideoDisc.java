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
    public void play() {
        if(this!=null)
        {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length:" + this.getLength());
        }
}
}



