
//员工信息查询类




package classsource;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JScrollPane.*;
import java.sql.*;

public class BIQ extends JInternalFrame{

	JLabel lbl1=new JLabel("Employee Basic Info Search");
   	JLabel lbl2=new JLabel("Employee ID");
   	JLabel lbl3=new JLabel("Name");
   	JTextField btxtid=new JTextField(10);
   	JTextField btxtname=new JTextField(10);
   	JButton btn1=new JButton("Search");

   	JTable table;
	DefaultTableModel dtm;

    String columns[] = {"ID", "Name", "Birthday", "schema", "Status", "Note"};
	public BIQ(){
		setTitle("Basic info Search");

		dtm = new DefaultTableModel();
		table = new JTable(dtm);

		JScrollPane sl = new JScrollPane();
		sl.getViewport().add(table);
		dtm.setColumnCount(5);
		dtm.setColumnIdentifiers(columns);
	//	sl.getViewport().add(table,null);

	    //sl.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//sl.setver
//
//		sl.HORIZONTAL_SCROLLBAR_ALWAYS;
//		sl.VERTICAL_SCROLLBAR_ALWAYS;
		//new JScrollPane().add(table);

		//dtm.setColumnCount(columns.length);
	//	dtm.insertRow(0,columns);

		//sl.setAutoscrolls(true);
/*		dtm.setColumnIdentifiers(columns);
		TableColumnModel tcm = table.getColumnModel();
		for(int i=0;i<columns.length;i++)
		{
			tcm.getColumn(i).setWidth(180);
		}
---------------------------------------------------------------------------------
*/

		getContentPane().setLayout(null);
		lbl1.setBounds(240,10,300,30);
		lbl1.setFont(new Font("Serif",Font.BOLD,24));
		getContentPane().add(lbl1);

		Font f=new Font("Serif",Font.PLAIN,12);
		lbl2.setBounds(10,60,80,25);
		lbl2.setFont(f);
		getContentPane().add(lbl2);
		btxtid.setBounds(80,60,80,23);
		btxtid.setFont(f);
		getContentPane().add(btxtid);
		lbl3.setBounds(10,90,80,25);
		lbl3.setFont(f);
   	    getContentPane().add(lbl3);
   	    btxtname.setBounds(80,90,80,23);
   	    btxtname.setFont(f);
   	    getContentPane().add(btxtname);
   	    btn1.setBounds(90,130,60,25);
   	    btn1.setFont(f);
   	    getContentPane().add(btn1);


		sl.setBounds(180,60,500,370);
		getContentPane().add(sl);

		
        btxtid.setBorder(BorderFactory.createLineBorder(Color.black));
   	    btxtname.setBorder(BorderFactory.createLineBorder(Color.black));
   	    btn1.setBorder(BorderFactory.createRaisedBevelBorder());
        sl.setBorder(BorderFactory.createLineBorder(Color.black));

//----------------------------------------------------------------------------
		//Database.joinDB();
		String sql="select * from EmployeeInformation";
		/*
		if(Database.query(sql)){
		   System.out.println(sql);
		   try{
		   	  while(Database.rs.next()){
		   	  	 String eNumber=(""+Database.rs.getInt("E_Number"));
		   	  	 System.out.println(eNumber);
		   	  	 String eName=Database.rs.getString("E_Name");
		   	  	 System.out.println(eName);
		   	  	 String eSex=Database.rs.getString("E_Sex");
		   	  	 System.out.println(eSex);
		   	  	 String eBornDate=Database.rs.getString("E_BornDate");
		   	  	 System.out.println(eBornDate);
		   	  	 String eMarriage=Database.rs.getString("E_Marriage");
		   	  	 System.out.println(eMarriage);
		   	  	 String ePoliticsVisage=Database.rs.getString("E_PoliticsVisage");
		   	  	 System.out.println(ePoliticsVisage);
		   	  	 String eSchoolAge=Database.rs.getString("E_SchoolAge");
		   	  	 System.out.println(eSchoolAge);
		   	  	 String eEnterDate=Database.rs.getString("E_EnterDate");
		   	  	 System.out.println(eEnterDate);
		   	  	 String eInDueFormDate=Database.rs.getString("E_InDueFormDate");
		   	  	 System.out.println(eInDueFormDate);
		   	  	 String eDepartment=Database.rs.getString("E_Department");
		   	  	 System.out.println(eDepartment);
		   	  	 String eHeadship=Database.rs.getString("E_Headship");
		   	  	 System.out.println(eHeadship);
		   	  	 String eEstate=Database.rs.getString("E_Estate");
		   	  	 System.out.println(eEstate);
		   	  	 String eRemark=Database.rs.getString("E_Remark");
		   	  	 System.out.println(eRemark);

		   	     Vector v=new Vector();
		   	     v.add(eNumber);
				 v.add(eName);
				 v.add(eSex);
				 v.add(eBornDate);
				 v.add(eMarriage);
				 v.add(ePoliticsVisage);
				 v.add(eSchoolAge);
		   	     v.add(eEnterDate);
				 v.add(eInDueFormDate);
				 v.add(eDepartment);
				 v.add(eHeadship);
				 v.add(eEstate);
				 v.add(eRemark);
				 dtm.addRow(v);
		   	  }

		   }
		   catch(Exception eBIQ){
		     System.out.println("Failed initialize data!");
		   }
*/
		}
//------------------------------------------------------------------

    	//setSize(700,480);
		//this.setClosable(true);
		//setVisible(true);
		//}
	}
