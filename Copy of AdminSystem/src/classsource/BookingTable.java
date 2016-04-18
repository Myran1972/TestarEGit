package classsource;
import javax.swing.table.AbstractTableModel;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;


//http://diyland.biz/index.php?opt=detail&topic=67&id=11433


class BookingTable extends AbstractTableModel {

    String defaultStatus = "available";
    String bookedStatus = "booked";
    
    Object[][] p = {
    		{now(), defaultStatus, defaultStatus, defaultStatus},
    		{now(), defaultStatus, defaultStatus, defaultStatus},
    		{now(), defaultStatus, defaultStatus, defaultStatus},
    		{now(), defaultStatus, defaultStatus, defaultStatus},
    		{now(), defaultStatus, defaultStatus, defaultStatus}
    		};
    
    String[] columnNames = {"Date", "00:00 - 07:59", "08:00 - 16:59", "17:00 - 24:00"};
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return columnNames.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return p[row][col];
    }
   
 public Class getColumnClass(int c) {
         return getValueAt(0, c).getClass();
    }
 
 public boolean isCellEditable(int rowIndex, int columnIndex) {
	 if(columnIndex == 0) return false;
  return true;
    }
   
 public void setValueAt(Object value, int row, int col) {
         p[row][col] = value;
         fireTableCellUpdated(row, col);
    }
   
    public void mySetValueAt(Object value, int row, int col) {
     p[row][col] = value;
    }
    
	public static String now() {
		final String DATE_FORMAT_NOW = "yyyy-MM-dd";
	
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
	}
}