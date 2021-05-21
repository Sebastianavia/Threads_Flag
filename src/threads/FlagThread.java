package threads;

import java.io.IOException;
import model.Flag;

public class FlagThread extends Thread{

	private Flag fl;
	
	public FlagThread(int color, int slumber,int place,int la) {
		fl= new Flag(color,slumber,place,la);
	}
	public void run() {
		try {
			fl.init();
		} catch (IOException e) {
	
			e.printStackTrace();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}
