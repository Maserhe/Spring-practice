/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 12:56
 */
public class Client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        UserServiceProxy usp = new UserServiceProxy();
        usp.setUserService(userService);

        usp.add();
        usp.delete();
        usp.insert();
        usp.select();
    }
}
