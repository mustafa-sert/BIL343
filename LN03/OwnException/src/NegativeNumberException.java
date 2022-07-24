/**
 * BIL343 Object Oriented Programming w/Java
 * TestException.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Writing own exception class
 * 2022 Summer
 */
 public class NegativeNumberException extends ArithmeticException{
	public NegativeNumberException() {
		super("Number cannot be negative!"); // call to super class' constructor
	}
}
