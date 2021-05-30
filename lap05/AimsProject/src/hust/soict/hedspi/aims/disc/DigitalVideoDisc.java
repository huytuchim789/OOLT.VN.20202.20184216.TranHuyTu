/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.disc;

/**
 *
 * @author MyPC
 */
import java.util.Arrays;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public String getTitle()
    {
    return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getCategory()
    {
        return category;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public String getDirector()
    {
        return director;
    }
    public void setDirector(String director)
    {
        this.director = director;
    }
    public int getLength()
    {
        return length;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public float getCost()
    {
        return cost;
    }
    public void setCost(float cost)
    {
        this.cost = cost;
    }
    public DigitalVideoDisc (String title)
    {
        super();
        this.title = title; 
    }
    public boolean search(String title)
    {
        String input[] = title.split(" ");
        String disctitle[] =this.getTitle().split(" ");
        boolean[] check= new boolean[input.length]; 
        boolean[] a = new boolean[input.length];
        for(int i=0;i<a.length;i++)
        {
            a[i]=true;
        }
        for(int i=0;i<input.length;i++)
        {
            for(int j=0;j<disctitle.length;j++)
            {
                if(input[i].equalsIgnoreCase(disctitle[j]))
                {
                    check[i] = true;
                }
            }
        }
        boolean b=Arrays.equals(check, a);
        if(b==true)
            return true;
        else
            return false;
    }
}



