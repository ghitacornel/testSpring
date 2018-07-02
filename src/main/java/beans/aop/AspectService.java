package beans.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectService {


    @Before(value = "execution(* beans.aop.beans.*.*(..))")
    void before() {
        System.out.println("before executing method call BEFORE");
    }

    @After(value = "execution(* beans.aop.beans.*.*(..))")
    void after() {
        System.out.println("after executing method call AFTER");
    }

    @AfterReturning(pointcut = "execution(* beans.aop.beans.*.*(..))", returning = "returnedValue")
    public void afterReturning(Object returnedValue) {
        System.out.println("returned object is " + returnedValue);
    }

    @AfterThrowing(pointcut = "execution(* beans.aop.beans.*.*(..))", throwing = "e")
    public void doRecoveryActions(Exception e) {
        System.out.println("exception thrown is " + e);
    }

}
