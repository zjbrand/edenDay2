package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLCommand {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springlearning?serverTimezone=UTC","root", "5312448th");
		Statement stmt=con.createStatement();
		//增加记录：
		//String s="INSERT INTO account VALUES (6, 'fff', '5000')";
		//修改记录：
		//String s="update account set money=2300 where name='bbb'";
		//删除记录：
		//String s="delete from account where id=6";
		//查询记录：
		String s="select * from account";
		ResultSet rs= stmt.executeQuery(s);
		while(rs.next()) {
			int eid=rs.getInt("id");
			String fname=rs.getString("name");
			float fmoney=rs.getFloat("money");
			System.out.println(eid+"  "+fname+"   "+fmoney);
		}
		//stmt.execute(s);
		con.close();
	}

}
