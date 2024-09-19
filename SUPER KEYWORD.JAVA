import java.util.*;
class A {
    A() {
        System.out.println("This is the super class");
    }
}
class B extends A {
    B() {
        super(); 
        System.out.println("This is the next to super class");
    }
}
class C12 extends B {
    C12() {
        super(); 
        System.out.println("Third super class");
    }
 void display() {
        C12 obj = new C12(); 
    }

    public static void main(String[] args) {
        C12 obj = new C12(); 
        obj.display(); 
    }
}
