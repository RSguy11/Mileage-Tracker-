package Package1;

import java.awt.Color;
import java.awt.Component;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;

import javax.swing.JFrame;

public class MainClass {

	
	public static  JFrame frame1 = new JFrame();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables Var = new Variables();
		
		StartFrame();
		frame1.add(Var.AddText());
		frame1.add(Var.AddButton());
		frame1.add(Var.Export());
		
		frame1.repaint();
		frame1.revalidate();
		
		
	}

	
	
public static void StartFrame() {
		
		frame1.setBounds(275, 50, 1000, 700);
		frame1.setLayout(null);
		frame1.setVisible(true);
		//frame1.setShape(new RoundRectangle2D.Double(275, 50, 1000, 700, 20, 20));
		frame1.repaint();
		
		
	}
}
