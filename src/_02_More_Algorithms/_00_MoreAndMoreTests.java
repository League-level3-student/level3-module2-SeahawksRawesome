package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	@Test
	  public void MultTest() {
		
	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }
	public String multiply(int mult1, int mult2){
		String answer = mult1 +  " x " + mult2 + " = " + mult1*mult2 ;
		return answer;
	}

	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
	public boolean isPrime(int j) {
			if(j%2 == 0) {
				return false;
			}
			for(int i = 3; i < j; i++) {
				if(j%i == 0) {
					return false;
				}
			}
			return true;
		
	}

	@Test
	  public void SquareTest() {

        assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
	public boolean isSquare(double j) {
			for(int i = 1; i <= j; i++) {
				if(i*i == j) {
					return true;
				}
				else {
					
				}
			}
			return false;
	}
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }
	public boolean isCube(double j) {
		for(int i = 1; i <= j; i++) {
			if(i*i*i == j) {
				return true;
			}
			else {
				
			}
		}
		return false;
}


}
