package javaders;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class java2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(4,4,10,10));
		for(int i = 1;i<=16;i++)
		    f.add(new JButton(""+i));
		
		f.setSize(300,400);
		f.setVisible(true);

	}

}
