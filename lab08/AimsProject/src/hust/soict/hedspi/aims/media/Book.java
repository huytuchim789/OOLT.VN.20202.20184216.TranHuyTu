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
import java.util.*;
public class Book extends Media implements Comparable<Book> {
    private int idbook=0;
    private ArrayList<String> author= new ArrayList<String>();
    private String content;
    private ArrayList<String> contentTokens = new ArrayList<String>();
    private TreeMap<String,Integer> wordFrequency = new TreeMap<String,Integer>();
    public Book(String title,String category,float cost,String a)
    {
        super(title,category,cost);
        this.setId();
        if(!author.contains(a))
            author.add(a);
    }    
    public Book(String title,String category,float cost,String a,String content)
    {
        super(title,category,cost);
        this.setId();
        if(!author.contains(a))
            author.add(a);
        this.content = content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<String> getContentTokens() {
        return contentTokens;
    }

    public TreeMap<String, Integer> getWordFrequency() {
        return wordFrequency;
    }

    @Override
    public int compareTo(Book o) {
        float i = this.getCost() - o.getCost();
        if(i>0)
            return 1;
        else if(i<0)
            return -1;
        else
            return 0;
    }
    public void processContent()
    {
        String []cut = content.split(" ");
        ArrayList <String> cut1 = new ArrayList<String>();
        int n=0;
        for(int i=0;i<cut.length;i++)
        {
            cut1.add(cut[i]);
            if(cut[i].contains("."))
            {
                cut1.remove(cut[i]);
                String[]tmp=cut[i].split("\\.");
                for(int j=0;j<tmp.length;j++)
                {
                    cut1.add(tmp[j]);
                }
            }
        }
        this.contentTokens = cut1;
        for(String i: cut1)
        {
            if(this.wordFrequency.containsKey(i))
            {
                this.wordFrequency.replace(i, this.wordFrequency.get(i)+1);
            }
            else
                this.wordFrequency.put(i, 1);
        }
    }
    public String toString()
    {
        System.out.println("title: "+ this.getTitle());
        System.out.println("category: "+this.getCategory());
        System.out.println("cost: "+this.getCost());
        System.out.println("author: "+ this.getAuthor());
        Set<String> keys = getWordFrequency().keySet();
        for (String key : keys)
        {
            System.out.println("Token: "+key + ", Value: " + getWordFrequency().get(key));
        }
        return null;
    }
}
 


