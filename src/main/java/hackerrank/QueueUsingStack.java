package hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * QueueUsingStack used to perform insertion, deletion and print the value in
 * queue using stack.
 * 
 * @author Saravanan Perumal
 * @version 1.0 {question : A queue is an abstract data type that maintains the
 *          order in which elements were added to it, allowing the oldest
 *          elements to be removed from the front and new elements to be added
 *          to the rear. This is called a First-In-First-Out (FIFO) data
 *          structure because the first element added to the queue (i.e., the
 *          one that has been waiting the longest) is always the first one to be
 *          removed.
 * 
 *          A basic queue has the following operations:
 * 
 *          Enqueue: add a new element to the end of the queue. Dequeue: remove
 *          the element from the front of the queue and return it. In this
 *          challenge, you must first implement a queue using two stacks. Then
 *          process queries, where each query is one of the following types:
 * 
 *          1 x: Enqueue element into the end of the queue. 2: Dequeue the
 *          element at the front of the queue. 3: Print the element at the front
 *          of the
 *          queue.url#https://www.hackerrank.com/challenges/queue-using-two-stacks/problem}
 *
 */
public class QueueUsingStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Stack<Integer> queueList = new Stack<>();
		for (int i = 0; i < T; i++) {
			int opt = sc.nextInt();
			if (opt == 1)
				queueList.add(sc.nextInt());
			else if (opt == 2) {
				queueList.remove(0);
			} else {
				System.out.println(queueList.get(0));
			}
		}
		sc.close();
	}
}