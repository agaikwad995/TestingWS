import java.util.Scanner;

public class DaysMonthAssignment {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Month");
		String i = scan.next();
		
		if(i.equals(1) || i.equals("JAN") || i.equals("jan")|| i.equals("JANAURY") || i.equals("janaury")) 
		{		
		System.out.println(i +" Month has 31 days");
		}
		else if(i.equals(2) || i.equals("FEB") || i.equals("Feb")|| i.equals("FEBRUARY") || i.equals("febraury")) 
		{		
		System.out.println(i +" Month has 28 or 29 days");
		}
		else if(i.equals(3) || i.equals("MAR") || i.equals("mar")|| i.equals("MARCH") || i.equals("march")) 
		{		
		System.out.println(i +" Month has 31 days");
		}
		else if(i.equals(4) || i.equals("APR") || i.equals("apr")|| i.equals("APRIL") || i.equals("april")) 
		{		
		System.out.println(i +" Month has 30 days");
		}
		else if(i.equals(5) || i.equals("MAY") || i.equals("may")) 
		{		
		System.out.println(i +" Month has 31 days");
		}
		else if(i.equals(6) || i.equals("JUN") || i.equals("jun")|| i.equals("JUNE") || i.equals("june")) 
		{		
		System.out.println(i +" Month has 30 days");
		}
		else if(i.equals(7) || i.equals("JUL") || i.equals("jul")|| i.equals("JULY") || i.equals("july"))
		{		
		System.out.println(i +" Month has 31 days");
		}
		else if(i.equals(8) || i.equals("AUG") || i.equals("aug")|| i.equals("AUGUST") || i.equals("august")) 
		{		
		System.out.println(i +" Month has 31 days");
		}
		else if(i.equals(9) || i.equals("SEP") || i.equals("sep")|| i.equals("SEPTEMBER") || i.equals("september")) 
		{		
		System.out.println(i +" Month has 30 days");
		}
		else if(i.equals(10) || i.equals("OCT") || i.equals("oct")|| i.equals("OCTOBER") || i.equals("october")) 
		{		
		System.out.println(i +" Month has 31 days");
		}
		else if(i.equals(11) || i.equals("NOV") || i.equals("nov")|| i.equals("NOVEMBER") || i.equals("november")) 
		{		
		System.out.println(i +" Month has 30 days");
		}
		else if(i.equals(12) || i.equals("DEC") || i.equals("dec")|| i.equals("DECEMBER") || i.equals("december")) 
		{		
		System.out.println(i +" Month has 31 days");
		}
		else
		{
		System.out.println(i +" is Invalid month");	
		}
		
		

	}
	
}
