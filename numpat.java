/* 
   Program to print following pattern
   
   1
   0 1
   1 0 1
   0 1 0 1
   1 0 1 0 1
*/

public class numpat
{
   public static void main(String[] args)
    {     
       for(int i=1; i<=5; i++)
       {
         for(int j=i; j>=1; j--)
         {     
           if(j%2==1)
           {
             System.out.print(" 1 ");
           }
           else
           {
             System.out.print(" 0 ");
           }
         }
        System.out.println();
       }
    }
}
