//Schema


package classsource;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.sql.*;

public class EPIQ extends JInternalFrame{

	JLabel lb1=new JLabel("Schema");
   	JLabel lb2=new JLabel("Employee ID");
   	JLabel lb3=new JLabel("Employee Name");
   	JTextField txt1=new JTextField(10);
   	JTextField txt2=new JTextField(10);
   	JButton btn1=new JButton("search");

   	JTable table;
	DefaultTableModel dtm;
	String columns[] = {"Employee ID", "Employee Name", "Time","reason","others"};
	public EPIQ(){
		setTitle("Schema");
		
		dtm = new DefaultTableModel();
		table = new JTable(dtm);
		JScrollPane sl = new JScrollPane(table);


		dtm.setColumnCount(6);
		dtm.setColumnIdentifiers(columns);

		getContentPane().setLayout(null);
		lb1.setBounds(200,10,300,30);
		lb1.setFont(new Font("italic",Font.BOLD,24));
		getContentPane().add(lb1);

		Font f=new Font("italic",Font.PLAIN,12);
		lb2.setBounds(10,60,80,25);
		lb2.setFont(f);
		getContentPane().add(lb2);
		txt1.setBounds(80,60,80,23);
		txt1.setFont(f);
		getContentPane().add(txt1);
		lb3.setBounds(10,90,80,25);
		lb3.setFont(f);
   	    getContentPane().add(lb3);
   	    txt2.setBounds(80,90,80,23);
   	    txt2.setFont(f);
   	    getContentPane().add(txt2);
   	    btn1.setBounds(90,130,60,25);
   	    btn1.setFont(f);
   	    getContentPane().add(btn1);


		txt1.setBorder(BorderFactory.createLineBorder(Color.black));
   	    txt2.setBorder(BorderFactory.createLineBorder(Color.black));
   	    btn1.setBorder(BorderFactory.createRaisedBevelBorder());
		sl.setBorder(BorderFactory.createLineBorder(Color.black));

		//Database.joinDB();

		String scEPIQ="select * from EncouragementPunishInformation";
/*
		if(Database.query(scEPIQ)){
        			System.out.println(scEPIQ);
        			try{
        				while(Database.rs.next()){
        					String number = ("" + Database.rs.getInt("EP_Number"));
        					String name = Database.rs.getString("EP_Name");
        					System.out.println(name);
        					String date = Database.rs.getString("EP_Date");
        					System.out.println(date);
        					String address = Database.rs.getString("EP_Address");
        					System.out.println(address);
        					String causation = Database.rs.getString("EP_Causation");
        					System.out.println(causation);
        					String remark = Database.rs.getString("EP_Remark");
        					System.out.println(remark);


        					Vector v = new Vector();
        					v.add(number);
        					v.add(name);
        					v.add(date);
        					v.add(address);
        					v.add(causation);
        					v.add(remark);

        					dtm.addRow(v);
       					}
        				}
        		   	catch(Exception eEPIQ){}

        			}
*/

		sl.setBounds(180,60,425,290);
		getContentPane().add(sl);

		setSize(630,400);
		this.setClosable(true);
		//this.setm
		setVisible(true);
		}
	}
