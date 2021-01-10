import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-10 18:37
 */
public class Test {

    @org.junit.Test
    public void Test() {
        // 获取Spring的上下文对象。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) applicationContext.getBean("User");



    }
}
