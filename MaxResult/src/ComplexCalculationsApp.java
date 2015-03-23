import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ComplexCalculationsApp {

	private static final int THREAD_POOL_SIZE = 10;
	private static Integer max;

	public static void main(String[] args) throws Exception {

		final CountDownLatch latch = new CountDownLatch(THREAD_POOL_SIZE);
		final ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		ArrayList<Future<Integer>> finalList = new ArrayList<Future<Integer>>();
		for (int i = 1; i <= THREAD_POOL_SIZE; i++) {
			finalList.add(executorService.submit(new ComplexCalculations(i, latch)));
		}
		latch.await();
		ArrayList<Integer> listForSort = new ArrayList<Integer>();
		for(Future<Integer> part : finalList) {
			listForSort.add(part.get());
		}
		Collections.sort(listForSort);
		System.out.println(listForSort);
		max = listForSort.get(listForSort.size() - 1);
		System.out.println("Determing the maximal result of the calculations...");
		System.out.println("The maximum result is "+max);

		executorService.shutdown();
	}
}
