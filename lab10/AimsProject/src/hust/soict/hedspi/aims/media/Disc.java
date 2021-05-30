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
import java.util.Random;
public class Disc extends Media implements Playable {
    private int length;
    private String director;
    public Disc(String title,String category,float cost, String director)
    {
        super(title,category,cost);
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
//    public void setId(int id) {
//        this.id=id;
//    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public void play() throws PlayerException{
        System.out.println("Playing DVD/CD" + this.getTitle());
        System.out.println("DVD/CD length: " + this.getLength());
    }
}
