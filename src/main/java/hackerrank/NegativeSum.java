package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * We define the following:
 * 
 * A subarray of an -element array is an array composed from a contiguous block of the original
 * array's elements. For example, if , then the subarrays are , , , , , and . Something like would
 * not be a subarray as it's not a contiguous subsection of the original array. The sum of an array
 * is the total sum of its elements. An array's sum is negative if the total sum of its elements is
 * negative. An array's sum is positive if the total sum of its elements is positive. Given an array
 * of integers, find and print its number of negative subarrays on a new line.
 * 
 * @author Saravanan Perumal
 * @see <a href="https://www.hackerrank.com/challenges/java-negative-subarray/problem">Problem
 *      Statement</a>
 *
 */
public class NegativeSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalElements = sc.nextInt();
    List<Integer> elementList = new ArrayList<>();
    for (int i = 0; i < totalElements; i++) {
      elementList.add(sc.nextInt());
    }
    System.out.println(countNegativeSubArray(elementList, totalElements));
    sc.close();
  }

  private static int countNegativeSubArray(List<Integer> elementList, int totalElements) {
    int count = 0;
    for (int i = 0; i < totalElements; i++) {
      for (int j = i; j < totalElements; j++) {
        int sumArray = elementList.subList(i, j + 1).stream().mapToInt(Integer::intValue).sum();
        if (sumArray < 0)
          count++;
      }
    }
    return count;
  }
}
