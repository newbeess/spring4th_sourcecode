package com.leon.aop;

import com.leon.service.Encorable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EncorableAspect {

  /**
   * 引入新功能
   */
  @DeclareParents(value = "com.leon.service.PerformanceImpl", defaultImpl = com.leon.service.EncorabIeImpl.class)
  public static Encorable encorable;

}
