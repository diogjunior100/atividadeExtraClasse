package app;

public class QuickSortParticionamento {
	public int particionar(int[] valores,int left, int right) {

		int pivot = escolherPivo(valores, left);
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (valores[j] <= pivot) {
                i++;
                swap(valores, i, j);
            }
        }

        swap(valores, left, i);
		
		return i;
	}
	
	private int escolherPivo(int[] valores, int left) {
        return valores[left];
    }
	
	private void swap(int[] valores, int i, int j) {
        int temp = valores[i];
        valores[i] = valores[j];
        valores[j] = temp;
    }

}
