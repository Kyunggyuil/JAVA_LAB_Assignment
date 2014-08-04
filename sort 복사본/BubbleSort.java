package sort;

import java.util.ArrayList;

public class BubbleSort implements Isort{

	ArrayList<Integer> member;
	
	public BubbleSort(ArrayList<Integer> member){
		this.member=member;
	}
	
	@Override
	public void sort(ArrayList<Integer> member) {
		System.out.println("Bubble Sort.");
		
	}

}
