package coding2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSort {

	public static void main(String[] args) {
		List<Student> stud = new ArrayList<>();
		stud.add(new Student("Aravind", 22, 89));
		stud.add(new Student("Bala", 21, 73));
		stud.add(new Student("Christ", 19, 76));
		stud.add(new Student("David", 20, 80));
		stud.add(new Student("Sam", 21, 56));

		Collections.sort(stud, Comparator.comparingInt(Student::getAge).reversed());
		System.out.println("Sorted by  Age in descending order:");
		for (Student student : stud) {
			System.out.println(student.getName() + ", Age:" + student.getAge() + ", Grade :" + student.getGrade());

		}

		Collections.sort(stud, Comparator.comparing(Student::getName));
		System.out.println("\nSorted by Name:");
		for (Student student : stud) {
			System.out.println(student.getName() + ", Age:" + student.getAge() + ", Grade :" + student.getGrade());

		}

		Collections.sort(stud, Comparator.comparingDouble(Student::getGrade).reversed());
		System.out.println("\nSorted by Grade in descending order:");
		for (Student student : stud) {
			System.out.println(student.getName() + ", Age:" + student.getAge() + ", Grade :" + student.getGrade());

		}
	}

}
