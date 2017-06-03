
public class InsertionSortExample {
	
	
	public void printArray(int[] A) {
		for (int i=0; i<A.length; i++) {
			System.out.println(A[i]);
		}
	}
	
	public void sortArray(int[] A) {
		for (int i=1; i<A.length; i++) {
			int key = A[i];
			int j = i-1;
			while (j>=0 && A[j] > key) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {10,13,5,111,7};
		InsertionSortExample testObj = new InsertionSortExample();
		testObj.printArray(A);
		testObj.sortArray(A);
		System.out.println("Sorted array");
		testObj.printArray(A);
	}

}
