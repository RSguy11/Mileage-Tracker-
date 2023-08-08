package Package1;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class UI {
	
	public Variables Var1 = new Variables();
	public MainClass main = new MainClass();
	public Logic excel = new Logic();
	
	
		
		  public ActionListener ANButtonCLick = new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 
		        	 
		        	   JComboBox[] Locationi = new JComboBox[3];
			        	 Locationi[0] = Var1.CreateMenu1();
			        	 Locationi[1] = Var1.CreateMenu2();
			        	 
			        	 
			           JComboBox[] Datei = new JComboBox[4];
			           	 Datei[0] = Var1.DayMenu();
			           	 Datei[1] = Var1.MonthMenu();
			           	 Datei[2] = Var1.YearMenu();
			           	
			           	
			        
			        Var1.DDS.add(Datei);
			        Var1.LDS.add(Locationi);
			      	 
			        main.frame1.add(Var1.LDS.get(Var1.i)[0]);
			        main.frame1.add(Var1.LDS.get(Var1.i)[1]);
			        main.frame1.add(Var1.ToText());
			  
			        
			        main.frame1.add(Var1.DDS.get(Var1.i)[0]);
			        main.frame1.add(Var1.DDS.get(Var1.i)[1]);
			        main.frame1.add(Var1.DDS.get(Var1.i)[2]);
			        
			        main.frame1.repaint();
			        main.frame1.revalidate();
			        
		        	 
			     	 Var1.V=Var1.V+80;
		             Var1.i++;
		    		 System.out.println(Var1.i);
			

		        	 
		         }
		      
		
		  };
	
	
	
		  public ActionListener EXButtonCLick = new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		      
		        	 JFrame frameExport = new JFrame();
		        	 frameExport.setBounds(700, 350, 400, 150);
		     		 frameExport.setLayout(null);
		     		 frameExport.setVisible(true);
		     		 frameExport.repaint();
		     		 
		        	 JLabel labelEx = new JLabel("your Trips have been Exported");
		        	 labelEx.setBounds(125, 15, 300, 100);
		        //	 labelEx.setBounds(pos x, pos y, length, height);
		        	 
		        	 frameExport.add(labelEx);
		        	 
		     
		        	 
						try {
							excel.Headers();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				
		        	 
		         }
		         
		  };
	
	
	

	
}	  

