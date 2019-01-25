import javax.swing.JFrame;

public class NumButton {
   
	
	
	public static void main(String args[]){
		JFrame frame = new JFrame("NumberPad");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	    NumberPad Np=new NumberPad();
	    
	
	 
	    frame.add(Np);
	    
	    
	    
	    
	    frame.getContentPane().add(Np);
	    frame.setVisible(true);
	    frame.pack();
	}
}
