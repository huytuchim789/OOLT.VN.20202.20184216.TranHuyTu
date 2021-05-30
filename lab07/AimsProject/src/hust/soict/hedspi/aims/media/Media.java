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
abstract class Media {
    protected static int id=0;
    protected int id1=0;    
    protected String title;
    protected float cost;
    protected String category;
    public Media(String title,String category,float cost)
    {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id++;
        this.id1 = this.id;
    }
    public int getId() {
        return id1;
    }

    public void setId() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        
    }
    
}
