package com.bunny.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExecutor {

    private int maxRetries = 5;

    @Around("execution(public void com.bunny.aop.worker.Pot.feedAnimal()) || execution(public void com.bunny.aop.worker.Pot.petAnimal())")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("before feed animal");
//        return proceedingJoinPoint.proceed();
        int numAttempts = 0;
        Exception exception;
        do {
            numAttempts++;
            System.out.println("trying " + numAttempts + " times");
            try {
                return proceedingJoinPoint.proceed();
            }
            catch(Exception ex) {
                exception = ex;
            }
        } while(numAttempts <= this.maxRetries);
        throw exception;
    }
}
