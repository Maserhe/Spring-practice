package mapper;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pojo.User;

import java.util.List;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-12 0:08
 */
@Component
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;


    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getAllUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getAllUser();
    }
}
