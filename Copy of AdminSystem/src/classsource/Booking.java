

package classsource;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.*;
import java.util.*;
import java.sql.*;

public class Booking extends JInternalFrame{

	String availableKaj = " ";
	
	JLabel lb1=new JLabel(availableKaj);
   	JLabel lb2=new JLabel("Shipment");
   	JLabel lb3=new JLabel("Shipment ID");
   	JTextField TF_Shipment=new JTextField(10);
   	JTextField TF_ShipmentID=new JTextField(10);
   	JButton searchBtn=new JButton("Search");
   	Container con=getContentPane();
   	
   	JTable table;
   	AbstractTableModel dtm;
   	
	public Booking(){
		DBUtils db = DBUtils.getInstance();
		System.out.println("Booking ");
		setTitle("Booking for Shipment");	
		
		dtm = new BookingTable();
		table = new JTable(dtm);

        JScrollPane sl = new JScrollPane(table);

		getContentPane().setLayout(null);
		lb1.setBounds(200,10,300,30);
		lb1.setFont(new Font("italic",Font.BOLD,24));
		getContentPane().add(lb1);
		
		String defaultStatus = "available";
		String bookedStatus = "booked";
		JComboBox c1 = new JComboBox();
		c1.addItem(defaultStatus);
		c1.addItem(bookedStatus);
		JComboBox c2 = new JComboBox();
		c2.addItem(defaultStatus);
		c2.addItem(bookedStatus);
		JComboBox c3 = new JComboBox();
		c3.addItem(defaultStatus);
		c3.addItem(bookedStatus);
		       
		table.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(c1));    
		table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(c2));    
		table.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(c3));   
		
		//table.setPreferredScrollableViewportSize(new Dimension(180, 60));

		Font f=new Font("italic",Font.PLAIN,12);
		lb2.setBounds(10,60,80,25);
		lb2.setFont(f);
		getContentPane().add(lb2);
		TF_Shipment.setBounds(80,60,80,23);
		TF_Shipment.setFont(f);
		getContentPane().add(TF_Shipment);
		lb3.setBounds(10,90,80,25);
		lb3.setFont(f);
   	    getContentPane().add(lb3);
   	    TF_ShipmentID.setBounds(80,90,80,23);
   	    TF_ShipmentID.setFont(f);
   	    getContentPane().add(TF_ShipmentID);
   	    searchBtn.setBounds(90,130,60,25);
   	    searchBtn.setFont(f);
   	    getContentPane().add(searchBtn);

		sl.setBounds(180,60,425,290);
		
		getContentPane().add(sl);


		TF_Shipment.setBorder(BorderFactory.createLineBorder(Color.black));
		TF_ShipmentID.setBorder(BorderFactory.createLineBorder(Color.black));
   	    searchBtn.setBorder(BorderFactory.createRaisedBevelBorder());
		sl.setBorder(BorderFactory.createLineBorder(Color.black));

		
		//Database.joinDB();
		
		searchBtn.addActionListener(new ActionListener(){
	   		public void actionPerformed(ActionEvent event){
        		
	   			System.out.println("Shipment is " + TF_Shipment.getText());
        		System.out.println("ShipmentID is " + TF_ShipmentID.getText());
        		String fetchType_sql;
        		String fetchKaj_sql;
        		String fetched_volType = null;
        		String fetched_kaj = null;
	   			if(TF_Shipment.getText().isEmpty() || TF_ShipmentID.getText().isEmpty()){
	   				new JOptionPane().showMessageDialog(null,"You must provide shipment name and ID!");
	   			}else{
	            	fetchType_sql = "SELECT VolumeType FROM Ships WHERE Name='" + TF_Shipment.getText() + "' AND ID='" + TF_ShipmentID.getText() + "';";
	            	ResultSet rs = db.executeQuery(fetchType_sql);
	            	
	        		try{
	        			while(rs.next()){
	        				fetched_volType = rs.getString("VolumeType");
	        				
	        				
	        			}
	        			if(fetched_volType != null){
	        				   //fetchKaj_sql = "SELECT Name FROM Dock WHERE VolumeType='" + fetched_volType + "';";
	        				fetchKaj_sql = "SELECT Name FROM Dock WHERE VolumeType='" +"A005" + "';";

	        				   rs = db.executeQuery(fetchKaj_sql);
	        				   while(rs.next()){
	        					   fetched_kaj = rs.getString("Name");
	        					   db.closeIt(rs);
	        					   System.out.println(fetched_kaj);
	        				   }
	        				   db.closeIt(rs);
	        			 }else {
	        				 new JOptionPane().showMessageDialog(null,"You must provide right shipment name and ID!");
	        			 }	        			
	        		}catch(Exception e){
	        			System.err.println("error " + e.getMessage());
	        			db.closeIt(rs);
	        		}
	   			}
	   			lb1.setText(fetched_kaj);
	   			/*
	   			JLabel lb = new JLabel(volType);
				lb.setBounds(200,50,300,30);  
				lb.setFont(new Font("italic",Font.BOLD,24));
				getContentPane().add(lb);*/
	   		}});
		setSize(630,400);
		this.setClosable(true);
		setVisible(true);
	}
	
   
}
		