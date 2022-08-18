package chapter3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LesCollections {

	public static void main(String[] args) {
	
		ArrayList<String> l = new ArrayList<>();
		System.out.println(l);
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		l.add("java");
		l.add("spring");
		l.add("java");
		//l.add(12);
		System.out.println(l);
		l.remove("java");
		System.out.println(l);
		
		List<String> l2 = new ArrayList<>();
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(12);// Autoboxing
		
		int x = nums.get(0); //Unboxing

	}

}
