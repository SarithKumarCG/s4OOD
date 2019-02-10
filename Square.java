import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
			
		int i,j;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = reader.nextInt();
        int m = 3 * n;
     for(i=0;i<n;i++)
     {
        for(j=0;j<m;j++)
        {
            System.out.print(" 1 ");
        }
        System.out.print("\n");
     }
     for(i=0;i<n;i++)
     {
        for(j=0;j<n;j++)
        {
            System.out.print(" 1 ");
        }
        for(j=0;j<n;j++)
        {
            System.out.print("   ");
        }
        for(j=0;j<n;j++)
        {
            System.out.print(" 1 ");
        }
        System.out.print("\n");
     }
     for(i=0;i<n;i++)
     {
        for(j=0;j<m;j++)
        {
            System.out.print(" 1 ");
        }
        System.out.print("\n");
     }
    }
}