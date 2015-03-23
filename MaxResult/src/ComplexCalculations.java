import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ComplexCalculations implements Callable<Integer>{
	
	private Integer calculationNumber;
	private CountDownLatch latch;
	
	public ComplexCalculations(Integer calculationNumber, CountDownLatch latch){
		this.calculationNumber = calculationNumber;
		this.latch=latch;
	}

	@Override
    public Integer call() throws Exception {
		System.out.println("Complex calculation "+calculationNumber+" started...");
        try {
        	TimeUnit.SECONDS.sleep(new Random().nextInt(2) + 1);
        	latch.countDown();
		} catch (InterruptedException e) {
		}
        System.out.println("Complex calculation "+calculationNumber+" completed.");
        return new Random().nextInt(100 + 1);
        
    }
}
