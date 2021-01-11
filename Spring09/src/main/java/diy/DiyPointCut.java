package diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 21:13
 */
@Aspect
public class DiyPointCut {

    @Before("execution(* service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("+++++++++++++before++++++++++++++");
    }

    @After("execution(* service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("-------------after----------------");
    }

    @Around("execution(* service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕前操作");
        // 执行方法
        Object proceed = pj.proceed();
        System.out.println("环绕后操作");

    }
}
