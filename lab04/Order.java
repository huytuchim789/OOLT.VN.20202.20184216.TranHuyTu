/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AimsClass;

/**
 *
 * @author MyPC
 */
public class Order {
    public static final int MAX_NUMBER_ORDERED = 10;
    DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    public int count = 0;
    public static int MAX_LIMITED_ORDER = 5;
    private static int nbOrders = 0;
    public Order(){
        nbOrders++;
    }
    public int numberOrd(){
        return nbOrders;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd)
    {
        if(itemsOrdered[count] == null && count < MAX_NUMBER_ORDERED)
        {   
            itemsOrdered[count] = dvd;
            count++;
        }
        else
            System.out.println("full");
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdlist)
    {
        if(qtyOrdered() < MAX_NUMBER_ORDERED && qtyOrdered()+dvdlist.length < MAX_NUMBER_ORDERED)
        {
            int j=0;
            for(int i=count;i<dvdlist.length;i++)
            {        
                addDigitalVideoDisc(dvdlist[j]);
                j++;
            }
        }
        else
        {
            System.out.println("cannot add this dvd list");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
    {               
        if(count < MAX_NUMBER_ORDERED && count + 2 <= MAX_NUMBER_ORDERED)
        {
            addDigitalVideoDisc(dvd1);
            addDigitalVideoDisc(dvd2);
        }
        else if(count == MAX_NUMBER_ORDERED)
        {
            System.out.println("the item quantity has reached its limit.");
        }
        else if(count + 1 < MAX_NUMBER_ORDERED)
        {             
            addDigitalVideoDisc(dvd1);
            System.out.println("the disc " + dvd2.getTitle() + " khong dc them vao");
        }
    }
    public int qtyOrdered()
    {
        return count;
    }
    public float totalCost()
    {
        float sum = 0;
        int n = qtyOrdered();
        for (int i = 0; i < n ; i++)
        {
            sum +=itemsOrdered[i].getCost();
        }
        return sum;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd)
    {
        int i,j;
        for (i = 0; i < count; i++) 
        {
            for(j=i;j<count -1;j++)
            {
                if(itemsOrdered[i].getTitle().equals(dvd.getTitle()))
                {
                    itemsOrdered[j] = itemsOrdered[j+1];
                    for(j=i+1;j<count -1;j++)
                    {
                        itemsOrdered[j] = itemsOrdered[j+1];
                    }
                }
            }
        }
        
        count--;
    }
    private MyDate dateOrdered=new MyDate();
    public void print()
    {
        if(nbOrders <= MAX_LIMITED_ORDER)
        {
            System.out.println("*******Order*******");
            System.out.print("Date:");
            dateOrdered.print();
            System.out.println("Ordered item: ");
            for(int i=0;i<qtyOrdered();i++)
            {

                System.out.println((i+1)+". DVD - "+itemsOrdered[i].getTitle()+" - "+itemsOrdered[i].getCategory()+ " - " +itemsOrdered[i].getDirector()+" - "+itemsOrdered[i].getLength()+": "+itemsOrdered[i].getCost()+ "$");               
            }
            float s=totalCost();
            System.out.println("Total cost: " + s);
        }
        else
            System.out.println("da vuot qua so luong Order");
    }
    
}
