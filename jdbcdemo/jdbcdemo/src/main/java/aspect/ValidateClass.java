package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0) //Weaving This will be executed first
 public class ValidateClass{
	@Before("execution(* *.*(Integer, Integer))") //@before is advice, //parameters are part of cross cut
	
	public void check(JoinPoint jp) throws Exception{
		for(Object x : jp.getArgs()) {
			Integer y = (Integer) x;
			if(y<0) {
				throw new IllegalArgumentException("Negative values are not supported");
			}
		}
	}
}
