package xoxo;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

public class wygrana extends JFrame{
	
	String napis = "Zwyciêzc¹ jest gracz: o";
	JLabel txt;
	Font font1 = new Font("SansSerif", Font.BOLD, 16);
	
	
	public wygrana() {
		setSize(300,200);
		setTitle("Zyciêzca");
		setLayout(null);
		txt = new JLabel(napis);
		txt.setBounds(50,15,200,100);
		txt.setForeground(java.awt.Color.BLUE);
		txt.setFont(font1);
		add(txt);
	}
}
