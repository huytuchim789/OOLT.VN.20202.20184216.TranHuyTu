/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author MyPC
 */
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class ex56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String a;       
        int b[] = new int[1000];
        for(int i=0;i<1000;i++)
        {
            Random rand = new Random();
            b[i]=rand.nextInt(5000)+1;
        }
        int n;
        Scanner Scan = new Scanner(System.in);
        System.out.println("1.Tu nhap phan tu \n 2.May tinh nhap");
        int choose = Scan.nextInt();
        if(choose == 1)
        {
            System.out.println("Nhap so phan tu cua mang: ");
            n = Scan.nextInt();
            if(n<=1000 && n >0)
            {
                int a1[]=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Phan tu thu: " + (i+1));
                a=Scan.next();
                if(a.equals("$"))
                {
                    a1[i]=b[i];
                }
                else
                {
                      a1[i]=Integer.parseInt(a);
                }               
            }
            ArrayASC(a1);
            System.out.println("mang ban vua nhap:");
            for(int i=0;i<n;i++)
            {
                System.out.print(a1[i] + " ");
            }
            int sum1=0;
            for(int i=0;i<n;i++)
            {
                sum1+=a1[i];
            }
                System.out.println("");
                System.out.println("Tong cac phan tu trong mang: " + sum1);
            double TBC1 = sum1/n;
                System.out.println("Trung binh cong cac phan tu: " + TBC1);
            }
            else
            {
                System.out.println("so phan tu khong hop le");
            }
        
        }
        else
        {
            if(choose==2)
            {
                int m;
                int sum=0;
                System.out.println("Nhap so phan tu:");
                m=Scan.nextInt();
                if(m<=1000 && m>0)
                {
                ArrayASC(b);
                for(int i=0;i<m;i++)
                {
                    System.out.println(b[i]);
                }
                for(int i=0;i<m;i++)
                {
                    sum+=b[i];
                }
                System.out.println("tong cac phan tu trong mang = " + sum);
                double TBC = sum/m;
                System.out.println("Trung binh cong cac phan tu = " + TBC);
                }
                else
                {
                    System.out.println("So phan tu khong hop le");
                }
                
            }
            else
            {
                System.out.println("khong hop le!");
            }
        }


}
public static void ArrayASC(int[] A)
    {
        int temp;
        for(int i =0; i< A.length -1;i++)
            for(int j = i+1; j< A.length;j++)
            {
                if(A[i]>A[j])
                {
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
    }
}



