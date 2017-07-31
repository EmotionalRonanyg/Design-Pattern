package com.DesignPattern._25VisitorPattern;

public interface IComputerPart {
	public void accept(IComputerPartVisitor computerPartVisitor);
}
