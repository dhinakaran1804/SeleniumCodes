package controlstatement;

public class ForLoop {
	
	public void IncrementalLoop() {
		for (int i = 1; i<=15; i++) 
			System.out.println(i);
	}
	
	public void DecrementLoop() {
		for (int i = 15; i>=1; i--) 
			System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoop loop = new ForLoop();
		loop.IncrementalLoop();
		loop.DecrementLoop();	
		
	}

}
