package Overriding;

class A {
  void methodA() {
	  System.out.println("Overiding Class A");
  }
}

class B extends A{
	void methodA() // when the method for class A is protected getting error message "Cannot reduce the visibility of the inherited method from A"
	{
	System.out.println("Overriding Class B");
}		
}

class C extends B{
	void methodA() {
	System.out.println("Overriding Class C");
}		
}

public class OverridingA {
	
	public static void main(String[] args) {
	
	A obA = new A();
    B obB = new B();
    C obC = new C();
    
    obA.methodA(); // when the method for class A is private getting error "The method methodA() is not visible"
    obB.methodA();
    obC.methodA();
    
}
}