package xoxo;

public class round {
	int r;
	public round(){
		r=0;
	}
	
	public int giveRound() {
		return r;
	}
	
	public void addRound() {
		r=r+1;
	}
	
	public void resetRound() {
		r=0;
	}
}
