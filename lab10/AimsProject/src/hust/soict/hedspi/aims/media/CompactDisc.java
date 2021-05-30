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
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class CompactDisc extends Disc implements Playable
{
    private String artist;
    private ArrayList <Track> tracks = new ArrayList<Track>();
    public CompactDisc(String title,String category,float cost,String director,String artist,Track t)
    {
        super(title,category,cost,director);
        this.setLength(getLeng());
        this.artist = artist;
        if(!tracks.contains(t))
            tracks.add(t);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void addTrack(Track t)
    {
        if(!tracks.contains(t))
            tracks.add(t);
    }
    public void removeTrack(Track t)
    {
        if(tracks.contains(t))
            tracks.remove(t);
    }
    public int getLeng()
    {
        int sum =0;
        for(Track t: tracks)
        {
            sum+=t.getLength();
        }
        return sum;
    }
    public static CompactDisc getcd(int i,ArrayList<CompactDisc> cd)
    {
        for(CompactDisc c: cd)
        {
            if(c.getId() == i)
                return c;
        }
        System.out.println("id ban nhap ko hop le!");
        return null;
    }
//    public void play()
//    {
//        if(this!=null)
//        {
//        System.out.println("CD name: "+this.getTitle());
//        System.out.println("Total length: "+this.getLeng());
//        for(Track t: tracks)
//        {
//            t.play();
//        }
//        }
//    }
    @Override
    public void play() throws PlayerException{
        if(this.getLeng() > 0) {
// TODO Play all tracks in the CD as you have implemented
            java.util.Iterator iter = tracks.iterator();
            Track nextTrack;
            while(iter.hasNext()) {
            nextTrack = (Track) iter.next();
            try{
                nextTrack.play();
            }
            catch(PlayerException e){
                throw e;
            }
            }
        }
        else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
}

    public ArrayList<Track> getTracks() {
        return tracks;
    }

//    @Override
//    public int compareTo(CompactDisc o) {
//      if(this.getTracks().size() > o.getTracks().size())
//          return this.getTracks().size() - o.getTracks().size();
//      else if(this.getTracks().size() < o.getTracks().size())
//          return o.getTracks().size() -this.getTracks().size();
//      else 
//      {
//          if(this.getLeng() > o.getLeng())
//              return this.getLeng() - o.getLeng();
//          else if(this.getLeng() < o.getLeng())
//              return o.getLeng() - this.getLeng();
//          else
//          {
//              return this.getTitle().compareTo(o.getTitle());
//          }
//      }
//    }
    
}
