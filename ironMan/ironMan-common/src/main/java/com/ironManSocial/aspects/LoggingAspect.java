package com.ironManSocial.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

@Aspect
public class LoggingAspect {

	 private static final Logger logger = LoggerFactory.getLogger("com.ironManSocial.logger");

	 
	 @Pointcut("execution(* *.*(..))")
	 protected void loggingOperation() {}
	 
	 @Before("loggingOperation()")
	 @Order(1)
	 public void logJoinPoint(JoinPoint joinPoint){
	     logger.debug("Join point kind : " + joinPoint.getKind());
	     logger.debug("Signature declaring type : "+ joinPoint.getSignature().getDeclaringTypeName());
	     logger.debug("Signature name : " + joinPoint.getSignature().getName());
	     logger.debug("Arguments : " + Arrays.toString(joinPoint.getArgs()));
	     logger.debug("Target class : "+ joinPoint.getTarget().getClass().getName());
	     logger.debug("This class : " + joinPoint.getThis().getClass().getName());
	 }
	 
	 @AfterReturning(pointcut="loggingOperation()", returning = "result")
	 @Order(2)
	 public void logAfter(JoinPoint joinPoint, Object result){
		 logger.debug("Exiting from Method :"+joinPoint.getSignature().getName());
		 logger.debug("Return value :"+result);
	 }
	 
	 @AfterThrowing(pointcut="execution(* *.*(..))", throwing = "e")
	 @Order(3)
	 public void logAfterThrowing(JoinPoint joinPoint, Throwable e){
		 logger.error("An exception has been thrown in "+ joinPoint.getSignature().getName() + "()");
		 logger.error("Cause :"+e.getCause());
	 }
	 
	 
}
