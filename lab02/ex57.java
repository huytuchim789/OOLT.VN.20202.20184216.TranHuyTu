/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author MyPC
 */
import java.util.Scanner;
import java.util.Random;
public class ex57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int row;
        int col;
        Scanner Scan = new Scanner(System.in);
        Random Ran = new Random();
        System.out.println("Nhap so dong cua ma tran");
        row = Scan.nextInt();
        System.out.println("Nhap so cot cua ma tran");
        col = Scan.nextInt();
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int c[][] = new int[row][col];
        System.out.println("1. Tu nhap cac gia tri cua ma tran. \n2. May tinh nhap random.");
        int nhap= Scan.nextInt();
        if(nhap==1)
        {
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.println("Nhap phan tu A["+i+"]["+j+"]" );
                    a[i][j]= Scan.nextInt();
                }
            }
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.println("Nhap phan tu B["+i+"]["+j+"]" );
                    b[i][j]= Scan.nextInt();
                }
            }
            System.out.println("Ma tran A:");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(a[i][j] + "  ");
                }
                System.out.println("");
            }
            System.out.println("Ma tran B:");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(b[i][j] + "  ");
                }
                System.out.println("");
            }
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Ma tran A + B:");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(c[i][j] + "  ");
                }
                System.out.println("");
            }
        }
        else
            if(nhap == 2)
            {
                for(int i=0;i<row;i++)
                {
                    for(int j=0;j<col;j++)
                    {
                        a[i][j] = Ran.nextInt(99)+1;
                        b[i][j] = Ran.nextInt(99)+1;
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
                System.out.println("Ma tran A:");
                for(int i=0;i<row;i++)
                {
                    for(int j=0;j<col;j++)
                    {
                        System.out.print(a[i][j] + "  ");
                    }
                    System.out.println("");
                }
                System.out.println("Ma tran B:");
                for(int i=0;i<row;i++)
                {
                    for(int j=0;j<col;j++)
                    {
                        System.out.print(b[i][j] + "  ");
                    }
                    System.out.println("");
                }
                System.out.println("Ma tran A + B:");
                for(int i=0;i<row;i++)
                {
                    for(int j=0;j<col;j++)
                    {
                        System.out.print(c[i][j] + "  ");
                    }
                    System.out.println("");
                }
            }
            else
                System.out.println("Ban nhap sai.");
    }
    

}

