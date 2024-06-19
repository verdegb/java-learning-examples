// Imports
import java.util.Scanner;
import java.util.ArrayList;

class Student {
	// Attributes
	private String name;
	private int age;
	private double average;

	// Method to create new student
	public Student(String name, int age, double average) {
		this.name = name;
		this.age = age;
		this.average = average;
	}

	// Method to return name (getter)
	public String getName() {
		return name;
	}

	// Method to create name attribute (setter)
	public void setName(String name) {
		this.name = name;
	}

	// Method to return age (getter)
	public int getAge() {
		return age;
	}

	// Method to create age attribute (setter)
	public void setAge(int age) {
		this.age = age;
	}

	// Method to return average (getter)
	public double getAverage() {
		return average;
	}

	// Method to create average attribute (setter)
	public void setAverage(double average) {
		this.average = average;
	}
}

public class StudentManagement {
	public static void main(String[] args) {
		// Variables
		int numberOfStudents = 0;
		ArrayList<Student> students = new ArrayList<>();

		// Create an instance to read console values
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many students do you want to add to the system?: ");

		while (numberOfStudents <= 0) {
			while (!scanner.hasNextInt()) {
				System.out.println("\nThe value entered is incorrect.");
				scanner.next();
				System.out.print("Enter a valid integer: ");
			}

			numberOfStudents = scanner.nextInt(); // Read the value

			if (numberOfStudents <= 0) {
				System.out.println("\nThe entered value must be greater than zero.");
				System.out.print("Enter a valid integer: ");
			}
		}

		// Create new students
		for (int i = 0; i < numberOfStudents; i++) {
			students.add(new Student("Pepito", 20, 21));
		}

		System.out.println(students);

		// End reading the console
		scanner.close();
	}
}
