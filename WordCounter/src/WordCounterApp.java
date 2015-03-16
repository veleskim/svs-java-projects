public class WordCounterApp {

	public static void main(String args[]) {

		WordCounter wc = new WordCounter();
		wc.openFile();
		wc.countWords();
		wc.printCount();
		wc.closeFile();
		
	}

}