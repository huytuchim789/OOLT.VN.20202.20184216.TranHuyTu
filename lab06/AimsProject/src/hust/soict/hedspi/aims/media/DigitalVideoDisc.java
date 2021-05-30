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
import java.util.Arrays;
public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public DigitalVideoDisc(int id,String title,String category,String director,int length,float cost)
    {
        super(id,title,category,cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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



