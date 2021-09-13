package mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	@Autowired
	static Holiday obj1;
	
	public static void main(String[] args) {
		//Holiday ob = new Holiday();
		ApplicationContext context = new ClassPathXmlApplicationContext("Container.xml");
		Holiday ob = (Holiday)context.getBean("holiday1");
		
		ob.display();
		
		ApplicationContext context1 = new AnnotationConfigApplicationContext(JavaContainer.class);
		obj1 = context1.getBean(Holiday.class);
		obj1.display();
		
		System.out.println("Enter ID to diaplay : ");
		String sid = Read.sc.nextLine();
		System.out.println(obj1.map.get(sid));
		
	}

}
