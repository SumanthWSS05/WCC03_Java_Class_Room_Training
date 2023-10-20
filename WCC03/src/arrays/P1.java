package arrays;

import java.util.Arrays;

public class P1 {

	public static void main(String[] args) {
		
		Student[] arr = new Student[5];
		
		Student s1 = new Student(12, "Vishal");
		Student s2 = new Student(8, "Vikram");
		Student s3 = new Student(2, "Arun");
		Student s4 = new Student(7, "Manju");
		Student s5 = new Student(16, "Kiran");
		
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		
		System.out.println("----------Before sort----------");
		for(Student s : arr) {
			System.out.println(s);
		}
		Arrays.sort(arr);
		System.out.println("----------After sort----------");
		for(Student s : arr) {
			System.out.println(s);
		}
	}
}
