import java.util.*;
public class arrayDemo1d{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int []abc=new int[5];
    int [][]arr=new int[3][3];
    int i,j;
    System.out.println("Enter the elements of the 1-D array");
    for(i=0;i<5;i++){
      abc[i]=sc.nextInt();
    }
    System.out.println("The elements of the array are");
    for(i=0;i<5;i++){
      System.out.print(abc[i]+" ");
    }
    System.out.println("Enter the elements of the 2-D array");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++){
          arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("The elements of 2d array are");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println("");
    }
  }
}
