import java.util.ArrayList;

import algorithm.*;

public class Main {

	public static void main(String args[]) {
		new Main();
	}
	
	public Main() {
		ArrayList<Integer> list = new ArrayList<>();
		SortAlgorithm sorter = new SelectionSort();
		
		for(int i=5500; i>0; i--) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		sorter.sort(list);
		long end = System.currentTimeMillis();
		
		System.out.printf("%d ms\n", end-start);
		printList(list);
	}
	

	
	public void printList(ArrayList<Integer> list) {
		for(int i : list) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
}
