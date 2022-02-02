package application;

import java.util.Timer;

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new DisplayCounter(), 0, 30000);

	}

}
