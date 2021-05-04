package algorithm;

import java.util.ArrayList;

public class InsertionSort implements SortAlgorithm{

	@Override
	public void sort(ArrayList<Integer> list) {
		insertionSort(list);
	}
	
	private void insertionSort(ArrayList<Integer> list) {
		
		for(int pos=1; pos<list.size(); pos++) {
			int current = list.get(pos);
			int i = pos-1;
			
			while(i >= 0 && list.get(i) > current) {
				list.set(i+1, list.get(i));
				i--;
			}
			
			list.set(i+1, current);
		}		
	}
}
