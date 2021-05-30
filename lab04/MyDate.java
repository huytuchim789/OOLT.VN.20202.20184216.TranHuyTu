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
import java.time.LocalDate;
import java.util.Scanner;        
public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean tof;
    private String thang;
    LocalDate localDate = LocalDate.now();
    public MyDate()
    {
        String date=localDate.toString();
        String[] str=date.split("-");     
        this.day=Integer.parseInt(str[2]);
        this.month=Integer.parseInt(str[1]);
        this.year=Integer.parseInt(str[0]);
    }
    public MyDate(int d,int m,int y)
    {
        this.day=d;
        this.month=m;
        this.year=y;
    }
    public MyDate(String d,String m,String y)
    {
        String[] str={"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth","Ninth","Tenth","Eleventh","twelfth","thirteenth","fourteenth","fifteenth","sixteenth","seventeenth","eighteenth","nineteenth","twenty","twenty-first","twenty-second","twenty-third","Twenty-fourth","Twenty-fifth","Twenty-sixth","Twenty-seventh","Twenty-eighth","	\n" +
"Twenty-ninth","Thirtieth","Thirty-first"};
        for(int i=0;i<str.length;i++)
        {
            if(d.equalsIgnoreCase(str[i]))
            {
                this.day=i+1;
            }
//            else
//            {
//                System.out.println("ban nhap ko dung cu phap ngay");                
//            }
        }
        String[] str1={"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0;i<str1.length;i++)
        {
            if(m.equalsIgnoreCase(str1[i]))
            {
                this.month=i+1;
                this.thang=str1[i];
            }
//            else
//            {
//                System.out.println("ban nhap khong dung cu phap thang");
//                break;
//            }
        }
        String[] th={"one","two","three","four","five","six","seven","eight","nine"};
        String th1="and";
        String[] str2={"thousand","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] str3={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] str4={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        String[] str5={"one","two","three","four","five","six","seven","eight","nine"};        
        int a=0;
        int b=0;
        int c=0;
        int z=0;
        String[] cut=y.split(" ");
        if(cut.length<=2)
        {
        for(int i=0;i<str2.length;i++)
        {
            if(cut[0].equalsIgnoreCase(str2[i]))
                a=(i+10)*100;
            else
                for(int j=0;j<str4.length;j++)
                {
                    if(cut[0].equalsIgnoreCase(str4[j]))
                        a=(j+2)*1000;
                }
                
        }
        for(int i=0;i<str3.length;i++)
        {
            if(cut[1].equalsIgnoreCase(str3[i]))
                b=i+10;
            else 
                for(int j=0;j<str4.length;j++)
                {
                    if(cut[1].equalsIgnoreCase(str4[j]))
                    b=(j+2)*10;
                }

        }
        this.year = a+b;
        }
        if(cut.length>2&&cut.length<=3)
        {
            if(cut[0].equalsIgnoreCase("one") && cut[1].equalsIgnoreCase(str2[0]))
            {
                a=1000;
                for(int h=0;h<str3.length;h++)
                {
                    if(cut[2].equalsIgnoreCase(str3[h]))
                        b=h+10;
                }
                for(int g=0;g<str4.length;g++)
                {
                    if(cut[2].equalsIgnoreCase(str4[g]))
                        b=(g+2)*10;
                }
                this.year = a+b;
            }
            for(int i=0;i<str2.length;i++)
            {          
            if(cut[0].equalsIgnoreCase(str2[i]))
                a=(i+10)*100;
            else
                for(int j=0;j<str4.length;j++)
                {
                    if(cut[0].equalsIgnoreCase(str4[j]))
                    {   
                        a=(j+2)*1000;
                        for(int k=0;k<str5.length;k++)
                        {
                            if(cut[1].equalsIgnoreCase(str5[k]))                            
                            {
                                a=(((j+2)*10)+(k+1))*100;
                                for(int l=0;l<str3.length;l++)
                                {
                                    if(cut[2].equalsIgnoreCase(str3[l]))
                                        b=l+10;
                                }
                                for(int n=0;n<str4.length;n++)
                                {
                                    if(cut[2].equalsIgnoreCase(str4[n]))
                                        b=(n+2)*10;
                                }
                            }    
                        }
                    }
                }
                
        }
        for(int i=0;i<str3.length;i++)
        {
            if(cut[1].equalsIgnoreCase(str3[i]))
                b=i+10;
            else 
                for(int j=0;j<str4.length;j++)
                {
                    if(cut[1].equalsIgnoreCase(str4[j]))
                    {
                        b=(j+2)*10;
                        for(int k=0;k<str5.length;k++)
                        {
                        if(cut[2].equalsIgnoreCase(str5[k]))
                            b=((j+2)*10)+(k+1);
                        }
                    }
                }
        }
        this.year=a+b;
        }
        if(cut.length == 4)
        {
            for(int t=0;t<th.length;t++)
            {
                if(cut[0].equalsIgnoreCase(th[t]) && cut[1].equalsIgnoreCase(str2[0]))
                {
                a=(t+1)*1000;
                if(cut[2].equalsIgnoreCase("and"))
                {
                    for(int i=0;i<str5.length;i++)
                    {
                        if(cut[3].equalsIgnoreCase(str5[i]))
                            b=i+1;
                    }
                }
                for(int h=0;h<str3.length;h++)
                {
                    if(cut[2].equalsIgnoreCase(str3[h]))
                        b=h+10;
                }
                for(int g=0;g<str4.length;g++)
                {
                    if(cut[2].equalsIgnoreCase(str4[g]))
                    {
                        b=(g+2)*10;
                        for(int i=0;i<str5.length;i++)
                        {
                            if(cut[3].equalsIgnoreCase(str5[i]))
                                b+=(i+1);
                        }
                    }
                }
                this.year = a+b;
            }
            }
        for(int i=0;i<str4.length;i++)
        {
            if(cut[0].equalsIgnoreCase(str4[i]))
            {
                for(int j=0;j<str5.length;j++)
                {
                    if(cut[1].equalsIgnoreCase(str5[j]))
                        a=(((i+2)*10)+(j+1))*100;
                }
            }
        }
        for(int i=0;i<str4.length;i++)
        {
            if(cut[2].equalsIgnoreCase(str4[i]))
            {
                for(int j=0;j<str5.length;j++)
                {
                    if(cut[3].equalsIgnoreCase(str5[j]))
                        b=((i+2)*10)+(j+1);
                }
                this.year = a+b;
            }        
        }

        }
}

    
    public boolean setMonth(int month)
    {
        this.month = month;
        if(month <= 12)
            return true;
        else 
            System.out.println("Sai cu phap thang");
            return false;
    }
    public boolean setYear(int year)
    {
        this.year = year;
        if(year > 0 && String.valueOf(year).length() == 4)
            return true;
        else
            System.out.println("Sai cu phap nam");
            return false;
    }
    public boolean setDay(int day)
    {
        this.day = day;
        switch(getMonth())
        {
            case 1,3,5,7,8,10,12 ->{
                if(day <= 31)
                    return true;}
            case 2->{
                if(namnhuan() == 1)
                {
                    if(day <= 29)
                        return true;
                }
                else
                {
                    if(day <= 28)
                        return true;
                }
            }
            case 4,6,9,11->{               
                    if(day <= 30)
                        return true;
            }        
        }
        boolean i = setMonth(month);
        if (i == false)
            System.out.println("");
        else
            System.out.println("sai cu phap ngay");
        return false;
    }

    public void accept()
    {
        System.out.println("Moi ban nhap ngay thang nam theo dinh dang dd/mm/yyyy: ");
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();
        String[] str = date.split("/", 3);
        boolean y=setYear(Integer.parseInt(str[2]));
        boolean m=setMonth(Integer.parseInt(str[1]));
        boolean d=setDay(Integer.parseInt(str[0]));
        tof = d && m && y;
    }
    public int namnhuan()
    {
        if(getYear()%400==0 || (getYear()%4==0 && getYear()%100!=0))
            return 1;
        else
            return 0;
    }
    public String getThang()
    {
        return thang;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
    public void print()
    {
        if(getDay()%10 == 1)
        {
            System.out.println(getThang() +" "+getDay()+"st "+getYear());
        }
        else if(getDay()%10 == 2)
        {
            System.out.println(getThang() +" "+getDay()+"nd "+getYear());
        }
        else if(getDay()%10 == 3)
        {
            System.out.println(getThang() +" "+getDay()+"rd "+getYear());
        }
        else 
        {
            System.out.println(getThang() +" "+getDay()+"th "+getYear());
        }        
    }
    public void printdate()
    {
        System.out.print("format: yyyy-MM-dd     ");
        System.out.println("today:"+getYear()+"-"+getMonth()+"-"+getDay());
    }
    public static int equal(MyDate d1,MyDate d2)
    {
        String date1=d1.getYear()+"";
        if(d1.getMonth()<10)
            date1+="0"+d1.getMonth();
        else
            date1+=d1.getMonth();
        if(d1.getDay()<10)
            date1+="0"+d1.getDay();
        else
            date1+=d1.getDay();
        String date2=d2.getYear()+"";
        if(d2.getMonth()<10)
            date2+="0"+d2.getMonth();
        else
            date2+=d2.getMonth();
        if(d2.getDay()<10)
            date2+="0"+d2.getDay();
        else
            date2+=d2.getDay();
        if(date1.compareTo(date2) > 0)
            return 1;
        else 
            return 0;
    }           
}
