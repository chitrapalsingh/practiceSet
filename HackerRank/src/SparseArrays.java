import java.util.Scanner;
import java.util.*;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numberOfString = scan.nextInt();
		ArrayList<String> inputStrings = new ArrayList<String>();
		for (int i =0 ; i< numberOfString; i++) {
			inputStrings.add(scan.next());
		}
		int numberOfQueries = scan.nextInt();
		ArrayList<String> inputQuries = new ArrayList<String>();
		for (int i=0; i< numberOfQueries; i++) {
			inputQuries.add(scan.next());
		}
		
		for (int i=0; i<inputQuries.size(); i++) {
			String queryString = inputQuries.get(i);
			int numberOfMatches = 0;
			for(int j=0; j<inputStrings.size(); j++){
				if (queryString.equals(inputStrings.get(j))) {
					numberOfMatches++;
				}
			}
			System.out.println(numberOfMatches);
		}
		
		scan.close();
	}

}
