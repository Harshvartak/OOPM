import java.util.*;
class sinx
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Number of terms: ");
int n=sc.nextInt();
System.out.print("Find the sine of(please remember to put input in radians): ");
double x =sc.nextDouble();
System.out.println();
double sin=0.0;
int sign=1;
int ctr=0,i=0;
while(ctr<=n)
{
if(i%2 !=0)
{
sin+=(double)(sign*Math.pow(x,i)/fact(i));
sign*=-1;
ctr++;
}
i++;
}
System.out.println("sin("+x+")= "+sin);
}
public static int fact(int a)
{
int p=1;
for(int i=1;i<=a;i++)
p*=i;
return p;
}
}
