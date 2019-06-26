package  demo;

import demo.IUserDaoImpl;
import demo.DataBaseConnection;
import demo.IUserDao;

public class UserDaoProxy  implements   IUserDao{
    private  DataBaseConnection  dbc=null;
    private  IUserDao dao=null;

    public  UserDaoProxy(){
        try {
            this.dbc=new  DataBaseConnection();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        this.dao=new IUserDaoImpl(this.dbc.getConn());
    }

    @Override
    public boolean findLogin(User user) throws Exception {
        boolean flag=false;
        try {
            flag=this.dao.findLogin(user);
        }catch (Exception e)
        {
            throw  e;
        }finally {
            this.dbc.close();
        }
        return flag;
    }
}
