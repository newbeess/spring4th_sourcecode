package com.leon.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 定义切面aspect
 */
@Component
@Aspect
public class AudienceAspect {

  /**
   * 定义切点pointcut，名为performance
   */
  @Pointcut(value = "execution (* com.leon.service.Performance.perform(..))")
  public void performance() {
  }

  /**
   * 定义通知advice
   *
   * 在执行com.leon.aop.Performance()之前，执行该方法
   */
  @Before("performance()")
  public void silenceCellPhones() {
    System.out.println("Silecing cell phones!");
  }

  @Around("performance()")
  public void takeSeats(ProceedingJoinPoint joinPoint) {
    System.out.println("Around before");
    try {
      joinPoint.proceed();
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
    System.out.println("Around After");
  }

  @AfterReturning("performance()")
  public void applause() {
    System.out.println("CLAP CLAP CLAP");
  }

  @AfterThrowing("performance()")
  public void demandRefund() {
    System.out.println("Demanding a refund");
  }
}
