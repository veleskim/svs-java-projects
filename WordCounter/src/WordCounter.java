import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordCounter {
	private Scanner input;

	private HashMap<String, Integer> wordCount;

	public void openFile() {
		try {
			input = new Scanner(new FileReader("words.txt"));
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
				if (wordCount.containsKey(str))
					wordCount.put(str, wordCount.get(str) + 1);
				else
					wordCount.put(str, 1);
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
