import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
import org.apache.commons.lang3.*;


public class ImprovedWordCounter {

	private Scanner input;

	private HashMap<String, Integer> wordCount;

	public void openFile() {
		try {
			input = new Scanner(new FileReader("src/main/resources/words.txt"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void countWords() {
		wordCount = new HashMap<String, Integer>();
		while (input.hasNext()) {
			String str = input.next();
			if (wordCount.isEmpty())
				wordCount.put(str, 1);
			else {
				boolean change = false;
				for(String aux:wordCount.keySet())
				if(StringUtils.containsIgnoreCase(str, aux)){
					wordCount.put(aux, wordCount.get(aux) + 1);
					change = true;
					continue;
				}
				if(change == false){
					wordCount.put(str, 1);
				}
			
			}
		}
	}

	public void printCount() {
		for (Entry<String, Integer> entry : wordCount.entrySet()) {
			String key = entry.getKey().toString();
			Integer value = entry.getValue();
			System.out.println(key + ":" + " " + value);
		}
	}

	public void closeFile() {
		input.close();
	}
}
