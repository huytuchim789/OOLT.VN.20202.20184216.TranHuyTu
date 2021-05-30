/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.utils;

/**
 *
 * @author MyPC
 */
public class DateUtils {
    public int compare(Object d1,Object d2)
    {
        MyDate o1=(MyDate)d1;
        MyDate o2=(MyDate)d2;
        if(d1!=null && d2!=null)
        {
            if(MyDate.equal(o1, o2) == 1)
              return 1;  

        }
        return 0;
    }
}
