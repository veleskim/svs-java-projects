import java.util.Scanner;

public class Stopwatch {

	static Counter counter = new Counter();
	static Thread counterThread = new Thread(counter);

	Scanner input = new Scanner(System.in);

	static int seconds = 0;
	
	static boolean paused = false;

	public void startCounter() {
		System.out.println("Starting the stopwatch. To stop the stopwatch, enter 'stop', to pause the stopwatch, enter 'pause'!");
		counterThread.start();

		while (true) {
			if (input.next().equals("stop")) {
				stopCounter();
				break;
			} else if (input.next().equals("pause")) {
				pauseCounter();
				break;
			} else
				System.out.println("Invalid input!");
		}
	}

	public void stopCounter() {
		System.out.println("Counter stopped.");
		counterThread.interrupt();
	}

	public void pauseCounter() {
		paused = true;
		System.out.println("Counter paused. To resume enter 'resume', to stop the stopwatch, enter 'stop'");
		while(true){
			if(input.next().equals("resume"))
			{
				resumeCounter();
				break;
			}
			else if (input.next().equals("stop")){
				stopCounter();
				break;}
			else
				System.out.println("Invalid input");
		}

	}
	
	public void resumeCounter(){
		System.out.println("Resuming the stopwatch. To stop the stopwatch, enter 'stop', to pause the stopwatch, enter 'pause'!");
			paused=false;
			synchronized(counter)
			{
				counter.notify();
				}
			while (true) {
				if (input.next().equals("stop")) {
					stopCounter();
					break;
				} else if (input.next().equals("pause")) {
					pauseCounter();
					break;
				} else
					System.out.println("Invalid input!");
			}
			
			}

	public static void main(String args[]) throws Exception {

		Stopwatch s = new Stopwatch();
		s.startCounter();
	}

	public static class Counter implements Runnable {

		public void run() {

			while (true) {
				try {
					if(paused)
						synchronized(this)
						{
							wait();
						}
					else{
					Thread.sleep(1000);
					System.out.println(++seconds);}
				} catch (Exception e) {
					return;
				}

			}
		}
	}

}
