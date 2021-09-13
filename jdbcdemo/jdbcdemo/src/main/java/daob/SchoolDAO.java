package daob;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDAO {

	public List<SDetailsDTO> getAllStudents() throws Exception {
		Connection co = DBConnect.getConnection();

		PreparedStatement ps = co.prepareStatement("select * from sdetails");
		ResultSet rs = ps.executeQuery();

		List<SDetailsDTO> ls = new ArrayList<SDetailsDTO>();
		while (rs.next()) {
			ls.add(new SDetailsDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getString(5)));
		}

		return ls;
	}

	public List<SDetailsDTO> getAnyStudent(String sid) throws Exception {
		Connection co = DBConnect.getConnection();

		PreparedStatement ps = co.prepareStatement("select * from sdetails where sid = ?");
		ps.setString(1, sid);

		ResultSet rs = ps.executeQuery();

		List<SDetailsDTO> ls = new ArrayList<SDetailsDTO>();
		if (rs.next()) {
			ls.add(new SDetailsDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getString(5)));
		} else {
			throw new Exception(sid + "does not exists");
		}

		return ls;
	}

	public Map<String, SDetailsDTO> getAllStudentsMap() throws Exception {
		Connection co = DBConnect.getConnection();

		PreparedStatement ps = co.prepareStatement("select * from sdetails");
		ResultSet rs = ps.executeQuery();

		Map<String, SDetailsDTO> ls = new HashMap();
		while (rs.next()) {
			ls.put(rs.getString(1), new SDetailsDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getString(5)));
		}

		return ls;
	}

	// Insert a new record

	// Delete a record

	// join query

}
