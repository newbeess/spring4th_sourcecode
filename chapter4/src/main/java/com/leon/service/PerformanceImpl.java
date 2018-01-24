package com.leon.service;

import com.leon.aop.Beforeaop;
import org.springframework.stereotype.Service;

@Service
public class PerformanceImpl implements Performance {

  @Beforeaop(descript = "hhhh===ll")
  public void perform() {
    System.out.println("我正在表演");
  }

}
