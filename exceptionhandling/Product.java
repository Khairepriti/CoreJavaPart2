package com.java.exceptionhandling;
class InvalidProduct extends Exception{
	public InvalidProduct(String s) {
		super(s);
	}
}
public class Product {
	void productCheck(int waight) throws InvalidProduct{
		if(waight<100) {
			throw new InvalidProduct("Product Invalid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Product p=new Product();
			try {
				p.productCheck(60);
			}
			catch (InvalidProduct ex) {
				System.out.println("Cought the exception");
				System.out.println(ex.getMessage());
			}
	}

}
