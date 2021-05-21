package ui;

import threads.FlagThread;

public class Main {
	public final static String ESC   = "\u001b[";
	public final static int ye=43;
	public final static int re=41;
	public final static int bl=44;
	
	public static void main(String[] args) {
		System.out.println(ESC+"2J");
	
	FlagThread colorY =new FlagThread(ye,8,1,10);
	FlagThread colorB =new FlagThread(bl,16,11,5);
	FlagThread colorR =new FlagThread(re,16,16,5);
	colorY.start();
	colorB.start();
	colorR.start();

	}
}
