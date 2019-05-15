package hackerrank;

import java.util.*;

class Checker implements Comparator<Player> {

  public int compare(Player player1, Player player2) {
    int scoreComparison = ((Integer) player1.score).compareTo((Integer) player2.score);
    return scoreComparison == 0 ? player1.name.compareTo(player2.name)
        : player1.score > player2.score ? -1 : (player1.score < player2.score ? 1 : 0);
  }

}


class Player {

  String name;
  int score;

  Player(String name, int score) {
    this.name = name;
    this.score = score;
  }
}


/**
 * Comparators are used to compare two objects. In this challenge, you'll create a comparator and
 * use it to sort an array.
 * 
 * The Player class is provided for you in your editor. It has fields: a String and a integer.
 * 
 * Given an array of Player objects, write a comparator that sorts them in order of decreasing
 * score; if or more players have the same score, sort those players alphabetically by name. To do
 * this, you must create a Checker class that implements the Comparator interface, then write an int
 * compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
 * 
 * @author Saravanan Perumal
 * @see <a href="https://www.hackerrank.com/challenges/java-comparator/problem">Problem Link</a>
 *
 */

public class MultipleComparison {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    Player[] player = new Player[n];
    Checker checker = new Checker();

    for (int i = 0; i < n; i++) {
      player[i] = new Player(scan.next(), scan.nextInt());
    }
    scan.close();
    Arrays.sort(player, checker);
    for (int i = 0; i < player.length; i++) {
      System.out.printf("%s %s\n", player[i].name, player[i].score);
    }
  }
}
