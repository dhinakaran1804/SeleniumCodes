package collectionsList;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<String> mentors = new ArrayList<String>();
//		List<Integer> into = new ArrayList<Integer>();  (Wrapper Class - Integer, Lower case interger it becomes a primitive data type)
		mentors.add("Dhina");
		mentors.add("Karan");
		mentors.add("Senior");
		mentors.add("NEC");
		
		System.out.println(mentors);
		System.out.println(mentors.size());
		
		mentors.add("Kovilpatti");
		System.out.println(mentors);
		
		mentors.remove(4); //using index
		System.out.println(mentors);
		
		mentors.remove("Dhina");
		System.out.println(mentors); //using obj
		
		String mentor = mentors.get(1);
		System.out.println(mentor);
		
		boolean contains = mentors.contains("Senior");
		System.out.println(contains);
		
		mentors.clear();
		System.out.println(mentors);
		
		//mentors.isEmpty();
		System.out.println(mentors.isEmpty());
	}

}
