package mysql;

import java.util.Map;

import daob.SDetailsDTO;
import daob.SchoolDAO;

public class Holiday {

	String holidayName = null;
	String holidayDate = null;
	Map<String, SDetailsDTO> map;

	public Holiday() throws Exception {
		super();
		map = new SchoolDAO().getAllStudentsMap();
	}

		
	public Holiday(String holidayName, String holidayDate) throws Exception {
		super();
		this.holidayName = holidayName;
		this.holidayDate = holidayDate;
		this.map = new SchoolDAO().getAllStudentsMap();
	}
	
	public String getHolidayName() {
		return holidayName;
	}


	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}


	public String getHolidayDate() {
		return holidayDate;
	}


	public void setHolidayDate(String holidayDate) {
		this.holidayDate = holidayDate;
	}


	public void display() {

		System.out.println("Holiday Name = "+this.holidayName+"\nHoliday Date = "+this.holidayDate);
	}

}
