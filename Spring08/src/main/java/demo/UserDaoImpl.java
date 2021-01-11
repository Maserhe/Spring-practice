package demo;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 16:02
 */
public class UserDaoImpl implements UserDao {

    @Override
    public Boolean findUserById(String userId) {
        if (userId.equals("Maserhe")) {
            System.out.println("用户名匹配成功！！");
            return true;
        }
        System.out.println("用户名匹配失败！！");
        return false;
    }
}
