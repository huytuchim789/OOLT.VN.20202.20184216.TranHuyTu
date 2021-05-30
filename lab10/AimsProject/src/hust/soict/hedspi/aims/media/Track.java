/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MyPC
 */
public class Track extends Object implements Comparable<Track>{
    private String title;
    private int length;
    public Track(String title, int length)
    {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public boolean equals(Object o)
    {
        Track a=(Track)o;
        if(a!=null)
        {
            if(this.getTitle().equals(a.getTitle()) && this.getLength()==a.getLength())
                return true;
        }
        return false;
    }

    @Override
    public int compareTo(Track o) {
        int i=this.getLength() - o.getLength();
        if(i!=0)
            return i;
        else
            return 0;
    }
    public void play() throws PlayerException{
        if(this.getLength()>0)
        {
            System.out.println("Length: " + this.getLength());
            System.out.println("Track " +this.getTitle()+ " is playing...");
        }
        else 
        {
            throw new PlayerException("Track"+this.getTitle() +"length is non-positive!");
 
        }
        
    }

}
