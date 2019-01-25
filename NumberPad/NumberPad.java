import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.util.*;

import javax.swing.border.*;
import javax.swing.*;
public class NumberPad extends JPanel implements ActionListener {
	
	JLabel[] Labels;
	int counter;

	String result;
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4; 
	JButton b5; 
	JButton b6; 
	JButton b7; 
	JButton b8; 
	JButton b9; 
	JButton b0; 
	JButton pound;
	JButton star;
	JButton Clear;
	
	
	
	
	
	public  NumberPad(){
		
		result="";
		int counter=0;
		JButton Button= new JButton();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLayout(new GridLayout(4,3));
		
		setBackground(Color.red);
		
		
		Labels=new JLabel[4];
		for(int i=0;i<Labels.length;i++){
			Labels[i]=new JLabel();
		}
		
		b1 = new JButton("1");
		 b2 = new JButton("2");
		 b3 = new JButton("3");
		 b4 = new JButton("4");
		 b5 = new JButton("5");
		 b6 = new JButton("6");
		 b7 = new JButton("7");
		 b8 =new JButton("8");
		 b9 = new JButton("9");
		 b0 = new JButton("0");
		 pound = new JButton("#");
		 star=new JButton("*");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		pound.addActionListener(this);
		star.addActionListener(this);
		
		
		JButton Clear=new JButton("Clear");
	
		Clear.addActionListener(this);
		
	   add(Labels[0]);
	    add(Clear);
	    add(Box.createHorizontalGlue());
		add(Box.createHorizontalGlue());
		add(b1);
	    add(b2);
	    add(b3);
	    add(Labels[1]);
	    add(Box.createHorizontalGlue());
	    add(Box.createHorizontalGlue());
	    add(Box.createHorizontalGlue());
	    add(b4);
	    add(b5);
	    add(b6);
	    add(Labels[2]);
	    add(Box.createHorizontalGlue());
	    add(Box.createHorizontalGlue());
	    add(Box.createHorizontalGlue());
	    add(b7);
	    add(b8);
	    add(b9);
	    add(Labels[3]);
	    add(Box.createHorizontalGlue());
	    add(Box.createHorizontalGlue());
	    add(Box.createHorizontalGlue());
	    add(pound);	
	    add(b0);
	    
	    add(star);

	 
	    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton tButton = (JButton)e.getSource();
		//e.getSource() == 
		
		if(tButton.getLabel().equals("Clear")){
			result ="";
		}else{
			result += tButton.getLabel();
		}
		
		Labels[3].setText(result);
	}
}

