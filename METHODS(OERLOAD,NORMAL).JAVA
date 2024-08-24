import java.util.*;
class Method1
{
   public static void mul(int a,int b){
   System.out.println("Multiplication is :"+(a*b));
   }
   public static void mul(int a,int b,int c){
   System.out.println("Multiplication is :"+(a*b*c));
   }
   public static void main(String []args){
   mul(4,5,6);
   mul(4,5);
   }
  }
////////////////////////////////////////////////////////
import java.util.*;
class Method
{
  static int a=10;
  public static void display(){
	System.out.println("Static method");
	}
    public static void main(String []args){
  System.out.println(a);
  display();
  }
  } 
