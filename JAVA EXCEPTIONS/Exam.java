 import java.util.*;

class Exam {
    public static void main(String[] args) {
        try {
              try{
                   int a=10,b=0;
                   System.out.println(a/b);
       		 }           
       		catch(ArithmeticException ae){
		System.out.println(ae);
		}        
            int arr[]={1,2,3,5,3,4};
            System.out.println(arr[10]);
        } 
        catch(ArrayIndexOutOfBoundsException aiob){
         System.out.println(aiob);
        }
         catch(NullPointerException np){
         System.out.println(np);
        }    
    }
}

