package xoxo;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class wygrana2 extends JFrame{
	
	String napis = "Zwyciêzc¹ jest gracz: x";
	JLabel txt;
	Font font1 = new Font("SansSerif", Font.BOLD, 16);
	
	
	public wygrana2() {
		setSize(300,200);
		setTitle("Zyciêzca");
		setLayout(null);
		txt = new JLabel(napis);
		txt.setBounds(50,15,200,100);
		txt.setForeground(java.awt.Color.RED);
		txt.setFont(font1);
		add(txt);
	}
}
