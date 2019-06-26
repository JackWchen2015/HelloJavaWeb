package demo;

import demo.IUserDao;
import demo.UserDaoProxy;

public class DaoFactory {
    public static  IUserDao getIUserDaoInstance()
    {
        return new UserDaoProxy();
    }
}
