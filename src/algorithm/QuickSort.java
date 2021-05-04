package algorithm;

import java.util.ArrayList;

public class QuickSort implements SortAlgorithm{

	@Override
	public void sort(ArrayList<Integer> list) {
		quickSort(list, 0, list.size()-1);
	}
	
	private void quickSort(ArrayList<Integer> list, int left, int right) {
		if(left < right) {
			int sortedPivotIndex = partition(list, left, right);
			
			quickSort(list, left, sortedPivotIndex-1);
			quickSort(list, sortedPivotIndex+1, right);
		}
	}
	
	private int partition(ArrayList<Integer> list, int left, int right) {
		
//		take last element of subarray as pivot
		int pivot = right;
		int i = left - 1;
		
		for(int j=left; j<right; j++) {
			if(list.get(j) < list.get(pivot)) {
				i++;
				swap(list, i, j);
			}
		}
		
		swap(list, i+1, pivot);
		return i+1;
		
//		take first element of subarray as pivot
//		int pivot = left;
//		int i = left;
//		
//		for(int j=i+1; j<right; j++) {
//			if(list.get(j) < list.get(pivot)) {
//				i++;
//				swap(list, i, j);
//			}
//		}
//		
//		swap(list, i, pivot);
//		return i;
		
	}
	
	private void swap(ArrayList<Integer> list, int i, int j) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	
	
}
