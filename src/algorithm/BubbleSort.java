package algorithm;

import java.util.ArrayList;

public class BubbleSort implements SortAlgorithm{

	@Override
	public void sort(ArrayList<Integer> list) {
		bubbleSort(list);
	}
	
	private void bubbleSort(ArrayList<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<list.size()-i-1; j++) {
				if(list.get(i) < list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
}
