package com.javaclass.assignments;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class GraphicsFrame extends JFrame{

	public GraphicsFrame() 
	{
		super();
		MainPanel mainPanelPtr = new MainPanel();//create mainpanel that overwrites the frame
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.LIGHT_GRAY));
		this.add(mainPanelPtr, BorderLayout.CENTER);//main panel covers entire frame
		
	}
	
	public static void main(String[] args) 
	{
		createAndShowGUI();
	}

	private static void createAndShowGUI() {
		
		GraphicsFrame frame = new GraphicsFrame();
		frame.setSize(700,400);
		
		frame.setVisible(true);
	}
}
