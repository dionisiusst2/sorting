import java.util.ArrayList;

import algorithm.*;

public class Main {

	public static void main(String args[]) {
		new Main();
	}
	
	public Main() {
		ArrayList<Integer> list = new ArrayList<>();
		SortAlgorithm sorter = new BubbleSort();
		
		for(int i=5500; i>0; i--) {
			list.add(i);
		}
		
		System.out.println(System.currentTimeMillis());
		sorter.sort(list, SortAlgorithm.ASCENDING);
		System.out.println(System.currentTimeMillis());
		
		printList(list);
	}
	

	
	public void printList(ArrayList<Integer> list) {
		for(int i : list) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
}
