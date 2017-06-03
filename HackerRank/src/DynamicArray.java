import java.io.*;
import java.util.*;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int numberOfSeq = scan.nextInt();
        int numberOfQueries = scan.nextInt();
        List<ArrayList> seqList = new ArrayList<ArrayList>();
        for (int i=0; i< numberOfSeq; i++) {
            ArrayList<Integer> seq = new ArrayList<Integer>();
            seqList.add(seq);
        }
        int lastAns = 0;
        for (int i=0; i<numberOfQueries; i++){
            int listIndex = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int index = (x^lastAns)%numberOfSeq;
            ArrayList<Integer> seq = seqList.get(index);
            if (listIndex == 1) {
                seq.add(y);
            }
            if (listIndex == 2) {
                int indexLast = y%seq.size();
                lastAns = seq.get(indexLast);
                System.out.println(lastAns);
            }
        }
    scan.close();

	}

}
