package application;

import java.util.TimerTask;

import javax.swing.JOptionPane;

public class DisplayDone extends TimerTask {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "Egg cooked!");
		
	}

}
