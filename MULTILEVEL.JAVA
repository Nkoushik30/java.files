import java.util.*;
class A1 {
    public void A() {
        int salary = 100000;
        System.out.println("Salary of parent: " + salary);
    }
}
class B1 extends A1 {
    public void B() {
        int salary = 20000;
        System.out.println("Salary of child: " + salary);
    }
}
class C1 extends B1 {
    public void C() {
        System.out.println("Class C");
    }
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.A();
        obj.B();
        obj.C(); 
  }
}
