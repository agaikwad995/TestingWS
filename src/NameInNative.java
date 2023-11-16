import java.util.Scanner;

public class NameInNative {
	public static void main(String[] args) {
		char i = '\u0906';
		char j = '\u0915';
		char k = '\u093E';
		char l = '\u0936';
		System.out.println("Name in Hindi, Marathi, Bodo, Maithili, Sindhi, Nepali, and Sanskrit : " + i+""+ j +""+k+""+l);
		
		char m = '\u3042';
		char n = '\u304B';
		char o = '\u3047';
		
		System.out.println("Name in Japanese : " + m +""+ n +""+ o);
		
		char p = '\u0041';
		char q = '\u004B';
		char r = '\u0041';
		char s = '\u0053';
		char t = '\u0048';
		
		System.out.println("Name in Basic Latin : " + p +""+ q +"" + r + "" + s +"" + t);
		
	}

}
