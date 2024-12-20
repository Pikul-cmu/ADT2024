import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        int i,j;
        //Scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.print("Enter the row");
        int row = sc.nextInt();
        //declare for loop for every new row
        for(i=1;i<=row;i++)
        {
            //this lopp is for the space
            for(j=i;j<=row;j++)
                System.out.print(" ");
            //this loop is for print number 1 to i
            for(j=1;j<=i;j++)
                System.out.print(j+"");
            //this loop is for the number in reverse order
            for(j=i-1;j>=1;j--)
                System.out.print(j+"");
            System.out.println();
         }
    }
}
