
package  demo;

import demo.IUserDao;
import demo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IUserDaoImpl implements  IUserDao {
    private Connection conn=null;
    private PreparedStatement pstmt=null;

    public  IUserDaoImpl(Connection conn)
    {
        this.conn=conn;
    }

    @Override
    public boolean findLogin(User user) throws Exception {
        boolean flag=false;
        try {
            String sql="Select name from User where  userid=? AND password=?";
            this.pstmt=this.conn.prepareStatement(sql);//????作用
            this.pstmt.setString(1,user.getUserid());
            this.pstmt.setString(2,user.getPassword());
            ResultSet rs=this.pstmt.executeQuery();
            if (rs.next())
            {
                user.setName(rs.getString(1));
                System.out.println("==========="+rs.getString(1));
                flag=true;
            }
        }
        catch (Exception e)
        {
            throw  e;
        }
        finally {
            if (this.pstmt!=null)
            {
                try {
                    this.pstmt.close();
                }
                catch (Exception e)
                {
                    throw  e;
                }
            }
        }
        return flag;
    };
}
