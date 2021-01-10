import entity.Student;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-10 20:31
 */
public class Test {
    @org.junit.Test
    public void test1() {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student.getName());
        System.out.println(student.getAddress());

        System.out.println(student);
    }

    @org.junit.Test
    public void test2() {

        ApplicationContext context = new ClassPathXmlApplicationContext("second-config.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);

        User user1 = context.getBean("user", User.class);
        System.out.println(user1);

    }
}
