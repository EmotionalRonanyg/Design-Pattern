package com.DesignPattern._8FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		  List<Person> malePersons = new ArrayList<Person>(); 
	      
	      for (Person person : persons) {
	         if(person.getGender().equalsIgnoreCase("MALE")){
	            malePersons.add(person);
	         }
	      }
	      return malePersons;
	}

}
