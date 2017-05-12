package sample.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Aspect
@Component
public class log {

    @Pointcut("execution(* sample.hwm.*.*(..))")
    public void controller() {
    }

    @Before("controller()")
    public void before() {
        System.out.println("before controller");
    }

    @After("controller()")
    public void after() {
        System.out.println("after controller");
    }
}