package thiskeyword;

public class ThisVariable {
	int age;
	ThisVariable(int age){
		this.age = age;
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisVariable obj = new ThisVariable(35);		

	}

}
