package GET2018.com.metacube.DSA.Assignment2.Part2;

import java.util.List;

public class NestedList implements INestedList{

	public static final int LIST_NUMBER = 0;
	public static final int LIST_POSITION = 1;
	
	private List<List<Integer>> nestedList;
	
	public NestedList(List<List<Integer>> nestedList) {
		if(nestedList == null) {
			throw new AssertionError("Null List");
		}
		
		if(nestedList.size() == 0) {
			throw new AssertionError("Empty List");
		}
		
		this.nestedList = nestedList;
	}
	
	@Override
	public int listSum() {
		int sum = 0;
		
		for(int i = 0; i < nestedList.size(); i++) {			
			for(int j = 0; j < nestedList.get(i).size(); j++) {
				sum += nestedList.get(i).get(j);				
			}
		}
		
		return sum;
	}

	@Override
	public int largestElement() {
		int max = nestedList.get(0).get(0);
		for(int i = 0; i < nestedList.size(); i++) {
			for(int j = 0; j < nestedList.get(i).size(); j++) {
				if(max < nestedList.get(i).get(j)) {
					max = nestedList.get(i).get(j);
				}
			}
		}
		return max;
	}

	@Override
	public int[] searchElement(int elementToSearch) {
		int[] elementPosition = new int[]{-1, -1};
		for(int i = 0; i < nestedList.size(); i++) {
			for(int j = 0; j < nestedList.get(i).size(); j++) {
				if(elementToSearch == nestedList.get(i).get(j)) {
					elementPosition[LIST_NUMBER] = i;
					elementPosition[LIST_POSITION] = j;
					return elementPosition;
				}
			}
		}
		return elementPosition;
	}


}
