package com.DesignPattern._8FilterPattern;

import java.util.List;

public interface ICriteria {

	public List<Person> meetCriteria(List<Person> persons);
}
