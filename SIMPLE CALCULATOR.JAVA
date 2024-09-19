import java.util.*;
class swift {
  public static void main(String []args)
  {
     int a,b;
     char ch;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the values of a,b:");
     a=sc.nextInt();
     b=sc.nextInt();
     System.out.println("enter the charector among these four '+','-','/'.'*':  ");
     ch=sc.next().charAt(0);
     int result=0;
     switch(ch){
   case '+':result=a+b;
              System.out.println(result);
              break;
    case '-':result=a-b;
               System.out.println(result);
              break;
    case '*':result=a*b;
               System.out.println(result);
              break;
     case '/':
           if(b==0)
{        
         System.out.println("enter the valid value of b:");
         }
else{
           result=a/b;
               System.out.println(result);
              break;
}
        }
        }
        }
