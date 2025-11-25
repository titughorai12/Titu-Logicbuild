
import java.util.*;
public class Matrixmultiplicaation
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //int row1,row2,col1,col2;
        System.err.println("enter row1");
        int row1=sc.nextInt();
        System.err.println("enter row2");
        int row2=sc.nextInt();
        System.out.println("enter col1");
        int col1=sc.nextInt();
        System.out.println("enter col2");
        int col2=sc.nextInt();
        if(col1!=row1)
        {
            System.out.println("matrix multiplication is imposible");
        }
        else
        {
            int[][]mat1=new int[row1][col1];
            int[][]mat2=new int[row2][col2];
            int[][]result=new int[row1][col2];
            System.out.println("enter element of fast matrix");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix multiplication is:");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;i<col2;j++)
            {
                
                for(int k=0;k<col1;k++)
                {
                    result[i][j]=result[i][j]+mat1[i][k]*mat2[k][j];
                }
            }
            
        }
        System.out.println("result is ");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.println(result[i][j]);
            }
            System.out.println();
        }
        
 
    }
}
}
