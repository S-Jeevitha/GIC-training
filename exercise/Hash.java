package exercise;

import java.util.HashMap;
import java.util.*;

public class Hash {

	public static void main(String[] args) {

		HashMap<String, Integer> grades = new HashMap<>();
		grades.put("Aravind", 43);
		grades.put("Saravanan", 97);
		grades.put("Ram", 32);
		grades.put("David", 76);

		System.out.println("The student names and grades are :");
		for (Map.Entry<String, Integer> entry : grades.entrySet()) {
			System.out.println(entry.getKey() + " :" + entry.getValue());

		}
		int lowestGrade = Collections.min(grades.values());
		String lowestGradeStudent = null;
		for (Map.Entry<String, Integer> entry : grades.entrySet()) {
			if (entry.getValue() == lowestGrade) {
				lowestGradeStudent = entry.getKey();
				break;
			}

		}
		if (lowestGradeStudent != null) {
			grades.remove(lowestGradeStudent);
		}

		System.out.println("\n After Removing Lowest Grade Student:");
		for (Map.Entry<String, Integer> entry : grades.entrySet()) {
			System.out.println(entry.getKey() + " :" + entry.getValue());

		}

	}

}
