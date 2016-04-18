


package classsource;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Employeemanage extends JInternalFrame{
	JInternalFrame jif;
    public Employeemanage() {
    	jif=this;
        initComponents();
    }

    private void initComponents() {

    	setTitle("Employee basic info");

    	String schema[]={"MF", "LS", "S"};
    	String Status[]={"100%", "50%", "Sjuk", "VAB", "Studier", "Semester"};
    	String DrivingCard[]={"A" ,"AA", "B", "BB", "C", "CC", "CCC", "K"};
    	
    	Font f = new Font("TimesNewRoman", 0, 14);
    	
        lb1 = new JLabel("Emplyee basic info");
        lb2 = new JLabel("ID");
        lb5 = new JLabel("Name");
        lb6 = new JLabel("Surname");
        lb8 = new JLabel("Driving Card Type");
        lb9 = new JLabel("Status");
        lb10 = new JLabel("Schema");
        
        lb12 = new JLabel("birthday");
        lb14 = new JLabel("name");
        txt_number = new JTextField();
        txt_name = new JTextField();

        txt_borndate = new JTextField();

        txt_enterdate = new JTextField();
        remark_ta = new JTextArea();
        save_bt = new JButton("save");
        rm_bt = new JButton(">>");
        lm_bt = new JButton("<<");
        right_bt = new JButton(">|");
        left_bt = new JButton("|<");
        exit_bt = new JButton("exit");
        append_bt = new JButton("add");
        delet_bt= new JButton("delete");
        amend_bt = new JButton("change");

        
        getContentPane().setLayout(null);

        setFont(new Font("italic", 1, 24));
        lb1.setBackground(new Color(0, 0, 0));
        lb1.setFont(new Font("italic", 1, 24));
        lb1.setForeground(new Color(0, 0, 255));
        getContentPane().add(lb1);
        lb1.setBounds(140, 10, 210, 40);


        lb2.setFont(f);

        getContentPane().add(lb2);
        lb2.setBounds(20, 80, 60, 20);

       
        lb5.setFont(f);

        getContentPane().add(lb5);
        lb5.setBounds(360, 140, 60, 20);

        lb6.setFont(f);

        getContentPane().add(lb6);
        lb6.setBounds(200, 290, 60, 20);

        lb8.setFont(f);

        getContentPane().add(lb8);
        lb8.setBounds(350, 240, 60, 20);

        lb9.setFont(f);

        getContentPane().add(lb9);
        lb9.setBounds(200, 140, 60, 20);

        lb10.setFont(f);

        getContentPane().add(lb10);
        lb10.setBounds(350, 190, 70, 20);

        lb11.setFont(f);

        getContentPane().add(lb11);
        lb11.setBounds(10, 290, 110, 20);

        lb12.setFont(f);

        getContentPane().add(lb12);
        lb12.setBounds(10, 140, 80, 20);

        lb14.setFont(f);

        getContentPane().add(lb14);
        lb14.setBounds(190, 80, 60, 20);

        getContentPane().add(txt_number);
        txt_number.setBounds(80, 80, 80, 21);

        getContentPane().add(txt_name);
        txt_name.setBounds(250, 80, 80, 20);


        getContentPane().add(txt_borndate);
        txt_borndate.setBounds(80, 140, 100, 20);  

        getContentPane().add(tdepartment);
        tdepartment.setFont(f);
        tdepartment.setBounds(250, 140, 90, 20); //²¿ÃÅ

        getContentPane().add(theadship);
        theadship.setFont(f);
        theadship.setBounds(250, 190, 90, 20);  //Ö°Îñ

        getContentPane().add(tschoolage);
        tschoolage.setFont(f);
        tschoolage.setBounds(250, 240, 90, 20); 

        getContentPane().add(txt_enterdate);
        txt_enterdate.setBounds(100, 290, 90, 20); 

        getContentPane().add(txt_InDueFormDate);
        txt_InDueFormDate.setBounds(430, 190, 100, 20); 

        getContentPane().add(remark_ta);         
        remark_ta.setBounds(350, 260, 190, 53);

        save_bt.setFont(f);

        getContentPane().add(save_bt);
        save_bt.setBounds(20, 390, 70, 25);
        save_bt.setEnabled(false);

        rm_bt.setFont(f);

        getContentPane().add(rm_bt);
        rm_bt.setBounds(260, 350, 70, 25);

        lm_bt.setFont(f);

        getContentPane().add(lm_bt);
        lm_bt.setBounds(150, 350, 70, 25);

        right_bt.setFont(f);

        getContentPane().add(right_bt);
        right_bt.setBounds(370, 350, 70, 25);

        left_bt.setFont(f);
        getContentPane().add(left_bt);
        left_bt.setBounds(50, 350, 70, 25);

        exit_bt.setFont(f);

        getContentPane().add(exit_bt);
        exit_bt.setBounds(410, 390, 70,25);

        append_bt.setFont(f);

        getContentPane().add(append_bt);
        append_bt.setBounds(110, 390, 70, 25);

        delet_bt.setFont(f);

        getContentPane().add(delet_bt);
        delet_bt.setBounds(310, 390, 70, 25);

        amend_bt.setFont(f);
        getContentPane().add(amend_bt);
        amend_bt.setBounds(210, 390, 70, 25);

        //Database.joinDB();

        String csql="select * from EmployeeInformation";


//----------------------------------------
        

//------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-558)/2, (screenSize.height-477)/2, 558, 455);
        this.setClosable(true);
        this.setMaximizable(true);
        setVisible(true);
    }


    private JButton save_bt;
    private JButton rm_bt;
    private JButton lm_bt;
    private JButton right_bt;
    private JButton left_bt;
    private JButton exit_bt;
    private JButton append_bt;
    private JButton delet_bt;
    private JButton amend_bt;
    private JLabel lb1;
    private JLabel lb10;
    private JLabel lb11;
    private JLabel lb12;
 
    private JLabel lb14;
    private JLabel lb2;
   
    private JLabel lb5;
    private JLabel lb6;
    private JLabel lb7;
    private JLabel lb8;
    private JLabel lb9;
    private JTextArea remark_ta;
    private JTextField txt_number;
    private JTextField txt_name;
    private JTextField txt_borndate;
    private JTextField txt_enterdate;
    private JTextField txt_InDueFormDate;
    private JTextField theadship;
    private JTextField tschoolage;
    private JTextField tdepartment;


}
