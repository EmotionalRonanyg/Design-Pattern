package com.DesignPattern._25VisitorPattern;

public class ComputerPartDisplayVisitor implements IComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Connecting Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Connecting Mouse.");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Connecting Keyboard.");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Connecting Monitor.");
	}

}
