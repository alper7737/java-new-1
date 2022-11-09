package javaders;

import java.awt.Dimension;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class java1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(0,2,6,3));
		f.add(new JLabel("senin adın nedir?"));
		f.add( new JButton("tamam"));
		f.add(new JLabel ("kaç yaşındasın"));
		f.add( new JButton("tamam"));
		f.add(new JLabel ("kaç yaşındasın"));
		f.add( new JButton("tamam"));
		f.setSize(new Dimension(500,100));
		f.setVisible(true);
		
	}

}
