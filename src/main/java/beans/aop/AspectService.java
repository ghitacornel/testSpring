package beans.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component// an aspect is a container managed bean
@Aspect// an aspect can be a simple class with a special marker
public class AspectService {

    // PLAY WITH DIFFERENT FLAVORS OF AOP OFFERED BY SPRING

    @Before(value = "execution(* beans.aop.beans.*.*(..))")
    void aspectExecutedBeforeExecutingTargetedMethods() {
        System.out.println("AOP invoked BEFORE executing method call");
    }

    @After(value = "execution(* beans.aop.beans.*.*(..))")
    void aspectExecutedAfterExecutingTargetedMethods() {
        System.out.println("AOP invoked AFTER executing method call");
    }

    @AfterReturning(pointcut = "execution(* beans.aop.beans.*.*(..))", returning = "valueReturnedByTargetedMethod")
    public void aspectExecutedAfterExecutingTargetedMethodsReturnAValues(Object valueReturnedByTargetedMethod) {
        System.out.println("AOP invoked when RETURN object is " + valueReturnedByTargetedMethod);
    }

    @AfterThrowing(pointcut = "execution(* beans.aop.beans.*.*(..))", throwing = "exceptionThrownByTargetedMethod")
    public void aspectExecutedWhenTargetedMethodsThrowExceptions(Exception exceptionThrownByTargetedMethod) {
        System.out.println("AOP invoked when EXCEPTION thrown is " + exceptionThrownByTargetedMethod);
    }

    @Around("execution(* beans.aop.beans.*.*(..))")
    public void aroundAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AOP AROUND invoked BEFORE executing method call " + joinPoint);
        joinPoint.proceed();
        System.out.println("AOP AROUND invoked AFTER executing method call " + joinPoint);
    }

}
