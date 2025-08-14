package thiskeyword;

public class VariableMethod {
	public void print() {
		System.out.println("Printing");
	}
	public void display() {
		System.out.println("Displaying");
		this.print();	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableMethod obj = new VariableMethod();
		obj.display();
	}

}
