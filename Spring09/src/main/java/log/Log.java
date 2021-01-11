package log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 20:25
 */

public class Log implements MethodBeforeAdvice {
    // method: 要执行的目标对象的方法
    // objects: 参数
    // o:目标对象
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        // 打印 执行了 什么类 的 什么方法
        System.out.println(o.getClass().getName() + "的" + method.getName() + "被执行了");
    }

}
