package edu.grinnell.csc207.util;

public class DecrementableCounter extends BasicCounter {
  /**
   * Create a new decrementable counter.
   *
   * @param start
   *   The initial value of the counter.
   */
  public DecrementableCounter(int start) {
    super(start);
    //System.err.printf("DecrementableCounter(%d)\n", start); 
  } // DecrementableCounter(int)

  public void decrement() {
    this.count--;
  }
}
