package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-12 15:05
 */
public interface UserMapper {

    // 获取所有用户
    List<User> getAllUser();
    // 删除用户
    int deleteUserById(@Param("id") int id);

    // 添加一个用户
    int addUser(User user);


}
