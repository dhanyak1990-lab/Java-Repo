package string;


public class StringExample {
	
	public static void main(String[] args) {
		// by using string Literal
		String a = "Java";
		String b = "Java";
		
		//by using New keyword
		
		String c = new String("Java");
		String d = new String("Java");
		
		System.out.println(a==b);
		System.out.println(c==d);
		
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		System.out.println(a.equals(c));
	}


}
