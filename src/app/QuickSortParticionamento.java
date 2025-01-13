package app;

public class QuickSortParticionamento {
	int i;
	int pivot;
	int left, right;
	QuickSort q;
	
	public QuickSortParticionamento (QuickSort q, int left, int right) {
		this.left = left;
		this.right = right;
		this.q = q;
	}
	
	public int computar() {

		pivot = q.getValores()[left];
		i = left;
		
		for (int j=i+1; j<=right; j++) {
			if (q.getValores()[j] <= pivot) {
				i++; 
				q.swap(i, j); 
			}
		}
		
		q.swap(left, i);
		return i;
	}

}
