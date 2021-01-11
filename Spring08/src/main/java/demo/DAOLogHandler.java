package demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 16:08
 */
// 自定义的请求处理类
public class DAOLogHandler implements InvocationHandler {

    private UserDao userDao;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object result = method.invoke(userDao, args);
        after();
        return result;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    // 获取代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
    }


    // 请求前执行的方法
    void before() {
        System.out.println("这是-----------before");
    }

    // 请求后执行的方法
    void after() {
        System.out.println("这是-----------after");
    }
}
