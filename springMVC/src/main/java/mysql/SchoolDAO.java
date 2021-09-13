package mysql;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Component
public class SchoolDAO {

	public SDetailsDTO getAnyStudent(String sid) throws Exception {
		Connection connection = DBConnect.getConnection();
		PreparedStatement ps = connection.prepareStatement("Select * from sdetails where sid=?;");
		ps.setString(1, sid);
		ResultSet rs = ps.executeQuery();

		if(rs.next()){
			return new SDetailsDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		}else{
			throw new Exception(sid + "does not exist");
		}

	}

	public void insertStudent(SDetailsDTO stdDto) throws Exception {
		Connection co = DBConnect.getConnection();
		PreparedStatement ps = co.prepareStatement("insert into sdetails values(?,?,?,?,?)");

		ps.setString(1, stdDto.getSid());
		ps.setString(2, stdDto.getFname());
		ps.setString(3, stdDto.getLname());
		ps.setString(4, stdDto.getDob());
		ps.setString(5, stdDto.getAddress());

		ps.executeQuery();
	}

}
