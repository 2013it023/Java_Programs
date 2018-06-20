package hackerrank;

import java.util.Scanner;

/**
 * SectionProblem used to find out the student section.
 * 
 * @author Saravanan Perumal All Contests Week of Code 38 Which Section?
 *         {url:https://www.hackerrank.com/contests/w38/challenges/which-section/problem}
 *
 */
public class SectionProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int totalStudent = sc.nextInt();
			int myNumber = sc.nextInt();
			int totalSection = sc.nextInt();
			int[] section = new int[totalSection];
			for (int j = 0; j < totalSection; j++) {
				section[j] = sc.nextInt();
			}
			System.out.println(getSection(section, myNumber));
		}
		sc.close();
	}

	/**
	 * getSection method used to get exact student section based upon his number.
	 * 
	 * @param section
	 * @param myNumber
	 * @return section number was returned
	 */
	private static int getSection(int[] section, int myNumber) {
		int sum = 0;
		int returnValue = 0;
		for (int i = 0; i < section.length; i++) {
			sum = sum + section[i];
			if (sum >= myNumber) {
				returnValue = ++i;
				break;
			}
		}
		return returnValue;
	}

}
