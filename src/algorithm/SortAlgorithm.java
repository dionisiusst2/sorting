package algorithm;
import java.util.ArrayList;

public interface SortAlgorithm {
	public static final int ASCENDING = 1;
	public static final int DESCENDING = 2;
	public void sort(ArrayList<Integer> list, int mode);
}
