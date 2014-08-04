package sort;

import java.util.ArrayList;

public class InsertionSort implements Isort{

	ArrayList<Integer> member;

	public InsertionSort(ArrayList<Integer> member){
		this.member=member;
	}
	
	@Override
	public void sort(ArrayList<Integer> member) {
		System.out.println("Insertion Sort.");
		
	}


}
