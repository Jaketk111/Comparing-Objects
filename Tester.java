package job;

import java.util.Arrays;

public class Tester {

	//method of a for loop to print the array of students
	public static void printArray(Object[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		//create students
		Student[] gryffindor = { 
				new Student("Harry", "Potter", 1111, 3.9, 2),
				new Student("Seamus", "Finnigan", 1234, 2.7, 1),
				new Student("Ron", "Weasley", 1534, 3.24, 2),
				new Student("Hermione", "Granger", 1754, 3.9, 1),
				new Student("Parvathy", "Patil", 1953, 3.78, 1),
						};
		//print array of students before and after being sorted
		System.out.println("Before sorting...");
		printArray(gryffindor);
		System.out.println("\t**********");
		System.out.println("Sorted by lastname:");
		Arrays.sort(gryffindor, Student.BY_LAST_NAME);
		printArray(gryffindor);
		System.out.println("\t**********");
		System.out.println("Sorted by GPA:");
		Arrays.sort(gryffindor, Student.BY_GPA);
		printArray(gryffindor);	
		System.out.println("\t**********");
	}

}

