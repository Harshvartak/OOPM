class A
{
public void show()
{System.out.println("This is show method in class A");}
}
class B extends A
{
public void show()
{System.out.println("This is show method in class B");}
}
class C extends A
{
public void show()
{System.out.println("This is show method in class C");}
}

class Dynamic
{ public static void main(String []args)
{
A obj=new A();
B obj1=new B();
C obj2=new C();
A r;
r=obj;
r.show();
r=obj1;
r.show();
r=obj2;
r.show();
}
}