import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,2,3,4,5,6,7,8,9,10,11};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{11,10,9,8,7,6,5,4,3,2,1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1,0,10,15};
    assertArrayEquals(new int[]{15, 10, 0, 1}, ArrayExamples.reversed(input1));
  }
}
