import java.util.*;
public class TwoDarrayuser9
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("what is the row size:");
        int row=sc.nextInt();
        System.out.print("what is the col size:");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            
        }
        for(int j=0;j<arr.length;j++)
        {
            
            int temp=arr[0][j];
            arr[0][j]=arr[arr.length-1][j];
            arr[arr.length-1][j]=temp; 
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }

    
}

