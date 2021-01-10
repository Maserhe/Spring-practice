import entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-10 1:30
 */
public class Test {

    @org.junit.Test
    public void Test1() {

        // 使用xml加载, 获取Spring的上下文对象。
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的 对象 都在Spring中 管理了
        Hello hello = (Hello) context.getBean("hello");

        Hello hello1 = (Hello) context.getBean("hello");
        System.out.println(hello1.getStr());
        System.out.println(hello.getStr());
        System.out.println(hello == hello1);



    }
}
