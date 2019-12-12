import java.util.*; 
class MarksOutOfBoundsException extends Exception{ 
public void showError(){ 
System.out.println("Invalid Marks"); } }
 public class Result{ 
public static void main(String[] args){ 
Scanner sc = new Scanner(System.in);
 Vector res = new Vector();
 System.out.println("Enter name: "); 
String name = sc.nextLine(); 
System.out.println("Enter seat number: "); 
String seatno = sc.next();
 System.out.println("Enter date in dd.mm.yyy format: ");
 String date = sc.next();
 System.out.println("Enter centre number: ");
 int centreno = sc.nextInt();
 boolean f = false;
 int marks = 0;
 do{ 
f = false; 
try{
 System.out.println("Enter marks: ");
 marks = sc.nextInt(); 
if(marks < 0 || marks > 100) 
throw new MarksOutOfBoundsException(); }
 catch(MarksOutOfBoundsException e){ 
e.showError(); 
f = true; }
 }while(f);
 System.out.println("Name: " + name + " SeatNo: " + seatno + " Date: " + date + " CentreNo: " + centreno + " Marks: " + marks); }
 }