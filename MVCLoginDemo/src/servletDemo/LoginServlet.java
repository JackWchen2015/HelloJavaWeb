package servletDemo;

import demo.DaoFactory;
import demo.User;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String path="index.jsp";
        String  userid=request.getParameter("userid");
        String password=request.getParameter("userpass");
        List<String> info=new ArrayList<String>();

        System.out.println("userid==="+userid);
        System.out.println("userpass==="+password);
        if (userid==null || "".equals(userid))
        {
            info.add("用户id不能为空");
        }
        if (password==null || "".equals(password))
        {
            info.add("密码不能为空");
        }
        if (info.size()==0)
        {
            User  user=new User();
            user.setUserid(userid);
            user.setPassword(password);

            try {
                if (DaoFactory.getIUserDaoInstance().findLogin(user))
                {
                    info.add("用户登陆成功，欢迎"+user.getName()+"光临");
                }
                else
                {
                    info.add("用户登陆失败，错误的用户名和密码");
                }
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        request.setAttribute("info",info);
        request.getRequestDispatcher(path).forward(request,response);
    }
}
