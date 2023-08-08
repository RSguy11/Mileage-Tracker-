package Package1;

import java.awt.Component;
import java.awt.Font;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class Variables {

	public static UI user = new UI();
	public static Logic excel = new Logic();
	
	
	String Locations[] = {"AppleWood","Matheson","Norelco","Pedigree","Coleraine","Bolton","Driver Road"};
	String Test[] = {"hello"};
	String Months[] = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
	String Days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String Years[] = {"2022","2021","2020","2019","2018","2017","2016"};
	
	int Distances[][] = {     {0,27,10,27,20,19,27},
							  {27,0,25,15,31,30,15},
							  {10,25,0,17,30,25,17},
							  {27,15,17,0,21,20,1 },
							  {20,31,30,21,0,3,21 },
							  {19,30,25,20,3,0,20 },
							  {27,15,17,1,21,20,0 }  };
	
	
	
	 static List <JComboBox[]> LDS = new ArrayList<JComboBox[]>();
	 static List <JComboBox[]> DDS = new ArrayList<JComboBox[]>();
	
	
	
	
	public int V = 120;
	public int i = 0;
	public int col = 1;
	
	public  JPanel panel1 = new JPanel();
	
	
	
	public JComboBox CreateMenu1 () {
		JComboBox box1 = new JComboBox( Locations );
		box1.setBounds(20,V,200,40);
		return box1;
	}
	
	public JComboBox CreateMenu2() {
		JComboBox box2 = new JComboBox( Locations );
		box2.setBounds(300,V,200,40);
		
		return box2;
	}
	
	public Component ToText () {
		JLabel ToText = new JLabel("To");
		ToText.setBounds(250, V, 200, 40);
		ToText.setFont(new Font("Verdana", Font.PLAIN, 18));
		return ToText;
	}
	
	public Component AddText () {
		JLabel AddText = new JLabel("Add Next Trip");
		AddText.setBounds(240, 40, 600, 40);
		AddText.setFont(new Font("Verdana", Font.PLAIN, 30));
		return AddText;
	}
	
	public Component AddButton () {
		JButton AddBut = new JButton("+");
		AddBut.setBounds(20, 40, 200, 40);
		AddBut.addActionListener(user.ANButtonCLick);;
		return AddBut;
	}
	
	public Component Export () {
		JButton EXbut = new JButton("Export");
		EXbut.setBounds(700, 40, 200, 40);
		EXbut.addActionListener(user.EXButtonCLick);
		return EXbut;
	}
	
	public JComboBox MonthMenu () {
		JComboBox Month = new JComboBox(Months);
		Month.setBounds(650, V, 200, 40);
		return Month;
	}
	
	public JComboBox DayMenu () {
		JComboBox Day = new JComboBox(Days);
		Day.setBounds(600, V, 50, 40);
		return Day;
	}
	
	public JComboBox YearMenu () {
		JComboBox year = new JComboBox(Years);
		year.setBounds(850, V, 100, 40);
		return year;
	}

	 
}
