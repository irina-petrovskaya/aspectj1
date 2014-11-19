package a.b.c.m4_aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

/**
 * by Irina.Petrovskaya on 11/10/2014.
 */
public aspect M4Aspect2 {

    /**
     * for all public methods with name == bar* and String type
     */
    @Before("execution(String a.b.c.*.bar*(..))")
    public void beforeFooMethodsExecution(JoinPoint jp) {
        System.out.println("----- before executing method bar* ( " + jp.getSignature().getName()+" )");
    }
}
