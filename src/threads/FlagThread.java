package threads;

import java.io.IOException;
import model.Flag;

public class FlagThread extends Thread{

	private Flag flag;
	
	public FlagThread(int color, int sleep,int position,int large) {
		flag= new Flag(color,sleep,position,large);
	}
	public void run() {
		try {
			flag.initialize();
		} catch (IOException e) {
	
			e.printStackTrace();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}
