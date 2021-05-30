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
abstract class Media extends Object implements Comparable<Media>{
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
    @Override
    public boolean equals(Object o)
    {
        Media a =(Media) o;
        try{
            if(o!=null)
        {
            if(this.getId() == a.getId())
                return true;
        }
        }catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public int compareTo(Media o)
    {
        try{
            if(this instanceof Book)
            {
                float i = this.getCost() - o.getCost();
                if(i>0)
                    return 1;
                else if(i<0)
                    return -1;
                else
                return 0;
            }
            if(this instanceof CompactDisc)
            {
                CompactDisc a = (CompactDisc) o;
                CompactDisc b = (CompactDisc) this;
                
                if(b.getTracks().size() > a.getTracks().size())
                    return b.getTracks().size() - a.getTracks().size();
                else if(b.getTracks().size() < a.getTracks().size())
                    return a.getTracks().size() -b.getTracks().size();
                else 
                {
                    if(b.getLeng() > a.getLeng())
                        return b.getLeng() - a.getLeng();
                    else if(b.getLeng() < a.getLeng())
                        return b.getLeng() - a.getLeng();
                else
                {
                    return b.getTitle().compareTo(a.getTitle());
                }
                }
            }
            if(this instanceof DigitalVideoDisc)
            {
                DigitalVideoDisc a = (DigitalVideoDisc) o;
                DigitalVideoDisc b = (DigitalVideoDisc) this;
                if(this.getCost() > o.getCost())
                    return 1;
                else if(this.getCost() < o.getCost())
                    return -1;
                else 
                {
                int i=b.getLength() - a.getLength();
                if(i!=0)
                    return i;
                else
                {
                    return this.getTitle().compareTo(o.getTitle());                  
                }
                }
            }
        }catch (ClassCastException e)
        {
            System.out.println("ERROR: CLASS_CAST_EXCEPTION");
        }
        return 0;
    }
}
