/*
 * IIHT institution is offering a variety of courses to students. 
 * Students have a facility to check whether a particular course is 
 * available in the institution. Write a program to help the institution 
 * accomplish this task. If the number is less than or equal to zero 
 * display "Invalid Range".
 * Assume maximum number of courses is 20.
 */

import java.util.Scanner;
public class Course {
	public static int n;
	public static String name[] = new String[20]; //declaring a string array
	public static String str;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of course: ");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid Range");
			return ;
		}
		
		System.out.println("Enter course names:");
		for(int i=0;i<=n;i++) {
			name[i] = sc.nextLine();
		}
		System.out.println("Enter the course to be searched:");
		str = sc.nextLine();
		
		boolean found = false ;
		for(int i=0 ; i<=n ;i++ ) {
			if(name[i].equals(str))
				found  = true;
		}
		if(found)
			System.out.println(str+" course is available");
		else 
			System.out.println(str+" course is not available");
	}
}
