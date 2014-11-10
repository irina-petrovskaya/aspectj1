package a.b.c.m4_aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *  by Irina.Petrovskaya on 11/10/2014.
 */
@Aspect
public class M4Aspect1 {
    @Pointcut("execution(String a.b.c.*.foo*(..))")
    public void fooPointcut(){};
  @Before("fooPointcut()")
  public void beforeFooMethodsExecution(JoinPoint jp){
    System.out.println("----- before executing method foo* ( " + jp.getSignature().getName()+" ) -----");
     }
}
