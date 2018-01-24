package com.leon.aop;

public @interface Beforeaop {

  String values() default "";

  String descript() default "自定义管理员注解";
}
