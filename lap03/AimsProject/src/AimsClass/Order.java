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
    int count = 0;
    public int addDigitalVideoDisc(DigitalVideoDisc dvd)
    {
        itemsOrdered[count] = dvd;
        count++;
        if(count < 10)
            return 1;
        else
            return 0;
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
                }
            }
        }
        count--;
    }
}
