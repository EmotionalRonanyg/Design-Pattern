package com.DesignPattern._21StatePattern;

public class Context {

	private IState state;

	public Context() {
		state = null;
	}

	public void setState(IState state) {
		this.state = state;
	}

	public IState getState() {
		return state;
	}
}
