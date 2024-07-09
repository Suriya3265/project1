package phase1.java;
import java.sql.*;
public class studentJDBC {
	
	
	
	
	public void getConnection(Student student) throws SQLException {
		
		
		
		
	     String url="jdbc:mysql://localhost:3306/student";
	     String user="root";
	     String password="lion";
		
		
		String query="insert into studentsList values(?,?,?)";
	    Connection con=DriverManager.getConnection(url,user,password);
    	PreparedStatement pst=con.prepareStatement(query);
    	pst.setInt(1, student.Regno);
    	pst.setString(2,student.Student_name);
    	pst.setString(3, student.department);
    	pst.executeUpdate();
    	
    	con.close();
	
	
	}
	

}
