import java.util.HashMap;

public class StringCountExp {
	
	public void findWordsCount(String input, String[] wordArr) {
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		for (String word : wordArr) {
			hm.put(word, 0);
			int i = input.indexOf(word);
			System.out.println(i);
			if (i >=0 ) {
				hm.put(word, 1);
			}
			i = input.indexOf(word, i+1);
			System.out.println(i);
			while (i>=0) {
				hm.put(word, hm.get(word)+1);
				i = input.indexOf(word, i+1);
			}
		}
		System.out.println(hm);
		
	}

	public static void main(String[] args) {
		String input = "acacabcatghhellomvnsdb";
		String[] arr={"aca","cat","hello","world"};
		StringCountExp obj = new StringCountExp();
		obj.findWordsCount(input, arr);
	}

}
