package CS1301.Assignment06;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 6

public class Diamonds {

  public static void main(String[] args) {

    drawDiamond();

    System.out.println("\n");

    drawHourGlass();

  }

  private static void drawHourGlass() {
    int HOURGLASS_WIDTH = 9;
    int padding = 0;

    for (int i = 0; i < HOURGLASS_WIDTH; i++) {
      drawPadding(padding);

      int starsToDraw = HOURGLASS_WIDTH - (padding * 2);
      for (int j = 0; j < starsToDraw; j++) {
        System.out.print("*");
      }
      System.out.println();

      // This logic allows us to "turn around" and start decreasing the padding after halfway through
      // the shape. This give us that distinctive hourglass shape.
      padding += (i < (HOURGLASS_WIDTH / 2)) ? 1 : -1;
    }

  }

  private static void drawDiamond() {

    int DIAMOND_WIDTH = 9;
    int padding = DIAMOND_WIDTH / 2;  // integer division intentional

    for (int i = 0; i < 9; i++) {

      drawPadding(Math.abs(padding));

      // Determine how many stars we need to draw. This is just the width of the diamond minus twice the
      // padding (one for each side)
      int starsToDraw = DIAMOND_WIDTH - (Math.abs(padding) * 2);
      for (int j = 0; j < starsToDraw; j++) {
        System.out.print("*");
      }

      System.out.println();

      padding -= 1;

    }

  }

  /**
   * Given an integer, just writes that many space characters to System.out.
   */
  private static void drawPadding(int padding) {
    for (; padding-- > 0;) System.out.print(" ");  // I have to have fun somehow
  }

}
