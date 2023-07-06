package io.github.fairyspace.test.bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class UserServiceInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Do something before "+methodInvocation.getMethod().getName());
        Object res = methodInvocation.proceed();
        System.out.println("Do something after "+methodInvocation.getMethod().getName());
        return res;
    }
}
