package thiskeyword;

public class VariableConstructor {
	VariableConstructor(){
		System.out.println("Printing");
	}
	VariableConstructor(int a){
		this();
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableConstructor obj = new VariableConstructor(9);
	}

}
