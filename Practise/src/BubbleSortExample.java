
public class BubbleSortExample {
	
	int[] intArray = {10,9,87,4,2,67,674,8,9,23,45};
	
	public void bubbleSort() {
		for(int i=0; i<intArray.length-1; i++ ) {
			for(int j=0; j<intArray.length-1-i; j++) {
				if(intArray[j] > intArray[j+1]) {
					swap(intArray, j, j+1);
				}
			}
		}
	}
	
	public void swap(int[] arrayint, int left, int right) {
		int temp = arrayint[left];
		arrayint[left] = arrayint[right];
		arrayint[right] = temp;
	}
	
	
	public void printArray() {
		for (int i=0; i< intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	
public static void main(String[] args) {
		
		BubbleSortExample testObj = new BubbleSortExample();
		testObj.printArray();
		System.out.println("after quick sort");
		testObj.bubbleSort();
		testObj.printArray();
		
		
	}

}
