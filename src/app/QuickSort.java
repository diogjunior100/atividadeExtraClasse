package app;

public class QuickSort {

	private int[] valores;
	private QuickSortParticionamento p;

	private QuickSort(int[] valores) {
		this.valores = valores; 
		this.p = new QuickSortParticionamento();
	}

	public static QuickSort getInstancia(int[] valores) {
		return new QuickSort(valores);
	}

	public int getSize() {
		return valores.length;
	}
	
	public int particionamento (int left, int right) {
		return p.particionar(valores, left, right);
	}

	public int[] ordenar(int left, int right) {
		if (left < right) {
			int indicePivot = p.particionar(valores, left, right);
			ordenar(left, indicePivot -1);
			ordenar(indicePivot + 1, right);
		}
		return valores;
	}
}
