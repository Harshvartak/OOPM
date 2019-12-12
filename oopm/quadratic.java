import java.util.*;
class quadratic{

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter coeff of X^2");
    int a=sc.nextInt();
    System.out.println("Enter coeff of X");
    int b=sc.nextInt();
    System.out.println("Enter coeff of constant");
    int c=sc.nextInt();
    Double D=(Math.pow(b,2)-4*a*c);
    if(D<0){
      System.out.println("Roots are imaginary");
    }
    else if(D==0){
      Double ans=(-b +Math.sqrt(D))/(2*a);
      System.out.println("Equal roots of the Quadratic equation:"+ans);
    }
    else{
      Double ans2=(-b +Math.sqrt(D))/(2*a);
      Double ans=(-b -Math.sqrt(D))/(2*a);
      System.out.println("Roots of the Quadratic equation: r1="+ans +"r2= "+ans2);
    }
  }
}
