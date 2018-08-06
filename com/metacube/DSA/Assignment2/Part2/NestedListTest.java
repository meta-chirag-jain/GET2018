package GET2018.com.metacube.DSA.Assignment2.Part2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import static java.util.Arrays.*;

public class NestedListTest {

	//List<List<Integer>> nestedList = new ArrayList<List<Integer>>(2){{add(2)};{add(3)}};
	
	List<List<Integer>> inputList1 = asList(
		    asList( 1, 2, 3 ),
		    asList( 4, 5, 6 ),
		    asList( 7, 8, 9 ) );
	
	NestedList object1 = new NestedList(inputList1);
	
	List<List<Integer>> inputList2 = asList(
		    asList( -1, 0, 1, 2, 3, 4 ),
		    asList( 5, 6, 11 ),
		    asList( 7, 8, 9, 10 ) );
	
	NestedList object2 = new NestedList(inputList2);
	
	@Test(expected = AssertionError.class)
	public void NullListTest() {
		List<List<Integer>> inputNullList = null;

		NestedList Nullobject = new NestedList(inputNullList);
	}
	
	@Test(expected = AssertionError.class)
	public void EmptyListTest() {
		List<List<Integer>> inputEmptyList = asList( );

		NestedList Nullobject = new NestedList(inputEmptyList);
	}
	
	@Test
	public void listSumTest() {
		
		int sum = object1.listSum();
		assertEquals(45, sum);
		
		sum = object2.listSum();
		assertEquals(65, sum);
		
	}
	
	@Test
	public void largestElementTest() {
		
		int largest = object1.largestElement();
		assertEquals(9, largest);
		
		largest = object2.largestElement();
		assertEquals(11, largest);
		
	}
	
	@Test
	public void searchElementTest() {
		
		int[] position = object1.searchElement(7);
		assertArrayEquals(new int[]{2, 0}, position);
		
		position = object2.searchElement(6);
		assertArrayEquals(new int[]{1, 1}, position);
		
		//element not present
		position = object2.searchElement(45);
		assertArrayEquals(new int[]{-1, -1}, position);
		
	}

}
