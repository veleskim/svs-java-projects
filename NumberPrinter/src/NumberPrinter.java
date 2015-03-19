public class NumberPrinter{

	static int n;
	static int sleepTime;

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(args[0]);
		sleepTime = Integer.parseInt(args[1]);
		
		final Task task = new Task();
		final Thread taskThread = new Thread(task);
		taskThread.start();
		
		Thread.sleep(sleepTime);
		System.out.println("Interrupting the task!");
		taskThread.interrupt();

	}

	public static class Task implements Runnable {
		@Override
		public void run() {
			for (int i = 1; i <= n; i++)
				System.out.println(i);
			if (Thread.interrupted()) {
				System.out.println("I've been interrupted!");
				return;
			}
		}
	}
}
