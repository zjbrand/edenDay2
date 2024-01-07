package connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLCommand {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?serverTimezone=UTC","root", "5312448th");
		
		Statement stmt=con.createStatement();
		
		String s ="select * from employees";
		//String s="delete from employees where employee_id=3";
		//String s="update employees set salary=60000 where employee_id=5";
		ResultSet rs=stmt.executeQuery(s);
		//String s="INSERT INTO employees VALUES (4, 'Jon Doen', 'Sales', 65000)";
		//stmt.execute(s);
		 
		while(rs.next()) {
			int eid=rs.getInt("employee_id");
			String fname=rs.getString("employee_name");
			String fdepartment=rs.getString("department");
			int esalary=rs.getInt("salary");
			System.out.println(eid+" "+fname+" "+fdepartment+" "+esalary);
		}
		con.close();
	}

}
