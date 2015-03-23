
public class ImprovedWordCounterApp {

	public static void main(String args[]) {

		ImprovedWordCounter wc = new ImprovedWordCounter();
		wc.openFile();
		wc.countWords();
		wc.printCount();
		wc.closeFile();
		
	}
}