package daob;

import java.util.List;
import java.util.Scanner;

public class demo1 {
	
	public static void main(String[] args) {
		try {
		SchoolDAO schoolDAO = new SchoolDAO();
		List<SDetailsDTO> l1 = schoolDAO.getAllStudents();
		
		l1.forEach(System.out::println);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sid to display");
		String s1 = sc.next();
		
		System.out.println(schoolDAO.getAnyStudent(s1));
		
		}catch(Exception e) {
			System.out.println("Conncetion failure"+e.getMessage());
		}
	}

}
