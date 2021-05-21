package model;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Flag {
	public final static String ESC   = "\u001b[";
	public static double width=4;
	public int he=1;
	private int la;
	private char space=' ';
	private BufferedWriter printer;
	private int slumber;
	private int color;
	private int place;
	
	
	public Flag(int color, int slumber,int place,int la) {
		this.color=color;
		this.slumber=slumber;
		this.place=place;
		this.la=la;
		printer= new BufferedWriter(new OutputStreamWriter(System.out));
	}


	public void init() throws IOException, InterruptedException {
		printer.write(ESC+place+";"+0+"f");

		while(he<100) {

		for (int i = 0; i < la; i++) {
			printer.write(ESC+color+"m"+space);
			printer.flush();
			Thread.sleep(slumber);
			int x=place+i;
			printer.write(ESC+x+";"+he+"f");
			
		}
			
			printer.write(ESC+color+"m"+space);
			printer.flush();
			he++;
			printer.write(ESC+place+";"+he+"f");
		}
	}



}
