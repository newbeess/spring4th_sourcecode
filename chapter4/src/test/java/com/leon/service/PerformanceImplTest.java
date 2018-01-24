package com.leon.service;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.leon.aop.AppConfig.class)
public class PerformanceImplTest {

  @Resource
  private Performance performance;

  @Test
  public void testBeforeAop() {
    performance.perform();
  }
}