package job;
//import Comparator
import java.util.Comparator;

public class Student implements Comparable<Student> {
//setting private variables
	private String firstName, lastName;
	private int id;
	private double gpa;
	private int section;

	public static final Comparator<Student> BY_SECTION = new BySection();
	public static final Comparator<Student> BY_LAST_NAME = new ByLastName();
	public static final Comparator<Student> BY_GPA = new ByGPA();
//Constructor
	public Student() {
		firstName = "John";
		lastName = "Doe";
		id = 0;
		gpa = 0;
		section = 0;
	}

	public Student(String firstname, String lastname, int id, double gpa, int section) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.id = id;
		this.gpa = gpa;
		this.section = section;
	}

	//method to compare last names of students
	private static class ByLastName implements Comparator<Student> {
		public int compare(Student v, Student w) {
			int NameCompare = v.getLastName().compareTo(w.getLastName());
			
			return NameCompare;
		}
	}

	//method to compare by sections
	private static class BySection implements Comparator<Student> {
		public int compare(Student v, Student w) {
			return v.section - w.section;
		}
	}

	//method to compare GPA of each student
	private static class ByGPA implements Comparator<Student> {
		public int compare(Student v, Student w) {
			   if (v.gpa > w.gpa) return 1;
	            else if (w.gpa > v.gpa) return -1;
	            else return 0;
		}
	}
	//getters and setters for the objects
	public String getName() {
		return firstName + " " + lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	//How the comparisons will print to the console
	@Override
	public String toString() {
		return firstName + " " + lastName + ":" + "\n\tID " + id + "\n\tGPA " + gpa + "\n\tSection " + section;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
