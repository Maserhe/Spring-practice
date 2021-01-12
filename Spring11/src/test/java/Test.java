import mapper.UserMapper;
import mapper.UserMapperImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

import java.util.List;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-12 15:13
 */
public class Test {

    @org.junit.Test
    public void test0 () {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");

        UserMapper b = context.getBean("userMapper", UserMapper.class);
        List<User> allUser = b.getAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }

    }

    @org.junit.Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        UserMapper bean = context.getBean("userMapper", UserMapper.class);
        bean.addUser(new User(6,"Maserhe","89989889"));

    }

    @org.junit.Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        UserMapper bean = context.getBean("userMapper", UserMapper.class);
        bean.addUser(new User(7,"Maserhe","89989889"));
        bean.deleteUserById(7);
    }

}
