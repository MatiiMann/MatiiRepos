package xoxo;

import javax.swing.JFrame;

public class winner {
	
	char[][]tab= new char[3][3];
	boolean end;
	
	public winner() {
		for(int y=0;y<3;y++) {
			for(int x=0;x<3;x++) {
				tab[x][y]='y';
			}
		}
		
		end = false;
		
	}
	
	wygrana wyg = new wygrana();
	wygrana2 wyg2 = new wygrana2();
	scoreTab st = new scoreTab();
	
	public void setTab(char a,int x,int y) {
		tab[x][y] = a;
	}
	
	private void restart() {
		for(int y=0;y<3;y++) {
			for(int x=0;x<3;x++) {
				tab[x][y]='y';
			}
		}
	}
	
	public boolean rAnswer() {
		if(end==true)return true;
		else return false;
	}
	
	public void setEnd() {
		end = false;
	}
	
	public void checkWin() {
		
		//opcje poziome
		if(tab[0][0]==tab[1][0]&&tab[1][0]==tab[2][0] && tab[0][0]!='y' && tab[1][0] != 'y' && tab[2][0]!='y') {
			end=true;
			if(tab[0][0]=='o') {
			restart();
			wyg.setVisible(true);
			wyg.setLocationRelativeTo(null);
			st.winO();
			}else {
				restart();
				wyg2.setVisible(true);
				wyg2.setLocationRelativeTo(null);
				st.winX();
			}
		}
		if(tab[0][1]==tab[1][1]&&tab[1][1]==tab[2][1] && tab[0][1]!='y' && tab[1][1]!='y' && tab[2][1]!='y') {
			end=true;
			if(tab[0][1]=='o') {
				restart();
				wyg.setVisible(true);
				wyg.setLocationRelativeTo(null);
				st.winO();
				}else {
					restart();
					wyg2.setVisible(true);
					wyg2.setLocationRelativeTo(null);
					st.winX();
				}
		}
		if(tab[0][2]==tab[1][2]&&tab[1][2]==tab[2][2] && tab[0][2]!='y' &&tab[1][2]!='y' && tab[2][2]!='y') {
			end=true;
			if(tab[0][2]=='o') {	
				restart();
				wyg.setVisible(true);
				wyg.setLocationRelativeTo(null);
				st.winO();
				}else {		
					restart();
					wyg2.setVisible(true);
					wyg2.setLocationRelativeTo(null);
					st.winX();
				}
		}
		
		//opcje pionowe
		if(tab[0][0]==tab[0][1]&&tab[0][1]==tab[0][2] && tab[0][0]!='y' && tab[0][1]!='y' && tab[0][2]!='y') {
			end=true;
			if(tab[0][0]=='o') {	
				restart();
				wyg.setVisible(true);
				wyg.setLocationRelativeTo(null);
				st.winO();
				}else {	
					restart();
					wyg2.setVisible(true);
					wyg2.setLocationRelativeTo(null);
					st.winX();
				}
		}
		if(tab[1][0]==tab[1][1]&&tab[1][1]==tab[1][2] && tab[1][0]!='y' && tab[1][1]!='y' && tab[1][2]!='y') {
			end=true;
			if(tab[1][0]=='o') {	
				restart();
				wyg.setVisible(true);
				wyg.setLocationRelativeTo(null);
				st.winO();
				}else {	
					restart();
					wyg2.setVisible(true);
					wyg2.setLocationRelativeTo(null);
					st.winX();
				}
		}
		if(tab[2][0]==tab[2][1]&&tab[2][1]==tab[2][2] && tab[2][0]!='y' && tab[2][1]!='y' && tab[2][2]!='y') {
			end=true;
			if(tab[2][0]=='o') {		
				restart();
				wyg.setVisible(true);
				wyg.setLocationRelativeTo(null);
				st.winO();
				}else {		
					restart();
					wyg2.setVisible(true);
					wyg2.setLocationRelativeTo(null);
					st.winX();
				}
		}
		
		//opcje skoœne
		if(tab[0][0]==tab[1][1]&&tab[1][1]==tab[2][2] && tab[0][0]!='y' && tab[1][1]!='y' && tab[2][2]!='y') {
			end=true;
			if(tab[0][0]=='o') {
				restart();
				wyg.setVisible(true);
				wyg.setLocationRelativeTo(null);
				st.winO();
				}else {	
					restart();
					wyg2.setVisible(true);
					wyg2.setLocationRelativeTo(null);
					st.winX();
				}
		}
		if(tab[0][2]==tab[1][1]&&tab[1][1]==tab[2][0] && tab[0][2]!='y' && tab[1][1]!='y' && tab[2][0]!='y') {
			end=true;
			if(tab[0][2]=='o') {
				restart();
				wyg.setVisible(true);
				wyg.setLocationRelativeTo(null);
				st.winO();
				}else {
					restart();
					wyg2.setVisible(true);
					wyg2.setLocationRelativeTo(null);
					st.winX();
				}
		}
	}
	
}
