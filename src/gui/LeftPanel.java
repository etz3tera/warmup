package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

public class LeftPanel extends JPanel{
	
	public LeftPanel() {
		super();
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawRect( 50,  50,  200,  400);
	}

}
