import java.util.*;
class Root
{
   public static void main(String []argc)
   {
    int a;
    int b;
    int c;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the values of a,b,c:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    int d=b*b-4*a*c;
    if(d<0){
     System.out.println("The roots are imaginary"+(-b/2*a)+(Math.sqrt(-d))/2*a);
    }else if(d>0){
        System.out.println("The roots are real and distint:"+((-b+Math.sqrt(d))/2*a)+"and"+((-b-Math.sqrt(d))/2*a));
        
    }else if(d==0){
           System.out.println("the roots are real but not distint:"+(-b/2*a)+"and"+(-b/2*a));
                 }
}
}
/*__using functions(or) Methods_______________________________________________________________________________________*/
import java.util.*;
class A3{
  void kal(int a,int b,int c){
  double d=b*b-4*a*c;
  if(d==0){
  System.out.println("Roots are real and equal:"+(-b/2*a));
  }
  else if(a==0){
   System.out.println("INVALID INFO");
   }
 else if(d<0){
  System.out.println("Roots are imaginary:"+(-b)+"(i)"+(+(Math.sqrt(-d)/2*a)));
  System.out.println("Roots are imaginory:"+(-b)+"(i)"+(-(Math.sqrt(-d)/2*a)));
  }
 else {
  System.out.println("Roots are :"+(-b+Math.sqrt(d)/2*a));
  System.out.println("Roots are :"+(-b-Math.sqrt(d)/2*a));
   }
  } public static void main(String []args){
  A3 obj=new A3();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the vlaues to find roots:");
  int d=sc.nextInt();
  int e=sc.nextInt();
  int f=sc.nextInt();
  obj.kal(d,e,f);
 }
 }
