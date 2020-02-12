package xoxo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainxo extends JFrame implements ActionListener
{
	
	//creating buttons of the board
	JButton p1 = new JButton();
	JButton p2 = new JButton();
	JButton p3 = new JButton();
	JButton p4 = new JButton();
	JButton p5 = new JButton();
	JButton p6 = new JButton();
	JButton p7 = new JButton();
	JButton p8 = new JButton();
	JButton p9 = new JButton();
	
	String bReset = "RESET";
	JButton reset = new JButton(bReset);
		
	
	Icon iconX = new ImageIcon("img\\x.PNG");
	Icon iconO = new ImageIcon("img\\o.PNG");
	JLabel turn = new JLabel(iconO);
	
	round rr = new round();
	winner w = new winner();
	
		public mainxo() {
			
			//frame settings
			setSize(500,500);
			setTitle("XO");
			setLayout(null);
			//JButton buttonO = new JButton(iconO);
			//JButton buttonX = new JButton(iconX);
			
			turn.setBounds(300,120,64,64);
			
			//creating graphics
			String inscription = "Runda Gracza:";
			JLabel txt = new JLabel(inscription);
			txt.setBounds(300, 0, 100, 100);
			String cr = "Mateusz Mialkas ©";
			JLabel copyright = new JLabel(cr);
			copyright.setBounds(10, 380, 200, 100);
			
			//setting posistions and size
			p1.setBounds(0, 0, 64, 64);
			p2.setBounds(74, 0, 64, 64);
			p3.setBounds(148, 0, 64, 64);
			p4.setBounds(0, 74, 64, 64);
			p5.setBounds(74, 74, 64, 64);
			p6.setBounds(148, 74, 64, 64);
			p7.setBounds(0, 148, 64, 64);
			p8.setBounds(74, 148, 64, 64);
			p9.setBounds(148, 148, 64, 64);
			
			reset.setBounds(150,300, 150,64);
			reset.setBackground(java.awt.Color.RED);
			
			//buttonO.setBounds(100,18,64,64);
			//buttonX.setBounds(18, 18, 64, 64);
			//add(buttonO);
			//add(buttonX);
			
			//adding buttons of the board
			add(p1);
			add(p2);
			add(p3);
			add(p4);
			add(p5);
			add(p6);
			add(p7);
			add(p8);
			add(p9);
			add(reset);
			
			//adding grpahics 
			add(txt);
			add(turn);
			add(copyright);
			
			//action listener of the buttons from the board
			p1.addActionListener(this);
			p2.addActionListener(this);
			p3.addActionListener(this);
			p4.addActionListener(this);
			p5.addActionListener(this);
			p6.addActionListener(this);
			p7.addActionListener(this);
			p8.addActionListener(this);
			p9.addActionListener(this);
			reset.addActionListener(this);
			
		}
	
		public static void main(String args[]) {
			mainxo window = new mainxo();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
			window.setLocationRelativeTo(null);
			
			/*String data = window.getLocation().toString();
			StringBuilder str = new StringBuilder();
			StringBuilder str2 = new StringBuilder();
			str.append(data.charAt(17));
			str.append(data.charAt(18));
			str.append(data.charAt(19));
			String dataX = str.toString();
			str2.append(data.charAt(23));
			str2.append(data.charAt(24));
			str2.append(data.charAt(25));
			String dataY = str2.toString();
			int tabX = Integer.parseInt(dataX);
			int tabY = Integer.parseInt(dataY);
			
			scoreTab st = new scoreTab();
			st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			st.setVisible(true);
			st.setLocation(tabX+500,tabY);
			*/
		}
		
		JLabel o1 ;
		JLabel x1;
		JLabel o2 ;
		JLabel x2;
		JLabel o3 ;
		JLabel x3;
		JLabel o4 ;
		JLabel x4;
		JLabel o5 ;
		JLabel x5;
		JLabel o6 ;
		JLabel x6;
		JLabel o7 ;
		JLabel x7;
		JLabel o8 ;
		JLabel x8;
		JLabel o9 ;
		JLabel x9;
		
		ArrayList arr = new ArrayList();
		
		void reset() {
			w.setEnd();
			int x = arr.size();
			for(int i=0;i<x;i++) {
				if(arr.get(i)=="o1") {
					remove(o1);
					add(p1);
				}
				if(arr.get(i)=="x1") {
					remove(x1);
					add(p1);
				}
				if(arr.get(i)=="o2") {
					remove(o2);
					add(p2);
				}
				if(arr.get(i)=="x2") {
					remove(x2);
					add(p2);
				}
				if(arr.get(i)=="o3") {
					remove(o3);
					add(p3);
				}
				if(arr.get(i)=="x3") {
					remove(x3);
					add(p3);
				}
				if(arr.get(i)=="o4") {
					remove(o4);
					add(p4);
				}
				if(arr.get(i)=="x4") {
					remove(x4);
					add(p4);
				}
				if(arr.get(i)=="o5") {
					remove(o5);
					add(p5);
				}
				if(arr.get(i)=="x5") {
					remove(x5);
					add(p5);
				}
				if(arr.get(i)=="o6") {
					remove(o6);
					add(p6);
				}
				if(arr.get(i)=="x6") {
					remove(x6);
					add(p6);
				}
				if(arr.get(i)=="o7") {
					remove(o7);
					add(p7);
				}
				if(arr.get(i)=="x7") {
					remove(x7);
					add(p7);
				}
				if(arr.get(i)=="o8") {
					remove(o8);
					add(p8);
				}
				if(arr.get(i)=="x8") {
					remove(x8);
					add(p8);
				}
				if(arr.get(i)=="o9") {
					remove(o9);
					add(p9);
				}
				if(arr.get(i)=="x9") {
					remove(x9);
					add(p9);
				}
			}
			rr.resetRound();
			turn.setIcon(iconO);
			repaint();
			arr.clear();
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object source = e.getSource();
			
			if(source==reset) {
				reset();
			}
			
			if(source==p1) {
				rr.addRound();
				if(rr.giveRound()%2==1) {
					w.setTab('o', 0, 0);
					w.checkWin();
					arr.add("o1");
					
					remove(p1);
					o1 = new JLabel(iconO);
					o1.setBounds(0, 0, 64, 64);
					add(o1);
					turn.setIcon(iconX);
					if(w.rAnswer()==true) {
						w.setEnd();
						reset();
					}
					repaint();
				}else {
					w.setTab('x', 0, 0);
					w.checkWin();
					arr.add("x1");
					
					remove(p1);
					x1 = new JLabel(iconX);
					x1.setBounds(0, 0, 64, 64);
					add(x1);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					
					turn.setIcon(iconO);
					repaint();
				}
			}
			
			
			if(source==p2) {
				rr.addRound();
				if(rr.giveRound()%2==1) {
					w.setTab('o', 1, 0);
					w.checkWin();
					arr.add("o2");
					
					remove(p2);
					o2 = new JLabel(iconO);
					o2.setBounds(74, 0, 64, 64);
					add(o2);
					turn.setIcon(iconX);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					repaint();
				}else {
					w.setTab('x', 1, 0);
					w.checkWin();
					arr.add("x2");
					
					remove(p2);
					x2 = new JLabel(iconX);
					x2.setBounds(74, 0, 64, 64);
					add(x2);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					
					turn.setIcon(iconO);
					repaint();
				}
			}
			
			if(source==p3) {
				rr.addRound();
				if(rr.giveRound()%2==1) {
					w.setTab('o', 2, 0);
					w.checkWin();
					arr.add("o3");
					
					remove(p3);
					o3 = new JLabel(iconO);
					o3.setBounds(148, 0, 64, 64);
					add(o3);
					turn.setIcon(iconX);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					repaint();
				}else {
					w.setTab('x', 2, 0);
					w.checkWin();
					arr.add("x3");
					
					remove(p3);
					x3 = new JLabel(iconX);
					x3.setBounds(148, 0, 64, 64);
					add(x3);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					
					turn.setIcon(iconO);
					repaint();
				}
			}
			
			if(source==p4) {
				rr.addRound();
				if(rr.giveRound()%2==1) {
					w.setTab('o', 0, 1);
					w.checkWin();
					arr.add("o4");
					
					remove(p4);
					o4 = new JLabel(iconO);
					o4.setBounds(0, 74, 64, 64);
					add(o4);
					turn.setIcon(iconX);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					repaint();
				}else {
					w.setTab('x', 0, 1);
					w.checkWin();
					arr.add("x4");
					
					remove(p4);
					x4 = new JLabel(iconX);
					x4.setBounds(0, 74, 64, 64);
					add(x4);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					
					turn.setIcon(iconO);
					repaint();
				}
			}
			
			if(source==p5) {
				rr.addRound();
				if(rr.giveRound()%2==1) {
					w.setTab('o', 1, 1);
					w.checkWin();
					arr.add("o5");
					
					remove(p5);
					o5 = new JLabel(iconO);
					o5.setBounds(74, 74, 64, 64);
					add(o5);
					turn.setIcon(iconX);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					repaint();
				}else {
					w.setTab('x', 1, 1);
					w.checkWin();
					arr.add("x5");
					
					remove(p5);
					x5 = new JLabel(iconX);
					x5.setBounds(74, 74, 64, 64);
					add(x5);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					
					turn.setIcon(iconO);
					repaint();
				}
			}
			
			if(source==p6) {
				rr.addRound();
				if(rr.giveRound()%2==1) {
					w.setTab('o', 2, 1);
					w.checkWin();
					arr.add("o6");
					
					remove(p6);
					o6 = new JLabel(iconO);
					o6.setBounds(148, 74, 64, 64);
					add(o6);
					turn.setIcon(iconX);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}					
					turn.setIcon(iconX);
					repaint();
				}else {
					w.setTab('x', 2, 1);
					w.checkWin();
					arr.add("x6");
					
					remove(p6);
					x6 = new JLabel(iconX);
					x6.setBounds(148, 74, 64, 64);
					add(x6);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					
					turn.setIcon(iconO);
					repaint();
				}
			}
			
			if(source==p7) {
				rr.addRound();
				if(rr.giveRound()%2==1) {
					w.setTab('o', 0, 2);
					w.checkWin();
					arr.add("o7");
					
					remove(p7);
					o7 = new JLabel(iconO);
					o7.setBounds(0, 148, 64, 64);
					add(o7);
					turn.setIcon(iconX);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					repaint();
				}else {
					w.setTab('x', 0, 2);
					w.checkWin();
					arr.add("x7");
					
					remove(p7);
					x7 = new JLabel(iconX);
					x7.setBounds(0, 148, 64, 64);
					add(x7);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					
					turn.setIcon(iconO);
					repaint();
				}
			}
			if(source==p8) {
				rr.addRound();
				if(rr.giveRound()%2==1) {
					w.setTab('o', 1, 2);
					w.checkWin();
					arr.add("o8");
					
					remove(p8);
					o8 = new JLabel(iconO);
					o8.setBounds(74, 148, 64, 64);
					add(o8);
					turn.setIcon(iconX);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					repaint();
				}else {
					w.setTab('x', 1, 2);
					w.checkWin();
					arr.add("x8");
					
					remove(p8);
					x8 = new JLabel(iconX);
					x8.setBounds(74, 148, 64, 64);
					add(x8);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					
					turn.setIcon(iconO);
					repaint();
				}
			}
			if(source==p9) {
				rr.addRound();
				if(rr.giveRound()%2==1) {
					w.setTab('o', 2, 2);
					w.checkWin();
					arr.add("o9");
					
					remove(p9);
					o9 = new JLabel(iconO);
					o9.setBounds(148, 148, 64, 64);
					add(o9);
					turn.setIcon(iconX);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					repaint();
				}else {
					w.setTab('x', 2, 2);
					w.checkWin();
					arr.add("x9");
					
					remove(p9);
					x9 = new JLabel(iconX);
					x9.setBounds(148, 148, 64, 64);
					add(x9);
					if(w.rAnswer()==true) {
						reset();
						w.setEnd();
					}
					
					turn.setIcon(iconO);
					repaint();
				}
			}
		}
}
