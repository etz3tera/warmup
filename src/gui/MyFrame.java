package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		super("GUI");
		
		
		this.setSize(600, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		RightPanel right = new RightPanel();
		LeftPanel left = new LeftPanel();
		
		this.setLayout(new GridLayout(1,2));
		
		this.add(left);
		this.add(right);
		
		
	}
	
	
	
	

}
