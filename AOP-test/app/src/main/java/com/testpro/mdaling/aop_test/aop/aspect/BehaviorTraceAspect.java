package com.testpro.mdaling.aop_test.aop.aspect;

import android.util.Log;

import com.testpro.mdaling.aop_test.aop.annotation.BehaviorTrace;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.security.acl.LastOwnerException;
import java.util.Objects;

/**
 * Created by M_DaLing on 2018/3/21.
 */

@Aspect
public class BehaviorTraceAspect {

    //定义切面的规则
    //1.就在原来应用中哪些注释的地方放到当前切面进行处理
    //execution(注释名   注释用的地方)
    @Pointcut("execution(@com.testpro.mdaling.aop_test.aop.annotation.BehaviorTrace * *(..))")
    public void methodWithBehaviorTrace() {
    }

    //2.对进入切面的内容如何处理
    //@Before()  在切入点之前运行
    //@After()   在切入点之后运行
    //@Around()  在切入点前后都运行
    @Around("methodWithBehaviorTrace()")
    public Object useTime(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getName();
        String methodName = methodSignature.getName();
        String actionName = methodSignature.getMethod().getAnnotation(BehaviorTrace.class).value();

        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        Log.d("------->", String.format("%s,%s类的%s方法执行了，用时%d ms", actionName, className, methodName, endTime - startTime));
        return result;
    }


}
