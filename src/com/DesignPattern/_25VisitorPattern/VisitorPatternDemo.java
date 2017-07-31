package com.DesignPattern._25VisitorPattern;

public class VisitorPatternDemo {

	public static void main(String[] args) {

		IComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
