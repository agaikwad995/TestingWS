package Strings;

public class InterningString {

	    public static void main(String[] args) {
	        String s1 = "hello";
	        String s2 = new String("hello");
	        String s3 = s2.intern();

	        System.out.println("s1 == s2: " + (s1 == s2)); 


	        System.out.println("s1 == s3: " + (s1 == s3)); 
	    }
}
