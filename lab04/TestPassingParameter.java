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
public class TestPassingParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        
    }
    public static void swap(Object o1,Object o2)
    {
        DigitalVideoDisc d1 = (DigitalVideoDisc)o1;
        DigitalVideoDisc d2 = (DigitalVideoDisc)o2;
        if(d1 != null && d2 != null)
        {
            String tmp = d1.getTitle();
            d1.setTitle(d2.getTitle());
            d2.setTitle(tmp);
        }
    }
    public static void changeTitle(DigitalVideoDisc dvd,String title)
    {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(title);       
    }
}
