import dao.UserDaoIml;
import dao.UserDaoMysql;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.UserServiceIml;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-09 23:36
 */
public class Test {

    public static void main(String[] args) {
        UserServiceIml userService = new UserServiceIml();

        // 控制反转 把控制权交给用户
        userService.setUserDao(new UserDaoIml());
        userService.getUser();
        userService.setUserDao(new UserDaoMysql());
        userService.getUser();

        /*测试*/

        // 获取Spring的容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceIml userServiceIml = (UserServiceIml) applicationContext.getBean("UserServiceIml");

        userServiceIml.getUser();


    }
}
