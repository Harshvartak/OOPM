import java.util.*;
class Library{
  Scanner sc = new Scanner(System.in);
  String s_name;
  String account_no;  
  int no_books;
  int fine_amount;
  Library(){
    s_name = "";
    account_no ="";
    no_books = 0;
    fine_amount = 0;
  }
  Library assign_values(Library obj){
    System.out.println("Enter the name of the student: ");
    obj.s_name = sc.nextLine();
    System.out.println("Enter Number of books in posession: ");
    obj.no_books = sc.nextInt();
    System.out.println("Enter the Students account number: ");
    obj.account_no = sc.next();
    fine(obj);
    return obj;
  }
  void issue(Library obj){
    obj.no_books +=1;
    System.out.println("You just issued a book.");
  }
  void return_bk(Library obj){
    obj.no_books -=1;
    System.out.println("You just returned a book.");
  }
  void fine(Library obj){
    System.out.println("For Student: "+obj.s_name);
    System.out.println("Enter no. of books overdue: ");
    int books = sc.nextInt();
    System.out.println("Enter no. of days overdue: ");
    int days = sc.nextInt();
    int fine_amt = days*books*2;
    System.out.println("Fine calculated");
    obj.fine_amount = fine_amt;
  }
  static void display(Library ob){
    System.out.println("==================================================");
    System.out.println("Name of Student: "+ob.s_name);
    System.out.println("Account number :" + ob.account_no);
    System.out.println("Number of books in posession: "+ob.no_books);
    System.out.println("Fine: "+ob.fine_amount);
    System.out.println("=============================");
  }
  public static void main(String args[]){
    Library std1 = new Library();
    Library std2 = new Library();
    Library std3 = new Library();
    std1.assign_values(std1);
    std2.assign_values(std2);
    std3.assign_values(std3);
    int f1 = std1.fine_amount;
    int f2 = std2.fine_amount;
    int f3 = std3.fine_amount;
    if (f1 > f2 && f1>f3){
      display(std1);
      if(f2>=f3){
        display(std2);
        display(std3);
      }
      else{
        display(std3);
        display(std2);
      }
    }
    else if (f2 > f3 && f2>f1){
      display(std2);
      if(f1>=f3){
        display(std1);
        display(std3);
      }
      else{
        display(std3);
        display(std1);
      }
    }
    else{
      display(std2);
      if(f1>=f3){
        display(std1);
        display(std3);
      }
      else{
        display(std3);
        display(std1);
      }
    }
  }
}
