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
