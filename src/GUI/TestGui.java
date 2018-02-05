package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("LOL");
		f.setSize(500,300);
		f.setLocation(200,200);
		f.setLayout(null);
		JButton b = new JButton("นา");
		b.setBounds(50, 50, 100, 50);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
