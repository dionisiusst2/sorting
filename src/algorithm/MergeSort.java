package algorithm;

import java.util.ArrayList;

public class MergeSort implements SortAlgorithm{

	@Override
	public void sort(ArrayList<Integer> list) {
		mergeSort(list, 0, list.size()-1);
	}
	

	private void mergeSort(ArrayList<Integer> list, int left, int right) {
		if(left == right) return;
		int mid = (right + left) / 2;
		
		mergeSort(list, left, mid);
		mergeSort(list, mid+1, right);
		merge(list, left, mid, right);
	}
	
	private void merge(ArrayList<Integer> list, int left, int mid, int right) {
		
		int s1 = mid - left + 1; // Size of Left Subarray
		int s2 = right - mid; // Size of Right Subarray
		
		int L[] = new int[s1];
		int R[] = new int[s2];
		
		for(int i=0; i<s1; i++) {
			L[i] = list.get(i + left);
		}
		
		for(int i=0; i<s2; i++) {
			R[i] = list.get(i + mid + 1);
		}
		
		
		int i = 0; 
		int j = 0;
		
		// k denotes the index of the list that is being modified
		int k = left;
		
		while(i < s1 && j < s2) {
			if(L[i] <= R[j]) {
				list.set(k, L[i]);
				i++;
			} else {
				list.set(k, R[j]);
				j++;
			}
			k++;
		}
		
		
		// Append remaining data from left subarray, if any
		while(i < s1) {
			list.set(k, L[i]);
			i++;
			k++;
		}
		
		// Append remaining data from right subarray, if any
		while(k < s2) {
			list.set(k, R[j]);
			j++;
			k++;
		}
	}
}
