import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.UserServiceImpl;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 21:00
 */
public class Test {

    @org.junit.Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        /*动态代理 代理的接口*/

        UserService uservice = (UserService) context.getBean("userService",UserService.class);

        uservice.add();
    }
}
