package mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.User;

import java.util.List;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-12 15:08
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> getAllUser() {
        return getSqlSession().getMapper(UserMapper.class).getAllUser();
    }

    @Override
    public int deleteUserById(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUserById(id);
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }
}
