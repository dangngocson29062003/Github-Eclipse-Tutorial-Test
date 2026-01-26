package exercise11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber complexNum1 = new ComplexNumber(2, 5);
		complexNum1.show();
		ComplexNumber complexNum2 = new ComplexNumber(4, -3);
		complexNum2.show();
		System.out.println("Adding complex numbers: ");
		complexNum1.add(complexNum2).show();
		System.out.println("Multiplying complex numbers: ");
		complexNum1.multiply(complexNum2).show();
	}

}
