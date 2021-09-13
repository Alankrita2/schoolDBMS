package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0) //Weaving This will be executed first
 public class ValidateClass3{
	@Before("execution(* *.*(Integer, Integer))") //@before is advice, //parameters are part of cross cut
	
	public void check(JoinPoint jp) throws Exception{
		for(Object x : jp.getArgs()) {
			Integer y = (Integer) x;
			if(y>2000) {
				throw new IllegalArgumentException("Return value is out of range");
			}
		}
	}
}
