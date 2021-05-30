/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.garbage;

/**
 *
 * @author MyPC
 */
import java.util.Random;
public class ConcatenationInLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Random r =new Random(123);
        long start=System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s+=r.nextInt(2);
        }
        System.out.println(System.currentTimeMillis() - start);
        
        r=new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt());
        }
        s =sb.toString();
        System.out.println(System.currentTimeMillis() - start);
    }
}
