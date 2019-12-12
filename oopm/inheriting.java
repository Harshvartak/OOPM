import java.util.*;


public class inheriting {

    public static void main(String[] args) {
	A obj1=new A();
	B obj2=new B();
        C1 obj3 = new C1();

        obj1.show();
	obj2.show();
	obj3.show();

    }

    static class C1 implements C{
        public void show(){
            System.out.println("This is class C interfaced");
        }
    }

    static class A {
        public void show(){
            System.out.println("This is class A");
        }
    }
    interface C {
        public static void show(){

        }
    }


    static class B extends A{
        public void show(){
            System.out.println("This is class B");
        }
    }


}
