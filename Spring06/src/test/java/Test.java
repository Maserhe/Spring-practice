import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 0:30
 */
public class Test {

    @org.junit.Test
    public void test() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);

        System.out.println(user.getName());

    }
}
