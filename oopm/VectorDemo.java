import java.util.*;
public class VectorDemo{
  public static void main(String []args){
    int i,len,val1;
    String val2;
    Scanner sc=new Scanner(System.in);
    Vector v1=new Vector();
    System.out.println("Enter length of Vector");
    len=sc.nextInt();
    sc.nextLine();
    for(i=0;i<len;i++)
    {System.out.println("Enter element ");
    v1.add(sc.nextLine());}
    System.out.println("Vector is"+v1);
    System.out.println("Enter element position to add value");
    val1=sc.nextInt();
    sc.nextLine();
    val2=sc.nextLine();
    v1.add(val1,val2);
    System.out.println("New vector"+v1);
    System.out.println("Enter element position to delete");
    v1.remove(sc.nextInt());
    System.out.println("After deleting the vector is"+v1);
  }
}
