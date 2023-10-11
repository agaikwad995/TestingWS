
public class TemperatureScale {

	public static void main(String[] args) {
		double cel = 0.0;
		double fer = (cel * 1.8) + 32;
		double kel = cel + 273 ;
		
		System.out.println(cel + " Celsius = "  + fer + " Fahrenheit");
		System.out.println(cel + " Celsius = "  + kel + " Kelvin");
	}
}
