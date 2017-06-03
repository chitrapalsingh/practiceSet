
public class QuickSortExample {
	
	int[] intArray = {10,9,87,4,2,67,674,8,9,23,45};
	
	public void quickSort() {
		quickSort(intArray, 0 , intArray.length -1);
	}
	
	public void quickSort(int[] arrayInt, int left, int right) {
		
		if(left >= right) {
			return;
		}
		
		int pivot = arrayInt[left +(right-left)/2];
		int index = partition(arrayInt, left, right, pivot);
		quickSort(arrayInt, left, index-1);
		quickSort(arrayInt, index, right);
	}
	
	public int partition(int[] arrayInt, int left, int right, int pivot) {
		while(left <= right) {
			
			while(arrayInt[left] < pivot) {
				left++;
			}
			while(arrayInt[right] > pivot) {
				right--;
			}
			
			if(left <= right) {
				swap(arrayInt, left, right);
				left++;
				right--;
			}
		}
		
		return left;
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
		
		QuickSortExample testObj = new QuickSortExample();
		testObj.printArray();
		System.out.println("after quick sort");
		testObj.quickSort();
		testObj.printArray();
		
		
	}

}
