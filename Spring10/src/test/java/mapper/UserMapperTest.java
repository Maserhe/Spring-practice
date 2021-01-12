package mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;
import utils.MybatisUtils;

import java.util.List;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 23:30
 */
public class UserMapperTest {

    @Test
    public void test0() {
        SqlSession session = MybatisUtils.getSqlSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();

        for (User user : allUser) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> allUser = userMapper.getAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }

    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        List<User> allUser = userMapper.getAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }

    }
}
