package aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAspect {
	
	public static void main(String[] args) {
		Arithmetic obj;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Container1.xml");
		obj = (Arithmetic) context.getBean("arithmetic");
		
		try {
			System.out.println(obj.add(10, 20));
			System.out.println(obj.subtract(10, 20));
			System.out.println(obj.multiply(1001, -20));
			System.out.println(obj.divide(-10, 20));
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
