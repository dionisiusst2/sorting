package algorithm;

import java.util.ArrayList;

public class SelectionSort implements SortAlgorithm {

	@Override
	public void sort(ArrayList<Integer> list) {
		selectionSort(list);
	}
	
	private void selectionSort(ArrayList<Integer> list ) {
		
		for(int pos=0; pos<list.size(); pos++) {
			int minIndex = pos;
			
			for(int i=pos+1; i<list.size(); i++) {
				if(list.get(i) < list.get(minIndex)) {
					minIndex = i;
				}
			}
			swap(list, pos, minIndex);
		}
	}
	
	private void swap(ArrayList<Integer> list, int i, int j) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
}
