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
public class Book extends Media {
    private int idbook=0;
    private ArrayList<String> author= new ArrayList<String>();
    public Book(String title,String category,float cost,String a)
    {
        super(title,category,cost);
        this.setId();
        if(!author.contains(a))
            author.add(a);
    }    


    public ArrayList<String> getAuthor() {
        return author;
    }
    public void addAuthor(String a)
    {
        if(!author.contains(a))
            author.add(a);
    }
    public void removeAuthor(String a)
    {
        if(author.contains(a))
            author.remove(a);
    }
    public static Book getbook(int i,ArrayList<Book> book)
    {
        for(Book t: book)
        {
            if(t.getId() == i)
            {
                return t;
            }
        }
        System.out.println("id ban nhap ko hop le!");
        return null;
    }
}
    


