/**
 * 
 */
package edu.cnm.deepdive.implementations;

import java.math.BigInteger;
import java.util.Iterator;

/**
 * @author Abdul Haseeb Gauba
 *
 */
public class Padovan implements Iterable<BigInteger> {
  
  public Padovan() {

  }
  

  
  @Override
  public Iterator<BigInteger> iterator() {

    return new Iterator<BigInteger>() {
      private BigInteger lessTwo = BigInteger.ZERO;
      private BigInteger previous = BigInteger.ONE;
      private BigInteger current = BigInteger.ZERO;
      private int index = 0;
          
      @Override
      public boolean hasNext() {
        return true;
      }

      @Override
      public BigInteger next() {
        BigInteger next = lessTwo.add(previous);
        lessTwo = previous;
        previous = current;
        current = next;
        index++;
        return current;
      }

    };

  }

//  Inner class implementing the Iterator<BigInteger> interface.
//  private class FibIterator implements Iterator<BigInteger> {
//
//    private BigInteger previous = BigInteger.valueOf(-1);
//    private BigInteger current = BigInteger.ONE;
//    private int index = 0;
//        
//    @Override
//    public boolean hasNext() {
//      return upper < 0 || index < upper;
//    }
//
//    @Override
//    public BigInteger next() {
//      BigInteger next = previous.add(current);
//      previous = current;
//      current = next;
//      index++;
//      return current;
//    }
//    
//  }
  
}












