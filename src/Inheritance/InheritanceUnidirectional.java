package Inheritance;

class Vehicle {
	  void model() {
		  System.out.println("Tesla");  
		  
	  }
}


	class Car extends Vehicle {
	  void speed() {

	    System.out.println("The car speed is 350 km/h");
	  }
}



	public class InheritanceUnidirectional {
	  public static void main(String[] args) {
	   Car Car1 = new Car();
	   Car1.model();
	   Car1.speed();
	    }
}


	


		
		