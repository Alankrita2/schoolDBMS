package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1) //Weaving This will be executed first
 public class ValidateClass1{
	@Before("execution(* *.*(Integer, Integer))") //@before is advice, //parameters are part of cross cut
	
	public void check(JoinPoint jp) throws Exception{
		for(Object x : jp.getArgs()) {
			Integer y = (Integer) x;
			if(y>1000) {
				throw new IllegalArgumentException("Range not supported");
			}
		}
	}
}
