package sampleproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonHeightComparator implements Comparator<Person>{
	
	@Override
	
	public int compare(Person person1,Person person2)
	{
		if(person1.height>person2.height)
		{
			return 1;
		}
		else if(person1.height<person2.height)
		{
			return -1;
		}
		else {
		return 0;
		}
	}

	
}

class Person implements Comparable<Person>{
	int height;
	int weight;
	String name;
	
	public Person(int height,int weight,String name) {
		this.height=height;
		this.weight=weight;
		this.name=name;
		
	}
	
	@Override
	public int compareTo(Person person) {
		
		if(this.name.compareTo(person.name)>0)
		{
			return 1;
		}
		else if(this.name.compareTo(person.name)<0)
		{
			return -1;
		}
		else {
			return 0;
		} 
	}
	
	@Override
	public String toString() {
		return "Height:"+height+"- Weight:"+weight+"Name:"+name;
	}

	
}

public class CompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person(20,50,"Neha");
		Person person2 = new Person(10,40,"Neha");
		Person person3 = new Person(15,35,"Meetali");
			
			
			if(person1.compareTo(person2) > 0) {
				System.out.println("person 1 is more height than person 2");
			}
			else if(person1.compareTo(person2) < 0) {
				System.out.println("person 2 is more height than person 1");
			}
			else {
				System.out.println("person 1 & person 2 are equal in height");
			}
			
			
			List<Person> list = new ArrayList<Person>();
			
			list.add(person1);
			list.add(person2);
			list.add(person3);
			
			Collections.sort(list);
			//Collections.sort(list,new PersonHeightComparator());
			for(Person person:list)
			{
				System.out.println(person);
			}
			
	}

}
