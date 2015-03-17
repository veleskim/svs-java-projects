import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MotionDetector implements ImageCapturingDevice, AlarmChannel {
;
	private ArrayList<String> pics = new ArrayList<String>();
	
	@Override
	public void record(){
		System.out.println("Simulacija na sliki: vnesuvajte znaci od tastatura; vnesete CTRL+Z prestanok!\n");
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
			pics.add(input.next());
		input.close();
	}
	
	public void compare(){
		record();
		for(int i=0;i<pics.size()-1;i++){
			if(!(Arrays.equals(pics.get(i).getBytes(), pics.get(i+1).getBytes())))
			{
				start();
				break;
			}
			else
				System.out.println("Not sounding the alarm. You are safe!\n");
		}
	}
	
	public void start(){
		System.out.println("The alarm is on!");
	}
}
