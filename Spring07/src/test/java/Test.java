import config.MaserheConfig;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 1:28
 */
public class Test {

    @org.junit.Test
    public void Test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MaserheConfig.class);
        User User = context.getBean("user", User.class);
        System.out.println(User.getName());
    }
}
