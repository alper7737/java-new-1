package javaders;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;

public class java3 {
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
		Container container = f.getContentPane();
		GridBagLayout gbl = new GridBagLayout();
		container.setLayout(gbl);
		komponentEkle(container,gbl,new JButton("1"),0,0,2,2,1.0,1.0);
		komponentEkle(container,gbl,new JButton("2"),2,0,1,1,0,1.0);
		komponentEkle(container,gbl,new JButton("3"),2,1,1,1,0,0);
		komponentEkle(container,gbl,new JButton("4"),0,2,3,1,0,1.0);
		komponentEkle(container,gbl,new JButton("5"),0,3,2,1,0,0);
		komponentEkle(container,gbl,new JButton("6"),0,4,2,1,0,0);
		komponentEkle(container,gbl,new JButton("7"),2,3,1,2,0,0);
		
		f.setSize(500,400);
		f.setVisible(true);

	}

}
