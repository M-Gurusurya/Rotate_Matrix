import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter row size");
        int row_size=scanner.nextInt();
        System.out.println("enter column size");
        int column_size=scanner.nextInt();
        int array[][]=new int[row_size][column_size];
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<column_size;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        findMatrixTranspose(array,row_size,column_size);
        findRowReverse(array,row_size,column_size);

        for(int i=0;i<row_size;i++)
        {
            for (int j=0;j<column_size;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void findMatrixTranspose(int array[][],int row_size,int column_size)
    {
        int temp;
        for(int i=0;i<row_size;i++)
        {
            for (int j=0;j<column_size;j++)
            {
                if(i<j)
                {
                    temp=array[i][j];
                    array[i][j]=array[j][i];
                    array[j][i]=temp;
                }
            }
        }
    }
    public static void findRowReverse(int array[][],int row_size,int column_size)
    {
        int temp;
        for(int i=0;i<row_size;i++)
        {
            for (int j=0;j<column_size/2;j++)
            {
                temp=array[i][(column_size-1)-j];
                array[i][(column_size-1)-j]=array[i][j];
                array[i][j]=temp;
            }
        }
    }
}
