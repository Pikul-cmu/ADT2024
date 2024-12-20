import java.util.Scanner;
public class Main
{
      public static void main(String[] args) 
      {
          int i,j,k;
          //scanner class declaration          
          Scanner sc=new Scanner(System.in);
          //enter user input
          System.out.print("Enter the row");
          int row = sc.nextInt();
          //this loop is for the every new row
          for(i=1;i<=row;i++)
          {
              // this loop is for the space from i to row
              for(j=i;j<=row;j++)
                    System.out.print(" ");
              //this loop is for print alphabet A to (J+64)
              for(j=1;j<=i;j++)
                    System.out.print((char)(j+64)+"");
               // this loop is for the reverse order of alphabet
              for(k=i-1;k>=1;k--)
                    System.out.print((char)(k+64)+"");
              System.out.println();
           }
        }
}
