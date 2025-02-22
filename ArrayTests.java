import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = {1,2,3,4};
    int[] input2 = {4,3,2,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(input2, input1);
  }

  @Test
  public void testReversed2(){
    int[] input1 = {1,2,3,4};
    int[] input2 = {4,3,2,1};
    assertArrayEquals(input2, ArrayExamples.reversed(input1));
  }
}
