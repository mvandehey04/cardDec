/**
 * This is a class that tests the Deck class.
 *
 *  Madeline Vande Hey
 *  4/26/22
 */

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

      String[] myRanks = new String[10];
      myRanks[0] = "king";
      myRanks[1] = "queen";
      myRanks[2] = "jack";
      myRanks[3] = "10";
      myRanks[4] = "9";
      myRanks[5] = "8";
      myRanks[6] = "7";
      myRanks[7] = "6";
      myRanks[8] = "5";
      myRanks[9] = "ace";

      String[] mySuits = new String[4];
      mySuits[0] = "clubs";
      mySuits[1] = "spades";
      mySuits[2] = "hearts";
      mySuits[3] = "diamonds";

      int[] myPointValues = new int[10];
      myPointValues[0] = 13;
      myPointValues[1] = 12;
      myPointValues[2] = 11;
      myPointValues[3] = 10;
      myPointValues[4] = 9;
      myPointValues[5] = 8;
      myPointValues[6] = 7;
      myPointValues[7] = 6;
      myPointValues[8] = 5;
      myPointValues[9] = 1;

      Deck myDeck = new Deck(myRanks, mySuits, myPointValues);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString:\n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal 5 Cards ****");
      System.out.println("  deal: " + myDeck.deal());
      // deal 2
      System.out.println("  deal: " + myDeck.deal());
      // deal 3
      System.out.println("  deal: " + myDeck.deal());
      // deal 4
      System.out.println("  deal: " + myDeck.deal());
      // deal 5
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");
      System.out.println("  toString:\n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      // deal 6
      myDeck.deal();
      // deal 7
      myDeck.deal();
      // deal 8
      myDeck.deal();
      // deal 9
      myDeck.deal();
      // deal 10
      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString:\n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println();
      System.out.println();


      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      // String[] ranks52 = {"ace"};
      // String[] suits52 = {"spades"};
      // int[] pointValues52 = {1};

      // System.out.println("  The Starting Deck ");

      // System.out.println("  The Deck After Dealing a Card" );

      // System.out.println("  Shuffleing the Deck ");


   }
}
