package javaders;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class java4 {

	static void komponentEkle(Container container,GridBagLayout gbl ,Component komponent,int x,int y,
			int genislik,int yukseklik,double agirlikx,double agirliky) 
	{
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=genislik;
		gbc.gridheight=yukseklik;
		gbc.weightx=agirlikx;
		gbc.weighty=agirliky;
		gbl.setConstraints(komponent, gbc);
		container.add(komponent);
	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gbl = new GridBagLayout();
		f.setLayout(gbl);
		komponentEkle(f,gbl,new JButton("1"),0,0,1,4,0,0);
		komponentEkle(f,gbl,new JButton("2"),1,0,3,1,0,0);
		komponentEkle(f,gbl,new JButton("3"),1,1,1,2,0,0);
		komponentEkle(f,gbl,new JButton("4"),2,1,1,1,0,0);
		komponentEkle(f,gbl,new JButton("5"),3,1,1,1,0,0);
		komponentEkle(f,gbl,new JButton("6"),2,2,2,1,0,0);
		komponentEkle(f,gbl,new JButton("7"),1,3,1,1,0,0);
		komponentEkle(f,gbl,new JButton("8"),2,3,1,1,0,0);
		komponentEkle(f,gbl,new JButton("9"),3,3,1,1,0,0);
		komponentEkle(f,gbl,new JButton("10"),0,4,4,1,0,0);
		f.setVisible(true);
		f.setSize(300,300);

	}

}
