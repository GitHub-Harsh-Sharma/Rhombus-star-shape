import java.io.*;
class Star5
{
    public static void main(String[] args)throws IOException
    {
        int i,s,k,b=3,a=1,c=5,d=1;
        for(i=1;i<=4;i++)
        {
            for(s=1;s<=b;s++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=a;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
            a=a+2;
            b--;
            }
                    for(i=1; i<=3;i++)
                {
                    for(s=1;s<=d;s++)
                    {
                        System.out.print(" ");
                    }
                 
                    for(k=1;k<=c;k++)
                    {
                        System.out.print("*");
                    }
                   
                    System.out.println("");
                    c=c-2;
                    d++;
                }          
    }
}
