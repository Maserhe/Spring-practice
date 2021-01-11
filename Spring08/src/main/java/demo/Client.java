package demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 18:49
 */
public class Client {
    public static void main(String[] args) {


        DAOLogHandler handler = new DAOLogHandler();
        handler.setUserDao(new UserDaoImpl());

        // 创建代理类对象。
        UserDao proxy = (UserDao) handler.getProxy();

        proxy.findUserById("Maserhe");


    }
}
