package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class student {
	/**
	 * id, id of the student
	 */
	private int id;

	/**
	 * name, name of the student
	 */
	private String name;

	/**
	 * cgpa, cgpa of a student
	 */
	private double cgpa;

	public student(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the cgpa
	 */
	public double getCgpa() {
		return cgpa;
	}

}

/**
 * JavaSort class used to sort a data based upon two or three data members.
 * 
 * @author Saravanan Perumal
 * @version 1.0
 * @question You are given a list of student information: ID, FirstName, and
 *           CGPA. Your task is to rearrange them according to their CGPA in
 *           decreasing order. If two student have the same CGPA, then arrange
 *           them according to their first name in alphabetical order. If those
 *           two students also have the same first name, then order them
 *           according to their ID. No two students have the same ID.
 * 
 *           Hint: You can use comparators to sort a list of objects. See the
 *           oracle docs to learn about comparators.
 *           {https://www.hackerrank.com/challenges/java-sort/problem}
 *
 */
public class JavaSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<student> studentList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			double cgpa = sc.nextDouble();
			student s = new student(id, name, cgpa);
			studentList.add(s);
		}
		Collections.sort(studentList, Comparator.comparing(student::getCgpa).reversed().thenComparing(student::getName)
				.thenComparing(student::getId));
		studentList.stream().forEach(action -> System.out.println(action.getName()));
		sc.close();
	}
}
