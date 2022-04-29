/**
 * This is a class that tests the Card class.
 *
 *  Madeline Vande Hey
 *  4/26/22
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card card1 = new Card("ace", "hearts", 1);
      Card card2 = new Card("queen", "diamonds", 1);
      Card card3 = new Card("jack", "clubs", 1);
      Card card4 = new Card("jack", "clubs", 1);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: " + card1.rank() + " of " + card1.suit());
      System.out.println("  rank: " + card1.rank());
      System.out.println("  suit: " + card1.suit());
      System.out.println("  pointValue: " + card1.pointValue());
      System.out.println("  toString: " + card1.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: " + card2.rank() + " of " + card2.suit()); 
      System.out.println("  rank: " + card2.rank());
      System.out.println("  suit: " + card2.suit());
      System.out.println("  pointValue: " + card2.pointValue());
      System.out.println("  toString: " + card2.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: " + card3.rank() + " of " + card3.suit());
      System.out.println("  rank: " + card3.rank());
      System.out.println("  suit: " + card3.suit());
      System.out.println("  pointValue: " + card3.pointValue());
      System.out.println("  toString: " + card3.toString());
      System.out.println();

      // Test matches() method
      System.out.println("**** Tests Card 4: " + card4.rank() + " of " + card4.suit());
      System.out.println("  rank: " + card4.rank());
      System.out.println("  suit: " + card4.suit());
      System.out.println("  pointValue: " + card4.pointValue());
      System.out.println("  toString: " + card4.toString());
      System.out.println();

      // matching tests
      System.out.println("**** matching tests *****");
      System.out.println("Compare card 1 to card 2");
      System.out.println("matching: " + card1.matches(card2));
      System.out.println();
      System.out.println("Compare card 3 to card 4");
      System.out.println("matching: " + card3.matches(card4));
      System.out.println();

   }
}
