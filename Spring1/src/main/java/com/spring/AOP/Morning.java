package com.spring.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.reflect.JoinPointMatchImpl;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Morning {

	@Before("pointCut()") // POINTCUT
	// ADVICE
	public void goodMorning() {
		System.out.println("GOOD MORNING STUDENT...");
	}

	@After("pointCut()") // POINTCUT
	// ADVICE
	public void goodNight() {
		System.out.println("GOOD NIGHT STUDENT...");
	}

	// POINTCUT FOR THE SIMILAR POINTCUTS
	@Pointcut("execution(public void school())")
	public void pointCut() {

	}

	/////////////////////// BREAK_ METHOD USAGE
	@Before("execution(public void break_())")
	public void lecture(JoinPoint j) {
		System.out.println("ITS STUDENT LECTURE GOING..." + j.getSignature().getName());
	}

	///////// @RETURNING METHOD
	@AfterReturning(pointcut = "execution (public int come(..))", returning = "time")
	public void go(int time) {
		System.out.println("THE COMING TIME IS : " + time);
	}

	///////// @THROWING METHOD
	@AfterThrowing(pointcut = "execution (public * excep())", throwing = "ex")
	public void go(MyExcep ex) {
		System.out.println("MY EXCEPTION :- " +ex);
	}

}
