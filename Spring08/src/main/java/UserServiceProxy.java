/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 12:55
 */
// 代理角色
public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
        log("代理说：使用了add方法");
    }

    @Override
    public void insert() {
        userService.insert();
        log("代理说：使用了insert方法");
    }

    @Override
    public void delete() {
        userService.delete();
        log("代理说：使用了delete方法");
    }

    @Override
    public void select() {
        userService.select();
        log("代理说：使用了select方法");
    }

    void log(String msg){
        System.out.println(msg);
    }
}
