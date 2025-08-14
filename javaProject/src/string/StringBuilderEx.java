package string;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("Red");
		System.out.println(s);
		
		//Method 1 - append()
		s.append(" Color");
		System.out.println(s);
		
		//Method 2 - insert()
		s.insert(9, "s");
		System.out.println(s);
		
		//Method 3 - replace()
		s.replace(0, 3, "Pink");
		System.out.println(s);
		
		//Method 4 - delete()
		s.delete(5, 11);
		System.out.println(s);
		
		//Method 5 - substring()
		//s.substring(1, 4);
		System.out.println(s.substring(1, 4));
		
		//Method 6 - reverse()
		System.out.println(s.reverse());
		
		//Method 7 - capacity()
		StringBuilder s1 = new StringBuilder("hi");
		System.out.println(s1.capacity());
		
		//Method 8 - length()
		System.out.println(s1.length());
		


	}

}
