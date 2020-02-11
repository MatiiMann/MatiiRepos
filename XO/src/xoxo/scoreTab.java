package xoxo;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class scoreTab extends JFrame {
	
	int x;
	int o;
	JLabel txt;
	JLabel wO;
	JLabel wX;
	Font font1 = new Font("SansSerif", Font.BOLD, 36);
	
	public scoreTab() {
		x=0;
		o=0;
		setSize(300,200);
		setTitle("Tabela Wyników");
		setLayout(null);
		
		txt = new JLabel("O:X");
		txt.setBounds(130, 0, 100, 20);
		add(txt);
		
		wO = new JLabel(Integer.toString(o));
		wO.setBounds(100, 50, 50, 50);
		wO.setFont(font1);
		wO.setForeground(java.awt.Color.BLUE);
		add(wO);
		
		wX = new JLabel(Integer.toString(x));
		wX.setBounds(150, 50, 50, 50);
		wX.setFont(font1);
		wX.setForeground(java.awt.Color.RED);
		add(wX);
	}
	
	public void winX() {
		x+=1;
		remove(wX);
		add(wX);
		repaint();
	}
	
	public void winO() {
		o+=1;
		remove(wO);
		add(wO);
		repaint();
	}
	
}
