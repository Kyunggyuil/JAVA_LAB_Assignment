package sort;

import java.util.ArrayList;

public class SortMain {

	public static void main(String[] args) {
		ArrayList member = new ArrayList<Integer>();
		member.add(2);
		member.add(1);
		member.add(6);
		member.add(4);
		
		BubbleSort list = new BubbleSort(member);
		InsertionSort list_1 = new InsertionSort(member);
		QuickSort list_2 = new QuickSort(member);
		
		list.sort(member);
		list_1.sort(member);
		list_2.sort(member);
	}

}
