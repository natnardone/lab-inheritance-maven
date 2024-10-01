package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
    
  int count;
  int start;

  public BasicCounter(int start) {
    this.count = start;
    this.start = start;
    //System.err.printf("BasicCounter(%d)\n",start); 
  }

  public void increment() throws Exception {
    this.count++;
  }

  public void reset() {
    this.count = this.start;
  }

  public String toString() {
    return new String("[" + this.count + "]");
  }

  public int get() {
    return this.count;
  }
}
