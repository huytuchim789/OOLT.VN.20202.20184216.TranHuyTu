/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MyPC
 */
public class TestMediaCompareTo
     {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<DigitalVideoDisc> dvds = new ArrayList<DigitalVideoDisc>();
        ArrayList<CompactDisc> cds = new ArrayList<CompactDisc>();
        ArrayList<Track> tracks = new ArrayList<Track>();
        books.add(new Book("than dong dat viet","Truyen tranh",4,"Phan Thi"));
        books.add(new Book("Chiec la cuoi cung","Tieu thuyet",3,"Victor Huygo"));
        books.add(new Book("10 van cau hoi vi sao","Khoa hoc",5,"Tran Du"));
        books.add(new Book("SGK Toan 9","SGK",2,"NBX Giao Duc"));
        dvds.add(new DigitalVideoDisc("NinjaFood","Movie",12,120,"AlabaMaradona"));
        dvds.add(new DigitalVideoDisc("LQP","Movie",22,142,"MCKJean"));
        dvds.add(new DigitalVideoDisc("Tash","Music",29,50,"Tyfiny"));
        dvds.add(new DigitalVideoDisc("127 hours","NightMare",21,100,"Victor Jean"));
        dvds.add(new DigitalVideoDisc("AbalaHell","Movie",12,120,"NinjaLead"));
        Track t1 = new Track("SelfLove",3);
        Track t2 = new Track("Con Chim",4);
        Track t3 = new Track("Tay To",2);
        Track t4 = new Track("Dont waste my time",3);
        Track t5 = new Track("Lay Chua",5);
        Track t6 = new Track("Mommy",2);
        tracks.add(t1);tracks.add(t2);tracks.add(t3);tracks.add(t4);tracks.add(t5);
        CompactDisc cd1 = new CompactDisc("EP 1","Gang",10,"95G","Lil Wuyn",t1);
        cd1.addTrack(t4);
        cd1.addTrack(t3);
        CompactDisc cd2 = new CompactDisc("EP 2","Love",9,"RPT","MCK",t3);
        cd2.addTrack(t6);
        CompactDisc cd3 = new CompactDisc("EP 3","Tune",12,"SS","Tommy Teo",t2);
        Collections.sort(books);
        cds.add(cd1);cds.add(cd2);cds.add(cd3);
        System.out.println("Book list sorted: ");
        for(Book i: books)
        {
            System.out.println("Title: "+i.getTitle()+" -category: "+i.getCategory()+" -Cost: "+i.getCost()+" -author: "+i.getAuthor());
        }
        System.out.println("");
        Collections.sort(dvds);
        System.out.println("DVD list sorted: ");
        for(DigitalVideoDisc i: dvds)
        {
            System.out.println("Title: "+i.getTitle()+" -category: "+i.getCategory()+" -Cost: "+i.getCost()+" - Length: "+i.getLength()+"- Director: "+i.getDirector());
        
        }
        System.out.println("");
        Collections.sort(tracks);
        System.out.println("Track list sorted: ");
        for(Track i: tracks)
        {
            System.out.println("Title: "+i.getTitle()+"- Length: "+i.getLength());
        }
        System.out.println("");
        Collections.sort(cds);
        System.out.println("CD list sorted: ");
        for(CompactDisc i: cds)
        {
            System.out.println("Title: "+i.getTitle()+" -category: "+i.getCategory()+" -Cost: "+i.getCost()+" - Length: "+i.getLength()+"- Director: "+i.getDirector()+"- Artist: "+i.getArtist());
        }
    }
}
