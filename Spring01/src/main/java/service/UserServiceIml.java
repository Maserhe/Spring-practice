package service;

import dao.UserDao;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-09 23:32
 */
public class UserServiceIml implements UserService{

    private UserDao userDao;

    @Override
    public void getUser() {
        userDao.getInfo();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
