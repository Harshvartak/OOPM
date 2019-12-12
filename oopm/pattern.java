import java.util.*;
class pattern{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    for(int i=1;i<=7;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      for(int k=i;k<=7;k++){
        System.out.print(" *");
      }
        System.out.println();
    }
    for(int i=1;i<7;i++){
      for(int j=7-i;j>=1;j--){
        System.out.print(" ");
      }
      for(int k=7-i;k<=7;k++){
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
