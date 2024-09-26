import java.util.*;

abstract class Al

abstract void square(); }

abstract class B extends A{

abstract void triangle(); }

abstract class C extends B{

abstract void circle();

}

abstract class D extends C{

abstract void rectangle(); }

class Areas extends D

Scanner sc=new Scanner(System.in);

void square(){

System.out.println("Enter the length of sides square: ");

double a=sc.nextDouble();

double b=sc.nextDouble();

System.out.println("The area of the square"+(a*b));

}

void triangle(){

System.out.println("Enter the base length and height of triangle: ");

double base=sc.nextDouble();

double height=sc.nextDouble();

System.out.println("Area of the triangle in:"+(/*(base*height)));

}
void circle(){

System.out.println("Enter the radius of circle: ");

double pi;

double radius=sc.nextDouble();

System.out.println("Area of the circle is:"+(pi*radius radius)); }

void rectangle(){

System.out.println("Enter the length and breadth of rectangle: ");

double length=sc.nextDouble();

double breadth=sc.nextDouble();

System.out.println("Area of the rectangle is "+(length*breadth));

}

public static void main(String []args){

System.out.println("Areas of different shapes ");

Scanner sc-new Scanner(System.in);

System.out.println("Note: Enter the choice 1:square, 2:triangle, 3:circle, 4:rectangle [all the inputs must be in the matura] "

int choice-sc.nextInt();

Areas obj=new Areas();

switch(choice){

case :obj.square(); break;

case 2:obj.triangle();

break;

case 3:obj.circle();

break;

case obj.rectangle();

break;
default:

System.out.println("you cannot chosen any choice provided by us");

}

}

}