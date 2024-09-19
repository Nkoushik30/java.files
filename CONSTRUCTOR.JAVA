import java.util.*;
class A
{
  A()
  {
    System.out.println("this is the constructor");
  }
  A(int n)
  {
   System.out.println("The number is"+n);
   }
  public static void main(String []args)
  {
   A obj1=new A();
   A obj2=new A(10);
  }
}
