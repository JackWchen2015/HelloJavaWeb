
package  demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    private  static  final  String DBDRIVER="com.mysql.cj.jdbc.Driver";
    private  static  final  String DBURL="jdbc:mysql://localhost:3306/mldn?useSSL=false&serverTimezone=UTC";
    private  static  final  String DBUSER="root";
    private  static  final  String DBPASSWORD="root";



    private Connection conn=null;

    public  DataBaseConnection() throws Exception{
        try {
            Class.forName(DBDRIVER);
            this.conn=DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    public Connection getConn() {
        return conn;
    }

    public  void close() throws Exception{
        if (this.conn!=null) {
            try {
            this.conn.close();
            } catch (Exception e) {

            }
        }
    }
}
