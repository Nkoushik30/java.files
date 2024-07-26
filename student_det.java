import java.util.*;
class Adk
{
 public static void main(String []args) 
{
String name;
String branch;
char sec;
float perc;
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the name,branch,sec,perc:");
name=Sc.next();
branch=Sc.next();
sec=Sc.next().charAt(0);
perc=Sc.nextFloat();
System.out.println("your name is:"+name);
System.out.println("your branch is:"+branch);
System.out.println("your section is:"+sec);    
System.out.println("your percentage is:"+perc+"%");
Sc.close();
}
}
