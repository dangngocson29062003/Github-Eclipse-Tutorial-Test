package exercise11;

public class ComplexNumber {
	private double realNumber;
	private double imaginaryNumber;

	// Constructors
	public ComplexNumber() {
	}

	public ComplexNumber(double realNumber, double imaginaryNumber) {
		this.realNumber = realNumber;
		this.imaginaryNumber = imaginaryNumber;
	}
	// Getters & Setters

	public double getRealNumber() {
		return realNumber;
	}

	public void setRealNumber(double realNumber) {
		this.realNumber = realNumber;
	}

	public double getImaginaryNumber() {
		return imaginaryNumber;
	}

	public void setImaginaryNumber(double imaginaryNumber) {
		this.imaginaryNumber = imaginaryNumber;
	}

	// Methods
	public void show() {
		if (imaginaryNumber >= 0) {
			System.out.println(this.realNumber + " + " + this.imaginaryNumber + "i");
		} else {
			System.out.println(this.realNumber + " - " + Math.abs(this.imaginaryNumber) + "i");
		}
	}

	public ComplexNumber add(ComplexNumber complexNumber) {
		double realNumber = this.realNumber + complexNumber.realNumber;
		double imaginaryNumber = this.imaginaryNumber + complexNumber.imaginaryNumber;
		return new ComplexNumber(realNumber, imaginaryNumber);
	}

	public ComplexNumber multiply(ComplexNumber complexNumber) {
		double realNumber = (this.realNumber * complexNumber.realNumber)
				- (this.imaginaryNumber * complexNumber.imaginaryNumber);
		double imaginaryNumber = (this.realNumber * complexNumber.imaginaryNumber)
				+ (this.imaginaryNumber * complexNumber.realNumber);
		return new ComplexNumber(realNumber, imaginaryNumber);
	}
}
