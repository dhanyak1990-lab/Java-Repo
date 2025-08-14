package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Test"; 
		System.out.println(a);
		//Method 1 - length()
		System.out.println("Length is " +a.length());
		
		//Method 2 - charAt()
		System.out.println("3rd letter is " +a.charAt(2));
		
		//Method 3 - valueOf()
		int x = 25;
		String y = String.valueOf(x);
		System.out.println("Converting int to string " +y);
		
		//Method 4 - equals()
		String b = "test";
		System.out.println("Compare a & b value " +a.equals(b)); //Case sensitive
		
		//Method 5 - equalsIgnoreCase()
		System.out.println("Compare a & b value " +a.equalsIgnoreCase(b)); //Ignore case sensitive
		
		//Method 6 - isEmpty()
		System.out.println(b.isEmpty());
		
		//Method 7 - concat()
		String c = a.concat(b);
		String d = a.concat(" Program");
		System.out.println(c);
		System.out.println(d);
		
		//Method 8 - toUpperCase()
		System.out.println(a.toUpperCase());
		
		//Method 9 - toLowerCase()
		System.out.println(d.toLowerCase());
		
		//Method 10 - contains()
		System.out.println(a.contains("s"));

	}

}
